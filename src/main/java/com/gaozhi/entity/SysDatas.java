package com.gaozhi.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
/**
 * <p>
 * 文件表存储表
 * </p>
 *
 * @author guoyu
 * @since 2019-06-05
 */
@TableName("t_sys_datas")
public class SysDatas implements Serializable {

    private static final long serialVersionUID = 1L;

    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "SysDatas{" +
        ", filePath=" + filePath +
        "}";
    }
}
