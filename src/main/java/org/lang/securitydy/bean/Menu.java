package org.lang.securitydy.bean;

import java.util.List;

/**
 * @Author: Lang wgyhon@gmail.com
 * @CreateDate: 2020/4/19 22:52
 * @Description:
 */
public class Menu {
    private Integer id;
    private String pattern;
    private List<Role> roles;

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", pattern='" + pattern + '\'' +
                ", roles=" + roles +
                '}';
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
