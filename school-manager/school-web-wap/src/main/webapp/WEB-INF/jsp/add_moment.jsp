<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="themes/icon.css">
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/common.js"></script>
	<style type="text/css">
		label{
			width:120px;
			display:block;
		}
		
	</style>
	<script type="text/javascript">
		function select_type(){
			$('#w').window('open');
		}
		function closedWin(){
			$('#w').window('close');
		}
		
        function uploadPic(){  
            if($("#file").val()==""){  
                $.messager.alert("提示","请选择文件夹");  
                return false;  
            }  
             
        }  
	</script>
					
	<div style="background:#fafafa;width:99%;height:300px;">
	    <form id="ff" method="post" novalidate>
	        <lable style="margin-left:15px">类目一</lable>
		    <input id="type1" class="easyui-combobox" data-options="
				valueField: 'id',
				textField: 'text',
				url: '/item/cat/list',
				onSelect: function(rec){
				$('#type2').combo('clear');
				var url = '/item/cat/list?id='+rec.id;
				$('#type2').combobox('reload', url);
			}">
			<lable style="margin-left:15px">类目二</lable>
			<input id="type2" class="easyui-combobox" data-options="valueField:'id',textField:'text'">
	        
	        <div style="margin:15px">
	            <label for="subject">内容:</label>
	            <input class="easyui-validatebox" type="text" name="content"></input>
	        </div>
	        <div style="margin:15px">
	            <input type="hidden" name="pic" />
	            <a href="javascript:void(0)" class="easyui-linkbutton onePicUpload">图片上传</a>
	        </div>
	        <lable style="margin-left:15px">国籍</lable>
			<input id="country" class="easyui-combobox" data-options="
				valueField: 'id',
				textField: 'text',
				url: '/localtion/cat/list',
				onSelect: function(rec){
				var url = '/localtion/cat/list?id='+rec.id;
				$('#provice').combobox('reload', url);
		    }">

			<lable style="margin-left:15px">省份</lable>
		    <input id="provice" class="easyui-combobox" data-options="
				valueField: 'id',
				textField: 'text',
				url: '/localtion/cat/list',
				onSelect: function(rec){
				var url = '/localtion/cat/list?id='+rec.id;
				$('#city').combobox('reload', url);
		    }">
		    <lable style="margin-left:15px">城市</lable>
		    <input id="city" class="easyui-combobox" data-options="
				valueField: 'id',
				textField: 'text',
				url: '/localtion/cat/list',
				onSelect: function(rec){
				var url = '/localtion/cat/list?id='+rec.id;
				$('#village').combobox('reload', url);
		    }">
		    <lable style="margin-left:15px">区域</lable>
		    <input id="village" class="easyui-combobox" data-options="
				valueField: 'id',
				textField: 'text',
				url: '/localtion/cat/list',
				onSelect: function(rec){
				var url = '/school/cat/list?id='+rec.id;
				$('#school').combobox('reload', url);
		    }"><br/>
		    <lable style="margin-left:15px">学校</lable>
		    <input id="school" class="easyui-combobox" data-options="
				valueField: 'id',
				textField: 'text',
				url: '/school/cat/list',
				onSelect: function(rec){
				var url = '/school/cat/list?id='+rec.id;
				$('#academy').combobox('reload', url);
		    }">
		    <lable style="margin-left:15px">学院</lable>
		    <input id="academy" class="easyui-combobox" data-options="
				valueField: 'id',
				textField: 'text',
				url: '/school/cat/list',
				onSelect: function(rec){
				var url = '/school/cat/list?id='+rec.id;
				$('#major').combobox('reload', url);
		    }">
		    <lable style="margin-left:15px">专业</lable>
		    <input id="major" class="easyui-combobox" data-options="
				valueField: 'id',
				textField: 'text',
				url: '/school/cat/list',
				onSelect: function(rec){
				var url = '/school/cat/list?id='+rec.id;
				$('#theclass').combobox('reload', url);
		    }">
		    <lable style="margin-left:15px">班级</lable>
			<input id="theclass" class="easyui-combobox" data-options="valueField:'id',textField:'text'">
			
			<div style="margin:15px">  
                                      图片: <input accept="image/gif, image/jpeg,image/jpg, image/png" id="file" type="file" name="myfiles"/><br/>     
            </div>  
                        
	        <div style="margin:15px">
	            <label for="level">等级:</label>
				<input class="easyui-combobox" name="level"
						data-options="
								url:'combobox_data.json',
								valueField:'id',
								textField:'text',
								panelHeight:'auto'
						">
	        </div>
	        <div style="margin:15px">
	            <input type="submit" value="提交">
	        </div>
	    </form>
		
		<!--  <div id="w"  class="easyui-window" data-options="title:'类目',iconCls:'icon-save'" style="width:600px;height:430px;padding:0px;" closed="true">
			<div class="easyui-layout" data-options="fit:true">
				<div data-options="region:'center',border:false" style="padding:10px;background:#fff;border:1px solid #ccc;">
					<ul id="isLeaf" class="easyui-tree" ></ul>
				</div>
				<div data-options="region:'south',border:false" style="text-align:right;padding:5px 0;">
					<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="resize()">提交</a>
					<a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="javascript:void(0)" onclick="closedWin()">取消、</a>
				</div>
			</div>
		</div> -->
	</div>
	
	
<script type="text/javascript">
// 初始化选择类目组件


		$(".selectItemCat").each(function(i,e){
			
		//	var type1 = $("#type1").val(); 
			//var type2 = $("#type2").val(); 
			var type1 = $("#type1").val(); 
			var type2 = $("#type2").val(); 
			
			var _ele = $(e);
			if(type1 && type2){
				_ele.after("<span style='margin-left:10px;'>"+type1+type2+"</span>");
			}else{
				_ele.after("<span style='margin-left:10px;'></span>");
			}
			
			_ele.unbind('click').click(function(){
				$("<div>").css({padding:"5px"}).html("<ul>")
				.window({
					width:'500',
				    height:"450",
				    modal:true,
				    closed:true,
				    iconCls:'icon-save',
				    title:'选择类目',
				    onOpen : function(){
				    	var _win = this;
				    	$("ul",_win).tree({
				    		url:'/item/cat/list',
				    		animate:true,
				    		onClick : function(node){
				    			if($(this).tree("isLeaf",node.target)){
				    				// 填写到cid中
				    				_ele.parent().find("[name=type2]").val(node.id);
				    				_ele.next().text(node.text).attr("type2",node.id);
				    				$(_win).window('close');
				    				if(data && data.fun){
				    					data.fun.call(this,node);
				    				}
				    			}
				    		}
				    	});
				    },
				    onClose : function(){
				    	$(this).window("destroy");
				    }
				}).window('open');
			});
		});

	
</script>

