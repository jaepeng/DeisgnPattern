package com.jae.responsibility;

public  abstract class Approver {
    Approver approver;//下一个处理者
    String name;
    public Approver(String name){
        this.name=name;
    }

    //设置下一个处理者
    public void setNextApprover(Approver approver){
        this.approver=approver;
    }

    //处理审批请求的方法,需要先得到一个请求.
    public abstract void processRequest(PurchaseRequest purchaseRequest);

}
