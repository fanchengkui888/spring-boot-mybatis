package com.jk.mapper;

import com.jk.model.DingDan;
//import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.codehaus.groovy.runtime.powerassert.SourceText;


import java.util.List;
/**
 * Created by Administrator on 2018/1/8 0008.
 */
public interface DingDanMapper {
//    @Results({
//            @Result(property = "jieKuanJieid",  column = "jie_kuan_jieid"),
//            @Result(property = "jinRongJid", column = "jin_rong_jid"),
//            @Result(property = "quDaoQid", column = "qu_dao_qid"),
//            @Result(property = "yinHangKaYid", column = "yin_hang_ka_yid")
//    })
//    List<DingDan> getAll();

    @Select("SELECT count(*) FROM ding_dan d,jin_rong j where d.did = j.jid")
    long getTotal();

    //两表联查（金融表的流氓属性 j.jname 别名 jname）
    @Select("select d.*,j.jname jname from ding_dan d,jin_rong j where d.did = j.jid limit #{page},#{rows}")
    List<DingDan> queryAll(@Param("page") int page, @Param("rows") int rows);

    @Insert("DELETE FROM ding_dan WHERE did =2")
    void insert(DingDan dingDan);


}
