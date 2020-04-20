package org.lang.securitydy.service;

import org.lang.securitydy.bean.User;
import org.lang.securitydy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * @Author: Lang wgyhon@gmail.com
 * @CreateDate: 2020/4/19 22:55
 * @Description:
 */
@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(s);
        if(user==null){
            throw new UsernameNotFoundException("用户不存在");
        }
        user.setRoles(userMapper.getRolesById(user.getId()));
        return user;
    }
}
