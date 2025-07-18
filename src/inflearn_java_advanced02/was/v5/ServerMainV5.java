package inflearn_java_advanced02.was.v5;

import inflearn_java_advanced02.was.httpserver.HttpServer;
import inflearn_java_advanced02.was.httpserver.ServletManager;
import inflearn_java_advanced02.was.httpserver.servlet.DiscardServlet;
import inflearn_java_advanced02.was.v5.servlet.HomeServlet;
import inflearn_java_advanced02.was.v5.servlet.SearchServlet;
import inflearn_java_advanced02.was.v5.servlet.Site1Servlet;
import inflearn_java_advanced02.was.v5.servlet.Site2Servlet;

import java.io.IOException;

public class ServerMainV5 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        ServletManager servletManager = new ServletManager();
        servletManager.add("/", new HomeServlet());
        servletManager.add("/site1", new Site1Servlet());
        servletManager.add("/site2", new Site2Servlet());
        servletManager.add("/search", new SearchServlet());
        servletManager.add("/favicon.ico", new DiscardServlet());

        HttpServer server = new HttpServer(PORT, servletManager);
        server.start();
    }
}
