package org.lang.securitydy.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lang.securitydy.bean.Role;
import org.lang.securitydy.bean.User;

import java.util.List;

/**
 * @Author: Lang wgyhon@gmail.com
 * @CreateDate: 2020/4/19 22:54
 * @Description:
 */
@Mapper
public interface UserMapper {

    User loadUserByUsername(String username);

    List<Role> getRolesById(Integer id);
}
