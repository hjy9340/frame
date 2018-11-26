package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "t_bg_cg_gwc")
public class TBgCgGwc {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CPBM")
    private String cpbm;

    @Column(name = "GYSBM")
    private String gysbm;

    @Column(name = "SL")
    private Long sl;

    @Column(name = "BS2")
    private String bs2;

    @Column(name = "BS1")
    private String bs1;

    @Column(name = "BS")
    private String bs;

    private String gc;

    private String czy;

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
     * @return SL
     */
    public Long getSl() {
        return sl;
    }

    /**
     * @param sl
     */
    public void setSl(Long sl) {
        this.sl = sl;
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
    public String getGc() {
        return gc;
    }

    /**
     * @param gc
     */
    public void setGc(String gc) {
        this.gc = gc;
    }

    /**
     * @return czy
     */
    public String getCzy() {
        return czy;
    }

    /**
     * @param czy
     */
    public void setCzy(String czy) {
        this.czy = czy;
    }
}