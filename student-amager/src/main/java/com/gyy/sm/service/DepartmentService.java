package com.gyy.sm.service;

import com.gyy.sm.entity.Department;

import java.util.List;

/**
 * @ClassName DepartmentService
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/17
 **/

public interface DepartmentService {
    /**
     * 查找所有院系
     *
     * @return List<Department>
     */
    List<Department> selectAll();
}
