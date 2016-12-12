<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/include.jsp"%>
<html>
<head>
    <title>boostrap页面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body class="container-fluid">
    <div>
        <button type="button" id="button1">显示</button>
        <button type="button" id="button2">隐藏</button>
    </div>
    <div id="hideDiv" style="display: none">
        这里是隐藏的区域!!
    </div>
    <div>
        <ul class="nav nav-tabs nav-tabs-justified">
            <li>
                <a href="#productInfo" data-toggle="tab">产品信息 </a>
            </li>
            <li>
                <a href="#userInfo" data-toggle="tab">用户信息 </a>
            </li>
        </ul>
        <div class="tab-content">
            <div id="productInfo" class="tab-pane">
                eeeeeeeeeeaaaa
            </div>
            <div id="userInfo" class="tab-pane">
                fffffffffffff
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-1">.col-md-1</div>
        <div class="col-md-1">.col-md-1</div>
        <div class="col-md-1">.col-md-1</div>
        <div class="col-md-1">.col-md-1</div>
        <div class="col-md-1">.col-md-1</div>
        <div class="col-md-1">.col-md-1</div>
        <div class="col-md-1">.col-md-1</div>
        <div class="col-md-1">.col-md-1</div>
        <div class="col-md-1">.col-md-1</div>
        <div class="col-md-1">.col-md-1</div>
        <div class="col-md-1">.col-md-1</div>
        <div class="col-md-1">.col-md-1</div>
    </div>
    <div class="row">
        <div class="col-md-8">.col-md-8</div>
        <div class="col-md-4">.col-md-4</div>
    </div>
    <div class="row">
        <div class="col-md-4">.col-md-4</div>
        <div class="col-md-4">.col-md-4</div>
        <div class="col-md-4">.col-md-4</div>
    </div>
    <div class="row">
        <div class="col-md-6">.col-md-6</div>
        <div class="col-md-6">.col-md-6</div>
    </div>
    <pre>&lt;p&gt;Sample text here...&lt;/p&gt;</pre>
    <kbd>cd</kbd></br>
    <table class="table table-responsive">
        <thead>
            <tr>
                <th>#</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Username</th>
            </tr>
        </thead>
        <tbody>
        <tr>
            <td>0</td>
            <td>Larry</td>
            <td>the Bird</td>
            <td>@twitter</td>
        </tr>
            <tr class="active">
                <td>1</td>
                <td>Mark</td>
                <td>Otto</td>
                <td>@mdo</td>
             </tr>
            <tr class="success">
                <td>2</td>
                <td>Jacob</td>
                <td>Thornton</td>
                <td>@fat</td>
            </tr>
            <tr class="info">
                <td>3</td>
                <td>Larry</td>
                <td>the Bird</td>
                <td>@twitter</td>
            </tr>
            <tr class="warning">
                <td>4</td>
                <td>Larry</td>
                <td>the Bird</td>
                <td>@twitter</td>
            </tr>
            <tr class="danger">
                <td>5</td>
                <td>Larry</td>
                <td>the Bird</td>
                <td>@twitter</td>
            </tr>
        </tbody>
    </table>
    <select class="form-control">
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
        <option>5</option>
    </select>

    <select multiple class="form-control">
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
        <option>5</option>
    </select>

    <div class="form-group has-success has-feedback">
        <label class="control-label" for="inputSuccess2">Input with success</label>
        <input type="text" class="form-control" id="inputSuccess2">
        <span class="glyphicon form-control-feedback glyphicon-ok"></span>
    </div>
    <div class="form-group has-warning has-feedback">
        <label class="control-label" for="inputWarning2">Input with warning</label>
        <input type="text" class="form-control" id="inputWarning2">
        <span class="glyphicon form-control-feedback glyphicon-warning-sign"></span>
    </div>
    <div class="form-group has-error has-feedback">
        <label class="control-label" for="inputError2">Input with error</label>
        <input type="text" class="form-control" id="inputError2">
        <span class="glyphicon form-control-feedback glyphicon-remove"></span>
    </div>
    <div class="jumbotron">
        <h1>Hello, world!</h1>
        <p>HFDHFHDFBHDBFHBHDFVBJFVJFVJDFVBJFVHJDFJVBFDJVJFVBJHFVJFHVHJFJ</p>
        <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
    </div>
    <div class="well well-lg">
        tiandiyouyouguokecongcong
    </div>

</body>
<script src="${ctx}/resources/index.js"></script>
</html>
