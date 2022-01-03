package swu.ml.design.dao;


import swu.ml.design.Destination;

import java.sql.SQLException;
import java.util.List;

public interface DestinationDao {

    Integer findCount();

    List<Destination> listPage(Integer startPage, Integer pageSize);
    List<Destination> selectDestination(int id) throws SQLException;
    /*
   查询列表
   @param searchKey
   @return

     */
    List<Destination> listPlace(String searchKey) throws SQLException;
}
