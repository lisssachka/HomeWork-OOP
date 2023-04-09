package notebook.src.notebook.log.impl;

import notebook.src.notebook.log.Logger;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String text) {
        System.err.println(LocalDateTime.now() + ": " + text);
    }
}
