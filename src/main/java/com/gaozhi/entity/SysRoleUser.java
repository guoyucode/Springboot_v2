package com.gaozhi.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
/**
 * <p>
 * 用户角色中间表
 * </p>
 *
 * @author guoyu
 * @since 2019-06-05
 */
@TableName("t_sys_role_user")
public class SysRoleUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ç”¨æˆ·id
     */
    private String sysUserId;

    /**
     * 角色id
     */
    private String sysRoleId;

    public String getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(String sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(String sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    @Override
    public String toString() {
        return "SysRoleUser{" +
        ", sysUserId=" + sysUserId +
        ", sysRoleId=" + sysRoleId +
        "}";
    }
}
