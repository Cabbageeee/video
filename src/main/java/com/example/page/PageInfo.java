package com.example.page;

import java.util.List;

public class PageInfo<T> {
    //每页显示的数据
    private int pageNum;
    //每页放入数据的个数
    private int pageSize;
    //总数据个数
    private int count;
    //查询结果集合
    private List<T> list;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
