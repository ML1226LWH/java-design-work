<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2021/12/25
  Time: 0:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/chocolat.css" type="text/css" media="screen" charset="utf-8" />
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <style>
        .myset{
            width:228px;
            height:152px;
            overflow: hidden;
            text-overflow:ellipsis;
            white-space: nowrap;
            display: block;
            font-size: 14px;
        }
    </style>
</head>
<body>
<div>
    <table style="margin-bottom: 20px;" width="100%" align="center" border="0" >
        <tbody id="data"></tbody>
        <a href="javascript:prevPage()">上一页</a>
        <a href="javascript:nextPage()">下一页</a>
        <input type="hidden" name="currentPage" value="">
        <input type="hidden" name="totalPage" value="">

    </table>
</div>

</body>
<script src="js/jquery-2.1.4.min.js"></script>

<script lang="javascript">
    $(function () {
        loadData(1,4);
    })


    function loadData(startPage,pageSize) {

        $.get(`listplaces?page=listPage&startPage=${"${startPage}"}&pageSize=${"${pageSize}"}`, function (res) {
            var dataList = "";
            for (let i = 0; i < res.destinationList.length; i++) {
                var b = res.destinationList[i];
                dataList += "<li class='col-md-3 pd_stn'>" +
                    "<div class='grid_item'>" +
                    "<a href='" + b.img + "' class='swipebox'>" +
                    "<img src='" + b.img + "' class='img-responsive' height='152px'>" +
                    "<div class='myset'>"+b.describe+"</div>"+
                    "<div class='hover_span hvr-text'>" +
                    "<h5>sep</h5>" +
                    "<h6>" + b.id + "</h6>" +
                    "<div class='hvr-icons'>" +
                    "<span class='glyphicon glyphicon-camera cam' aria-hidden='true'>" +
                    "<span class='glyphicon glyphicon-menu-right nav_rt' aria-hidden='true'>" +
                    "</div>" +
                    "</div>" +
                    "</a>" +
                    "</div>" +
                    "</li>";

            }
            $("#data").html(dataList);
            $("input[name=currentPage]").val(res.currentPage);
            $("input[name=totalPage]").val(res.totalPages);

        })
    }

    // 上一页
    function prevPage() {
        let prevPage = parseInt($("input[name=currentPage]").val())-1;
        if (prevPage < 1) {
            prevPage = 1;
        }
        loadData(prevPage,4);
    }

    // 下一页
    function nextPage() {
        let nextPage = parseInt($("input[name=currentPage]").val())+1;
        let totalPage = parseInt($("input[name=totalPage]").val());
        if (nextPage > totalPage) {
            nextPage = totalPage;
        }
        loadData(nextPage ,4);
    }

</script>
</html>
<%--
<script lang="javascript">
  function getPageData(pageNum,pageSize){
        $.get("listplaces?methodName=listPage",{startPage:pageNum,pageSize:pageSize},function(result){
            console.log(result);
        },"json");
    }
    $(function () {
        $.get("listplaces?page=listPage", function (res) {
            var dataList = "";
            for (let i = 0; i < res.destinationList.length; i++) {
                var b = res.destinationList[i];
                dataList += "<li class='col-md-3 pd_stn'>" +
                    "<div class='grid_item'>" +
                    "<a href='" + b.img +"' class='swipebox'>" +
                    "<img src='" + b.img +"' class='img-responsive'>" +
                    "<div class='hover_span hvr-text'>" +
                    "<h5>No.</h5>" +
                    "<h6>" + b.id + "</h6>" +
                    "<div class='hvr-icons'>" +
                    "<span class='glyphicon glyphicon-camera cam' aria-hidden='true'>" +
                    "<span class='glyphicon glyphicon-menu-right nav_rt' aria-hidden='true'>" +
                    "</div>" +
                    "</div>" +
                    "</a>" +
                    "</div>" +
                    "</li>";

            }
            $("#data").html(dataList)
        })
    })--%>
