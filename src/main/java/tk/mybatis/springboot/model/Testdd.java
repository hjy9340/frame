package tk.mybatis.springboot.model;

import javax.persistence.*;

public class Testdd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer ddbh;

    private Integer zt;

    private Integer gc;

    private String ms;

    /**
     * @return id
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
     * @return ddbh
     */
    public Integer getDdbh() {
        return ddbh;
    }

    /**
     * @param ddbh
     */
    public void setDdbh(Integer ddbh) {
        this.ddbh = ddbh;
    }

    /**
     * @return zt
     */
    public Integer getZt() {
        return zt;
    }

    /**
     * @param zt
     */
    public void setZt(Integer zt) {
        this.zt = zt;
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
     * @return ms
     */
    public String getMs() {
        return ms;
    }

    /**
     * @param ms
     */
    public void setMs(String ms) {
        this.ms = ms;
    }
}