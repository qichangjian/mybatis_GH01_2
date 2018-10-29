package com.qcj.mapper;

import com.qcj.pojo.UserInfos;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 可以通过注释写接口方法，就不用在mapper中定义preparedStatement
 *   如果这里全部方法都使用注解，就可以删除mapper.xml文件了
 */
public interface UserInfosMapper {
    @Select("select * from userinfo where uid = #{uid}")
    List<UserInfos> selectUserInfos(int uid);

    List<UserInfos> selectAll();
    List<UserInfos> selectLikeName(String likename);
    int updateUserInfosById(UserInfos userInfos);
    int insertUserInfos(UserInfos userInfos);
    int deleteUserInfos(int id);
}
