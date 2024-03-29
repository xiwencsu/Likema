<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="no-js ie7 ie" lang="en"> <![endif]-->
<!--[if IE 8]>
<html class="no-js ie8 ie" lang="en"> <![endif]-->
<!--[if IE 9]>
<html class="no-js ie9 ie" lang="en"> <![endif]-->
<!--[if gt IE 9]><!-->
<html class="no-js" lang="en"> <!--<![endif]-->
<head>
    <meta charset="utf-8"/>
    <title>Likema</title>
    <meta name="description" content=""/>
    <meta name="author" content="Walking Pixels | www.walkingpixels.com"/>
    <meta name="robots" content="index, follow"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <!-- CSS styles -->
    <link rel='stylesheet' type='text/css' href='/css/wuxia-red.css'/>
    <link rel="stylesheet" href="https://unpkg.com/bootstrap-table@1.15.3/dist/bootstrap-table.min.css">

    <!-- Fav and touch icons -->
    <link rel="shortcut icon" href="/img/icons/favicon.ico"/>
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/img/icons/apple-touch-icon-114-precomposed.png"/>
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/img/icons/apple-touch-icon-72-precomposed.png"/>
    <link rel="apple-touch-icon-precomposed" href="/img/icons/apple-touch-icon-57-precomposed.png"/>

    <!-- JS Libs -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="/js/libs/jquery.js"><\/script>')</script>
    <script src="/js/libs/modernizr.js"></script>
    <script src="/js/libs/selectivizr.js"></script>
    <script src="/js/echarts.js"></script>
    <script src="https://unpkg.com/bootstrap-table@1.15.3/dist/bootstrap-table.min.js"></script>

    <script>

        $(document).ready(function () {

            // Navbar tooltips
            $('.navbar [title]').tooltip({
                placement: 'bottom'
            });

            // Content tooltips
            $('[role=main] [title]').tooltip({
                placement: 'top'
            });

            // Dropdowns
            $('.dropdown-toggle').dropdown();


        });
    </script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>

<!-- Main navigation bar -->
<header class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".user">
                <span class="icon-user"></span>
            </button>
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".navigation">
                <span class="icon-chevron-down"></span>
            </button>
            <a class="brand" href="#">Likema</a>
            <nav class="nav-collapse navigation">
                <ul class="nav" role="navigation">
                    <li class="active"><a href="#" title="Homepage dashboard"><span class="icon-home"></span>
                        Dashboard</a></li>
                    <li><a href="../charts.html" title="Chart"><span class="icon-tasks"></span> Chart</a></li>
                    <li><a href="#table" title="Table"><span class="icon-table"></span> Tables</a>
                    </li>
                    <li class="divider-vertical"></li>
                    <li><a href="../portfolio.html" title="Buttons in navbar!" class="btn-wuxia-navbar">
                        <div class="btn btn-wuxia"><span class="icon-key"></span> Portfolio</div>
                    </a></li>
                </ul>
            </nav>
        </div>
    </div>
</header>
<!-- /Main navigation bar -->

