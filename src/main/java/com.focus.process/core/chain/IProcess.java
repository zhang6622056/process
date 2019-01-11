package com.focus.process.core.chain;

import com.focus.process.context.Context;
import com.focus.process.core.chain.response.ChainResponse;

/**
 * 定义流程链必须实现的方法入口
 * Created by Nero on 2019-01-11.
 */
public interface IProcess {

    /****
     * 默认流程链方法入口
     * @return
     */
    ChainResponse doChain(Context context);
}
