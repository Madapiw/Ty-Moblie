package bdbt_project.bdbt_client_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MagazynDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public MagazynDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Magazyn> list(){
        String query = "SELECT * FROM DOCKER.\"Magazyny\"";

        List<Magazyn> MagazynList = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Magazyn.class));

        return MagazynList;
    }

    public void save(Magazyn magazyn){

    }

    public Magazyn get(int id){
        return null;
    }

    public void update(Magazyn magazyn){

    }

    public void delete(int id){

    }
}
