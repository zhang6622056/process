package com.focus.process.context;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 维护一个context用来保存线程param信息
 * Created by Nero on 2019-01-10.
 */
public interface Context {
    /****
     * 获取当前处理的processNode
     * @return
     */
    Process getCurrentNode();
    /***
     * 获取下一个processNode
     * @return
     */
    Process getNextNode();
    /*****
     * 存放参数
     * @param k
     * @param v
     */
    void putParam(String k,Object v);
    /*****
     * 获取参数类型
     * @param k
     * @param T
     * @param <T>
     * @return
     */
    <T> T getParam(String k,Class<T> T);
}
