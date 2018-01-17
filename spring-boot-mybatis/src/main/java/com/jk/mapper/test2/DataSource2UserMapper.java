//package com.jk.mapper.test2;
//
//import com.jk.model.DingDan;
//import com.jk.model.User;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;
//
//import java.util.List;
//
///**
// * Created by Administrator on 2018/1/9 0009.
// */
//public interface DataSource2UserMapper {
//
//    @Select("select count(t.id) from t_user t,jin_rong j where t.jid = j.jid")
//    long queryUserTotal();
//
//    //分页两表查询（j.jname jinrongjname jname 是金融表的字段 jinrongjname是别名，需要在user表中定义，展示也是展示别名）
//    @Select("select t.*,j.jname jinrongjname from t_user t,jin_rong j where t.jid = j.jid limit #{page},#{rows} ")
//    List<User> queryUser(@Param("page") int page, @Param("rows") int rows);
//}
