package com.jk.service.impl;


import com.jk.mapper.DingDanMapper;
import com.jk.model.DingDan;
import com.jk.service.DingDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
@Service
public class DingDanServiceImpl implements DingDanService {


    @Autowired//正常注入mapper
    private DingDanMapper dingDanMapper;

    @Override
    public Map<String, Object> getAll(int page, int rows) {

        long total = dingDanMapper.getTotal();

        page = page - 1;
        List<DingDan> list = dingDanMapper.queryAll(page,rows);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total",total);
        map.put("rows",list);
        return map;
    }

    @Override
    public void insert(DingDan dingDan) {
        System.out.println("11111");
        dingDanMapper.insert(dingDan);
    }




}
