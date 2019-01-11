package com.focus.process.runtime;

import com.focus.process.context.Context;

/**
 * 获取上下文中的参数
 * Created by Nero on 2019-01-11.
 */
public interface ParamSearcher {
    /****
     * 根据类型获取参数
     * @param classPath
     * @param context
     * @param <T>
     * @return
     */
    List<T> byType(String classPath, Context context,Class<T> clazz);
    /****
     * 根据名称获取参数
     * @param paramName
     * @param <T>
     * @return
     */
    <T> T byName(String paramName,Context context);
}
