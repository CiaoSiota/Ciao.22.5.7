package com.java.dao;

import com.java.bean.Country;

import com.java.utils.DataSourceUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class CountryDaoImpl implements CountryDao {

    @Override
    public List<Country> selectAllCountry() {
        List<Country> list = null;
        QueryRunner qr = new QueryRunner(DataSourceUtil.getDataSource());
        String sql = "select * from country";
        try {
            list = qr.query(sql,new BeanListHandler<>(Country.class));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
}