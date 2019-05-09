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
	<form action="/stock/search" method = "post">
	  <div class="control-group">
	    <label class="control-label" for="inputEmail">编号</label>
	    <div class="controls">
		    <input type="text" placeholder="编号" name = "number">
	    </div>
	  </div>
	  <div class="control-group">
	    <label class="control-label" for="inputEmail">名称</label>
	    <div class="controls">
		    <input type="text" placeholder="名称" name = "name">
	    </div>
	  </div>
	  <input class="btn btn-primary" type="submit" value = "查询"/>
</form>
</body>
</html>
