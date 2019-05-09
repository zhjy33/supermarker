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
	<form action="/goods/create" class="form-horizontal" method = "post">
	  <div class="control-group">
	    <label class="control-label" >类别</label>
	    <div class="controls">
	    <select name = "kindId" id = "kindId"  required>
			<option value = "">---</option>
			<#if kindsList??>
				<#list kindsList as kind>
					<option value = "${kind.id?c}">${kind.name}</option>
				</#list>
			</#if>
	    </select>
	    </div>
	    <label class="control-label" >编号</label>
	    <div class="controls">
		    <input type="text" placeholder="编号" name = "number" required>
	    </div>
	    <label class="control-label" >名称</label>
	    <div class="controls">
		    <input type="text" placeholder="名称" name = "name" required>
	    </div>
	    <label class="control-label" >单位</label>
	    <div class="controls">
		    <input type="text" placeholder="单位" name = "uom" required>
	    </div>
	    <label class="control-label" >备注</label>
	    <div class="controls">
		    <input type="text" placeholder="备注" name = "remark" required>
	    </div>
	  </div>
	  <input class="btn btn-primary" type="submit" value = "保存"/>
</form>
</body>
</html>
