package Main;

import java.util.Scanner;

public class CDCS {
    public static void main(String[] args) {
        int n,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số: ");
        n=sc.nextInt();
        System.out.println("Mời bạn nhập cơ số cần chuyển sang: ");
        b=sc.nextInt();
        System.out.println("So " +n+ " chuyen sang co so " +b+ " thanh: ");
        doicoso(n,b);
    }
    public static void doicoso(int so, int coso){
        if(so>=coso)doicoso(so / coso, coso);
        if(so % coso >= 9)System.out.printf("%c",so%coso+55);
        else
            System.out.print((so % coso));
    }
//    public static int nhap(){
//        Scanner input = new Scanner(System.in);
//        boolean check= false;
//        int n=0;
//        while (!check){
//            System.out.println(" ");
//            try{
//                n= input.nextInt();
//                check= true;
//            }catch(Exception e){
//                System.out.println("Ban phai nhap so! hay nhap lai...");
//                input.nextLine();
//            }
//        }
//        return(n);
//    }
}
