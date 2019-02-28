<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<style>
#content {
	margin: 50px 100px;
	float: left;
}

#print-content {
	border-collapse: collapse;
	table-layout: fixed;
	margin-top: 50px;
}

#print-content tr {
	text-align: center;
	font-size: 18px;
	line-height: 35px;
}

#chapter {
	position: absolute;
	left: 415px;
	top: 120px;
	width: 150px;
}

.ps {
	color: red;
	font-size: 12px;
}

.button {
	display: inline-block;
	border-radius: 4px;
	background-color: #4CAF50;
	border: none;
	color: #FFFFFF;
	text-align: center;
	font-size: 28px;
	padding: 20px;
	width: 200px;
	transition: all 0.5s;
	cursor: pointer;
	margin: 5px;
}

.button span {
	cursor: pointer;
	display: inline-block;
	position: relative;
	transition: 0.5s;
}

.button span:after {
	content: '»';
	position: absolute;
	opacity: 0;
	top: 0;
	right: -20px;
	transition: 0.5s;
}

.button:hover span {
	padding-right: 25px;
}

.button:hover span:after {
	opacity: 1;
	right: 0;
}
</style>
</head>

<body>
	<div id="content">
		<table id="print-content" border="1" cellpadding="0" cellspacing="0">
			<colgroup>
				<col width="150 ">
				<col width="80 ">
				<col width="150 ">
				<col width="150">
				<col width="80">
				<col width="150">
			</colgroup>
			<tr height="20">
				<td colspan="7">天使宠物医院医疗收费账单</td>
			</tr>
			<tr height="20">
				<td>姓名：</td>
				<td colspan="2">${bList.pName }</td>
				<td>年龄</td>
				<td colspan="3">${bList.pAge }</td>
			</tr>
			<tr height="20">
				<td>性别：</td>
				<td colspan="2">${bList.pSex }</td>
				<td>主人身份证号：</td>
				<td colspan="3">${bList.pOIdCard }</td>
			</tr>
			<tr height="20">
				<td>创建时间</td>
				<td colspan="2"><fmt:formatDate value="${bList.billCreateTime}"
						type="both" /></td>
				<td>账单编号</td>
				<td id="billId" colspan="3">${bList.billId }</td>
			</tr>
			<tr height="20">
				<td>挂号费</td>
				<td colspan="6">${bList.registrationPrices }</td>
			</tr>
			<c:if test="${bList.exaninePrices!=0}">
				<tr height="20">
					<td>检查费</td>
					<td colspan="6">${bList.exaninePrices }</td>
				</tr>
			</c:if>
			<c:if test="${bList.materialPrices!=0}">
				<tr height="20">
					<td>材料费</td>
					<td colspan="6">${bList.materialPrices }</td>
				</tr>
			</c:if>
			<c:if test="${bList.westermPrices!=0}">
				<tr height="20">
					<td>西成药费</td>
					<td colspan="6">${bList.westermPrices }</td>
				</tr>
			</c:if>
			<c:if test="${bList.ChinesePrices!=0}">
				<tr height="20">
					<td>中成药费</td>
					<td colspan="6">${bList.ChinesePrices }</td>
				</tr>
			</c:if>
			<c:if test="${bList.OPSPrices!=0}">
				<tr height="20">
					<td>手术费</td>
					<td colspan="6">${bList.OPSPrices }</td>
				</tr>
			</c:if>
			<tr height="20">
				<td>账单总金额</td>
				<td colspan="6">${bList.totalPrices }</td>
			</tr>
			<tr height="20">
				<td colspan="7" class="ps">*如有疑问，请及时与天使宠物医院联系</td>
			</tr>
			<img id="chapter" src="../images/chapter.gif">
		</table>
		
		<input type="hidden" id="paySTS" value="${bList.payStatus }">
		<button id="renderPdf" class="button" style="vertical-align: middle">
			<span>下载账单</span>
		</button>
	</div>

	<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.js"></script>
	<script src="https://cdn.bootcss.com/jspdf/1.5.3/jspdf.debug.js"></script>
	<script src="https://cdn.bootcss.com/html2canvas/0.4.0/html2canvas.js"></script>
	<script type="text/javascript">
		var downPdf = document.getElementById("renderPdf");
		var paySTS = $('#paySTS').val()
		var billId = $('#billId').html()
		downPdf.onclick = function() {
			if(paySTS=="未支付"){
				alert("该账单未支付，请先去支付账单再下载")
				return;
			}
			html2canvas(document.getElementById("print-content"), {
				onrendered : function(canvas) {

					var contentWidth = canvas.width;
					var contentHeight = canvas.height;

					//一页pdf显示html页面生成的canvas高度;
					var pageHeight = contentWidth / 592.28 * 841.89;
					//未生成pdf的html页面高度
					var leftHeight = contentHeight;
					//pdf页面偏移
					var position = 0;
					//a4纸的尺寸[595.28,841.89]，html页面生成的canvas在pdf中图片的宽高
					var imgWidth = 595.28;
					var imgHeight = 592.28 / contentWidth * contentHeight;

					var pageData = canvas.toDataURL('image/jpeg', 1.0);

					var pdf = new jsPDF('', 'pt', 'a4');

					//有两个高度需要区分，一个是html页面的实际高度，和生成pdf的页面高度(841.89)
					//当内容未超过pdf一页显示的范围，无需分页
					if (leftHeight < pageHeight) {
						pdf.addImage(pageData, 'JPEG', 0, 0, imgWidth,
								imgHeight);
					} else {
						while (leftHeight > 0) {
							pdf.addImage(pageData, 'JPEG', 0, position,
									imgWidth, imgHeight)
							leftHeight -= pageHeight;
							position -= 841.89;
							//避免添加空白页
							if (leftHeight > 0) {
								pdf.addPage();
							}
						}
					}
					
					pdf.save(billId+'订单.pdf');
				}
			})
		}
	</script>
</body>

</html>