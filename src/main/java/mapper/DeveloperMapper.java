package mapper;

import model.Developer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DeveloperMapper implements RowMapper<Developer> {

    public static final String SELECT_ALL = "select dev.id, dev.first_name, dev.second_name from developers dev";
    public static final String INSERT = "insert into \"developers\" (\"id\", \"first_name\", \"second_name\") values (DEFAULT, ?, ?)";

    @Override
    public Developer mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("id");
        String firstName = rs.getString("first_name");
        String secondName = rs.getString("second_name");
        return new Developer(id, firstName, secondName);
    }
}
