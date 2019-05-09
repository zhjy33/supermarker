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
	<form action="/supplier/create" class="form-horizontal" method = "post">
	    <label class="control-label" >名称</label>
	    <div class="controls">
		    <input type="text" placeholder="名称" name = "companyName" required>
	    </div>
	    
	    <label class="control-label" >地址</label>
	    <div class="controls">
		    <input type="text" placeholder="地址" name = "address" required>
	    </div>
	    
	    <label class="control-label" >联系人</label>
	    <div class="controls">
		    <input type="text" placeholder="联系人" name = "contactName" required>
	    </div>
	    
	    <label class="control-label" >联系电话</label>
	    <div class="controls">
		    <input type="text" placeholder="联系电话" name = "tel" required>
	    </div>
	    
	    <label class="control-label" >邮编</label>
	    <div class="controls">
		    <input type="text" placeholder="邮编" name = "postCode" required>
	    </div>
	    
	    <label class="control-label" >传真</label>
	    <div class="controls">
		    <input type="text" placeholder="传真" name = "fax" required>
	    </div>
	    
	    <label class="control-label" >电子邮箱</label>
	    <div class="controls">
		    <input type="text" placeholder="电子邮箱" name = "email" required>
	    </div>
	  </div>
	  <input class="btn btn-primary" type="submit" value = "保存"/>
</form>
</body>
</html>
