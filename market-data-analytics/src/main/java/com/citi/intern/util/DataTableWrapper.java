package com.citi.intern.util;

import java.util.List;

public class DataTableWrapper {

    //data
    private Object data;


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataTable [data=" + data + "]";
    }

}
