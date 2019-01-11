package com.focus.process.core.annotation;

import java.lang.annotation.*;

/**
 * 注解于类基础上
 * 流程链基本单位---流程
 * Created by nero on 2019-01-03.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Process {
    /****
     * 流程所属链名称
     * @return
     */
    String chianName() default "";
    /****
     * 表示下一个流程
     * 当下一个流程为空的时候，则认为执行结束
     * @return
     */
    Class<?> next() default void.class;
    /****
     * 是否开启流程，默认开启
     * 当流程关闭则不加载此node到链中
     * @return
     */
    boolean enable() default true;
}
