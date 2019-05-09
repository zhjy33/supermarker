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
		    <th>员工姓名</th>
		    <th>月份</th>
		    <th>工资</th>
		    <th>奖金</th>
		    <th>扣款</th>
		    <th>备注</th>
		    <th>操作</th>
		  </tr>
		  <#if salariesList??>
			  <#list salariesList as salaries>
			  <tr>
			  		<th>${salaries_index + 1}</th>
			  		<th>${salaries.employName}</th>
			  		<th>${salaries.salaryDate}</th>
			  		<th>${salaries.salary}</th>
			  		<th>${salaries.achievementSalary}</th>
			  		<th>${salaries.debitFee}</th>
			  		<th>${salaries.remark}</th>
			  		<th><a class="btn" href="/salary/delete/${salaries.id?c}">删除</a></th>
			  </tr>
			  </#list>
		  </#if>
    </table>
    <a class="btn" href = "/salary/add">添加</a>
</body>
</html>
