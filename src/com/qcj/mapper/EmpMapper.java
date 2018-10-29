package com.qcj.mapper;

import com.qcj.pojo.Emp;
import com.qcj.pojo.UserInfos;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 可以通过注释写接口方法，就不用在mapper中定义preparedStatement
 *   如果这里全部方法都使用注解，就可以删除mapper.xml文件了
 */
public interface EmpMapper {
    List<Emp> findEmpAndDept();
}
