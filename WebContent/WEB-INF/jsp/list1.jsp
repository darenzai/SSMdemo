<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>   
    <title>Person列表</title>
    <!-- 引入Jquery -->
    <script src="http://code.jquery.com/jquery-1.7.2.min.js"></script> 
    <!-- 编写脚本 -->
    <script type="text/javascript">
        $(function() {
            $.ajax({
                url: '${pageContext.request.contextPath}/listSwb',
                type: 'post',
                dataType: 'json',
                success: function(data) {//这里的data代表的就是返回person集合list
                    var html = "";
                    html += "<tr><th>姓名</th><th>性别</th></tr>";
                    for(var i in data){
                        html +=data[i].id;
                    }
                    $("table").html(html);
                }
            });
        });
    </script>
  </head>
  
  <body>
    <table>
    </table>
  </body>
</html>