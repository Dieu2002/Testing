package Baitaphcn;

import java.util.Scanner;

public class HCNtest {
    public static void main(String[] args) {

        System.out.print("Nhap so luong hinh chu nhat: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chieudai = 0,chieurong = 0;
        Hinhchunhat[] HCNArr = new Hinhchunhat[n];
        for(int i=0; i<n; i++){
            System.out.println("Hình chữ nhật thứ  "+(i + 1)+":");
            System.out.print("Nhập chiều dài: ");
            chieudai = sc.nextInt();
            System.out.print("Nhập chiều rộng: ");
            chieurong = sc.nextInt();
            HCNArr[i] = new Hinhchunhat(chieudai, chieurong) {
                @Override
                public void setDaiRong(int cd, int cr) {

                }
            };
        }
        for(int i = 0; i < n; i++){
            System.out.println("HCN thứ: "+(i + 1) + " " + HCNArr[i]);
        }
        int max = HCNArr[1].DientichHCN();
        for (int x = 0; x<n;x++){
            if(HCNArr[x].DientichHCN()>max){
                max=HCNArr[x].DientichHCN();
            }
            System.out.print("Diện tích HCN lớn nhất là: "+ max);
        }
    }
}

