<%-- 
    Document   : Home
    Created on : Oct 22, 2023, 4:23:29 AM
    Author     : ngngh
--%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="Menu.jsp"></jsp:include>
<!--        <div class="container">
            <div class="row">
                <div class="col">
                    <nav aria-label="breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="Home.jsp">Home</a></li>
                            <li class="breadcrumb-item"><a href="#">Category</a></li>
                            <li class="breadcrumb-item active" aria-current="#">Sub-category</li>
                        </ol>
                    </nav>
                </div>
            </div>
        </div>-->
        <div class="container">
            <div class="row">
                    <div class="row">
                        <c:forEach items="${listP}" var="o">
                            <div class="col-12 col-md-6 col-lg-3">
                                <div class="card" style="margin-bottom: 25px;height: 396px ;">
                                    <div value="${o.id}" name="productId"></div>
                                    <c:set var="ProdId" value="${dao.getProductIteambyProductId(o.id)}" />
                                    <c:set var="img" value="${dao.getImagebyProduct(ProdId.gallery)}" />
                                    <img class="card-img-top" src="${img.img}" alt="Card image cap">
                                    
                                        <div class="card-body">
                                        <div class="each" style="height:60px;">
                                            <h6 style="word-wrap: break-word"><a href="detail?prid=${o.id}" title="View Product" >${o.name}</a></h6>
                                        </div>
                                        <div class="row">
                                            <c:if test="${ProdId.salePrice!=0}">
                                                <div class="col">                                                
                                                    <p style="color: red;margin: 0;padding: 0;"><fmt:formatNumber value="${ProdId.salePrice}" type="number" pattern="###,###"></fmt:formatNumber><sup>đ</sup></p>
                                                </div>
                                                <div class="col">
                                                    <p style="color: #939393;margin: 0;padding: 0;"><del><fmt:formatNumber value="${ProdId.price}" type="number" pattern="###,###"></fmt:formatNumber><sup>đ</sup></del></p>
                                                </div>
                                            </c:if>
                                            <c:if test="${ProdId.salePrice==0}">
                                                <div class="col">                                                
                                                    <p style="margin: 0;padding: 0;"><fmt:formatNumber value="${ProdId.price}" type="number" pattern="###,###"></fmt:formatNumber><sup>đ</sup></p>
                                                </div>                                                
                                            </c:if>
                                        </div>
                                    </div>
                                    
                                </div>
                            </div>
                        </c:forEach>
                    <c:forEach begin="1" end="${totalPage}" var="i">
                        <a href="Paging?index=${i}">${i}</a>
                    </c:forEach>
                    </div>
                
            </div>
        </div>
        
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>

