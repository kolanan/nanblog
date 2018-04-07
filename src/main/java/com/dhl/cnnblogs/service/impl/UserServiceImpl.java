package com.dhl.cnnblogs.service.impl;

import com.dhl.cnnblogs.dao.UserMapper;
import com.dhl.cnnblogs.model.User;
import com.dhl.cnnblogs.service.UserService;
import com.dhl.cnnblogs.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/07.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
