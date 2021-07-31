package chutest.bean;

public class Customer {
    public  static  void main(String[] args){
        System.out.println("chu Hello World!");
        System.out.println("My name is Chu");
        String[] arr = new String[]{"Tom","jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);

        }
    }
}
