<%-- 
    Document   : Left
    Created on : Oct 23, 2023, 4:17:38 AM
    Author     : ngngh
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Left</title>
    </head>
    <body>
        <div class="col-sm-3">
            <div class="card bg-light mb-3">
                <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i> Categories</div>
                <ul class="list-group category_block">
                    <c:forEach items="${listC0}" var="o">
                        <li class="list-group-item text-white ${tag==o.id?"active":""}"><a href="category?id=${o.id}">${o.name}</a></li>
                    </c:forEach>
                </ul>
            </div>            
        </div>
    </body>
</html>
