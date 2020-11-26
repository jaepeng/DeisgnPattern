package com.jae.responsibility;

public class SchoolMasterApprove extends Approver {
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice()>10000){
            System.out.println(name+"处理完成");
        }else{
            approver.processRequest(purchaseRequest);
        }

    }

    public SchoolMasterApprove(String name) {
        super(name);
    }

}
