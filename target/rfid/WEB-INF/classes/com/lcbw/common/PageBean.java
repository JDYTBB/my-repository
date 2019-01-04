package com.lcbw.common;

import java.util.List;

/**
 * 分页实体类
 */
public class PageBean<T> {

    //已知数据
    private int currentPage;//当前页
    private int pageSize;//每页显示的条数
    private int totalCount;//总记录数,数据库查询得到

    //需要计算得到
    private int startIndex;//开始索引,就是在数据库中从第几行数据开始拿数
    private int totalPage;//总页数

    private int start;//动态条开始
    private int end;//动态条结束

    private List<T> data;//将每页要显示的数据放在List中

    public PageBean(int currentPage, int pageSize, int totalCount) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;

        //总记录数mod每页记录数 mod值为0，说明没有多余一页要显示少于pageSize条数据的
        if(totalCount % pageSize == 0){
            this.totalPage = totalCount / pageSize;
        }else {
            this.totalPage = totalCount / pageSize + 1;
        }

        //开始索引
        this.startIndex = (currentPage - 1) * pageSize;

        this.start = 1;
        this.end = 5;

        if(totalPage <= 5){
            //总页数<5那么end就为totalPage
            this.end = totalPage;
        }else {
            //总页数>5,就需要根据当前页是第几页来判断start和end是多少。
            this.start = currentPage -2;
            this.end = currentPage + 2;
            if(start <= 0){
                this.start = 1;
                this.end = 5;
            }
            if(end > this.totalPage){
                this.start = totalPage -5;
                this.end = totalPage;
            }
        }
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public List<T> getData() {
        return data;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
