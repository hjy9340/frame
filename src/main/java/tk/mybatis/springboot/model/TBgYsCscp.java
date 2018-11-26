package tk.mybatis.springboot.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_bg_ys_cscp")
public class TBgYsCscp {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "RQ")
    private String rq;

    @Column(name = "DW")
    private String dw;

    @Column(name = "YSJE")
    private BigDecimal ysje;

    @Column(name = "PFJE")
    private BigDecimal pfje;

    @Column(name = "YSR")
    private String ysr;

    @Column(name = "PFR")
    private String pfr;

    @Column(name = "BZ")
    private String bz;

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
     * @return RQ
     */
    public String getRq() {
        return rq;
    }

    /**
     * @param rq
     */
    public void setRq(String rq) {
        this.rq = rq;
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
     * @return YSJE
     */
    public BigDecimal getYsje() {
        return ysje;
    }

    /**
     * @param ysje
     */
    public void setYsje(BigDecimal ysje) {
        this.ysje = ysje;
    }

    /**
     * @return PFJE
     */
    public BigDecimal getPfje() {
        return pfje;
    }

    /**
     * @param pfje
     */
    public void setPfje(BigDecimal pfje) {
        this.pfje = pfje;
    }

    /**
     * @return YSR
     */
    public String getYsr() {
        return ysr;
    }

    /**
     * @param ysr
     */
    public void setYsr(String ysr) {
        this.ysr = ysr;
    }

    /**
     * @return PFR
     */
    public String getPfr() {
        return pfr;
    }

    /**
     * @param pfr
     */
    public void setPfr(String pfr) {
        this.pfr = pfr;
    }

    /**
     * @return BZ
     */
    public String getBz() {
        return bz;
    }

    /**
     * @param bz
     */
    public void setBz(String bz) {
        this.bz = bz;
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