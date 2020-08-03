package com.reference;

import com.mysql.cj.jdbc.Driver;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author kangfw5
 * @since 2020-06-24
 */
public class ReferenceMain {
    public static void main(String[] args) {
        SoftReference<String> stringSoftReference = new SoftReference<>(new String("你好"));

        String s = stringSoftReference.get();
        System.out.println(s);

       /* try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String name = Driver.class.getName();

            System.out.println(name);
            Class.forName(Driver.class.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/



        /*try {
            FileChannel.open(null, null);
            DatagramChannel.open();
            SocketChannel.open();
            ServerSocketChannel.open();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
