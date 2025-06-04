package inflearn_java_advanced02.was.v5.servlet;

import inflearn_java_advanced02.was.httpserver.HttpRequest;
import inflearn_java_advanced02.was.httpserver.HttpResponse;
import inflearn_java_advanced02.was.httpserver.HttpServlet;

import java.io.IOException;

public class SearchServlet implements HttpServlet {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        final String query = request.getParameter("q");
        response.writeBody("<h1>Search</h1>");
        response.writeBody("<ul>");
        response.writeBody("<li>query: " + query + "</li>");
        response.writeBody("</ul>");
    }
}
