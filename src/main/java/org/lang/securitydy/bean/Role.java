package org.lang.securitydy.bean;

/**
 * @Author: Lang wgyhon@gmail.com
 * @CreateDate: 2020/4/16 22:30
 * @Description:
 */
public class Role {
    private Integer id ;
    private String name;
    private String nameZH;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameZH() {
        return nameZH;
    }

    public void setNameZH(String nameZH) {
        this.nameZH = nameZH;
    }
}
