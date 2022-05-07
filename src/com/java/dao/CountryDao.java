package com.java.dao;

import com.java.bean.Country;

import java.util.List;

public interface CountryDao {
    List<Country> selectAllCountry();
}
