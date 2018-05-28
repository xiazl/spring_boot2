package com.fly.caipiao.comment.configuration.datasource;


public class DataSourceContextHolder {
    private static final ThreadLocal<String> LOCAL = new ThreadLocal<String>();

    public static ThreadLocal<String> getLocal() {
        return LOCAL;
    }

    public static void set(DataSourceType dataSourceType){
        LOCAL.set(dataSourceType.getType());
    }

    /**
     * 读可能是多个库
     */
    public static void read() {
        LOCAL.set(DataSourceType.read.getType());
    }

    /**
     * 写只有一个库
     */
    public static void write() {
        LOCAL.set(DataSourceType.write.getType());
    }

    public static String get() {
        return LOCAL.get();
    }

    public static void clear() {
        LOCAL.remove();
    }


}
