package swu.ml.design.service;


import org.apache.commons.fileupload.FileUploadException;
import swu.ml.design.domain.Destination;
import swu.ml.design.page.PageResult;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

public interface DestinationService {

    PageResult listPage(Integer startPage, Integer pageSize);
    Destination selectDestination(int id) throws SQLException;
    List<Destination> listPlaces(String searchKey) throws SQLException;
    void updatePlace(String id,HttpServletRequest request) throws Exception;
    void addPlace(HttpServletRequest request) throws SQLException, Exception;
    Destination imgOperate(HttpServletRequest request) throws Exception;
    void deletePlace(String id) throws SQLException;
}
