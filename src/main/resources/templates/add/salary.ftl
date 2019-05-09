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
	<form action="/salary/create" class="form-horizontal" method = "post">
	  <div class="control-group">
	    <label class="control-label" >员工姓名</label>
	    <div class="controls">
	    <select name = "employId" id = "kindId" required>
			<option value = "">---</option>
			<#if employ??>
				<#list employ as e>
					<option value = "${e.id?c}">${e.name}</option>
				</#list>
			</#if>
	    </select>
	    </div>
	    <label class="control-label" >月份</label>
	    <div class="controls">
		    <input type="text" placeholder="月份" name = "salaryDate" required>
	    </div>
	    <label class="control-label" >工资</label>
	    <div class="controls">
		    <input type="text" placeholder="工资" name = "salary" required>
	    </div>
	    <label class="control-label" >奖金</label>
	    <div class="controls">
		    <input type="text" placeholder="奖金" name = "achievementSalary" required>
	    </div>
	    <label class="control-label" >扣款</label>
	    <div class="controls">
		    <input type="text" placeholder="扣款" name = "debitFee" required>
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
