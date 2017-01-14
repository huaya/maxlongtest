var globalId;
var pageWidth=800;
var pageHeigth=600;
var fieldWidth = 150;
var gridPageSize = 20;
var pageFormGridTrans ="100%, 55%";
var globalMap=new Array();
Ext.quickTipsActive;
delete Ext.tip.Tip.prototype.minWidth; // 防止tooltip的宽度很小，不好看
Ext.setGlyphFontFamily('FontAwesome');
Ext.onReady(function() {
    var viewport = Ext.create('Ext.panel.Panel', {
        title: 'Hello',
        width: 200,
        html: '<p>World!</p>',
        renderTo: Ext.getBody()
    });

    completeLoading();
});