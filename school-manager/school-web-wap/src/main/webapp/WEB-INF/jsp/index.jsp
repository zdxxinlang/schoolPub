<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>短消息管理</title>
<link rel="stylesheet" type="text/css" href="themes/gray/easyui.css">
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<style type="text/css">
body {
	font: 12px/20px "微软雅黑", "宋体", Arial, sans-serif, Verdana, Tahoma;
	padding: 0;
	margin: 0;
}
a:link {
 text-decoration: none;
}
a:visited {
 text-decoration: none;
}
a:hover {
 text-decoration: underline;
}
a:active {
 text-decoration: none;
}
.cs-north {
	height:60px;background:#B3DFDA;
}
.cs-north-bg {
	width: 100%;
	height: 100%;
	background: url(themes/gray/images/header_bg.png) repeat-x;
}
.cs-north-logo {
	height: 40px;
	padding: 15px 0px 0px 5px;
	color:#fff;font-size:22px;font-weight:bold;text-decoration:none
}
.cs-west {
	width:200px;padding:0px;border-left:1px solid #99BBE8;
}
.cs-south {
	height:25px;background:url('themes/gray/images/panel_title.gif') repeat-x;padding:0px;text-align:center;
}
.cs-navi-tab {
	padding: 5px;
}
.cs-tab-menu {
	width:120px;
}
.cs-home-remark {
	padding: 10px;
}
</style>
<script type="text/javascript">
<!--首页的js代码-->
function addTab(title, url){
	if ($('#tabs').tabs('exists', title)){
		$('#tabs').tabs('select', title);//选中并刷新
		var currTab = $('#tabs').tabs('getSelected');
		var url = $(currTab.panel('options').content).attr('src');
		if(url != undefined && currTab.panel('options').title != 'Home') {
			$('#tabs').tabs('update',{
				tab:currTab,
				options:{
					content:createFrame(url)
				}
			});
		}
	} else {
		var content = createFrame(url);
		$('#tabs').tabs('add',{
			title:title,
			content:content,
			closable:true
		});
	}
	tabClose();
}
function createFrame(url) {
	var s = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
	return s;
}
		
function tabClose() {
	/*双击关闭TAB选项卡*/
	$(".tabs-inner").dblclick(function(){
		var subtitle = $(this).children(".tabs-closable").text();
		$('#tabs').tabs('close',subtitle);
	});
	/*为选项卡绑定右键*/
	$(".tabs-inner").bind('contextmenu',function(e){
		$('#mm').menu('show', {
			left: e.pageX,
			top: e.pageY
		});

		var subtitle =$(this).children(".tabs-closable").text();

		$('#mm').data("currtab",subtitle);
		$('#tabs').tabs('select',subtitle);
		return false;
	});
}		
//绑定右键菜单事件
function tabCloseEven() {
	//刷新
	$('#mm-tabupdate').click(function(){
		var currTab = $('#tabs').tabs('getSelected');
		var url = $(currTab.panel('options').content).attr('src');
		if(url != undefined && currTab.panel('options').title != 'Home') {
			$('#tabs').tabs('update',{
				tab:currTab,
				options:{
					content:createFrame(url)
				}
			});
		}
	});
	//关闭当前
	$('#mm-tabclose').click(function(){
		var currtab_title = $('#mm').data("currtab");
		$('#tabs').tabs('close',currtab_title);
	});
	//全部关闭
	$('#mm-tabcloseall').click(function(){
		$('.tabs-inner span').each(function(i,n){
			var t = $(n).text();
			if(t != 'Home') {
				$('#tabs').tabs('close',t);
			}
		});
	});
	//关闭除当前之外的TAB
	$('#mm-tabcloseother').click(function(){
		var prevall = $('.tabs-selected').prevAll();
		var nextall = $('.tabs-selected').nextAll();		
		if(prevall.length>0){
			prevall.each(function(i,n){
				var t=$('a:eq(0) span',$(n)).text();
				if(t != 'Home') {
					$('#tabs').tabs('close',t);
				}
			});
		}
		if(nextall.length>0) {
			nextall.each(function(i,n){
				var t=$('a:eq(0) span',$(n)).text();
				if(t != 'Home') {
					$('#tabs').tabs('close',t);
				}
			});
		}
		return false;
	});
	//关闭当前右侧的TAB
	$('#mm-tabcloseright').click(function(){
		var nextall = $('.tabs-selected').nextAll();
		if(nextall.length==0){
			//msgShow('系统提示','后边没有啦~~','error');
			alert('后边没有啦~~');
			return false;
		}
		nextall.each(function(i,n){
			var t=$('a:eq(0) span',$(n)).text();
			$('#tabs').tabs('close',t);
		});
		return false;
	});
	//关闭当前左侧的TAB
	$('#mm-tabcloseleft').click(function(){
		var prevall = $('.tabs-selected').prevAll();
		if(prevall.length==0){
			alert('到头了，前边没有啦~~');
			return false;
		}
		prevall.each(function(i,n){
			var t=$('a:eq(0) span',$(n)).text();
			$('#tabs').tabs('close',t);
		});
		return false;
	});

	//退出
	$("#mm-exit").click(function(){
		$('#mm').menu('hide');
	});
}

