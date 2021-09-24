package com.msr.batter.dao;

import com.msr.batter.entity.User;

import java.util.List;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-09-24 22:08:24
 */
public interface UserDao {

    List<User> findAll();

    int saveUser(User user);

    int updateUser(User user);

    int deleteUser(Long id);

    List<User> findByCondition(User user);

    void findByIds(List<Long> ids);
}
