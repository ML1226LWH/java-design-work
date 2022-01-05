package swu.ml.design.dao;


import swu.ml.design.domain.Destination;

import java.sql.SQLException;
import java.util.List;

public interface DestinationDao {

    Integer findCount();

    List<Destination> listPage(Integer startPage, Integer pageSiz);
    List<Destination> selectDestination(int id) throws SQLException;
    /*
   查询列表
   @param searchKey
   @return

     */
    List<Destination> listPlace(String searchKey) throws SQLException;

    /*
     * 更新列表
     * */
    void updatePlace(String sql) throws SQLException;
    /*
    * 添加地点
    * */
    void addPlace(String place, String describe,String img) throws SQLException;
    /*
    * 删除数据
    * */
    void deletePlace(String id) throws SQLException;
}
