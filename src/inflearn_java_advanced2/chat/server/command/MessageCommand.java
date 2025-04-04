package inflearn_java_advanced2.chat.server.command;

import inflearn_java_advanced2.chat.server.Session;
import inflearn_java_advanced2.chat.server.SessionManager;

public class MessageCommand implements Command{

    private final SessionManager sessionManager;

    public MessageCommand(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String[] args, Session session)  {
        String message = args[1];
        sessionManager.sendAll("[" + session.getUsername() + "] " + message);
    }
}
