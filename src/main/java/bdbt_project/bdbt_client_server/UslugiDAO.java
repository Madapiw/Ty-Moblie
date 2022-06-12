package bdbt_project.bdbt_client_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UslugiDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public UslugiDAO(JdbcTemplate jdbcTemplate){
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Uslugi> list(){
        String query = "select  U.\"ID_uslugi\", U.\"Nazwa\" as Nazwa, U.\"Typ\", U.\"Rodzaj\", U.\"Cena_netto\", \"NazwaOp\" as Operator from \"Operatorzy\" join \"Uslugi\" U on \"Operatorzy\".\"ID_operatora\" = U.\"ID_operatora\"";

        List<Uslugi> UslugiList = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Uslugi.class));
        System.out.println(UslugiList);
        return UslugiList;
    }

    public void save(Uslugi usligi){

    }

    public Uslugi get(int id){
        return null;
    }

    public void update(Uslugi uslugi){

    }

    public void delete(int id){}

}
