package com.sample.ssm.service.impl;

import com.sample.ssm.mapper.UserInfoMapper;
import com.sample.ssm.model.UserInfo;
import com.sample.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuyufeng
 * @date 2018/8/24.
 */
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfoByUserId(Integer userId) {
        return userInfoMapper.selectOne(userId);
    }
}
