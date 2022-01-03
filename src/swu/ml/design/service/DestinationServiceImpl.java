package swu.ml.design.service;
import swu.ml.design.Destination;

import swu.ml.design.page.PageResult;
import swu.ml.design.dao.DestinationDao;
import swu.ml.design.dao.DestinationDaoImpl;

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

    @Override
    public List<Destination> listPlaces(String searchKey) throws SQLException {
        List<Destination> destinations= destinationDao.listPlace(searchKey);
        return destinations;
    }

}
