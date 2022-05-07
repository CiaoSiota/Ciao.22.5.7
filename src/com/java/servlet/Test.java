package com.java.servlet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        a.add("asd");
        a.add("asd1");
        a.add("asd2");
        ObjectMapper ma = new ObjectMapper();
        String s1 = null;
        try {
            s1 = ma.writeValueAsString(a);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(s1);


    }
}
