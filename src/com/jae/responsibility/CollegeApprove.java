package com.jae.responsibility;

public class CollegeApprove extends Approver {
    public CollegeApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice()<=10000&& purchaseRequest.getPrice()>5000){
            System.out.println(name+"处理成功");
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
