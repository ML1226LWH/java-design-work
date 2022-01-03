package swu.ml.design.service;


import swu.ml.design.Destination;
import swu.ml.design.page.PageResult;

import java.sql.SQLException;
import java.util.List;

public interface DestinationService {

    PageResult listPage(Integer startPage, Integer pageSize);
    Destination selectDestination(int id) throws SQLException;
    List<Destination> listPlaces(String searchKey) throws SQLException;
}
