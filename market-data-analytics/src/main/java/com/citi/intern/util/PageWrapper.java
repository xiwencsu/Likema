package com.citi.intern.util;

public class PageWrapper {

        // current page
        private int pageNo;
        // page container
        private int pageSize;
        // page sum
        private int count;
        // data
        private Object data;

        public int getPageNo() {
            return pageNo;
        }

        public void setPageNo(int pageNo) {
            this.pageNo = pageNo;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Page [pageNo=" + pageNo + ", pageSize=" + pageSize + ", count=" + count + ", data=" + data + "]";
        }

}
