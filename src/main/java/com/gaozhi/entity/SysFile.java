package com.gaozhi.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
/**
 * <p>
 * 文件信息表
 * </p>
 *
 * @author guoyu
 * @since 2019-06-05
 */
@TableName("t_sys_file")
public class SysFile implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片名字
     */
    private String fileName;

    /**
     * 创建人id
     */
    private String createUserId;

    /**
     * 创建人名字
     */
    private String createUserName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改人
     */
    private String updateUserId;

    /**
     * 修改人名字
     */
    private String updateUserName;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SysFile{" +
        ", fileName=" + fileName +
        ", createUserId=" + createUserId +
        ", createUserName=" + createUserName +
        ", createTime=" + createTime +
        ", updateUserId=" + updateUserId +
        ", updateUserName=" + updateUserName +
        ", updateTime=" + updateTime +
        "}";
    }
}
