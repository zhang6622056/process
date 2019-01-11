package com.focus.process.core.chain.response;

/**
 * 可以考虑使用rest方式返回，
 * 如果使用ChainResponse，可以不关注返回值
 * Created by Nero on 2019-01-11.
 */
public interface ChainRestResponse<T> extends ChainResponse{
    /****
     * 获取错误code
     * @return
     */
    int retCode();
    /****
     * 获取错误msg
     * @return
     */
    String retMsg();

    /****
     *
     * @return
     */
    T body();


}