<!-- Main content -->
<div class="container" role="main">

    <!-- Breadcrumbs -->
    <ul class="breadcrumb">
        <li  class="active"><a href="#"><span class="icon-home"></span> Home</a></li>
    </ul>
    <!-- Breadcrumbs -->

    <!-- Secondary navigation in hero unit -->
    <div class="hero-unit blow">
        <h1>Likema</h1>
        <p>Likema is a website that you can see, search and sort the securities listed. In addition, you can also
            create your own portfolios of securities. We offered our users charts to intuitively see the price,
            volumes and dividend information. According the charts it becomes very easy to analysis and decide
            what securities to buy</p>
        <div class="nav-secondary inverse">
            <nav>
                <ul>
                    <li><a class="wuxify-me" href="#table"><span class="icon-th"></span>Table</a></li>
                    <li><a class="wuxify-me" href="../charts.html"><span class="icon-signal"></span>Chart</a></li>
                    <li><a class="wuxify-me" href="../portfolio.html"><span class="icon-heart"></span>Portfolio</a><span
                            class="badge badge-inverse">6</span></li>
                </ul>
            </nav>
        </div>
    </div>

    <div class="content">

        <!-- Tab content -->
        <div class="page-container tab-content">

            <!-- Tab #ui -->
            <div class="tab-pane active" id="ui">

                <!-- Grid row -->
                <div class="row">

                    <!-- Page grid cell (12 blocks - full) -->
                    <article class="span12">
                        <h2>All of the securities</h2>
                    </article>
                    <!-- /Page grid cell (12 blocks - full) -->

                    <!-- Page grid cell (8 blocks) -->
                    <article class="span8">
                        <table class="datatable table table-striped table-bordered" id="table">
                            <thead>
                            <tr>
                                <th>Date</th>
                                <th>Symbol</th>
                                <th>Open</th>
                                <th>High</th>
                                <th>Low</th>
                                <th>Close</th>
                                <th>Volume</th>
                            </tr>
                            </thead>
                            <tbody>

                            </tbody>
                        </table>
                    </article>

                    <!-- Page grid cell (8 blocks) -->

                    <!-- Page grid cell (4 blocks) -->
                    <article class="span4">
                        <h3></h3>
                        <p><strong><code>Date</code></strong>
                            <em>– This provides the date as an integer where 20100527 would represent May 27th,
                                2010.</em>
                            <abbr title="date"></abbr>
                        </p>
                        <p><strong><code>Open</code></strong>
                            <em>– The open price.</em>
                            <abbr title="first trade price"></abbr>
                        </p>
                        <p><strong><code>High</code></strong>
                            <em>– The high price. </em>
                            <abbr title="highest trade price"></abbr>
                        </p>
                        <p><strong><code>Low</code></strong>
                            <em>– The low price.</em>
                            <abbr title="lowest trade price"></abbr>
                        </p>
                        <p><strong><code>Close</code></strong>
                            <em>– The close price.</em>
                            <abbr title="last trade price"></abbr>
                        </p>
                        <p><strong><code>Volume</code></strong>
                            <em>– The trading volume during the interval. Note that it is extremely difficult
                                to get accurate volume information. The volume is adjusted for splits so that
                                the total value of shares traded remains constant even if a split occurs.
                            </em>
                            <abbr title="trade volume"></abbr>
                        </p>
                        <!--<p class="demo-btns">-->
                        <!--<button class="btn btn-info btn-wuxia">Info</button>-->
                        <!--<button class="btn btn-success btn-wuxia">Success</button>-->
                        <!--<button class="btn btn-warning btn-wuxia">Warning</button>-->
                        <!--<button class="btn btn-danger btn-wuxia">Danger</button>-->
                        <!--<button class="btn btn-inverse btn-wuxia">Inverse</button>-->
                        <!--</p>-->
                    </article>
                    <!-- Page grid cell (4 blocks) -->

                </div>
                <!-- Grid row -->

            </div>
            <!-- /Tab #ui -->

        </div>
        <!-- /Tab content -->

    </div>
    <!-- /Main data container -->

</div>
<!-- /Main content -->

<!-- Main footer -->
<footer class="container">
    <nav>
        <ul>
            <li>&copy; Copyright 2019. All rights reserved.</li>
        </ul>
    </nav>
    <p>&copy; Copyright &copy; 2019. Likema. All rights reserved.</p>
</footer>
<!-- /Main footer -->

<!-- Scripts -->
<script src="${pageContext.request.contextPath}/js/navbar.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/waypoints.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap-tooltip.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap-dropdown.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap/bootstrap-collapse.js"></script>

