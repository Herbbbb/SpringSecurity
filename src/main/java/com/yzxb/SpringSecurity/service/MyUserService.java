package com.yzxb.SpringSecurity.service;

import com.yzxb.SpringSecurity.pojo.Role;
import com.yzxb.SpringSecurity.pojo.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class MyUserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        // 1-本地mysql用户存在性查询
        User user = selectUserFromDb();
        if (Objects.isNull(user)) {
            throw new UsernameNotFoundException("用户不存在");
        }

        // 2-本地查询权限
        List<Role> roles = selectAuthFromDb();

        // 3-设置权限信息
        user.setRoles(roles);

        // 4-返回权限合集
        return user;
    }

    /**
     * TODO 如果需要调用数据库查询，这里接入orm持久层框架即可
     * @return 用户本地权限合集
     */
    private List<Role> selectAuthFromDb() {
        return new ArrayList<>();
    }

    /**
     * TODO 如果需要调用数据库查询，这里接入orm持久层框架即可
     * @return  本地用户信息
     */
    private User selectUserFromDb() {
        return new User();
    }
}
