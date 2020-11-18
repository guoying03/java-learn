package com.gyy.sm.dao;

import com.gyy.sm.entity.Department;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentDao
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/17
 **/

public interface DepartmentDao {
    /**
     * 查询所有院系
     *
     * @return List<Department>
     * @throws SQLException、异常
     */
    List<Department> getAll() throws SQLException;
}
