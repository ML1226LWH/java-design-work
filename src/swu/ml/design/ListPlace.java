package swu.ml.design;

import java.sql.SQLException;
import java.util.List;

public class ListPlace {
    public List<Destination> listDestination() throws SQLException {
        String sql = "SELECT * FROM books ORDER BY id DESC";
        List<Destination> destinations = DBUtils.getDestination(sql);
        return destinations;
    }

}
