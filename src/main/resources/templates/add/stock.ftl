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
	<form action="/in/create" class="form-horizontal" method = "post">
	  <div class="control-group">
	    <label class="control-label" >商品</label>
	    <div class="controls">
	    <select name = "goodsId" id = "kindId" required>
			<option value = "">---</option>
			<#if goodsList??>
				<#list goodsList as goods>
					<option value = "${goods.id?c}">${goods.name}</option>
				</#list>
			</#if>
	    </select>
	    </div>
	    <label class="control-label" >单据</label>
	    <div class="controls">
		    <input type="text" placeholder="单据" name = "number" required>
	    </div>
	    <label class="control-label" >数量</label>
	    <div class="controls">
		    <input type="text" placeholder="数量" name = "qty" required>
	    </div>
	    <label class="control-label" >进货时间</label>
	    <div class="controls">
		    <input type="text" placeholder="进货时间" name = "date" required>
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
