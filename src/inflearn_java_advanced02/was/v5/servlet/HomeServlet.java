package inflearn_java_advanced02.was.v5.servlet;

import inflearn_java_advanced02.was.httpserver.HttpRequest;
import inflearn_java_advanced02.was.httpserver.HttpResponse;
import inflearn_java_advanced02.was.httpserver.HttpServlet;

import java.io.IOException;

public class HomeServlet implements HttpServlet {

    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        response.writeBody("<h1>home</h1>");
        response.writeBody("<ul>");
        response.writeBody("<li><a href='/site1'>site1</a></li>");
        response.writeBody("<li><a href='/site2'>site2</a></li>");
        response.writeBody("<li><a href='/search?q=hello'>검색</a></li>");
        response.writeBody("</ul>");
    }
}
