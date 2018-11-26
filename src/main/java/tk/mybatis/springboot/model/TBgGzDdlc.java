package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_bg_gz_ddlc")
public class TBgGzDdlc {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "DDBH")
    private String ddbh;

    @Column(name = "DDMS")
    private String ddms;

    @Column(name = "JLSJ")
    private Date jlsj;

    @Column(name = "BS1")
    private String bs1;

    @Column(name = "BS2")
    private String bs2;

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
     * @return DDMS
     */
    public String getDdms() {
        return ddms;
    }

    /**
     * @param ddms
     */
    public void setDdms(String ddms) {
        this.ddms = ddms;
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