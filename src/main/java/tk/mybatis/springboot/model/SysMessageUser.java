package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "sys_message_user")
public class SysMessageUser {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "MESSAGEID")
    private Integer messageid;

    @Column(name = "TOUSER")
    private String touser;

    @Column(name = "TOEMAIL")
    private String toemail;

    @Column(name = "TOPHONE")
    private String tophone;

    @Column(name = "READSTATE")
    private Boolean readstate;

    @Column(name = "ISDELETE")
    private Boolean isdelete;

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
     * @return MESSAGEID
     */
    public Integer getMessageid() {
        return messageid;
    }

    /**
     * @param messageid
     */
    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    /**
     * @return TOUSER
     */
    public String getTouser() {
        return touser;
    }

    /**
     * @param touser
     */
    public void setTouser(String touser) {
        this.touser = touser;
    }

    /**
     * @return TOEMAIL
     */
    public String getToemail() {
        return toemail;
    }

    /**
     * @param toemail
     */
    public void setToemail(String toemail) {
        this.toemail = toemail;
    }

    /**
     * @return TOPHONE
     */
    public String getTophone() {
        return tophone;
    }

    /**
     * @param tophone
     */
    public void setTophone(String tophone) {
        this.tophone = tophone;
    }

    /**
     * @return READSTATE
     */
    public Boolean getReadstate() {
        return readstate;
    }

    /**
     * @param readstate
     */
    public void setReadstate(Boolean readstate) {
        this.readstate = readstate;
    }

    /**
     * @return ISDELETE
     */
    public Boolean getIsdelete() {
        return isdelete;
    }

    /**
     * @param isdelete
     */
    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }
}