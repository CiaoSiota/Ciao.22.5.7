package com.java.service;

import com.java.bean.Country;
import com.java.dao.CountryDao;
import com.java.dao.CountryDaoImpl;

import java.util.List;

public class CountryServiceImpl implements CountryService{
    CountryDao sd = new CountryDaoImpl();
    @Override
    public List<Country> selectAllCountry() {
        return sd.selectAllCountry();
    }
}
