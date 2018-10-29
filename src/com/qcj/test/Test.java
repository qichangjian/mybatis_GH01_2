package com.qcj.test;



import com.qcj.mapper.DeptMapper;
import com.qcj.mapper.EmpMapper;
import com.qcj.mapper.UserInfosMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
/**
 * mapper代理实现mybatis  dao层的开发
 *
 *   接口中可以使用注解来写sql语句
 *
 *  高级查询
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //加载配置文件，读取信息
        Reader reader = Resources.getResourceAsReader("com/qcj/config/mybatis.xml");
        //创建sqlSession面向程序员接口，提供了增删改查的方法
        SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSession.openSession(true);
        /*mapper接口和mapper.xml一起使用的测试*/
        //UserInfosMapper mapper = session.getMapper(UserInfosMapper.class);//得到Mapper 接口的class对象
        //System.out.println(mapper.selectUserInfos(2));//调用方法 打印输出
        //System.out.println(mapper.selectLikeName("2"));
        //System.out.println(mapper.deleteUserInfos(12));


        /*只使用mapper接口（注解）不适用mapper.xml的测试*/
        /*UserInfosMapper mapper1 = session.getMapper(UserInfosMapper.class);
        System.out.println(mapper1.selectUserInfos(2));*/

        /*高级映射*/
        //一对多高级查询
        //DeptMapper mapper = session.getMapper(DeptMapper.class);
        //System.out.println(mapper.findDeptAndEmps());

        //一对一高级查询
        //EmpMapper mapper1 = session.getMapper(EmpMapper.class);
        //System.out.println(mapper1.findEmpAndDept());

        session.close();//归还连接，连接池
    }
}
