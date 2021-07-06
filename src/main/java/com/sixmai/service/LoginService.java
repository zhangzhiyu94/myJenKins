package com.sixmai.service;

import java.util.Map;

/**
 * @author Zzy
 * @description:TODO
 * @date 2021/7/5 10:13
 */
public interface  LoginService {

    //loginname是登陆名称
    //password是密码
    Map<String,Object> login(String loginname, String password);
}
