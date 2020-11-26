package com.jae.template.improve;

public abstract class SoyaMilk {
    //模板方法,make,做成final方法,不让子类去覆盖
    final void make(){
        select();
        if (customerWantCondiments()){
            add();
        }
        soak();
        beat();
    }
    //选材料
    void select(){
        System.out.println("选择新鲜黄豆");
    }

    //添加不同的配料,抽象方法
    abstract void add();

    //浸泡
    private void soak(){
        System.out.println("第三步,黄豆和配料开始浸泡,需要三个小时");
    }
    void beat(){
        System.out.println("第四步,打豆浆");
    }

    //钩子方法:决定是否需要添加配料
    boolean customerWantCondiments(){
        return true;
    }
}