<!-- jQuery DataTable -->
<script src="${pageContext.request.contextPath}/js/plugins/dataTables/jquery.datatables.min.js"></script>
<script>
    /* Default class modification */
    $.extend($.fn.dataTableExt.oStdClasses, {
        "sWrapper": "dataTables_wrapper form-inline"
    });

    /* API method to get paging information */
    $.fn.dataTableExt.oApi.fnPagingInfo = function (oSettings) {
        return {
            "iStart": oSettings._iDisplayStart,
            "iEnd": oSettings.fnDisplayEnd(),
            "iLength": oSettings._iDisplayLength,
            "iTotal": oSettings.fnRecordsTotal(),
            "iFilteredTotal": oSettings.fnRecordsDisplay(),
            "iPage": Math.ceil(oSettings._iDisplayStart / oSettings._iDisplayLength),
            "iTotalPages": Math.ceil(oSettings.fnRecordsDisplay() / oSettings._iDisplayLength)
        };
    }

    /* Bootstrap style pagination control */
    $.extend($.fn.dataTableExt.oPagination, {
        "bootstrap": {
            "fnInit": function (oSettings, nPaging, fnDraw) {
                var oLang = oSettings.oLanguage.oPaginate;
                var fnClickHandler = function (e) {
                    e.preventDefault();
                    if (oSettings.oApi._fnPageChange(oSettings, e.data.action)) {
                        fnDraw(oSettings);
                    }
                };

                $(nPaging).addClass('pagination').append(
                    '<ul>' +
                    '<li class="prev disabled"><a href="#"><span class="icon-caret-left"></span> ' + oLang.sPrevious + '</a></li>' +
                    '<li class="next disabled"><a href="#">' + oLang.sNext + ' <span class="icon-caret-right"></span></a></li>' +
                    '</ul>'
                );
                var els = $('a', nPaging);
                $(els[0]).bind('click.DT', {action: "previous"}, fnClickHandler);
                $(els[1]).bind('click.DT', {action: "next"}, fnClickHandler);
            },

            "fnUpdate": function (oSettings, fnDraw) {
                var iListLength = 0;
                var oPaging = oSettings.oInstance.fnPagingInfo();
                var an = oSettings.aanFeatures.p;
                var i, j, sClass, iStart, iEnd, iHalf = Math.floor(iListLength / 2);

                if (oPaging.iTotalPages < iListLength) {
                    iStart = 1;
                    iEnd = oPaging.iTotalPages;
                }
                else if (oPaging.iPage <= iHalf) {
                    iStart = 1;
                    iEnd = iListLength;
                } else if (oPaging.iPage >= (oPaging.iTotalPages - iHalf)) {
                    iStart = oPaging.iTotalPages - iListLength + 1;
                    iEnd = oPaging.iTotalPages;
                } else {
                    iStart = oPaging.iPage - iHalf + 1;
                    iEnd = iStart + iListLength - 1;
                }

                for (i = 0, iLen = an.length; i < iLen; i++) {

                    // Add / remove disabled classes from the static elements
                    if (oPaging.iPage === 0) {
                        $('li:first', an[i]).addClass('disabled');
                    } else {
                        $('li:first', an[i]).removeClass('disabled');
                    }

                    if (oPaging.iPage === oPaging.iTotalPages - 1 || oPaging.iTotalPages === 0) {
                        $('li:last', an[i]).addClass('disabled');
                    } else {
                        $('li:last', an[i]).removeClass('disabled');
                    }
                }
            }
        }
    });

    /* Table #example */
    $(document).ready(function () {
        $('.datatable').dataTable({
            "sDom": "<'row'<'span4'l><'span4'f>r>t<'row'<'span4'i><'span4'p>>",
            "sPaginationType": "bootstrap",
            "bProcessing" : true,
            "sAjaxSource" : "${basePath}/testBean/testData",//通过ajax实现分页的url路径。
            "aoColumns" : [//初始化要显示的列
                {
                    "mDataProp" : "date",//获取列数据，跟服务器返回字段一致
                    "sClass" : "center",//显示样式
                    "mRender" : function(data, type, full) {
                        return new Date(data)//处理时间显示
                            .toLocaleString();
                    }
                },
                {
                    "mDataProp" : "symbol",
                    "mRender" : function(data, type, full) {//返回自定义的样式
                        return "<label><input type='checkbox' class='ace' /><span class='lbl'></span></label>"
                    }
                },
                {
                    "mDataProp" : "open"
                },
                {
                    "mDataProp" : "high"
                },
                {
                    "mDataProp" : "low",

                },
                {
                    "mDataProp" : "close",
                    "mRender" : function(data, type, full) {
                        return "<span class='label label-sm label-info arrowed arrowed-righ'>Sold</span>"
                    }
                },
                {
                    "mDataProp" : "volume",
                    "mRender" : function(data, type, full) {
                        return "<div class='visible-md visible-lg hidden-sm hidden-xs action-buttons'>" +
                            "<a class='blue' href='#'><i class='icon-zoom-in bigger-130'></i></a>" +
                            "<a class='green' href='#'><i class='icon-pencil bigger-130'></i></a>" +
                            "<a class='red' href='#'><i class='icon-trash bigger-130'></i></a></div>"
                    }
                } ],
            "oLanguage": {
                "sLengthMenu": "_MENU_ records per page"
            }
        });
    });
</script>


<div style="display:none">
    <script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script>
</div>
</body>
</html>
