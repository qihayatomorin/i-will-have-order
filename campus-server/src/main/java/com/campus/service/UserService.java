package com.campus.service;

import com.campus.vo.UserLoginVO;

public interface UserService {

    UserLoginVO login(String code);
}
