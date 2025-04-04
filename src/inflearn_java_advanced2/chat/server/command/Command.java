package inflearn_java_advanced2.chat.server.command;

import inflearn_java_advanced2.chat.server.Session;

import java.io.IOException;

public interface Command {
    void execute(String[] args, Session session) throws IOException;
}
