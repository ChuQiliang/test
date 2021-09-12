package chutest.java;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ChuQiliang
 * @date 2021/7/24-22:51
 */
public class Hello {
    public  static  void main(String[] args){
        System.out.println("Hello, ChuQiliang!");
        SimpleDateFormat currentdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(currentdate.format(new Date()));
        System.out.println("加油！");
    }
}
