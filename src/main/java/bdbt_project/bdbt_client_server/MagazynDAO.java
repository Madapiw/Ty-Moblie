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
        String query = "SELECT M.\"ID_magazynu\", M.\"Wielkosc\", M.\"Nr_tel\", \"NazwaOp\" as Operator ,A2.\"Miasto\" from \"Operatorzy\" join \"Magazyny\" M on \"Operatorzy\".\"ID_operatora\" = M.\"ID_operatora\" join \"Adresy\" A2 on A2.\"ID_adresu\" = M.\"ID_adresu\"";

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
