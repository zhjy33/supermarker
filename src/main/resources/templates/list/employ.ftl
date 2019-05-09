<!DOCTYPE html>
<html>
  <head>
    <title>超市管理</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">
  </head>
	<script type="text/javascript" src="../javascript/jq/jquery.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.min.js"></script>
<body class="blue-style">
    <table class="table">
    	<tr>
		    <th>序号</th>
		    <th>姓名</th>
		    <th>性别</th>
		    <th>年龄</th>
		    <th>学历</th>
		    <th>职位</th>
		    <th>操作</th>
		  </tr>
		  <#if employList??>
			  <#list employList as employ>
			  <tr>
			  		<th>${employ_index + 1}</th>
			  		<th>${employ.name}</th>
			  		<th>${employ.gender?string('男', '女')}</th>
			  		<th>${employ.age}</th>
			  		<th>${employ.educationalBackground}</th>
			  		<th>${employ.position}</th>
			  		<th><a class="btn" href="/employ/delete/${employ.id?c}">删除</a></th>
			  </tr>
			  </#list>
		  </#if>
    </table>
    <a class="btn" href = "/employ/add">添加</a>
</body>
</html>
