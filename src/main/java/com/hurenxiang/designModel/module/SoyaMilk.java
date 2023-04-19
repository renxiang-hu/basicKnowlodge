package com.hurenxiang.designModel.module;

public abstract class SoyaMilk {

    //模板方法
    final void make(){
        select();
        //用钩子函数去判断
        if (customerWantCondiments()){
            addCondiments();
        }
        soak();
        beat();
    }

    //选材料
    void select(){
        System.out.println("选择新鲜的黄豆");
    }

    //添加不同的配料
    abstract void addCondiments();

    //浸泡
    void soak(){
        System.out.println("黄豆和配料开始浸泡...");
    }

    //打碎
    void beat(){
        System.out.println("黄豆和配料放到豆浆机开始打碎...");
    }

    //钩子方法，用于判断是否需要添加配料
    boolean customerWantCondiments(){
        return true;
    }
}
