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
		    <th>编号</th>
		    <th>名称</th>
		    <th>操作</th>
		  </tr>
		  <#if kindLists??>
			  <#list kindLists as kind>
			  <tr>
			  		<th>${kind_index + 1}</th>
			  		<th>${kind.name}</th>
			  		<th><a class="btn" href="/kind/delete/${kind.id?c}">删除</a></th>
			  </tr>
			  </#list>
		  </#if>
    </table>
    <a class="btn" href = "/kind/add">添加</a>
</body>
</html>
