package com.linfengda.sb.support.orm.exception;


import com.linfengda.sb.chapter1.common.exception.entity.ErrorCode;
import lombok.Getter;

/**
 * 描述: 持久化异常
 *
 * @author linfengda
 * @create 2018-08-17 16:40
 */
@Getter
public class DataAccessException extends RuntimeException {

    public DataAccessException(String msg) {
        this.msg = msg;
    }

    public DataAccessException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code = ErrorCode.COMMON_DAO_ERROR_CODE;

    private String msg;
}
