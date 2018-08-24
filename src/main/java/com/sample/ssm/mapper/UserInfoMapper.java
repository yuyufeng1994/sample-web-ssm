package com.sample.ssm.mapper;

import com.sample.ssm.model.UserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author yuyufeng
 * @date 2018/8/24.
 */
public interface UserInfoMapper {
    /**
     * 根据ID获取单个对象
     * @param userId
     * @return
     */
    UserInfo selectOne(@Param("userId") Integer userId);
}
