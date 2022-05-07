package com.java.service;

import com.java.bean.City;
import com.java.dao.CityDao;
import com.java.dao.CityDaoImpl;

import java.util.List;

public class CityServiceImpl implements CityService{
    CityDao sd = new CityDaoImpl();
    @Override
    public List<City> selectCityByCountryId(int countryId) {
        return sd.selectCityByCountryId(countryId);
    }
}
