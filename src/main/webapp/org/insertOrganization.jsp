<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>系统主页</title>
<meta name="viewport" charset="utf-8" content="width=device-width, initial-scale=1">
<%@ include file="/tabledata.jsp"%>
<link href="${pageContext.request.contextPath}/css/bootstrap-override.css" rel="stylesheet">
<style>
.form-control {
	border-radius: 5px;
	height: 30px;
}
</style>

</head>
<body>
	<div id="abc" class="panel panel-dark-head">
		<div class="panel-heading">
			<h4 class="panel-title">新增组织信息</h4>
		</div>
		<!-- panel-heading -->
		<div class="panel-body nopadding">
			<form id="orgForm" method="post" class="form-bordered">

				<div class="form-group">
					<label class="col-sm-4 control-label">组织编码</label>
					<div class="col-sm-8">
						<input type="text" class="form-control" id="organCode" name="organCode" placeholder="请输入组织编码">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-4 control-label">组织名称</label>
					<div class="col-sm-8">
						<input class="form-control" id="organName" name="organName" placeholder="请输入组织名称">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-4 control-label">组织类型</label>
					<div class="col-sm-8">
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="1" name="organType" id="organType1"><label for="organType1">1</label>
						</div>
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="2" name="organType" id="organType2"><label for="organType2">2</label>
						</div>
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="3" name="organType" id="organType3"><label for="organType3">3</label>
						</div>
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="4" name="organType" id="organ_type4"><label for="organType4">4</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-4 control-label">是否在用</label>
					<div class="col-sm-8">
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="Y" name="inUse" id="inUse1"><label for="inUse1">否</label>
						</div>
						<div class="radio icheck-silver icheck-inline">
							<input type="radio" value="N" name="inUse" id="inUse2"><label for="inUse2">是</label>
						</div>
					</div>
				</div>
			
				<div class="form-group">
					<label class="col-sm-4 control-label">父组织信息</label>
					<div class="col-sm-8">
						<div class="input-group mb15">
							<input id="parentName" class="form-control" type="text" name="parentName" placeholder="请输入父组织信息"/>
							<input id="parentUuid" type="hidden" name="parentUuid"/>
							<span class="input-group-addon" data-toggle="modal" data-target="#orgTree"><i class="fa fa-paper-plane"></i></span> 
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="col-sm-4 control-label">描述</label>
					<div class="col-sm-8">
						<textarea class="form-control" id="description" name="description" placeholder="请输入描述"></textarea>
					</div>
				</div>

				<div class="form-group">
					<label class="col-sm-4 control-label">组织账号</label>
					<div class="col-sm-8">
						<input class="form-control" id="accountCode" name="accountCode" placeholder="请输入组织账号">
					</div>
				</div>

				<div class="form-group">
					<label class="col-sm-4 control-label">组织简称</label>
					<div class="col-sm-8">
						<input class="form-control" id="shortname" name="shortname" placeholder="请输入组织简称">
					</div>
				</div>

				<div class="form-group" style="text-align: center;">
					<div class="col-sm-12" style="text-align: center;">
						<input type="button" class="btn btn-default" onclick="submitForm()" value="提交" />
						&nbsp;&nbsp;&nbsp;&nbsp;
						<button type="reset" class="btn btn-default">重置</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<!-- 组织树 -->
	<div id="orgTree" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">组织树</h4>
				</div>
				<div class="modal-body">
					<%@ include file="/orgTree.jsp"%>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" onclick="getResult()">确定</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>

	<script type="text/javascript">
	
		$(function(){
			toastr.options = {
				positionClass : "toast-center-center",
				timeOut : "10000",
				showMethod : "fadeIn",
				hideMethod : "fadeOut",  
				onclick : function() {
					window.location.href='${pageContext.request.contextPath}/org/organizations.jsp';
				}
			};
		});
		
		function submitForm(){
				var form = $('#orgForm').serialize();
				$.post('${pageContext.request.contextPath}/org/insert', form, function (data) {
					
					debugger;
					if(data == 1){
						toastr.success('<strong>成功&nbsp;! </strong>&nbsp;&nbsp;请到数据列表进行查看。');
					}else{
						toastr.error('<strong>失败&nbsp;! </strong>&nbsp;&nbsp;请检查数据正确性或联系管理员。');
					}
					
					setTimeout(function(){
						window.location.href='${pageContext.request.contextPath}/org/organizations.jsp';
					}, 11000);
					
				}, "json");
		}

		function getResult() {
			var result = $('#result').val().split(',');
			$('#parentName').val(result[0]);
			$('#parentUuid').val(result[1]);
			$("#orgTree").modal('hide'); //手动关闭
		}
		
		setBodyHeight();
		window.parent.setMainDivHeight($('#abc').css('height'));
	</script>
</body>
</html>