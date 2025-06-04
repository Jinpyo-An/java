package inflearn_java_advanced02.chat.server;

import java.io.IOException;

public interface   CommandManager {
    void execute(String totalMessage, Session session) throws IOException;
}
