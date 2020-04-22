package org.lang.securitydy.config;

import org.lang.securitydy.bean.Menu;
import org.lang.securitydy.bean.Role;
import org.lang.securitydy.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

/**
 * @Author: Lang wgyhon@gmail.com
 * @CreateDate: 2020/4/20 22:10
 * @Description:
 */
@Component
public class MyFilter implements FilterInvocationSecurityMetadataSource {

    AntPathMatcher pathMatcher = new AntPathMatcher();
    @Autowired
    MenuService menuService;
    //根据访问请求的地址去判断需要的角色,如果匹配的上就返回角色,匹配不上返回默认ROLE_login
    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        List<Menu> allMenu = menuService.getAllMenu();
        for (Menu menu : allMenu) {
            if(pathMatcher.match(menu.getPattern(),requestUrl)){
                List<Role> roles = menu.getRoles();
                String[]  rolesStr = new String[roles.size()];
                for (int i = 0; i < roles.size(); i++) {
                    rolesStr[i]= roles.get(i).getName();
                }
                return SecurityConfig.createList(rolesStr);
            }
        }

        return SecurityConfig.createList("ROLE_login");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
