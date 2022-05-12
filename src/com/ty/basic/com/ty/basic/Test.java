package com.ty.basic.com.ty.basic;

public class Test {

    public static void main(String[] args) {
        //整型
//        int i=10;
//        int i2=010;
//        int i3=0x10;
//        System.out.println(i); //10
//        System.out.println(i2); //8
//        System.out.println(i3); //16
//
//        float f = 0.1f;
//        double d = 1.0/10;
//        System.out.println(f==d); //false
//
//        float d1 = 2131231231f;
//        float d2 = d1+1;
//        if(d1==d2){
//            System.out.println("d1==d2");
//        }else{
//            System.out.println("d1!=d2");
//        }

//        char c1='a';//定义一个char类型
//        int i1 = c1;//char自动类型转换为int
//        System.out.println("char自动类型转换为int后的值等于"+i1);
//        char c2 = 'A';//定义一个char类型
//        int i2 = c2+1;//char 类型和 int 类型计算
//        System.out.println("char类型和int计算后的值等于"+i2);

//        int money = 1000000000; //10亿
//        int years = 20;
//        int total = money*years; //返回的是负数
//        long total1 = money*years; //返回的仍然是负数。默认是int，因此结果会转成int值，再转成long。但是已经发生了数据丢失
//        long total2 = money*((long)years); //先将一个因子变成long，整个表达式发生提升。全部用long来计算。
//        System.out.println(total);
//        System.out.println(total1);
//        System.out.println(total2);

        int a=0b0101;
        System.out.println(a);
        int b=1_2234_5678;
        System.out.println(b);
    }
}
