package tk.mybatis.springboot.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "gys_cp_jg")
public class GysCpJg {
    private String gysbm;

    private String gysmc;

    private String cpbm;

    private String cpmc;

    private BigDecimal jg;

    private String xyrq;

    private String ggxh;

    private String jsyq;

    private String cplb;

    private String cplbmc;

    private Integer pxh;

    /**
     * @return gysbm
     */
    public String getGysbm() {
        return gysbm;
    }

    /**
     * @param gysbm
     */
    public void setGysbm(String gysbm) {
        this.gysbm = gysbm;
    }

    /**
     * @return gysmc
     */
    public String getGysmc() {
        return gysmc;
    }

    /**
     * @param gysmc
     */
    public void setGysmc(String gysmc) {
        this.gysmc = gysmc;
    }

    /**
     * @return cpbm
     */
    public String getCpbm() {
        return cpbm;
    }

    /**
     * @param cpbm
     */
    public void setCpbm(String cpbm) {
        this.cpbm = cpbm;
    }

    /**
     * @return cpmc
     */
    public String getCpmc() {
        return cpmc;
    }

    /**
     * @param cpmc
     */
    public void setCpmc(String cpmc) {
        this.cpmc = cpmc;
    }

    /**
     * @return jg
     */
    public BigDecimal getJg() {
        return jg;
    }

    /**
     * @param jg
     */
    public void setJg(BigDecimal jg) {
        this.jg = jg;
    }

    /**
     * @return xyrq
     */
    public String getXyrq() {
        return xyrq;
    }

    /**
     * @param xyrq
     */
    public void setXyrq(String xyrq) {
        this.xyrq = xyrq;
    }

    /**
     * @return ggxh
     */
    public String getGgxh() {
        return ggxh;
    }

    /**
     * @param ggxh
     */
    public void setGgxh(String ggxh) {
        this.ggxh = ggxh;
    }

    /**
     * @return jsyq
     */
    public String getJsyq() {
        return jsyq;
    }

    /**
     * @param jsyq
     */
    public void setJsyq(String jsyq) {
        this.jsyq = jsyq;
    }

    /**
     * @return cplb
     */
    public String getCplb() {
        return cplb;
    }

    /**
     * @param cplb
     */
    public void setCplb(String cplb) {
        this.cplb = cplb;
    }

    /**
     * @return cplbmc
     */
    public String getCplbmc() {
        return cplbmc;
    }

    /**
     * @param cplbmc
     */
    public void setCplbmc(String cplbmc) {
        this.cplbmc = cplbmc;
    }

    /**
     * @return pxh
     */
    public Integer getPxh() {
        return pxh;
    }

    /**
     * @param pxh
     */
    public void setPxh(Integer pxh) {
        this.pxh = pxh;
    }
}