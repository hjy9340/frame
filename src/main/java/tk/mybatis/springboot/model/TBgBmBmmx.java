package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "t_bg_bm_bmmx")
public class TBgBmBmmx {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "BMLB")
    private String bmlb;

    @Column(name = "BMMX")
    private String bmmx;

    @Column(name = "MXMC")
    private String mxmc;

    @Column(name = "BMJC")
    private String bmjc;

    @Column(name = "PXH")
    private Integer pxh;

    @Column(name = "YXBJ")
    private String yxbj;

    @Column(name = "BZ")
    private String bz;

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
     * @return BMLB
     */
    public String getBmlb() {
        return bmlb;
    }

    /**
     * @param bmlb
     */
    public void setBmlb(String bmlb) {
        this.bmlb = bmlb;
    }

    /**
     * @return BMMX
     */
    public String getBmmx() {
        return bmmx;
    }

    /**
     * @param bmmx
     */
    public void setBmmx(String bmmx) {
        this.bmmx = bmmx;
    }

    /**
     * @return MXMC
     */
    public String getMxmc() {
        return mxmc;
    }

    /**
     * @param mxmc
     */
    public void setMxmc(String mxmc) {
        this.mxmc = mxmc;
    }

    /**
     * @return BMJC
     */
    public String getBmjc() {
        return bmjc;
    }

    /**
     * @param bmjc
     */
    public void setBmjc(String bmjc) {
        this.bmjc = bmjc;
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