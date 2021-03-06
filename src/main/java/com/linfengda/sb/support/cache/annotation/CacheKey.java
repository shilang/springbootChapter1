package com.linfengda.sb.support.cache.annotation;

import java.lang.annotation.*;

/**
 * 描述: 缓存key
 *
 * @author linfengda
 * @create 2020-03-27 15:05
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface CacheKey {
    /**
     * key顺序
     * @return
     */
    int index() default 0;
    /**
     * key是否允许为空
     * @return
     */
    boolean nullable() default true;
    /**
     * key为空时使用值
     * @return
     */
    String nullKey() default "null";
}
