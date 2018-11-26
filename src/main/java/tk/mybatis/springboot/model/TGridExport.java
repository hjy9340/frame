package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_grid_export")
public class TGridExport {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "FILENAME")
    private String filename;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "GROUPNAME")
    private String groupname;

    @Column(name = "CREATETIME")
    private Date createtime;

    @Column(name = "CREATEUSER")
    private String createuser;

    @Column(name = "GROUPDISPLAY")
    private String groupdisplay;

    @Column(name = "ROWDATA")
    private byte[] rowdata;

    @Column(name = "COLDATA")
    private byte[] coldata;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return FILENAME
     */
    public String getFilename() {
        return filename;
    }

    /**
     * @param filename
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * @return TITLE
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return GROUPNAME
     */
    public String getGroupname() {
        return groupname;
    }

    /**
     * @param groupname
     */
    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    /**
     * @return CREATETIME
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return CREATEUSER
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * @param createuser
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    /**
     * @return GROUPDISPLAY
     */
    public String getGroupdisplay() {
        return groupdisplay;
    }

    /**
     * @param groupdisplay
     */
    public void setGroupdisplay(String groupdisplay) {
        this.groupdisplay = groupdisplay;
    }

    /**
     * @return ROWDATA
     */
    public byte[] getRowdata() {
        return rowdata;
    }

    /**
     * @param rowdata
     */
    public void setRowdata(byte[] rowdata) {
        this.rowdata = rowdata;
    }

    /**
     * @return COLDATA
     */
    public byte[] getColdata() {
        return coldata;
    }

    /**
     * @param coldata
     */
    public void setColdata(byte[] coldata) {
        this.coldata = coldata;
    }
}