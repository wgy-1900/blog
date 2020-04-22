package org.lang.securitydy.service;

import org.lang.securitydy.bean.Menu;
import org.lang.securitydy.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Lang wgyhon@gmail.com
 * @CreateDate: 2020/4/20 22:13
 * @Description:
 */
@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;
    public List<Menu> getAllMenu(){
        return menuMapper.getAllMenu();
    }
}
