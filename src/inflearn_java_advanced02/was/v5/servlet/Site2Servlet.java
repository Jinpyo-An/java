package inflearn_java_advanced02.was.v5.servlet;

import inflearn_java_advanced02.was.httpserver.HttpRequest;
import inflearn_java_advanced02.was.httpserver.HttpResponse;
import inflearn_java_advanced02.was.httpserver.HttpServlet;

import java.io.IOException;

public class Site2Servlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        response.writeBody("<h1>site2</h1>");
    }
}
