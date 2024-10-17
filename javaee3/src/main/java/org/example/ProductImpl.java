package org.example;

public class ProductImpl implements Product{
    @Override
    public void insert(){
        System.out.println("添加信息......");
    }
    @Override
    public void delete(){
        System.out.println("删除信息......");
        throw new RuntimeException("数据异常!");
    }
}
