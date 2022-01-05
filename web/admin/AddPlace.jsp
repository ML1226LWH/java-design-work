<doctype html!>
	<%@ page contentType="text/html; charset=utf-8" language="java" %>
	<%@ page import="swu.ml.design.domain.Destination" %>
	<html>
	<head>
		<title>途羊网站上新啦！</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="Play-Offs Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
		<script type="application/x-javascript"> addEventListener("load", function() {setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

		<!--fonts-->


		<!--fonts-->
		<!--choclatecss-->
		<link rel="stylesheet" href="../css/chocolat.css" type="text/css" media="screen" charset="utf-8" />
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
					<ul class="nav navbar-nav cl-effect-2">
						<li><a href="index.html"><span data-hover="Home">首页</span></a></li>
						<li><a href="#"><span data-hover="Add">添加</span></a></li>
						<li><a href="./gallery_root.jsp"><span class="active" data-hover="Scenery">风景</span></a></li>
						<li><a href="../logout"><span class="active" data-hover="Logout">注销</span></a></li>
					</ul>
					<ul class="form_acess">
						<form class="re-disgn1">
							<input type="text" name="s" class="textbox" value="Search.." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search...';}">
							<input type="submit" value="">
						</form>
					</ul>
				</div><!-- /.navbar-collapse -->
				<div class="clearfix"></div>
			</div><!-- /.container-fluid -->
		</nav>
	</div>
	<!--header-->
	<div class="contact_page">
		<h3>添加旅游地点</h3>
		<div class="container">
			<div class="col-md-6">
				<div class="contact_form">
					<form method="post" action="/MyNewApp/addPlace" enctype="multipart/form-data">

						<input class="nuber" type="text" name="place" value="地点" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '地点';}" ><br>

						<input  class="name" type="text"  style="width:540px; height:144px;"  name="describe" value="请输入一段简短的描述" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入一段简短的描述';}"><br>
						<input   class="nuber" type="file"  name="img" value="上传图片"><br>

						<button type="clear" class="btn btn-info mrgn-can">Clear</button>
						<button type="submit" class="btn btn-info mrgn-can">Submit</button>
					</form>
				</div>
			</div>
			<div class="col-md-6">
				<div class="map">
					<iframe  class="embed-responsive-item" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2708701.6196657238!2d57.47843070707167!3d24.36721917215885!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3e5f43496ad9c645%3A0x74ced0bf2b0029e9!2sDubai+-+United+Arab+Emirates!5e0!3m2!1sen!2sin!4v1437020921804"frameborder="0" style="border:0" allowfullscreen></iframe>
				</div>
			</div>
			<div class="clearfix"></div>
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
	</body>
	</html>
