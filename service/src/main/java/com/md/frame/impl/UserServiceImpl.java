package com.md.frame.impl;

import com.md.frame.UserService;
import com.md.frame.entity.MUser;
import com.md.frame.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @类名: ${CLASS_NAME}
 * @包名: com.md.frame.impl
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @日期: 2017/12/25 16:18
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public MUser findUser() {
        return userMapper.findUser();
    }
}
