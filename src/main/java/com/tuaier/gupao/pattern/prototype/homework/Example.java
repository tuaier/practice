package com.tuaier.gupao.pattern.prototype.homework;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * @author kangfw5
 * @since 2020-03-02
 */
public class Example {
    private String id;
    private String name;
    private List<String> son;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSon() {
        return son;
    }

    public void setSon(List<String> son) {
        this.son = son;
    }

    public Example cloneByJSON() {
        try {
            return JSON.parseObject(JSON.toJSONString(this), Example.class);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Example{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", son=" + son +
                '}';
    }
}
