package com.example.demo.singleton;

public class LogManager {
    private static LogManager instance;

    private LogManager() {
        // 私有构造函数防止实例化
    }

    public static synchronized LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager();
        }
        return instance;
    }

    public void log(String message) {
        // 简单的日志记录实现
        System.out.println("Log: " + message);
    }
}
