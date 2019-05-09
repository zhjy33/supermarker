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
		    <th>单据</th>
		    <th>商品</th>
		    <th>进货数量</th>
		    <th>进货时间</th>
		    <th>备注</th>
		    <th>操作</th>
		  </tr>
		  <#if stockList??>
			  <#list stockList as stock>
			  <tr>
			  		<th>${stock_index + 1}</th>
			  		<th>${stock.number}</th>
			  		<th>${stock.goodsName}</th>
			  		<th>${stock.qty?c}</th>
			  		<th>${stock.date}</th>
			  		<th>${stock.remark}</th>
			  		<th><a class="btn" href="/in/delete/${stock.id?c}">删除</a></th>
			  </tr>
			  </#list>
		  </#if>
    </table>
    <a class="btn" href = "/in/add">添加</a>
</body>
</html>
