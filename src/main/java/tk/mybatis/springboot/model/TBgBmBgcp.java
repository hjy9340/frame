package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "t_bg_bm_bgcp")
public class TBgBmBgcp {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CPBM")
    private String cpbm;

    @Column(name = "CPMC")
    private String cpmc;

    @Column(name = "CPJC")
    private String cpjc;

    @Column(name = "JLDW")
    private String jldw;

    @Column(name = "CPLB")
    private String cplb;

    @Column(name = "JSYQ")
    private String jsyq;

    @Column(name = "GGXH")
    private String ggxh;

    @Column(name = "CPBZ")
    private String cpbz;

    @Column(name = "PXH")
    private Integer pxh;

    @Column(name = "YXBJ")
    private String yxbj;

    @Column(name = "BS")
    private String bs;

    @Column(name = "BS1")
    private String bs1;

    @Column(name = "BS2")
    private String bs2;

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
     * @return CPMC
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
     * @return CPJC
     */
    public String getCpjc() {
        return cpjc;
    }

    /**
     * @param cpjc
     */
    public void setCpjc(String cpjc) {
        this.cpjc = cpjc;
    }

    /**
     * @return JLDW
     */
    public String getJldw() {
        return jldw;
    }

    /**
     * @param jldw
     */
    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    /**
     * @return CPLB
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
     * @return JSYQ
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
     * @return GGXH
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
     * @return CPBZ
     */
    public String getCpbz() {
        return cpbz;
    }

    /**
     * @param cpbz
     */
    public void setCpbz(String cpbz) {
        this.cpbz = cpbz;
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
}