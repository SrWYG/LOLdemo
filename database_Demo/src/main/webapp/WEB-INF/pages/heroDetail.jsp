<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/12/11
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href='http://fonts.googleapis.com/css?family=Droid+Sans' rel='stylesheet' type='text/css'>
    <meta charset="utf-8">
    <title>Pure CSS3 Menu</title>
    <link href="../../css/style.css" media="screen" rel="stylesheet" type="text/css" />
    <link href="../../css/iconic.css" media="screen" rel="stylesheet" type="text/css" />
    <link href="../../css/bootstrap.css" rel="stylesheet" type="text/css" />
    <link href="../../css/bootstrap-table.css" rel="stylesheet" type="text/css" />
    <script src='../../js/Chart.js' type="text/javaScript"></script>
    <script src="../../js/jquery-3.3.1.min.js"></script>
    <script src="../../js/prefix-free.js"></script>
    <script src="../../js/bootstrap.min.js"></script>
    <script src="../../js/bootstrap-table.js"></script>
</head>

<body>
<div class="wrap">

    <nav>
        <ul class="menu">
            <li><a href='javascript:void(0)' onclick="searchHeroDetail()"><span class="iconic magnifying-glass"></span>当前查询英雄</a>
            </li>
            <input id="heroName" style="position: relative;top:10px" type="text" name="hero_name"/>
            </li>
        </ul>
        <div class="clearfix"></div>
    </nav>
    <div style="position:relative; top:20px ;background-color:gainsboro; height:400px" >
        <div>
            <span>本次查询耗时：</span><text id="timeSpan"></text>
        </div>
        <div style="position:relative; float:left;top:20px ;background-color:white; height: 300px;width: 500px" >
            <canvas id="myChart" style="z-index: 9999" width=100 height=50 aria-label="zhexian" role="img" ></canvas>
        </div>
        <div style="position:relative;float:left; top:20px ;background-color:white; height: 300px;left:20px;width: 400px">
            <table  class="table bootstrap-table" id="heroDetailList" data-pagination="false" data-side-pagination="client" data-page-size="5" >

            </table>
        </div>
    </div>

</div>
<div class="loading" id="ajax-waiting" style="display:none">
    <img src="../../img/loading.gif" />
</div>
</body>

<script src="../../js/hero_controller.js"></script>
</html>
