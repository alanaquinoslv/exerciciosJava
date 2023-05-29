package sptech.banco.de.dados;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author alan
 */
public class TesteConexao {

    public static void main(String[] args) {
        Conexao conexao = new Conexao();

        JdbcTemplate con = conexao.getConnection();

        con.execute("drop table if exists filme");

        //separar palavras no banco com _
        con.execute("create table filme (id int primary key auto_increment,"
                + "nome varchar (45),"
                + "ano_lancamento int,"
                + ")");

        con.update("insert into filme values (null, 'Sherk 5', 2023)");
        con.update("insert into filme values (null, 'Carros 4', 2025)");
        con.update("insert into filme values (null, 'Panico', 1998)");
        con.update("insert into filme values (null, 'Bob Sponja', 2020)");
        con.update("insert into filme values (null, 'A casa monstro', 2006)");

        Filme novoFilme = new Filme(null, "Poeira em alto mar", 1999);
        con.update("insert into filme values (?, ?, ?)",
                novoFilme.getId(),
                novoFilme.getNome(),
                novoFilme.getAnoLancamento());

        List<Filme> listaDeFilmes = new ArrayList();

        listaDeFilmes = con.query("select * from filme", new BeanPropertyRowMapper<>(Filme.class));
        System.out.println(listaDeFilmes);
                
         // da pra usar variavel na pesquisa
        listaDeFilmes = con.query("select * from filme where nome = ?", 
                new BeanPropertyRowMapper<>(Filme.class), novoFilme.getNome());
        System.out.println(listaDeFilmes);
        
        
        //editando 
        con.update("update filme set nome = 'Barbie' where nome = ?", "Sherek 5");
           listaDeFilmes = con.query("select * from filme", new BeanPropertyRowMapper<>(Filme.class));
        System.out.println(listaDeFilmes);
        
        //deletando 
          con.update("delete from filme where id = ?", 2);
           listaDeFilmes = con.query("select * from filme", new BeanPropertyRowMapper<>(Filme.class));
        System.out.println(listaDeFilmes);
        
    }
}
