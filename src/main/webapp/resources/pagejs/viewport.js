var globalId;
var pageWidth=800;
var pageHeigth=600;
var fieldWidth = 150;
var gridPageSize = 20;
var pageFormGridTrans ="100%, 55%";
var globalMap=new Array();
Ext.quickTipsActive;
delete Ext.tip.ToolTip.prototype.minWidth; // 防止tooltip的宽度很小，不好看
Ext.setGlyphFontFamily('FontAwesome');
Ext.onReady(function() {
    Ext.toolbar.Toolbar
    var top = Ext.create('Ext.toolbar.Toolbar', {
        region: 'north',
        border : false,
        style : 'border-bottom:1px solid white;background-color:#157fcc;padding-right:10px;',//
        //border : '0 0 1 0',
        height : 52,
        items: [{
            xtype : 'component',
            style : 'width:86px;height:50px;background:url(resources/images/logo.png) no-repeat center 0px'
        },{
            /*xtype : 'tbtext',
             id: 'signedorginfo',*/
            xtype : 'component',
            html : '<font size="4px" color="#FFFFFF">杉德宝管理系统</font>'
        },{
            xtype: 'tbfill'
        },'-',{
            //glyph : 0xf023,
            icon: "static/images/user.gif",
            text: "修改密码",
            scope: this,
            handler: function() {
                createChangePasswordWin(usercenterurl);
            }
        },'-', {
            //glyph : 0xf011,
            icon: "static/images/locked.gif",
            text: "注销",
            scope: this,
            handler: function() {
                window.location = 'https://testusercenter.sandpay.com.cn:7443/cas/logout';
            }
        }
        ]
    });

    var vp = Ext.create('Ext.container.Viewport', {
        layout: 'border',
        items: [top]
    });

    generateMenuTree(vp);
    completeLoading();
    
    function generateMenuTree(panel) {
        // var myMask = new Ext.LoadMask({
        //     msg    : '正在加载菜单，请稍后...',
        //     target : panel
        // });
        // myMask.show();
    }
});