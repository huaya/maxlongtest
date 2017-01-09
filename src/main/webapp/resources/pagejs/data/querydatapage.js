var table;
$(function () {

    $('#commit').click(function() {
        table.ajax.reload();
        //alert($("#editor1").val());
        return true;
    });

    table = $("#datatable").DataTable({
        processing: false,	//隐藏加载提示,自行处理
        serverSide: true,	//启用服务器端分页
        searching: false,	//禁用原生搜索
        oLanguage: {sUrl:ctx + "/resources/json/page_zh_CN.json"},
        ajax:function(data, callback, settings) {
            var params = {};
            params.sql = $("#editor1").val();
            $.ajax({
                type: "GET",
                url: ctx + "/data/getdata",
                cache : false,	//禁用缓存
                data: params,	//传入已封装的参数
                dataType: "json",
                success: function(result) {
                    var returnData = {};
                    returnData.draw = result.draw;
                    returnData.recordsTotal = result.totalCnt;
                    returnData.recordsFiltered = result.totalCnt;
                    returnData.data = result.data;
                    callback(returnData);
                }
            });

        },
        columns: [
            {"data":"BUSI_CTRL_CODE"},
            {"data":"BUSI_CTRL_NAME"},
            {"data":"BUSI_CTRL_DESC"},
            {"data":"INSTI_CODE"},
            {"data":"PRODUCT_CODE"},
            {"data":"INSERT_O"},
            {"data":"INSERT_TIME"},
            {"data":"UPDATE_O"},
            {"data":"UPDATE_TIME"}],
    });

});