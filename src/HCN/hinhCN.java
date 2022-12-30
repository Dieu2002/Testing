package HCN;

import java.util.Scanner;

public class hinhCN implements HCNinterface{
    int chieudai, chieurong;
    public int ChuviHCN()
    {
        return (chieudai + chieurong) /2;
    }
    public int DientichHCN()
    {
        return chieudai*chieurong;
    }
    public int getChieuDai( )
    {
        return chieudai;
    }

    public int getChieuRong()
    {
        return chieurong;
    }
    public void setDaiRong(int cd, int cr)
    {
        this.chieudai=cd;
        this.chieurong=cr;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int cd = sc.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int cr = sc.nextInt();
    }
    public void show(){
        System.out.println("Chiều dài: "+ getChieuDai()+
                ", " +"Chiều rộng: "+ getChieuRong()+
                "\n" + "Chu vi HCN" + ChuviHCN() +
                "\n "+ "Diện tích: " + DientichHCN());
    }
}
