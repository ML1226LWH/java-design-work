<%@ page import="swu.ml.design.domain.Destination" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<!DOCTYPE html>
<%@ page contentType="text/html; charset=utf-8" language="java" %>
<html>
<head>
    <title>途羊网站风光</title>
    <meta>
    <meta http-equiv="Content-Type" charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="keywords"
          content="Play-Offs Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);

    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>

    <!--fonts-->
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.js"></script>
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
    <!--fonts-->

    ${pageContext.request.contextPath }/css/style.css
    <!--fonts-->
    <!--choclatecss-->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/chocolat.css" type="text/css" media="screen" charset="utf-8" />
    <!--owlcss-->
    <link href="${pageContext.request.contextPath }/css/owl.carousel.css" rel="stylesheet">
    <!--bootstrap-->
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <!--coustom css-->
    <link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css"/>
    <!--default-js-->
    <script src="${pageContext.request.contextPath }/js/jquery-2.1.4.min.js"></script>
    <!--bootstrap-js-->
    <script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
    <!--script-->
    <script src="${pageContext.request.contextPath }/js/jquery.circlechart.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js"></script>
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
<div class="header">
    <nav class="navbar navbar-default">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <div class="logo">
                    <a class="navbar-brand" href="index.html">途🐏</a>
                </div>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav cl-effect-2">
                    <li><a href="index.html"><span data-hover="Home">首页</span></a></li>
                    <li><a href="./AddPlace.html"><span data-hover="Add">添加</span></a></li>
                    <li><a href="./gallery_root.jsp"><span class="active" data-hover="Scenery">风景</span></a></li>
                    <li><a href="../logout"><span class="active" data-hover="Logout">注销</span></a></li>
                </ul>
                <ul class="form_acess">
                    <form class="re-disgn1" action="../findplace">
                        <input type="text" name="searchKey" class="textbox" value="Search.." onfocus="this.value = '';"
                               onblur="if (this.value == '') {this.value = 'Search...';}">
                        <input type="submit" value="">
                    </form>
                </ul>
            </div><!-- /.navbar-collapse -->
            <div class="clearfix"></div>
        </div><!-- /.container-fluid -->
    </nav>
</div>
<!--header-->
<div class="gallery">
    <h3>风景大赏</h3>
    <div class="container">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/swipebox.css">
        <script src="${pageContext.request.contextPath}/js/jquery.swipebox.min.js"></script>
        <script type="text/javascript">
            jQuery(function ($) {
                $(".swipebox").swipebox();
            });
        </script>
        <div class="gallery-grids">
<%
    List<Destination> destinations=(List<Destination>)request.getAttribute("destinations");
    if(destinations!=null && destinations.size()>0){
        Iterator it = destinations.iterator();
        while(it.hasNext()){
            Destination destination=(Destination) it.next();
%>
            <li class='col-md-3 pd_stn'>
                <div class='grid_item'>
                    <a href='<%=destination.getImg()%>' class='swipebox'>
                        "<img src='<%=destination.getImg()%>' class='img-responsive' height='152px'></a>
                    <div class='myset'>
                        <%=destination.getDescribe()%>
                    </div>
                    <div class='hover_span hvr-text'>
                        <h5>No.</h5>
                        <h6><%=destination.getId()%></h6>
                        <div class='hvr-icons'>
                            <span class='glyphicon glyphicon-camera cam' aria-hidden='true'>
                            <span class='glyphicon glyphicon-menu-right nav_rt' aria-hidden='true'>
                        </div>
                    </div>
                </div>
                </li>
<%
                    }
                }else{
%>
                    <h1>暂无该景点！敬请期待！</h1>
            <%
                    }
    %>



        </div>
    </div>
</div>
<!--footer-->
<div class="logo_label">
    <div class="container">
        <div class="logo re_styl5">
            <a class="navbar-brand" href="#">途🐏</a>
        </div>
    </div>
</div>
<div class="footer">
    <div class="container">
        <div class="div1">
            <div class="col-md-2 head">
                <h3>即将上线</h3>
                <ul class="inspired">
                    <li><a href="#">丽江古城</a></li>
                    <li><a href="#">海南三亚</a></li>
                    <li><a href="#">玉龙雪山</a></li>
                    <li><a href="#">桂林山水</a></li>
                    <li><a href="#">江西上饶</a></li>
                </ul>
            </div>
            <div class="col-md-2 head">
                <h3>已上线</h3>
                <ul class="customer">
                    <li><a href="#">四川色达</a></li>
                    <li><a href="#">长白山</a></li>
                    <li><a href="#">西沙群岛</a></li>
                    <li><a href="#">乌镇</a></li>
                </ul>
            </div>
            <div class="col-md-2 head">
                <h3>sites</h3>
                <ul class="sites">
                    <li><a href="https://www.zhihu.com/">进一步查询旅游地点</a></li>
                    <li><a href="https://www.xiaohongshu.com/">进一步查询旅游地点</a></li>
                    <li><a href="https://www.tuniu.com/">进一步查询旅游地点</a></li>
                </ul>
            </div>
            <div class="col-md-2 head">
                <h3>contents</h3>
                <ul class="contents">
                    <li><a href="#">Scenery</a></li>
                    <li><a href="AddPlace.html">Add</a></li>
                </ul>
            </div>
            <div class="col-md-4 mail_soc">


            </div>
            <div class="clearfix"></div>
        </div>

    </div>
</div>
</body>
<script lang="javascript">
    $(function () {
        loadData(1,4);
    })


    function loadData(startPage,pageSize) {
        $.get(`../listplaces?page=listPage&startPage=${"${startPage}"}&pageSize=${"${pageSize}"}`, function (res) {
        var dataList = "";
        for (let i = 0; i < destinations.size(); i++) {
            var b = destinations.get(i);
            alert(b);
            dataList += "<li class='col-md-3 pd_stn'>" +
                    "<div class='grid_item'>" +
                    "<a href='" + b.img + "' class='swipebox'>" +
                    "<img src='." + b.img + "' class='img-responsive' height='152px'>"+"</a>"+
                    "<div class='myset'>"+b.describe+"</div>"+
                    "<div class='hover_span hvr-text'>" +
                    "<h5>No.</h5>" +
                    "<h6>" + b.id + "</h6>" +
                    "<div class='hvr-icons'>" +
                    "<span class='glyphicon glyphicon-camera cam' aria-hidden='true'>" +
                    "<span class='glyphicon glyphicon-menu-right nav_rt' aria-hidden='true'>" +
                    "</div>" +
                    "</div>" +
                    "<a href='../editplace?id="+b.id+"' style='margin-left:50px'>编辑</a>"+
                    "<a href='../deleteplace?id="+b.id+"' style='margin-left:10px'>删除</a>"+
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

</doctype>