package bdbt_project.bdbt_client_server;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.DriverManager;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MagazynDAOTest {

    private MagazynDAO dao;

    @BeforeEach
    void setup() throws Exception {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:orcl");
        datasource.setUsername("DOCKER");
        datasource.setPassword("password");
        datasource.setDriverClassName("oracle.jdbc.OracleDriver");

        dao = new MagazynDAO(new JdbcTemplate(datasource));
    }

    @Test
    void testList(){
        List<Magazyn> MagazynList = dao.list();

        assertFalse(MagazynList.isEmpty());
    }
}
