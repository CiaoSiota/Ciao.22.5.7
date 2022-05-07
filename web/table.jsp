<%--
  Created by IntelliJ IDEA.
  User: 11708
  Date: 2022/5/5
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表</title>
    <script src="js/jquery.min.js"></script>
    <script>
        //1、查询出所有国家，将查询到的结果写到countrysel中   <option value="1">中国</option>
        $(function () {
            $.get("CountryServlet", function (data) {
                //data并不是js对象，是字符串   eval("(" + data + ")");
                var obj = eval("(" + data + ")");
                var str = "";
                for (var i = 0; i < obj.length; i++) {
                    str += "<option value='" + obj[i].id + "'>" + obj[i].name + "</option>";
                }

                $("#countrysel").html($("#countrysel").html() + str);
            });

            $("#countrysel").change(function () {

                var countryId = $("#countrysel").val();
                $.getJSON("CityServlet",{"countryId":countryId},function (data){
                    if (data.length > 0){
                        var str = "";
                        for (var i = 0; i < data.length; i++) {
                            str += "<option value='" + data[i].id + "'>" + data[i].name + "</option>";
                        }
                        $("#citysel").html(str);
                    }else{
                        $("#citysel").html("<option value='0'>-请选择-</option>");
                    }
                })

            })
        })


    </script>
</head>
<body>


<select name="countrysel" id="countrysel">
    <option value="0">-请选择-</option>
</select>
<select name="citysel" id="citysel">
    <option value="0">-请选择-</option>
</select>


</body>

</html>
