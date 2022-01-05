package swu.ml.design.dao;


import swu.ml.design.domain.Destination;
import swu.ml.design.utils.BaseDao;
import swu.ml.design.utils.DBUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DestinationDaoImpl implements DestinationDao {

    private BaseDao baseDao = new BaseDao();

    @Override
    public Integer findCount() {
        String sql = "select count(id) from destination";
        ResultSet rs = baseDao.query(sql);
        int count = 0;
        try {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public List<Destination> listPage(Integer startPage, Integer pageSize) {
        ArrayList<Destination> destinationList = new ArrayList<>();
        String sql = "select * from destination limit %d,%d";
        sql = String.format(sql, (startPage - 1) * pageSize, pageSize);
        try {
            ResultSet rs = baseDao.query(sql);
            while (rs.next()) {
                Destination destination = new Destination();
                destination.setId(rs.getInt("id"));
                destination.setPlace(rs.getString("place"));
                destination.setImg(rs.getString("img"));
                destination.setDescribe(rs.getString("describe"));
                destinationList.add(destination);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return destinationList;
    }
/*
* 查询功能，把符合要求的选出来
* */
    @Override
    public List<Destination> selectDestination(int id) throws SQLException {
        System.out.println("id=" + id);
        String sql = "SELECT * FROM destination WHERE id=" + id;
        List<Destination> destinations = null;
        destinations = DBUtils.getDestinations(sql);

        return destinations;
    }

    @Override
    public  List<Destination> listPlace(String searchKey) throws SQLException {
        String sql="select * from destination";
        if (null != searchKey && !"".equals(searchKey))
        {
            sql="select * from destination where place like '%"+searchKey+"%'";
        }
        List<Destination> destinations = new ArrayList<Destination>();
        destinations=DBUtils.getDestinations(sql);
        return  destinations;
    }

    @Override
    public void updatePlace(String sql) throws SQLException {
        DBUtils.update(sql);
    }

    @Override
    public void addPlace(String place, String describe,String img) throws SQLException {
        String INSERT_TEMPLATE =
                "INSERT INTO destination (`place`, `describe`, `img`) " +
                        "VALUES ('%s', '%s', '%s')";
        String sql = String.format(INSERT_TEMPLATE,place,describe,img);
        System.out.println(sql);
        DBUtils.insert(sql);
    }

    @Override
    public void deletePlace(String id) throws SQLException {
        String sql = "DELETE FROM destination WHERE id=" + id;
        DBUtils.delete(sql);
    }


}
