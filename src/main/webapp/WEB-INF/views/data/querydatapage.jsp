<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<script type="text/javascript">
    var ctx = "${ctx}";
</script>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${ctx}/resources/plugins/jQuery/jquery-2.2.3.min.js"></script>
    <script type="text/javascript" src="${ctx}/resources/plugins/datatables/jquery.dataTables.js"></script>
    <script type="text/javascript" src="${ctx}/resources/plugins/datatables/extensions/Responsive/js/dataTables.responsive.min.js"></script>
    <script type="text/javascript" src="${ctx}/resources/pagejs/data/querydatapage.js"></script>
    <link rel="stylesheet" href="${ctx}/resources/plugins/datatables/jquery.dataTables.css">
    <link rel="stylesheet" href="${ctx}/resources/plugins/datatables/extensions/Responsive/css/dataTables.responsive.css">
</head>
<body>
    <form>
        <textarea id="editor1" name="editor1" rows="10" cols="80">
            select * from ACC_BUSICTRL_INFO
        </textarea>

        <button type="button" id="commit">提交</button>
    </form>
    <div>
        <table id="datatable" class="display responsive nowrap">
            <thead>
            <tr>
                <th>busi_ctrl_code</th>
                <th>busi_ctrl_name</th>
                <th>busi_ctrl_desc</th>
                <th>insti_code</th>
                <th>product_code</th>
                <th>insert_o</th>
                <th>insert_time</th>
                <th>update_o</th>
                <th>update_time</th>
            </tr>
            </thead>
            <tbody></tbody>
            <tfoot>
            <tr>
                <th>busi_ctrl_code</th>
                <th>busi_ctrl_name</th>
                <th>busi_ctrl_desc</th>
                <th>insti_code</th>
                <th>product_code</th>
                <th>insert_o</th>
                <th>insert_time</th>
                <th>update_o</th>
                <th>update_time</th>
            </tr>
            </tfoot>

        </table>
    </div>

</body>
</html>
