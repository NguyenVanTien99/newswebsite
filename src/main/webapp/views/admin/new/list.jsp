<%@include file="/common/taglib.jsp"%>
<c:url var="APIurl" value="/api-admin-new" />
<c:url var="NewURL" value="/admin-new" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Danh sách bài viết</title>
</head>

<body>
	<div class="main-content">
 <form action="<c:url value='/admin-new'/>" id="formSubmit" method="get">
		<div class="main-content-inner">
			<div class="breadcrumbs ace-save-state" id="breadcrumbs">
				<ul class="breadcrumb">
					<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Trangchủ</a></li>
				</ul>
				<!-- /.breadcrumb -->
			</div>
			<div class="page-content">
				<div class="row">
					<div class="col-xs-12">
						<table class="table">
							<thead>
								<tr>
									<th>Tên bài viết</th>
									<th>Mô tả</th>
								</tr>
							</thead>
							<tbody>
							<c:forEach var="item" items="${model.listResult}">
								<tr>
									<td>${item.title}</td>
									<td>${item.shortDecription}</td>
								</tr>
							</c:forEach>
							</tbody>
						</table>
						<ul class="pagination" id="pagination"></ul>
						<input type="hidden" value="" id ="page" name = "page" />
						<input type="hidden" value="" id ="maxPageItem" name = "maxPageItem" />
						<input type="hidden" value="" id ="sortName" name = "sortName" />
						<input type="hidden" value="" id ="sortBy" name = "sortBy" />
					</div>
				</div>
			</div>
		</div>

 </form> 
 	</div>
	<!-- /.main-content -->
	<script type="text/javascript">
	var totalPage = ${model.totalPage};
	var currentPage = ${model.page};
	var visiblePages = ${model.maxPageItem};
	var limit = 2;
		$(function () {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages: totalPage,
				visiblePages: 10,
				startPage: currentPage,
				onPageClick: function (event, page) {
					if(currentPage != page){
						$('#maxPageItem').val(limit);
						$('#page').val(page);
						$('#sortName').val('titile');
						$('#sortBy').val('desc');
						$('#formSubmit').submit();
					}
				}
			});
		});
	</script> 
</body>

</html>