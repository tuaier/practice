package com.tuaier.gupao.pattern.prototype.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangfw5
 * @since 2020-03-02
 */
public class CloneByJsonTest {
    public static void main(String[] args) {
        Example e1 = new Example();
        List<String> list = new ArrayList<String>() {{
            add("1");
            add("2");
        }};
        e1.setId("1");
        e1.setName("一");
        e1.setSon(list);

        Example e2 = e1.cloneByJSON();
        list.add("3");

        System.out.println(e1);
        System.out.println(e2);
    }
}
