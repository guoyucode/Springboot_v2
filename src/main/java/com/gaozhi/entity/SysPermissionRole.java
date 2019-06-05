package com.gaozhi.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
/**
 * <p>
 * 角色权限中间表
 * </p>
 *
 * @author guoyu
 * @since 2019-06-05
 */
@TableName("t_sys_permission_role")
public class SysPermissionRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
    private String roleId;

    /**
     * 权限id
     */
    private String permissionId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        return "SysPermissionRole{" +
        ", roleId=" + roleId +
        ", permissionId=" + permissionId +
        "}";
    }
}
