package com.jk.service;

import com.jk.model.QuDao;
import com.jk.model.User;
import com.jk.model.User_Hei;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/9 0009.
 */
public interface UserService {
    Map<String ,Object> queryUser(int page, int rows);

    void insertqianke(User user);

    List<QuDao> queryQuDao(String did);

    User queryUsers(String id);
}
