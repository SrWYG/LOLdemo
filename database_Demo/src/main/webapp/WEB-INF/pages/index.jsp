<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/12/4
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href='http://fonts.googleapis.com/css?family=Droid+Sans' rel='stylesheet' type='text/css'>
    <meta charset="utf-8">
    <title>英雄胜率查询Demo</title>
    <link href="../../css/style.css" media="screen" rel="stylesheet" type="text/css" />
    <link href="../../css/iconic.css" media="screen" rel="stylesheet" type="text/css" />
    <link href="../../css/bootstrap.css" rel="stylesheet" type="text/css" />
    <link href="../../css/bootstrap-table.css" rel="stylesheet" type="text/css" />
    <script src="../../js/jquery-3.3.1.min.js"></script>
    <script src="../../js/prefix-free.js"></script>
    <script src="../../js/bootstrap.min.js"></script>
    <script src="../../js/bootstrap-table.js"></script>
</head>

<body>
<div class="wrap">

    <nav>
        <ul class="menu">
            <li><a href="#"><span class="iconic magnifying-glass"></span> 赛季:<text id="versionTest"></text> </a>
                <ul style="z-index: 9999">
                    <li ><a href='javascript:void(0)' onclick=getDetail("2017")>2017</a></li>
                    <li><a  href='javascript:void(0)' onclick=getDetail("2016")>2016</a></li>
                    <li><a  href='javascript:void(0)' onclick=getDetail("2015")>2015</a></li>
                    <li><a  href='javascript:void(0)' onclick=getDetail("2014")>2014</a></li>

                </ul>
            </li>
        </ul>
        <div class="clearfix"></div>
    </nav>
    <div style="position:relative; top:20px ;background-color:gainsboro">
        <div>
            <span>本次查询耗时：</span><text id="timeSpan"></text>
            <span>视图查询耗时：</span><text id="timeSpan_view"></text>
        </div>
        <table  class="table bootstrap-table" id="list_hero" data-pagination="true" data-side-pagination="client" data-page-size="10" >

        </table>
        <button type="button" class="btn btn-primary" onclick="getDetailByView()">reload by view</button>
    </div>

</div>

<div class="loading" id="ajax-waiting" style="display:none">
    <img src="../../img/loading.gif" />
</div>

</body>
<script src="../../js/data_controller.js"></script>
</html>
