package com.linfengda.sb.support.cache.manager;

import org.springframework.core.Ordered;

/**
 * 描述: 缓存切面优先级管理
 *
 * @author linfengda
 * @create 2020-03-26 11:08
 */
public interface CacheAopOrderManager {
    /**
     * 查询缓存切面：第一
     */
    int QUERY_CACHE = Ordered.LOWEST_PRECEDENCE-2;
    /**
     * spring事务切面：第二
     */
    int SPRING_TRANSACTION = Ordered.LOWEST_PRECEDENCE-1;
    /**
     * 更新删除缓存切面：第三
     */
    int UPDATE_CACHE = Ordered.LOWEST_PRECEDENCE;
}
