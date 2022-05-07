package com.java.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.bean.City;
import com.java.service.CityService;
import com.java.service.CityServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/CityServlet")
public class CityServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String countryId = request.getParameter("countryId");
        CityService cs = new CityServiceImpl();
        List<City> list = cs.selectCityByCountryId(Integer.parseInt(countryId));

        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(list);

        writer.print(s);
    }
}
