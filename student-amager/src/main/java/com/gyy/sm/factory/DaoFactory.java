package com.gyy.sm.factory;

import com.gyy.sm.dao.AdminDao;
import com.gyy.sm.dao.DepartmentDao;
import com.gyy.sm.dao.impl.AdminDaoImpl;
import com.gyy.sm.dao.impl.DepartmentDaoImpl;

/**
 * @ClassName DaoFactory
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/16
 **/
public class DaoFactory {
    /**
     * 获得AdminDao实例
     *
     * @return AdminDao实例
     */
    public static AdminDao getAdminDaoInstance(){
        return new AdminDaoImpl();
    }

    /**
     * 获得DepartmentDao实例
     *
     * @return AdminDao实例
     */
    public static DepartmentDao getDepartmentDaoInstance(){
        return new DepartmentDaoImpl();
    }
}
