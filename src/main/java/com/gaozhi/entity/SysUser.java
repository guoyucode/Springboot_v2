package com.gaozhi.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
/**
 * <p>
 * 用户表
 * </p>
 *
 * @author guoyu
 * @since 2019-06-05
 */
@TableName("t_sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户账号
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        ", username=" + username +
        ", password=" + password +
        "}";
    }
}
