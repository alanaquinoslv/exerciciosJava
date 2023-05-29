package sptech.banco.de.dados;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author alan
 */
public class Conexao {

    private JdbcTemplate connection;

    public Conexao() {

        BasicDataSource dataSource = new BasicDataSource();

        //driver do banco usado --- pesquisar qual o do mysql
        dataSource​.setDriverClassName("org.h2.Driver");

        dataSource​.setUrl("jdbc:h2:file:./banco_teste");

        dataSource​.setUsername("");

        dataSource​.setPassword("");

        this.connection = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConnection() {
        return connection;
    }
    
    

}
