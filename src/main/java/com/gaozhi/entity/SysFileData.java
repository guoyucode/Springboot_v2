package com.gaozhi.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
/**
 * <p>
 * 文件数据外键绑定表
 * </p>
 *
 * @author guoyu
 * @since 2019-06-05
 */
@TableName("t_sys_file_data")
public class SysFileData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String dataId;

    private String fileId;

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Override
    public String toString() {
        return "SysFileData{" +
        ", dataId=" + dataId +
        ", fileId=" + fileId +
        "}";
    }
}
