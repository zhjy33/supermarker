<!DOCTYPE html>
<html>
  <head>
    <title>超市管理</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
  </head>
	<script type="text/javascript" src="javascript/jq/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
<body style="background:#dceaf4; height:100%; width: 100%;">
<div class="container" id="login" style="margin-top:400px;background: #f7f7f9; height:90%; width: 30%;">
    <div style="margin:0 auto;text-align:center">
        <form method="post" action="login">
			<h2>超市管理系统</h2>
            <dl>
                <dt>用户名：</dt>
                <dd><input type="text" name="name" class="input-text"/></dd>
                <dt>密　码：</dt>
                <dd><input type="password" name="password" class="input-text"/></dd>
            </dl>
            <div class="buttons">
                <input type="submit" name="submit" value="登录系统" class="btn btn-primary"/>
                <input type="reset" name="reset" value="重　　填" class="btn"/>
            </div>
			<#if error??>${error}</#if>
        </form>
        
    </div>
</div>
</body>
</html>
