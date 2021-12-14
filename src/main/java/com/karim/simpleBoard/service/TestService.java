package com.karim.simpleBoard.service;

import com.karim.simpleBoard.mapper.TestMapper;
import com.karim.simpleBoard.vo.TestVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sblim
 * Date : 2021-12-14
 * Time : 오전 10:31
 */
@RequiredArgsConstructor
@Service
public class TestService {
    private final TestMapper testMapper;

    public List<TestVo> getAllUserList(){
        return testMapper.getAllUserList();
    }
}
