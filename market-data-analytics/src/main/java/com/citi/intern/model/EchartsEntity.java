package com.citi.intern.model;

public class EchartsEntity {
    private String name;
    private String type;
    private Object data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "EchartsEntity{" +
                "name:" + name +
                ", type:" + type +
                ", data:" + data +
                '}';
    }
}
