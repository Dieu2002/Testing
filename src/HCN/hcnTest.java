package HCN;

import java.util.Scanner;

public class hcnTest extends hinhCN {
    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số lượng hình chữ nhật: ");
        int n = scan.nextInt();
        hinhCN [] hcn = new hinhCN[n];
        for (int i =1; i<n; i++){
            System.out.println("Nhập thông tin HCN thứ  "+i);
            System.out.print("Nhap chieu dai:");
            int cd= scan.nextInt();
            System.out.print("Nhap chieu rong:");
            int cr= scan.nextInt();
            hcn[i]=new hinhCN();
//            hcn[i]=nhap(cd,cr);
//            hcn[i]=DientichHCN();

        }
        for(int i =0; i<n; i++){
            System.out.println("Hình chữ nhật "+ (i+1)+" : ");
            hcn[i].show();
        }
        for(int i =0; i<n;i++){
            int max = hcn[i].DientichHCN();
            for(int j = i+1;j<n; j++){
                if(max < hcn[j].DientichHCN()){
                    max = hcn[j].DientichHCN();
                }
                System.out.println("Diện tích max = "+max);
            }
        }
    }

//    private static void nhap(int cd, int cr) {
//
//
//    }
}
