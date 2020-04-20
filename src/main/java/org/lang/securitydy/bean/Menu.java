package org.lang.securitydy.bean;

/**
 * @Author: Lang wgyhon@gmail.com
 * @CreateDate: 2020/4/19 22:52
 * @Description:
 */
public class Menu {
    private Integer id;
    private String pattern;

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", pattern='" + pattern + '\'' +
                '}';
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
