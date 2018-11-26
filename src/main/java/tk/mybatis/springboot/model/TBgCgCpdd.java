package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_bg_cg_cpdd")
public class TBgCgCpdd {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "LX")
    private String lx;

    @Column(name = "DDBH")
    private String ddbh;

    @Column(name = "LB")
    private String lb;

    @Column(name = "RQ")
    private String rq;

    @Column(name = "DW")
    private String dw;

    @Column(name = "SBR")
    private String sbr;

    @Column(name = "LYR")
    private String lyr;

    @Column(name = "BZ")
    private String bz;

    @Column(name = "CZYBM")
    private String czybm;

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

    @Column(name = "YXBJ")
    private String yxbj;

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
     * @return LX
     */
    public String getLx() {
        return lx;
    }

    /**
     * @param lx
     */
    public void setLx(String lx) {
        this.lx = lx;
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
     * @return SBR
     */
    public String getSbr() {
        return sbr;
    }

    /**
     * @param sbr
     */
    public void setSbr(String sbr) {
        this.sbr = sbr;
    }

    /**
     * @return LYR
     */
    public String getLyr() {
        return lyr;
    }

    /**
     * @param lyr
     */
    public void setLyr(String lyr) {
        this.lyr = lyr;
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
}