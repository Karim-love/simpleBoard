package com.karim.simpleBoard.mapper;


import com.karim.simpleBoard.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sblim
 * Date : 2021-12-14
 * Time : 오전 10:31
 */
@Mapper
@Repository
public interface TestMapper {
    List<TestVo> getAllUserList();
}
