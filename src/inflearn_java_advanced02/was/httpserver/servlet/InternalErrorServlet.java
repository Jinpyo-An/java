package inflearn_java_advanced02.was.httpserver.servlet;

import inflearn_java_advanced02.was.httpserver.HttpRequest;
import inflearn_java_advanced02.was.httpserver.HttpResponse;
import inflearn_java_advanced02.was.httpserver.HttpServlet;

import java.io.IOException;

public class InternalErrorServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        response.setStatusCode(500);
        response.writeBody("<h1>Internal Error</h1>");
    }
}
