package com.jae.responsibility;

public class DepartmentApprove extends Approver {
    public DepartmentApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice()<=5000){
            System.out.println(name+"处理成功");
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
