<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
	<script type="text/javascript" src="javascript/jq/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <link href="css/main.css" rel="stylesheet">
  </head>
<body>
<nav class="navbar navbar-inverse"> 
<div style="background:#a5a5a5"> 
<div class="navbar-header" > 
		<div style="margin:0 auto;text-align:right">
			<a class="btn btn-info" href="/logout"> <span class="glyphicon glyphicon-lock"></span>退出登录</a> 
		</div>
</div> 
</div> 
</nav> 
<!-- 中间主体内容部分 -->
 <div class="pageContainer"> 
 <!-- 左侧导航栏 --> 
 <div class="pageSidebar"> 
 	<ul class="nav nav-stacked nav-pills"> 
 		<li role="presentation"> <a href="/kind/list" target="mainFrame" >种类管理</a> </li> 
 		<li role="presentation"> <a href="/goods/list" target="mainFrame">商品管理</a> </li> 
 		<li role="presentation"> <a href="/supplier/list" target="mainFrame">供应商管理</a> </li> 
 		<li role="presentation"> <a href="/in/list" target="mainFrame">入库管理</a> </li> 
 		<li role="presentation"> <a href="/sell/list" target="mainFrame">销售管理</a> </li> 
 		<li role="presentation"> <a href="/stock/search-page" target="mainFrame">库存统计</a> </li> 
 		<li role="presentation"> <a href="/employ/list" target="mainFrame">员工管理</a> </li> 
 		<li role="presentation"> <a href="/salary/list" target="mainFrame">财务管理</a> </li> 
 	</ul> 
 </div> 
 <!-- 左侧导航和正文内容的分隔线 --> 
 <div class="splitter"></div> 
 <!-- 正文内容部分 --> 
 <div class="pageContent"> 
 <iframe src="/welcome" id="mainFrame" name="mainFrame" 
       frameborder="0" width="100%"  height="100%" frameBorder="0"> </iframe> 
       </div> </div> 
       <!-- 底部页脚部分 --> 
       <div class="footer"> 
       
       <script type="text/javascript">
 $(".nav li").click(function() {
        $(".active").removeClass('active');
        $(this).addClass("active");
    }); 


 </script>

</body>
</html>
