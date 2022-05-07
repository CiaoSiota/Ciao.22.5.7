package com.java.dao;

import com.java.bean.City;

import java.util.List;

public interface CityDao {
    List<City> selectCityByCountryId(int countryId);
}
