package swu.ml.design.dao;


import swu.ml.design.Destination;

import java.util.List;

public interface DestinationDao {

    Integer findCount();

    List<Destination> listPage(Integer startPage, Integer pageSize);
}
