package hello;

import mapper.DeveloperMapper;
import model.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Transactional
public class DeveloperDAO {


    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Developer> getAllDevelopers(){
        String sql = DeveloperMapper.SELECT_ALL;
        return jdbcTemplate.query(sql, new DeveloperMapper());
    }

    public void insertDeveloper(Developer developer){
        String sql = DeveloperMapper.INSERT;
        Object[] params = new Object[] { developer.getFirstName(), developer.getSecondName()};
        jdbcTemplate.update(sql, params);
    }
}
