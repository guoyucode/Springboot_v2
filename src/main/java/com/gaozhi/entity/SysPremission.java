package com.gaozhi.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
/**
 * <p>
 * 权限表
 * </p>
 *
 * @author guoyu
 * @since 2019-06-05
 */
@TableName("t_sys_premission")
public class SysPremission implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限描述
     */
    private String descripion;

    /**
     * 授权链接
     */
    private String url;

    /**
     * 是否跳转 0 不跳转 1跳转
     */
    private Integer isBlank;

    /**
     * 父节点id
     */
    private String pid;

    /**
     * 权限标识
     */
    private String perms;

    /**
     * 类型   0：目录   1：菜单   2：按钮
     */
    private Integer type;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 排序
     */
    private Integer orderNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIsBlank() {
        return isBlank;
    }

    public void setIsBlank(Integer isBlank) {
        this.isBlank = isBlank;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "SysPremission{" +
        ", name=" + name +
        ", descripion=" + descripion +
        ", url=" + url +
        ", isBlank=" + isBlank +
        ", pid=" + pid +
        ", perms=" + perms +
        ", type=" + type +
        ", icon=" + icon +
        ", orderNum=" + orderNum +
        "}";
    }
}
