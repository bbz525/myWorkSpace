package com.jt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import javax.xml.soap.Name;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
@Component
public class App 
{
    @Autowired
    @Qualifier(value = "devDatasource")
    DataSource dataSource;
    public static void main(String[] args) {
        Connection conn=null;
        try {
            conn=new App().dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(conn);
    }
}
