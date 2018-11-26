package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_bg_bm_gys")
public class TBgBmGys {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "GYSBM")
    private String gysbm;

    @Column(name = "GYSMC")
    private String gysmc;

    @Column(name = "GYSJC")
    private String gysjc;

    @Column(name = "GYSSSM")
    private String gysssm;

    @Column(name = "YWM")
    private String ywm;

    @Column(name = "ZCDZ")
    private String zcdz;

    @Column(name = "FRDB")
    private String frdb;

    @Column(name = "SSSS")
    private String ssss;

    @Column(name = "SSSQ")
    private String sssq;

    @Column(name = "XXDZ")
    private String xxdz;

    @Column(name = "LXR")
    private String lxr;

    @Column(name = "PHO")
    private String pho;

    @Column(name = "TEL")
    private String tel;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "FAX")
    private String fax;

    @Column(name = "JLSJ")
    private Date jlsj;

    @Column(name = "XGSJ")
    private String xgsj;

    @Column(name = "CZYBM")
    private String czybm;

    @Column(name = "PXH")
    private Integer pxh;

    @Column(name = "YXBJ")
    private String yxbj;

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
     * @return GYSBM
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
     * @return GYSMC
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
     * @return GYSJC
     */
    public String getGysjc() {
        return gysjc;
    }

    /**
     * @param gysjc
     */
    public void setGysjc(String gysjc) {
        this.gysjc = gysjc;
    }

    /**
     * @return GYSSSM
     */
    public String getGysssm() {
        return gysssm;
    }

    /**
     * @param gysssm
     */
    public void setGysssm(String gysssm) {
        this.gysssm = gysssm;
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
     * @return ZCDZ
     */
    public String getZcdz() {
        return zcdz;
    }

    /**
     * @param zcdz
     */
    public void setZcdz(String zcdz) {
        this.zcdz = zcdz;
    }

    /**
     * @return FRDB
     */
    public String getFrdb() {
        return frdb;
    }

    /**
     * @param frdb
     */
    public void setFrdb(String frdb) {
        this.frdb = frdb;
    }

    /**
     * @return SSSS
     */
    public String getSsss() {
        return ssss;
    }

    /**
     * @param ssss
     */
    public void setSsss(String ssss) {
        this.ssss = ssss;
    }

    /**
     * @return SSSQ
     */
    public String getSssq() {
        return sssq;
    }

    /**
     * @param sssq
     */
    public void setSssq(String sssq) {
        this.sssq = sssq;
    }

    /**
     * @return XXDZ
     */
    public String getXxdz() {
        return xxdz;
    }

    /**
     * @param xxdz
     */
    public void setXxdz(String xxdz) {
        this.xxdz = xxdz;
    }

    /**
     * @return LXR
     */
    public String getLxr() {
        return lxr;
    }

    /**
     * @param lxr
     */
    public void setLxr(String lxr) {
        this.lxr = lxr;
    }

    /**
     * @return PHO
     */
    public String getPho() {
        return pho;
    }

    /**
     * @param pho
     */
    public void setPho(String pho) {
        this.pho = pho;
    }

    /**
     * @return TEL
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return FAX
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
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