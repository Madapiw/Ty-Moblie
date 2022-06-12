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
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Magazyn> list(){
        String query = "SELECT \"Magazyny\".\"ID_magazynu\", \"Magazyny\".\"Wielkosc\", \"Magazyny\".\"Nr_tel\", \"Operatorzy\".\"Nazwa\", \"Adresy\".\"Miasto\" from DOCKER.\"Magazyny\" left join \"Operatorzy\" on \"Magazyny\".\"ID_magazynu\"=\"Operatorzy\".\"ID_operatora\" left join \"Adresy\" on \"Magazyny\".\"ID_magazynu\" = \"Adresy\".\"ID_adresu\"";

        List<Magazyn> MagazynList = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Magazyn.class));
        System.out.println(MagazynList);
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
