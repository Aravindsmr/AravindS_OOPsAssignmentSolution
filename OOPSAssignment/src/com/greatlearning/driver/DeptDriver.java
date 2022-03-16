package com.greatlearning.driver;

import com.greatlearning.departments.AdminDepartment;
import com.greatlearning.departments.HrDepartment;
import com.greatlearning.departments.TechDepartment;

public class DeptDriver {

    public static void main(String[] args) {
        
        // creating objects for the departments
        HrDepartment hrDept = new HrDepartment();
        AdminDepartment adminDept = new AdminDepartment();
        TechDepartment techDept = new TechDepartment();

        // printing admin department methods
        System.out.println("\n Welcome to" + adminDept.departmentName());
        System.out.println(adminDept.getTodaysWork());
        System.out.println(adminDept.getWorkDeadline());
        System.out.println(adminDept.isTodayAHoliday());

        // printing HR department methods
        System.out.println("\n\n Welcome to" + hrDept.departmentName());
        System.out.println(hrDept.doActivity());
        System.out.println(hrDept.getTodaysWork());
        System.out.println(hrDept.getWorkDeadline());
        System.out.println(hrDept.isTodayAHoliday());

        // printing tech department methods
        System.out.println("\n\n Welcome to" + techDept.departmentName());
        System.out.println(techDept.getTodaysWork());
        System.out.println(techDept.getWorkDeadline());
        System.out.println(techDept.getTechStackInformation());
        System.out.println(techDept.isTodayAHoliday());

    }


}
