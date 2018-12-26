package com.jt.pro.common;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.util.Properties;

public class ProfileDataSource {
    @Bean(name = "devDatasource")
    @Profile(value = "dev")
    public DataSource getDataSource(){
        Properties props =new Properties();
        props.setProperty("driver","com.msyql.jdbc.Driver");
        props.setProperty("url","jdbc:mysql://localhost:3306/fudan");
        props.setProperty("username","root");
        props.setProperty("password","root");
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(props);
        }catch (Exception e){
            e.printStackTrace();
        }
        return dataSource;
    }
    @Bean(name = "testDatasource")
    @Profile(value = "dev")
    public DataSource getTestDataSource(){
        Properties props =new Properties();
        props.setProperty("driver","com.msyql.jdbc.Driver");
        props.setProperty("url","jdbc:mysql://localhost:3306/fudan");
        props.setProperty("username","fudan");
        props.setProperty("password","123456");
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(props);
        }catch (Exception e){
            e.printStackTrace();
        }
        return dataSource;
    }
}
