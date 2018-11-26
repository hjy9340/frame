package tk.mybatis.springboot.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_bg_bm_gys_bgcp_jg")
public class TBgBmGysBgcpJg {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "GYSBM")
    private String gysbm;

    @Column(name = "CPBM")
    private String cpbm;

    private String xyrq;

    @Column(name = "SCJG")
    private BigDecimal scjg;

    @Column(name = "SCJGBHs")
    private BigDecimal scjgbhs;

    @Column(name = "JG")
    private BigDecimal jg;

    @Column(name = "JGBHs")
    private BigDecimal jgbhs;

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
     * @return CPBM
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
     * @return SCJG
     */
    public BigDecimal getScjg() {
        return scjg;
    }

    /**
     * @param scjg
     */
    public void setScjg(BigDecimal scjg) {
        this.scjg = scjg;
    }

    /**
     * @return SCJGBHs
     */
    public BigDecimal getScjgbhs() {
        return scjgbhs;
    }

    /**
     * @param scjgbhs
     */
    public void setScjgbhs(BigDecimal scjgbhs) {
        this.scjgbhs = scjgbhs;
    }

    /**
     * @return JG
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
     * @return JGBHs
     */
    public BigDecimal getJgbhs() {
        return jgbhs;
    }

    /**
     * @param jgbhs
     */
    public void setJgbhs(BigDecimal jgbhs) {
        this.jgbhs = jgbhs;
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