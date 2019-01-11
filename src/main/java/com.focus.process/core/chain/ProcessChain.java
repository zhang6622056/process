package com.focus.process.core.chain;

import java.util.List;

/**
 * 流程链能力接口
 * Created by Nero on 2019-01-11.
 */
public interface ProcessChain {
    /****
     * 获取链node总数
     * @return
     */
    int getNodeCount();
    /****
     * 获取流程连第一个节点
     * @return
     */
    Process getStartNode();
    /****
     * 获取流程链，以list node的形式返回
     * @return
     */
    List<Process> getProcessList();

    /*****
     * 开始执行流程链中的process
     */
    void start();
    /****
     * 初始化参数
     * @return
     */
    ProcessChain param(String k,Object v);
}
