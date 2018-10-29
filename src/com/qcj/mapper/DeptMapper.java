package com.qcj.mapper;

import com.qcj.pojo.Dept;

import java.util.List;

public interface DeptMapper {
    List<Dept> findDeptAndEmps();
}
