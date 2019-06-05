package com.gaozhi.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.io.Serializable;
/**
 * <p>
 * 日志记录表
 * </p>
 *
 * @author guoyu
 * @since 2019-06-05
 */
@TableName("t_sys_oper_log")
public class SysOperLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标题
     */
    private String title;

    /**
     * 方法
     */
    private String method;

    /**
     * 操作人
     */
    private String operName;

    /**
     * url
     */
    private String operUrl;

    /**
     * 参数
     */
    private String operParam;

    private String errorMsg;

    /**
     * 操作时间
     */
    private LocalDate operTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public String getOperUrl() {
        return operUrl;
    }

    public void setOperUrl(String operUrl) {
        this.operUrl = operUrl;
    }

    public String getOperParam() {
        return operParam;
    }

    public void setOperParam(String operParam) {
        this.operParam = operParam;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public LocalDate getOperTime() {
        return operTime;
    }

    public void setOperTime(LocalDate operTime) {
        this.operTime = operTime;
    }

    @Override
    public String toString() {
        return "SysOperLog{" +
        ", title=" + title +
        ", method=" + method +
        ", operName=" + operName +
        ", operUrl=" + operUrl +
        ", operParam=" + operParam +
        ", errorMsg=" + errorMsg +
        ", operTime=" + operTime +
        "}";
    }
}
