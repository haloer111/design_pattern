package com.gexiao.design.creational.singleton;

public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance() ;
        }
    };

    public static ThreadLocalInstance getInstance(){
        return threadLocalInstance.get();
    }

    private ThreadLocalInstance(){

    }
}
