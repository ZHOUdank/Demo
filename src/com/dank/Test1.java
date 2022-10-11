package com.dank;

/**
 * @ClassName: test1
 * @author: zyk
 * @createTime 2022年10月12日 00:13:00
 * @Description:
 */
public class Test1 {
    public static void main(String[] args) {
        String s = "zyk";
        String b = str(s);
        System.out.println(str(s));
        System.out.println("asd:"+b);

    }


    /**
     * @title: str
     * @author: zyk
     * @updateTime: 2022/10/12 0:24
     * @description:
    */
    public static String str(String a){
        String b = "222"+"333"+a;
        return b;
    }
    /**
     * @title: sss
     * @author: zyk
     * @updateTime: 2022/10/12 0:23
     * @description:
     */
    public static String sss(String b){
        String c = "22";
        return b;
    }
}
