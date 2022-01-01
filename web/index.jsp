<%--
  Created by IntelliJ IDEA.
  User: meilv
  Date: 2021/12/8
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Home</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="keywords" content="Play-Offs Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
  <script type="application/x-javascript"> addEventListener("load", function() {setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
  <!meta charset utf="8">
  <!--fonts-->


  <!--fonts-->
  <!--owlcss-->
  <link href="css/owl.carousel.css" rel="stylesheet">
  <!--bootstrap-->
  <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
  <!--coustom css-->
  <link href="css/style.css" rel="stylesheet" type="text/css"/>
  <!--default-js-->
  <script src="js/jquery-2.1.4.min.js"></script>
  <!--bootstrap-js-->
  <script src="js/bootstrap.min.js"></script>
  <!--script-->
</head>
<body>
<div class="header">
  <nav class="navbar navbar-default">
    <div class="container">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
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
        <ul class="nav navbar-nav cl-effect-2 active_hover">
          <li><a href="index.jsp"><span class="active" data-hover="Home">Home</span></a></li>
          <li><a href="admin/AddPlace.html"><span data-hover="About">About </span></a></li>
          <li><a href="gallery.jsp"><span data-hover="Scenery">Scenery</span></a></li>
          <li><a href="blog.html"><span data-hover="Typo">Typo</span></a></li>
          <li><a href="tuyang-login.html"><span data-hover="Login">Login</span></a></li>
          <li><a><span data-hover="当前访问人数">当前访问<%=this.getServletConfig().getServletContext().getAttribute("count")%>人</span></a></li>
        </ul>
        <ul class="form_acess">
          <form class="re-disgn1">
            <input type="text" name="s" class="textbox" value="Search.." onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Search...';}">
            <input type="submit" value="">
          </form>
        </ul>
      </div><!-- /.navbar-collapse -->
      <div class="clearfix"></div>
    </div><!-- /.container-fluid -->
  </nav>

  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active  image-wid">
        <img src="./images/1a.jpg" alt="..." />
        <div class="carousel-caption">
          <h3>途🐏</h3>
          <p>一个旅游网站</p>
          <button type="button" class="btn btn-info sld">Read more</button>
        </div>
      </div>
      <div class="item  image-wid">
        <img src="./images/1b.jpg" alt="..." />
        <div class="carousel-caption">
          <h3>途🐏</h3>
          <p>一个旅游网站</p>
          <button type="button" class="btn btn-info sld">Read more</button>
        </div>
      </div>
      <div class="item  image-wid">
        <img src="./images/1c.jpg" alt="..." />
        <div class="carousel-caption">
          <h3>途🐏</h3>
          <p>一个旅游网站</p>
          <button type="button" class="btn btn-info sld">Read more</button>
        </div>
      </div>
      <div class="item  image-wid">
        <img src="./images/1d.jpg" alt="..." />
        <div class="carousel-caption">
          <h3>途🐏</h3>
          <p>一个旅游网站</p>
          <button type="button" class="btn btn-info sld">Read more</button>
        </div>
      </div>
    </div>
    <!-- Controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<div class="header-bottom">
  <div class="container">
    <div class="col-md-6 main_div">
      <div class="de-mar">
        <div class="col-md-2 icn_div">
          <span class="glyphicon glyphicon-sunglasses re_styl2" aria-hidden="true"></span>
        </div>
        <div class="col-md-10 txt-div">
          <h4>途🐏</h4>
          <p>一个旅游网站</p>
        </div>
        <div class="clearfix"></div>
      </div>
      <div class="de-mar">
        <div class="col-md-2 icn_div">
          <span class="glyphicon glyphicon-camera re_styl2" aria-hidden="true"></span>
        </div>
        <div class="col-md-10 txt-div">
          <h4>途🐏</h4>
          <p>一个旅游网站</p>
        </div>
        <div class="clearfix"></div>
      </div>
    </div>
    <div class="col-md-6 main_div">
      <div class="de-mar">
        <div class="col-md-2 icn_div">
          <span class="glyphicon glyphicon-heart re_styl2" aria-hidden="true"></span>
        </div>
        <div class="col-md-10 txt-div">
          <h4>途🐏</h4>
          <p>一个旅游网站</p>
        </div>
        <div class="clearfix"></div>
      </div>
      <div class="de-mar">
        <div class="col-md-2 icn_div">
          <span class="glyphicon glyphicon-picture re_styl2" aria-hidden="true"></span>
        </div>
        <div class="col-md-10 txt-div">
          <h4>途🐏</h4>
          <p>一个旅游网站</p>
        </div>
        <div class="clearfix"></div>
      </div>
    </div>
    <div class="clearfix"></div>
  </div>
</div>
<div class="icons-grid">
  <div class="container">
    <div class="col-md-3 txt-grid">
      <span class="glyphicon glyphicon-shopping-cart re_styl3" aria-hidden="true"></span>
      <h4>Shop</h4>
    </div>
    <div class="col-md-3 txt-grid">
      <span class="glyphicon glyphicon-apple re_styl3" aria-hidden="true"></span>
      <h4>Joy</h4>
    </div>
    <div class="col-md-3 txt-grid">
      <span class="glyphicon glyphicon-eye-open re_styl3" aria-hidden="true"></span>
      <h4>Look Up</h4>
    </div>
    <div class="col-md-3 txt-grid">
      <span class="glyphicon glyphicon-bell re_styl3" aria-hidden="true"></span>
      <h4>Notify</h4>
    </div>
    <div class="clearfix"></div>
  </div>
</div>
<div class="copyrights">Collect from <a href="http://www.baisheng999.com/" >手机网站模板</a></div>
<div class="images_grid">
  <h3>热门地点</h3>
  <div class="container">
    <ul class="grid cs-style-2">
      <div class="col-md-4 pd">
        <li>
          <figure>
            <img src="./images/1f.jpg" style="width:340px;height:220px;" alt="img02" />
            <figcaption>
              <h3>西湖</h3>
              <span>浙江杭州</span>
              <a href="gallery.html">Take a look</a>
            </figcaption>
          </figure>
        </li>
      </div>
      <div class="col-md-4 pd">
        <li>
          <figure>
            <img src="./images/1g.jpg" style="width:340px;height:220px;" alt="img02" />
            <figcaption>
              <h3>色达</h3>
              <span>四川省西北部</span>
              <a href="gallery.html">Take a look</a>
            </figcaption>
          </figure>
        </li>
      </div>
      <div class="col-md-4 pd">
        <li>
          <figure>
            <img src="./images/1h.jpg" style="width:340px;height:220px;"  alt="img02" />
            <figcaption>
              <h3>乌镇</h3>
              <span>浙江省嘉兴市桐乡市</span>
              <a href="gallery.html">Take a look</a>
            </figcaption>
          </figure>
        </li>
      </div>
      <div class="col-md-4 pd">
        <li>
          <figure>
            <img src="./images/1i.jpg" style="width:340px;height:220px;" alt="img02" />
            <figcaption>
              <h3>喀纳斯</h3>
              <span>喀纳斯风景区，位于新疆阿尔泰山中段</span>
              <a href="gallery.html">Take a look</a>
            </figcaption>
          </figure>
        </li>
      </div>
      <div class="col-md-4 pd">
        <li>
          <figure>
            <img src="./images/1j.jpg" style="width:340px;height:220px;"  alt="img02" />
            <figcaption>
              <h3>草原</h3>
              <span>内蒙古</span>
              <a href="gallery.html">Take a look</a>
            </figcaption>
          </figure>
        </li>
      </div>
      <div class="col-md-4 pd">
        <li>
          <figure>
            <img src="./images/1e.jpg" style="width:340px;height:220px;"  alt="img02" />
            <figcaption>
              <h3>布达拉宫</h3>
              <span>西藏</span>
              <a href="gallery.html">Take a look</a>
            </figcaption>
          </figure>
        </li>
      </div>
      <div class="clearfix"></div>
    </ul>
    <script src="js/toucheffects.js"></script>
    <script src="js/modernizr.custom.js"></script>
  </div>
</div>
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
            <input class="mail2" type="text" name="email" value="E-mail" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'E-mail';}">
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
      <p>Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="http://www.baisheng999.com/" target="_blank" title="网站模板库">网站模板库</a> - Collect from <a href="http://www.baisheng999.com/" title="网页模板" target="_blank">网页模板</a></p>
    </div>
  </div>
</div>
</body>
</html>