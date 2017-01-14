<%@ page contentType="text/html;charset=UTF-8"%>
<link rel="stylesheet" type="text/css" href="${ctx}/resources/loading/loading.css" />
<style type="text/css">
.x-selectable, .x-selectable * {
	-moz-user-select: text ! important;
	-khtml-user-select: text ! important;
}
</style>
<div id="loading-mask"></div>
<div id="loading">
	<div class="loading-indicator">
		<img src="${ctx}/resources/loading/extanim32.gif" align="middle"/>正在加载数据...
	</div>
</div>
<script type="text/javascript" src="${ctx}/resources/loading/Loading.js"></script>