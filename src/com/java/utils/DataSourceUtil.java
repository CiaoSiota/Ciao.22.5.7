package com.java.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

public class DataSourceUtil {

    public static DataSource ds;

    //获取资源

    public static DataSource getDataSource() {

        Properties pr = new Properties();

        try {
            InputStream is = Class.forName("com.java.utils.DataSourceUtil").getResourceAsStream("/druid.properties");
            pr.load(is);
            ds = DruidDataSourceFactory.createDataSource(pr);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return ds;
    }

    public static void main(String[] args) {
        System.out.println(DataSourceUtil.getDataSource());
    }






}
