var globalId;
var pageWidth=800;
var pageHeigth=600;
var fieldWidth = 150;
var gridPageSize = 20;
var pageFormGridTrans ="100%, 55%";
var globalMap=new Array();
Ext.QuickTips.init();// 启动悬停提示
delete Ext.tip.Tip.prototype.minWidth; // 防止tooltip的宽度很小，不好看
Ext.setGlyphFontFamily('FontAwesome');
Ext.onReady(function() {
    var viewport = new Ext.Viewport({
        layout:'border',
        items:[
            new Ext.toolbar.Toolbar({
                region:'north',
                el: 'north',
                height:50,
                items: [{
                    xtype : 'component',
                    style : 'width:86px;height:50px;background:url(resources/images/logo.png) no-repeat center 0px'
                },{
                        xtype : 'component',
                        html : '<font size="4px" color="#FFFFFF">杉德宝管理系统</font>'
                }]
            }),new Ext.form.Panel({
                region:'west',
                width:200,
                split:true,
                title:'菜单导航',
                collapsible:true,
                layout:'accordion',
                defaults:{autoScroll:true,border:true},
                layoutConfig:{
                    animate:true
                }
            }),new Ext.tab.Panel({
                region:'center',
                id:'center-panel',
                deferredRender:false,
                defaults: {autoScroll:true},
                plugins: new Ext.ux.TabCloseMenu(),
                enableTabScroll:true,
                activeTab:0,
                items:[{
                    contentEl:'welcome',
                    id:'tab_welcome',
                    title: '欢迎',
                    closable:false,
                    html:'<iframe name="iftab_welcome" scrolling="auto" frameborder="0" width="100%" height="100%" src="main1"></iframe>',
                    autoScroll:true
                }],
                listeners:{
                    'beforeremove': function(tdemo,item,event) {
                        if(item.id!="tab_welcome"){
                            document.getElementsByName('if'+item.id)[0].src="about:blank";
                        }
                    }
                }
            })
        ]
    });
    completeLoading();
});