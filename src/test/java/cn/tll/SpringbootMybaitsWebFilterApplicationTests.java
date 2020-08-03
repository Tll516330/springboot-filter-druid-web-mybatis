package cn.tll;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class SpringbootMybaitsWebFilterApplicationTests {

    //DI注入数据源
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        //查看默认数据源
        System.out.println("默认数据源"+dataSource.getClass());
        //获得连接
        Connection connection = dataSource.getConnection();
        System.out.println("获得连接"+connection);
        //关闭连接
        connection.close();
    }

}
