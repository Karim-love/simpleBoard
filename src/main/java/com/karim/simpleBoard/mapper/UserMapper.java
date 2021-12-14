package com.karim.simpleBoard.mapper;

import com.karim.simpleBoard.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by sblim
 * Date : 2021-12-14
 * Time : 오후 3:46
 */
@Mapper
public interface UserMapper {
    UserVo getUserAccount(String userId);

    void saveUser(UserVo userVo);
}
