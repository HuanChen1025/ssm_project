# Spring+SpringMVC+Mybatis+Maven+oracle框架搭建
## 1. 工程运行环境  
JDK:1.6  
TOMCAT7  
Windows7/Eclipse luna   
对应博文：http://blog.csdn.net/evankaka/article/details/49452201   
## 2. 后台使用到的框架
Spring+SpringMVC+Mybatis+Maven
日志使用：logback
数据库使用:Mysql
后台分页使用：PageHelp(与Mybatis一起使用)
## 3. 前台使用
框架：Bootstarp+JSP
## 4. 数据源配置
数据库配置修改
请修改POM.XML中的profiles里的内容，将jdbcurl、jdbcusername、jdbc_password修改成自己的，示例如下： 

           <jdbc_driverClassName>com.mysql.jdbc.Driver</jdbc_driverClassName>   
           <jdbc_url>jdbc:mysql://localhost:3306/learning</jdbc_url>  
           <jdbc_username>root</jdbc_username>  
           <jdbc_password>christmas</jdbc_password>   

## 5.修改
与原作者比较，做了一些修改：

- 原作者将 sql语句放在了 src/java/main 中，我将它改放到了src/java/resources 中。这个问题花费了我半天时间，在本地运行时，之前都正常，突然有一天出问题了，数据库中的资源无法返回。经过排查发现是这里的问题。
- 第二个问题是前端显示的问题：  

		     $("#tableBody").append('<tr class="tab">');
		     $("#tableBody").append('<td>' + this.name + '</td>');
		     $("#tableBody").append('<td>' + this.content + '</td>');
		     $("#tableBody").append('<td>' + this.des + '</td>');
		     $("#tableBody").append('<td>'+"<input type='button' id='btn1' value='修改' onclick='getTableContent(this)' />"+'</td>');
		     $("#tableBody").append('</tr>');
作者在前端界面中用到了以上的Jquery语句，但是实际上这样是无法将td添加到tr中的，通过F12可以查看。后来将其改成一句话添加：

            $("#tableBody").append('<tr class="tab">'+'<td>' + this.name + '</td>'+
     	    '<td>' + this.content + '</td>'+'<td>' + this.des + '</td>'+'<td>'+"<a href='javascript:void(0)' class='big-link' data-reveal-id='myModal' data-animation='fade'  onclick='getTableContent(this)'>修改</a>"+'</td>'
     	    +'</tr>'
     	    );

采用以上方法，使用一句话向其中添加，即可。