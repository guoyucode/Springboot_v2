package com.gaozhi.entity;
import java.io.Serializable;
/**
 * <p>
 * 
 * </p>
 *
 * @author guoyu
 * @since 2019-06-05
 */
public class Tttt implements Serializable {

    private static final long serialVersionUID = 1L;

    private String asd;

    public String getAsd() {
        return asd;
    }

    public void setAsd(String asd) {
        this.asd = asd;
    }

    @Override
    public String toString() {
        return "Tttt{" +
        ", asd=" + asd +
        "}";
    }
}
