package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("account.xml");
        AccountManage accountManage=context.getBean("accountManageImpl",AccountManage.class);
        accountManage.queryAllAccount();
        accountManage.transfor(1,2,100d);
        accountManage.queryAllAccount();
        try {
            accountManage.transfor(1, 33, 100d);
        }catch (Exception e){
            System.out.println("异常信息:"+e.getMessage());
        }
        accountManage.queryAllAccount();

        ((AbstractApplicationContext)context).close();
    }
}
