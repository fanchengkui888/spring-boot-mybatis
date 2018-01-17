package com.jk.mapper;

import com.jk.model.QuDao;
import com.jk.model.User;
import com.jk.model.User_Hei;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
/**
 * Created by Administrator on 2018/1/8 0008.
 */
public interface UserMapper {

        //总条数
    @Select("select count(t.id) from t_user t,jin_rong j where t.jid = j.jid")
    long queryUserTotal();

    //分页两表查询（j.jname jinrongjname jname 是金融表的字段 jinrongjname是别名，需要在user表中定义，展示也是展示别名）
    @Select("select t.*,j.jname jinrongjname from t_user t,jin_rong j where t.jid = j.jid limit #{page},#{rows} ")
    List<User> queryUser(@Param("page") int page, @Param("rows") int rows);

    @Insert("insert into t_user (name,shenfenzheng,sex,xueli,hunyin,xianzhuzhi,hukousuozi,userdate,jid,shoujihao) " +
            "values (#{name},#{shenfenzheng},#{sex},#{xueli},#{hunyin},#{xianzhuzhi},#{hukousuozi},#{userdate},#{jid},#{shoujihao})")
    void insertqianke(User user);

    @Select("select * from qu_dao q,ding_dan d where q.qid = d.did and d.did =#{did}")
    List<QuDao> queryQuDao(@Param("did") String did);

    @Select("select * from t_user t where t.id = #{id}")
    User queryUsers(@Param("id") String id);
}
