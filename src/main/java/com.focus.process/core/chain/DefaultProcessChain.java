package com.focus.process.core.chain;

import com.focus.process.core.annotation.Process;
import com.focus.process.util.StringUtils;

import java.util.List;

/**
 * 默认流程链
 * Created by Nero on 2019-01-11.
 */
public class DefaultProcessChain implements ProcessChain{


    public DefaultProcessChain(String chainName) {
        init(chainName);



    }


    /****
     * 初始化一个流程链
     * @param chainName
     */
    private void init(String chainName){
        if (StringUtils.isBlank(chainName)) throw new ProcessChainException("chainName must not null");

        



    }





    @Override
    public int getNodeCount() {
        return 0;
    }

    @Override
    public java.lang.Process getStartNode() {
        return null;
    }

    @Override
    public List<java.lang.Process> getProcessList() {
        return null;
    }

    @Override
    public void start() {

    }

    @Override
    public ProcessChain param(String k, Object v) {
        return this;
    }











}
