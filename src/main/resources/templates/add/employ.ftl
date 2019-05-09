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
    <script>
    </script>
<body class="blue-style">
	<form action="/employ/create" class="form-horizontal" method = "post">
	  <div class="control-group">
	    <label class="control-label" >姓名</label>
	    <div class="controls">
		    <input type="text" placeholder="姓名" name = "name" required>
	    </div>
	    <label class="control-label" >性别</label>
	    <div class="controls">
	    	<label class="radio">
			  <input type="radio" name="gender" value="1" checked required>
			 	 男
			</label>
	    	<label class="radio">
			  <input type="radio" name="gender" value="0" required>
			 	 女
			</label>
	    </div>
	    <label class="control-label" >年龄</label>
	    <div class="controls">
		    <input type="text" placeholder="年龄" name = "age" required>
	    </div>
	    <label class="control-label" >学历</label>
	    <div class="controls">
		    <input type="text" placeholder="学历" name = "educationalBackground" required>
	    </div>
	    <label class="control-label" >职位</label>
	    <div class="controls">
		    <input type="text" placeholder="职位" name = "position" required>
	    </div>
	  </div>
	  <input class="btn btn-primary" type="submit" value = "保存"/>
</form>
</body>
</html>
