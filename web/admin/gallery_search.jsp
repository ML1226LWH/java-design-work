<%@ page import="swu.ml.design.Destination" %>
<!DOCTYPE html>
<%@ page contentType="text/html; charset=utf-8" language="java" %>
<html>
<head>
    <title>大好风光呀</title>
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
    <!--choclatecss-->
    <link rel="stylesheet" href="../css/chocolat.css" type="text/css" media="screen" charset="utf-8"/>
    <!--owlcss-->
    <link href="../css/owl.carousel.css" rel="stylesheet">
    <!--bootstrap-->
    <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <!--coustom css-->
    <link href="../css/style.css" rel="stylesheet" type="text/css"/>
    <!--default-js-->
    <script src="../js/jquery-2.1.4.min.js"></script>
    <!--bootstrap-js-->
    <script src="../js/bootstrap.min.js"></script>
    <!--script-->
    <script src="../js/jquery.circlechart.js"></script>
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
<%
    Destination destination= (Destination) request.getAttribute("destination");
%>
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
                    <a class="navbar-brand" href="index.html">Hunk</a>
                </div>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav cl-effect-2">
                    <li><a href="index.html"><span data-hover="Home">Home</span></a></li>
                    <li><a href="admin/AddPlace.html"><span data-hover="About">About </span></a></li>
                    <li><a href="gallery.html"><span class="active" data-hover="Scenery">Scenery</span></a></li>
                    <li><a href="blog.html"><span data-hover="Typo">Typo</span></a></li>
                    <li><a href="tuyang-login.html"><span data-hover="Login">Login</span></a></li>
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
        <link rel="stylesheet" href="../css/swipebox.css">
        <script src="../js/jquery.swipebox.min.js"></script>
        <script type="text/javascript">
            jQuery(function ($) {
                $(".swipebox").swipebox();
            });
        </script>
        <div class="gallery-grids">

            <ul>
                <table style="margin-bottom: 20px;" width="100%" align="center" border="0" >
                    <tbody id="data"></tbody>
                    <a href="javascript:prevPage()">上一页</a>
                    <a href="javascript:nextPage()">下一页</a>
                    <input type="hidden" name="currentPage" value="">
                    <input type="hidden" name="totalPage" value="">

                </table>
            </ul>

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
                <h3>get inspired</h3>
                <ul class="inspired">
                    <li><a href="#">Head wear</a></li>
                    <li><a href="#">mens</a></li>
                    <li><a href="#">Unisex</a></li>
                    <li><a href="#">Brand protection</a></li>
                    <li><a href="#">investors</a></li>
                </ul>
            </div>
            <div class="col-md-2 head">
                <h3>support</h3>
                <ul class="customer">
                    <li><a href="#">Terms and Conditions</a></li>
                    <li><a href="#">Privacy Policy</a></li>
                    <li><a href="tuyang-login.html">Contact Us</a></li>
                    <li><a href="#">FAQ</a></li>
                </ul>
            </div>
            <div class="col-md-2 head">
                <h3>sites</h3>
                <ul class="sites">
                    <li><a href="#">yyy.com</a></li>
                    <li><a href="#">zzz.com</a></li>
                    <li><a href="#">aaa.com</a></li>
                </ul>
            </div>
            <div class="col-md-2 head">
                <h3>contents</h3>
                <ul class="contents">
                    <li><a href="gallery.html">Gallery</a></li>
                    <li><a href="blog.html">Typo</a></li>
                </ul>
            </div>
            <div class="col-md-4 mail_soc">
                <div class="form_data">
                    <form>
                        <input class="mail2" type="text" name="email" value="E-mail" onfocus="this.value = '';"
                               onblur="if (this.value == '') {this.value = 'E-mail';}">
                        <input class="btn btn-default re_dsgn6" type="button" value="join">
                    </form>
                    <p>subscribe us.</p>
                </div>
                <div class="social">
                    <ul>
                        <li><a href="#" class="face"></a></li>
                        <li><a href="#" class="twit"></a></li>
                        <li><a href="#" class="gplus"></a></li>
                        <li><a href="#" class="insta"></a></li>
                    </ul>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
        <div class="div2">
            <p>Copyright &copy; 2015.Company name All rights reserved.More Templates <a
                    href="http://www.baisheng999.com/" target="_blank" title="网站模板库">网站模板库</a> - Collect from <a
                    href="http://www.baisheng999.com/" title="网页模板" target="_blank">网页模板</a></p>
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
            for (let i = 0; i < destinations.length; i++) {
                var b = destinations[i];
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