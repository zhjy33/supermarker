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
		    <th>商品名称</th>
		    <th>销售数量</th>
		    <th>单价</th>
		    <th>总价</th>
		    <th>销售时间</th>
		    <th>备注</th>
		    <th>操作</th>
		  </tr>
		  <#if sellList??>
			  <#list sellList as sell>
			  <tr>
			  		<th>${sell_index + 1}</th>
			  		<th>${sell.goodsName}</th>
			  		<th>${sell.qty}</th>
			  		<th>${sell.price}</th>
			  		<th>${sell.subTotal}</th>
			  		<th>${sell.date}</th>
			  		<th>${sell.remark}</th>
			  		<th><a class="btn" href="/sell/delete/${sell.id?c}">删除</a></th>
			  </tr>
			  </#list>
		  </#if>
    </table>
    <a class="btn" href = "/sell/add">添加</a>
</body>
</html>
