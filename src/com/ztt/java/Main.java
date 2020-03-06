package com.ztt.java;

import java.util.ArrayList;

public class Main {
//    模板六：prsf  可以生成private static final
//    private static final Customer cust = new Customer();

    //    变形：psf
    public static final int num=1;
    //    变形：psfi  出现 public static final int
    public static final int num2=1;
    //    变形：psfs  出现  public static final String
    public static final String s="abc";



    //    模板一：psvm
    public static void main(String[] args) {
//        模板二：sout
        System.out.println("hello");
//        变形：soutp / soutm / soutv / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("Main.main");

        int num=10;
        System.out.println("i = " + num);

//        模板三：fori
        String[] arr = new String[]{"Tom","Jerry","LiHua"};
        for (int i = 0; i <arr.length ; i++) {
//            arr[i].sout 回车
            System.out.println(arr[i]);
        }
//        变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
//        变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }


//        模板四：list.for
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {

        }

//        变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }

//        变形：list.forr  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

//        模板五：ifn
        if (list == null) {

        }
//        变形：inn
        if (list != null) {

        }

//        变形：xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }

//    修改一：psvm  改为  main
//    public static void main(String[] args) {
//
//    }

//    修改二： 在psfi中 加入 $VAR1$ = $VAR2$;
//    $END$
//    生成：public static final int  = ;


    //    生成的模板演示1
    public void testUpdate(){
//        修改的测试
    }

    //    生成的模板演示2
    /*
     *客户的id
     */
    private int id;

    /**
     * 客户的姓名
     */
    private String name;

}
