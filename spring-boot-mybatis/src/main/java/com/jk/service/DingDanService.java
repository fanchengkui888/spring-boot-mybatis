package com.jk.service;

import com.jk.model.DingDan;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
public interface DingDanService {
    Map<String, Object> getAll(int page, int rows);

    void insert(DingDan dingDan);


//    List<DingDan> getAll();
}
