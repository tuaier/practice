package com.thread;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.*;

/**
 * @author kangfw5
 * @since 2020-07-31
 */
public class StaticMethodDemo {
    public static void main(String[] args) {

        ThreadPoolExecutor t = new ThreadPoolExecutor(10, 15, 2000, TimeUnit.SECONDS, new LinkedBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Thread th1 = new Thread(()->{
            StaticMethodSync.stMethod();
        }, "A1");

        Thread th2 = new Thread(()->{
            StaticMethodSync.stMethod();
            StaticMethodSync s = new StaticMethodSync();
            s.stMethod();
        }, "A2");
        th1.start();
        th2.start();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection dbConn = DriverManager.getConnection("", "", "");
            PreparedStatement statement = dbConn.prepareStatement("SELECT * FROM  ER_BXZB WHERE DJBH = '23'");
            ResultSet resultSet = statement.executeQuery();
        } catch (Exception e) {

        }
    }
}
