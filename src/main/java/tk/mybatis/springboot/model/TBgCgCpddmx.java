package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_bg_cg_cpddmx")
public class TBgCgCpddmx {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "DDBH")
    private String ddbh;

    @Column(name = "CPBM")
    private String cpbm;

    @Column(name = "GYSBM")
    private String gysbm;

    @Column(name = "LB")
    private String lb;

    @Column(name = "SL")
    private Integer sl;

    @Column(name = "BZ")
    private String bz;

    @Column(name = "CZYBM")
    private String czybm;

    @Column(name = "QRSJ")
    private String qrsj;

    @Column(name = "JLSJ")
    private Date jlsj;

    @Column(name = "XGSJ")
    private String xgsj;

    @Column(name = "BS1")
    private String bs1;

    @Column(name = "BS2")
    private String bs2;

    @Column(name = "BS")
    private String bs;

    private Integer gc;

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
     * @return DDBH
     */
    public String getDdbh() {
        return ddbh;
    }

    /**
     * @param ddbh
     */
    public void setDdbh(String ddbh) {
        this.ddbh = ddbh;
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
     * @return LB
     */
    public String getLb() {
        return lb;
    }

    /**
     * @param lb
     */
    public void setLb(String lb) {
        this.lb = lb;
    }

    /**
     * @return SL
     */
    public Integer getSl() {
        return sl;
    }

    /**
     * @param sl
     */
    public void setSl(Integer sl) {
        this.sl = sl;
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
     * @return QRSJ
     */
    public String getQrsj() {
        return qrsj;
    }

    /**
     * @param qrsj
     */
    public void setQrsj(String qrsj) {
        this.qrsj = qrsj;
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

    /**
     * @return gc
     */
    public Integer getGc() {
        return gc;
    }

    /**
     * @param gc
     */
    public void setGc(Integer gc) {
        this.gc = gc;
    }
}