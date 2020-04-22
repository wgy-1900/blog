package org.lang.securitydy.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lang.securitydy.bean.Menu;

import java.util.List;

/**
 * @Author: Lang wgyhon@gmail.com
 * @CreateDate: 2020/4/20 22:15
 * @Description:
 */
@Mapper
public interface MenuMapper {
    public List<Menu> getAllMenu() ;
    
}
