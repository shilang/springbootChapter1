package com.linfengda.sb.chapter1.common.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 描述: 基本数据类型
 *
 * @author linfengda
 * @create 2019-12-23 17:58
 */
@Getter
@AllArgsConstructor
public enum BaseType {
    /**
     * java.lang.String
     */
    STRING("java.lang.String"),
    /**
     * int
     */
    INT("int"),
    /**
     * java.lang.Integer
     */
    B_INT("java.lang.Integer"),
    /**
     * float
     */
    FLOAT("float"),
    /**
     * java.lang.Float
     */
    B_FLOAT("java.lang.Float"),
    /**
     * double
     */
    DOUBLE("double"),
    /**
     * java.lang.Double
     */
    B_DOUBLE("java.lang.Double"),
    /**
     * java.math.BigDecimal
     */
    BIG_DECIMAL("java.math.BigDecimal"),
    /**
     * long
     */
    LONG("long"),
    /**
     * java.lang.Long
     */
    B_LONG("java.lang.Long"),
    /**
     * java.util.Date
     */
    DATE("java.util.Date"),
    /**
     * java.sql.Date
     */
    SQL_DATE("java.sql.Date"),
    /**
     * java.sql.Timestamp
     */
    SQL_DATE_TIME("java.sql.Timestamp"),
    /**
     * byte
     */
    BYTE("byte"),
    /**
     * java.lang.Byte
     */
    B_BYTE("java.lang.Byte"),
    /**
     * [B
     */
    BYTES("[B"),
    /**
     * [Ljava.lang.Byte
     */
    B_BYTES("[Ljava.lang.Byte;"),
    /**
     * boolean
     */
    BOOLEAN("boolean"),
    /**
     * java.lang.Boolean
     */
    B_BOOLEAN("java.lang.Boolean"),
    ;

    private String type;

    public static boolean isBaseType(String type){
        for (BaseType value : values()) {
            if (value.getType().equals(type)) {
                return true;
            }
        }
        return false;
    }
}
