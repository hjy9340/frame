package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "t_bg_bm_bmlb")
public class TBgBmBmlb {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "BMLB")
    private String bmlb;

    @Column(name = "LBMC")
    private String lbmc;

    @Column(name = "PXH")
    private Integer pxh;

    @Column(name = "YXBJ")
    private String yxbj;

    @Column(name = "XGBJ")
    private String xgbj;

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
     * @return LBMC
     */
    public String getLbmc() {
        return lbmc;
    }

    /**
     * @param lbmc
     */
    public void setLbmc(String lbmc) {
        this.lbmc = lbmc;
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
     * @return XGBJ
     */
    public String getXgbj() {
        return xgbj;
    }

    /**
     * @param xgbj
     */
    public void setXgbj(String xgbj) {
        this.xgbj = xgbj;
    }
}