package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_bg_bm_dw")
public class TBgBmDw {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "DW")
    private String dw;

    @Column(name = "DWMC")
    private String dwmc;

    @Column(name = "DWJC")
    private String dwjc;

    @Column(name = "DWLS")
    private String dwls;

    @Column(name = "YWM")
    private String ywm;

    @Column(name = "PXH")
    private Integer pxh;

    @Column(name = "YXBJ")
    private String yxbj;

    @Column(name = "JLSJ")
    private Date jlsj;

    @Column(name = "XGSJ")
    private String xgsj;

    @Column(name = "CZYBM")
    private String czybm;

    @Column(name = "BS1")
    private String bs1;

    @Column(name = "BS2")
    private String bs2;

    @Column(name = "BS")
    private String bs;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return DW
     */
    public String getDw() {
        return dw;
    }

    /**
     * @param dw
     */
    public void setDw(String dw) {
        this.dw = dw;
    }

    /**
     * @return DWMC
     */
    public String getDwmc() {
        return dwmc;
    }

    /**
     * @param dwmc
     */
    public void setDwmc(String dwmc) {
        this.dwmc = dwmc;
    }

    /**
     * @return DWJC
     */
    public String getDwjc() {
        return dwjc;
    }

    /**
     * @param dwjc
     */
    public void setDwjc(String dwjc) {
        this.dwjc = dwjc;
    }

    /**
     * @return DWLS
     */
    public String getDwls() {
        return dwls;
    }

    /**
     * @param dwls
     */
    public void setDwls(String dwls) {
        this.dwls = dwls;
    }

    /**
     * @return YWM
     */
    public String getYwm() {
        return ywm;
    }

    /**
     * @param ywm
     */
    public void setYwm(String ywm) {
        this.ywm = ywm;
    }

    /**
     * @return PXH
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

    /**
     * @return YXBJ
     */
    public String getYxbj() {
        return yxbj;
    }

    /**
     * @param yxbj
     */
    public void setYxbj(String yxbj) {
        this.yxbj = yxbj;
    }

    /**
     * @return JLSJ
     */
    public Date getJlsj() {
        return jlsj;
    }

    /**
     * @param jlsj
     */
    public void setJlsj(Date jlsj) {
        this.jlsj = jlsj;
    }

    /**
     * @return XGSJ
     */
    public String getXgsj() {
        return xgsj;
    }

    /**
     * @param xgsj
     */
    public void setXgsj(String xgsj) {
        this.xgsj = xgsj;
    }

    /**
     * @return CZYBM
     */
    public String getCzybm() {
        return czybm;
    }

    /**
     * @param czybm
     */
    public void setCzybm(String czybm) {
        this.czybm = czybm;
    }

    /**
     * @return BS1
     */
    public String getBs1() {
        return bs1;
    }

    /**
     * @param bs1
     */
    public void setBs1(String bs1) {
        this.bs1 = bs1;
    }

    /**
     * @return BS2
     */
    public String getBs2() {
        return bs2;
    }

    /**
     * @param bs2
     */
    public void setBs2(String bs2) {
        this.bs2 = bs2;
    }

    /**
     * @return BS
     */
    public String getBs() {
        return bs;
    }

    /**
     * @param bs
     */
    public void setBs(String bs) {
        this.bs = bs;
    }
}