package com.fly.caipiao.comment.framework.page;

/**
 * 分页对象bean
 *
 * @author baidu
 */

public class PageBean {
    /**
     * current page number
     */
    private int current = 1;

    /**
     * number of data items per page
     */
    private int pageSize = 50;

    /**
     * total number of data items
     */
    private long total;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
