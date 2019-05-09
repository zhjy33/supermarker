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
		    <th>名称</th>
		    <th>地址</th>
		    <th>联系人</th>
		    <th>联系电话</th>
		    <th>邮编</th>
		    <th>传真</th>
		    <th>电子邮箱</th>
		    <th>操作</th>
		  </tr>
		  <#if supplierList??>
			  <#list supplierList as supplier>
			  <tr>
			  		<th>${supplier_index + 1}</th>
			  		<th>${supplier.companyName}</th>
			  		<th>${supplier.address}</th>
			  		<th>${supplier.contactName}</th>
			  		<th>${supplier.tel?c}</th>
			  		<th>${supplier.postCode}</th>
			  		<th>${supplier.fax}</th>
			  		<th>${supplier.email}</th>
			  		<th><a class="btn" href="/supplier/delete/${supplier.id?c}">删除</a></th>
			  </tr>
			  </#list>
		  </#if>
    </table>
    <a class="btn" href = "/supplier/add">添加</a>
</body>
</html>
