package com.focus.process.core.init;

/****
 * 启动过程中检查process是否按照正常标准编写
 * -是否每一个类只有一个processmethod
 * -是否processmethod返回的是约定response对象
 */
public interface Checker {

    boolean checkProcess();
}
