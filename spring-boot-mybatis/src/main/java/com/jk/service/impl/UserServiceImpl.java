package com.jk.service.impl;

import com.jk.mapper.UserMapper;
import com.jk.model.QuDao;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/9 0009.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;//正常注入mapper

//    @Autowired//注入主库
//    private DataSource1UserMapper dataSource1UserMapper;
//    @Autowired//注入从库1
//    private DataSource2UserMapper dataSource2UserMapper;
//    @Autowired//注入从库2
//    private DataSource3UserMapper dataSource3UserMapper;
    @Override
//    @Cacheable(value="user-qianke",key="'qianke-id'")//表示该方法支持缓存
    public Map<String ,Object> queryUser(int page, int rows) {
        System.out.println("打印说明走缓存");
        long total = userMapper.queryUserTotal();
//        long total = dataSource2UserMapper.queryUserTotal();//去从库1查询（test2）
        page = page - 1;
        List<User> list = userMapper.queryUser(page,rows);
//        List<User> list = dataSource2UserMapper.queryUser(page,rows);//去从库1查询（test2）
        Map<String ,Object> map = new HashMap<String ,Object>();
        map.put("total",total);//bootsart必须是这么写 total
        map.put("rows",list);//bootsart必须是这么写 rows
        return map;
    }

    @Override
//    @CacheEvict(value="user-qianke",key="'qianke-id'")//缓存的清除操作
    public void insertqianke(User user) {
        userMapper.insertqianke(user);
//        dataSource1UserMapper.insertqianke(user);//去主库新增（test1）
    }

    @Override
    public List<QuDao> queryQuDao(String did) {
        return userMapper.queryQuDao(did);
    }

    @Override
    public User queryUsers(String id) {
        return userMapper.queryUsers(id);
    }
}
