package edu.xcdq.练习;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/7/1 8:46
 */
public class anli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user = "张三";
        String pwd = "123";
        double money = 100;
        System.out.println("--------------------------");
        System.out.println("\t欢迎登录前程ATM系统");
        System.out.println("\t1、查询\n\t2、存款\n\t3、取款\n\t4、修改密码\n\t5、退出");
        System.out.println("请输入用户名:");
        String user1 = input.next();
        System.out.println("请输入用户密码:");
        String pwd1 = input.next();
        if(user.equals(user1) && pwd.equals(pwd1)){
            System.out.println("登录成功");
            System.out.println("---------------------");
            System.out.println("1、存款\n2、取款\n3、退出");
            System.out.println("---------------------");
            System.out.println("请选择你要执行的操作");
            int number = input.nextInt();
            switch (number){
                case 1:
                    System.out.println("请输入你要存入的金额:");
                    float savemoney = input.nextFloat();
                    if(savemoney >1000){
                        System.out.println("单次最大存款金额不能大于1000元");
                        savemoney=0;
                    }else if(savemoney < 0){
                        System.out.println("存款金额不能为负数");
                        savemoney=0;
                    }else if(savemoney % 100 !=0){
                        System.out.println("不能存零钱");
                        savemoney=0;
                    }else{
                        System.out.println("存款成功");
                        money+=savemoney;
                        System.out.println("您的余额为:" +money);
                    }
                    break;
                case 2:
                    System.out.println("请输入你要取出的金额:");
                    float getmoney = input.nextFloat();
                    if(getmoney>1000){
                        System.out.println("单次取款金额不能大于1000元");
                        getmoney=0;
                    }else if(getmoney % 100 != 0){
                        System.out.println("不能取零钱");
                        getmoney=0;
                    }else if(getmoney < 0){
                        System.out.println("不能取负数的钱");
                        getmoney=0;
                    }else if (getmoney > money){
                        System.out.println("余额不足");
                        getmoney=0;
                    }else{
                        System.out.println("取款成功");
                        money-=getmoney;
                        System.out.println("您的余额为:"+money);
                    }
                    break;
                case 3:
                    System.out.println("退出成功");
                    break;
            }
        }else{
            System.out.println("您输入的密码或用户名错误");
        }
    }
}
