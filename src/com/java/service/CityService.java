package com.java.service;

import com.java.bean.City;

import java.util.List;

public interface CityService {
    List<City> selectCityByCountryId(int countryId);
}
