package com.jae.responsibility;

import com.jae.composit.College;
import com.jae.composit.Department;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 1000, 1);
        DepartmentApprove departmentApprove = new DepartmentApprove("管理部门");
        CollegeApprove collegeApprove = new CollegeApprove("学院部门");
        SchoolMasterApprove schoolMasterApprove=new SchoolMasterApprove("校长");
        //需要将各个审批级别的下一个设置好,(处理人要设置成环状)
        departmentApprove.setNextApprover(collegeApprove);
        collegeApprove.setNextApprover(schoolMasterApprove);
        schoolMasterApprove.setNextApprover(departmentApprove);

        //执行订单
        departmentApprove.processRequest(purchaseRequest);

    }
}
