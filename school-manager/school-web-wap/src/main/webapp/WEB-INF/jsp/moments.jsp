<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Custom DataGrid Pager - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="themes/icon.css">
	<link rel="stylesheet" type="text/css" href="css/easyui.css">
	<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body class="easyui-layout">
	<div data-options="region:'center',title:''" >
		<table id="dg" title="" style="height:530px"
				data-options="rownumbers:true,singleSelect:true,pagination:true,url:'momentsMsg/list',method:'get'">
			<thead>
				<tr>
					<th data-options="field:'content',width:240">内容</th>
					<th data-options="field:'pic',width:120,align:'center'">照片位置</th>
					<th data-options="field:'goods',width:60">赞数</th>
					<th data-options="field:'forward',width:60">转发数</th>
					<th data-options="field:'favourite',width:60">收藏数</th>
					<th data-options="field:'typename2',width:80,align:'center'">类型</th>
					<th data-options="field:'level',width:40">等级</th>
					<th data-options="field:'uname',width:80,align:'center'">用户名</th>
					<th data-options="field:'createTime',width:110,align:'center'">创建时间</th>
					<th data-options="field:'schoolname',width:100">学校名</th>
					<th data-options="field:'urbanname',width:80,align:'center'">位置信息</th>
				</tr>
			</thead>
		</table>
	<script type="text/javascript">
		$(function(){
			var pager = $('#dg').datagrid().datagrid('getPager');	// get the pager of datagrid
			pager.pagination({
				buttons:[{
					iconCls:'icon-search',
					handler:function(){
						alert('search');
					}
				},{
					iconCls:'icon-add',
					handler:function(){
						window.location.href='showAddMomentPage';
					}
				},{
					iconCls:'icon-edit',
					handler:function(){
						alert('edit');
					}
				}]
			});			
		});
		

	</script>
	</div>
</body>
</html>