package com.greatlearning.driver;

import com.greatlearning.departments.AdminDepartment;
import com.greatlearning.departments.HrDepartment;
import com.greatlearning.departments.TechDepartment;

public class DeptDriver {

    public static void main(String[] args) {

        HrDepartment hrDept = new HrDepartment();
        AdminDepartment adminDept = new AdminDepartment();
        TechDepartment techDept = new TechDepartment();

        System.out.println("\n Welcome to" + adminDept.departmentName());
        System.out.println(adminDept.getTodaysWork());
        System.out.println(adminDept.getWorkDeadline());
        System.out.println(adminDept.isTodayAHoliday());

        System.out.println("\n\n Welcome to" + hrDept.departmentName());
        System.out.println(hrDept.doActivity());
        System.out.println(hrDept.getTodaysWork());
        System.out.println(hrDept.getWorkDeadline());
        System.out.println(hrDept.isTodayAHoliday());

        System.out.println("\n\n Welcome to" + techDept.departmentName());
        System.out.println(techDept.getTodaysWork());
        System.out.println(techDept.getWorkDeadline());
        System.out.println(techDept.getTechStackInformation());
        System.out.println(techDept.isTodayAHoliday());

    }


}
