package com.karim.simpleBoard.dao;

import com.karim.simpleBoard.mapper.UserMapper;
import com.karim.simpleBoard.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by sblim
 * Date : 2021-12-14
 * Time : 오후 4:39
 */
@Repository
public class UserDao {
    @Autowired
    UserMapper userMapper;

    public UserVo getUserAccount(String userId){
        return userMapper.getUserAccount(userId);
    }
}
