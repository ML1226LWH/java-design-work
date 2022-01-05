package swu.ml.design.service;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import swu.ml.design.domain.Destination;

import swu.ml.design.page.PageResult;
import swu.ml.design.dao.DestinationDao;
import swu.ml.design.dao.DestinationDaoImpl;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.sql.SQLException;
import java.util.List;

public class DestinationServiceImpl implements DestinationService{

    private DestinationDao destinationDao = new DestinationDaoImpl();
    @Override
    public PageResult listPage(Integer startPage, Integer pageSize) {
        PageResult result = new PageResult();
        result.setCurrentPage(startPage);
        result.setPageSize(pageSize);

        // 查询总记录数
        Integer count = destinationDao.findCount();
        result.setTotal(count);

        // 查询当前页的数据集合
        List<Destination> destinations = destinationDao.listPage(startPage,pageSize);
        result.setDestinationList(destinations);

        return result;
    }
    @Override
    public Destination selectDestination(int id) throws SQLException {
        List<Destination> destinations=destinationDao.selectDestination(id);
        Destination destination=destinations.get(0);
        return destination;
    }

    /*
    * 查询功能，先找到对应的需要编辑的地点
    * */
    @Override
    public List<Destination> listPlaces(String searchKey) throws SQLException {
        List<Destination> destinations= destinationDao.listPlace(searchKey);
        return destinations;
    }

    /*
    * 更新功能
    * id,place,describe,img
    * */
    @Override
    public void updatePlace(String id,HttpServletRequest request) throws Exception {
        Destination destination=imgOperate(request);
        String sql = String.format("UPDATE destination SET " +
                        "`place`='%s', `describe`='%s', `img`='%s' WHERE `id`=%s",
                destination.getPlace(), destination.getDescribe(),destination.getImg(), destination.getId());
        System.out.println(sql);
        destinationDao.updatePlace(sql);
    }

    /*
    * 添加功能
    * place,describe,img
    * */
    @Override
    public void addPlace(HttpServletRequest request) throws Exception {
        Destination destination=imgOperate(request);
        destinationDao.addPlace(destination.getPlace(),destination.getDescribe(),destination.getImg());
    }

    @Override
    public Destination imgOperate(HttpServletRequest request) throws Exception {
        final int MEMORY_THRESHOLD = 1024 * 1024 * 3;  // 3MB
        final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
        final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB
        // 上传文件存储目录
        final String UPLOAD_DIRECTORY = "upload";


        // 配置上传参数
        DiskFileItemFactory factory = new DiskFileItemFactory();
        // 设置内存临界值 - 超过后将产生临时文件并存储于临时目录中
        factory.setSizeThreshold(MEMORY_THRESHOLD);
        // 设置临时存储目录
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

        ServletFileUpload upload = new ServletFileUpload(factory);
        // 设置最大文件上传值
        upload.setFileSizeMax(MAX_FILE_SIZE);
        // 设置最大请求值 (包含文件和表单数据)
        upload.setSizeMax(MAX_REQUEST_SIZE);
        // 中文处理
        upload.setHeaderEncoding("UTF-8");

        // 构造临时路径来存储上传的文件
        // 这个路径相对当前应用的目录
        String uploadPath = request.getServletContext().getRealPath("./") + File.separator + UPLOAD_DIRECTORY;
        // 如果目录不存在则创建
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }
        String place = null;
        String describe=null;
        String id=null;

        String pics = "";
            // 解析请求的内容提取文件数据
            List<FileItem> formItems = upload.parseRequest(request);
            if (formItems != null && formItems.size() > 0) {
                // 迭代表单数据
                for (FileItem item : formItems) {
                    // 处理不在表单中的字段
                    if (!item.isFormField()) {
                        String fileName = new File(item.getName()).getName();
                        String filePath = uploadPath + File.separator + fileName;
                        File storeFile = new File(filePath);
                        // 在控制台输出文件的上传路径
                        System.out.println(filePath);
                        // 保存文件到硬盘
                        item.write(storeFile);
                        pics = "./upload/" + fileName;
                    } else {
                        if (item.getFieldName().equals("place")) {
                            place = item.getString();
                        }
                        if (item.getFieldName().equals("describe")) {
                            describe = item.getString();
                        }
                        if (item.getFieldName().equals("id")) {
                            id = item.getString();
                        }
                    }
                }

            }
            Destination destination = new Destination();
            destination.setPlace(place);
            destination.setDescribe(describe);
            destination.setImg(pics);
            destination.setId(Integer.valueOf(id));
            return destination;
        }

        /*
         * 删除
         * */
        @Override
        public void deletePlace (String id) throws SQLException {
            destinationDao.deletePlace(id);
        }

    }
