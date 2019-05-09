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
		    <th>编号</th>
		    <th>名称</th>
		    <th>单位</th>
		    <th>备注</th>
		    <th>操作</th>
		  </tr>
		  <#if goodsList??>
			  <#list goodsList as goods>
			  <tr>
			  		<th>${goods_index + 1}</th>
			  		<th>${goods.number}</th>
			  		<th>${goods.name}</th>
			  		<th>${goods.uom}</th>
			  		<th>${goods.remark}</th>
			  		<th><a class="btn" href="/goods/delete/${goods.id?c}">删除</a></th>
			  </tr>
			  </#list>
		  </#if>
    </table>
    <a class="btn" href = "/goods/add">添加</a>
</body>
</html>
