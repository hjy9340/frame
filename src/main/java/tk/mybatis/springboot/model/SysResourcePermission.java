package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "sys_resource_permission")
public class SysResourcePermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "permission_id")
    private Integer permissionId;

    @Column(name = "resource_id")
    private Integer resourceId;

    @Column(name = "is_show")
    private Boolean isShow;

    private Byte type;

    @Column(name = "permission_str")
    private String permissionStr;

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
     * @return permission_id
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * @param permissionId
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * @return resource_id
     */
    public Integer getResourceId() {
        return resourceId;
    }

    /**
     * @param resourceId
     */
    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * @return is_show
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * @param isShow
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * @return type
     */
    public Byte getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * @return permission_str
     */
    public String getPermissionStr() {
        return permissionStr;
    }

    /**
     * @param permissionStr
     */
    public void setPermissionStr(String permissionStr) {
        this.permissionStr = permissionStr;
    }
}