$(function() {
	tabCloseEven();
	$('.cs-navi-tab').click(function() {
		var $this = $(this);
		var href = $this.attr('src');
		var title = $this.text();
		addTab(title, href);
	});
});

<!--tree的计js代码-->
function reload(){
	var node = $('#tt2').tree('getSelected');
	if (node){
		$('#tt2').tree('reload', node.target);
	} else {
		$('#tt2').tree('reload');
	}
}
function getChildren(){
	var node = $('#tt2').tree('getSelected');
	if (node){
		var children = $('#tt2').tree('getChildren', node.target);
	} else {
		var children = $('#tt2').tree('getChildren');
	}
	var s = '';
	for(var i=0; i<children.length; i++){
		s += children[i].text + ',';
	}
	alert(s);
}
function getChecked(){
	var nodes = $('#tt2').tree('getChecked');
	var s = '';
	for(var i=0; i<nodes.length; i++){
		if (s != '') s += ',';
		s += nodes[i].text;
	}
	alert(s);
}
function getSelected(){
	var node = $('#tt2').tree('getSelected');
	alert(node.text);
}
function collapse(){
	var node = $('#tt2').tree('getSelected');
	$('#tt2').tree('collapse',node.target);
}
function expand(){
	var node = $('#tt2').tree('getSelected');
	$('#tt2').tree('expand',node.target);
}
function collapseAll(){
	var node = $('#tt2').tree('getSelected');
	if (node){
		$('#tt2').tree('collapseAll', node.target);
	} else {
		$('#tt2').tree('collapseAll');
	}
}
function expandAll(){
	var node = $('#tt2').tree('getSelected');
	if (node){
		$('#tt2').tree('expandAll', node.target);
	} else {
		$('#tt2').tree('expandAll');
	}
}
function append(){
	var node = $('#tt2').tree('getSelected');
	$('#tt2').tree('append',{
		parent: (node?node.target:null),
		data:[{
			text:'new1',
			checked:true
		},{
			text:'new2',
			state:'closed',
			children:[{
				text:'subnew1'
			},{
				text:'subnew2'
			}]
		}]
	});
}
function remove(){
	var node = $('#tt2').tree('getSelected');
	$('#tt2').tree('remove', node.target);
}
function update(){
	var node = $('#tt2').tree('getSelected');
	if (node){
		node.text = '<span style="font-weight:bold">new text</span>';
		node.iconCls = 'icon-save';
		$('#tt2').tree('update', node);
	}
}
function isLeaf(){
	var node = $('#tt2').tree('getSelected');
	var b = $('#tt2').tree('isLeaf', node.target);
	alert(b)
}
</script>
</head>
<body class="easyui-layout">
	<div region="north" border="true" class="cs-north">
		<div class="cs-north-bg"><div class="cs-north-logo">校园平台管理系统后台</div></div>
	</div>
	<div region="west" border="true" split="true" title="Navigation" class="cs-west">
		<div class="easyui-accordion" fit="true" border="false">
				<div title="朋友圈管理">
					<a href="javascript:void(0);" src="showMomentsPage" class="cs-navi-tab">查看所有信息</a><br/>
					<a href="javascript:void(0);" src="showAddMomentPage" class="cs-navi-tab">新增朋友圈文字</a>
				</div>
				<div title="Layout">
					<a href="javascript:void(0);" src="accordion.html" class="cs-navi-tab">accordion</a>
					<a href="javascript:void(0);" src="layout.html" class="cs-navi-tab">layout</a>
					<a href="javascript:void(0);" src="layout1.html" class="cs-navi-tab">layout1</a>
					<a href="javascript:void(0);" src="layout2.html" class="cs-navi-tab">layout2</a>
					<a href="javascript:void(0);" src="panel.html" class="cs-navi-tab">panel</a>
					<a href="javascript:void(0);" src="panel2.html" class="cs-navi-tab">panel1</a>
					<a href="javascript:void(0);" src="tabs.html" class="cs-navi-tab">tabs</a>
				</div>
				<div title="Menu and Button">
					<a href="javascript:void(0);" src="menu.html" class="cs-navi-tab">menu</a>
					<a href="javascript:void(0);" src="menubutton.html" class="cs-navi-tab">menubutton</a>
					<a href="javascript:void(0);" src="linkbutton.html" class="cs-navi-tab">linkbutton</a>
					<a href="javascript:void(0);" src="splitbutton.html" class="cs-navi-tab">splitbutton</a>
				</div>
				<div title="Form">
					<a href="javascript:void(0);" src="form.html" class="cs-navi-tab">form</a>
					<a href="javascript:void(0);" src="validatebox.html" class="cs-navi-tab">validatebox</a>
					<a href="javascript:void(0);" src="combo.html" class="cs-navi-tab">combo</a>
					<a href="javascript:void(0);" src="combobox.html" class="cs-navi-tab">combobox</a>
					<a href="javascript:void(0);" src="combotree.html" class="cs-navi-tab">combotree</a>
					<a href="javascript:void(0);" src="combogrid.html" class="cs-navi-tab">combogrid</a>
					<a href="javascript:void(0);" src="numberbox.html" class="cs-navi-tab">numberbox</a>
					<a href="javascript:void(0);" src="numberbox2.html" class="cs-navi-tab">numberbox1</a>
					<a href="javascript:void(0);" src="datebox.html" class="cs-navi-tab">datebox</a>
					<a href="javascript:void(0);" src="datetimebox.html" class="cs-navi-tab">datetimebox</a>
					<a href="javascript:void(0);" src="calendar.html" class="cs-navi-tab">calendar</a>
					<a href="javascript:void(0);" src="timespinner.html" class="cs-navi-tab">timespinner</a>
					<a href="javascript:void(0);" src="numberspinner.html" class="cs-navi-tab">numberspinner</a>
					<a href="javascript:void(0);" src="slider.html" class="cs-navi-tab">slider</a>
				</div>
				<div title="Window">
					<a href="javascript:void(0);" src="window.html" class="cs-navi-tab">window</a>
					<a href="javascript:void(0);" src="dialog.html" class="cs-navi-tab">dialog</a>
					<a href="javascript:void(0);" src="messager.html" class="cs-navi-tab">messager</a>
				</div>
				<div title="DataGrid and Tree">
					<a href="javascript:void(0);" src="datagrid.html" class="cs-navi-tab">datagrid</a>
					<a href="javascript:void(0);" src="propertygrid.html" class="cs-navi-tab">propertygrid</a>
					<a href="javascript:void(0);" src="tree.html" class="cs-navi-tab">tree</a>
					<a href="javascript:void(0);" src="tree2.html" class="cs-navi-tab">tree1</a>
					<a href="javascript:void(0);" src="treegrid.html" class="cs-navi-tab">treegrid</a>
					<a href="javascript:void(0);" src="treegrid2.html" class="cs-navi-tab">treegrid1</a>
					<a href="javascript:void(0);" src="treegrid3.html" class="cs-navi-tab">treegrid2</a>
				</div>
		</div>
	</div>
	<div id="mainPanle" region="center" border="true" border="false">
		 <div id="tabs" class="easyui-tabs"  fit="true" border="false" >
                <div title="Home">
				<div class="cs-home-remark">
					<h1>信息管理系统</h1> <br>
					制作：潇湘菌子 <br>
					电话：13734717137<br>
				</div>
				</div>
        </div>
	</div>

	<div region="south" border="false" class="cs-south">@1393565334@qq.com</div>
	
	<div id="mm" class="easyui-menu cs-tab-menu">
		<div id="mm-tabupdate">刷新</div>
		<div class="menu-sep"></div>
		<div id="mm-tabclose">关闭</div>
		<div id="mm-tabcloseother">关闭其他</div>
		<div id="mm-tabcloseall">关闭全部</div>
	</div>
</body>
</html>