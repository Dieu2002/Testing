package Main;

import java.util.Scanner;

public class matran {
    public static void main(String[] args) {
        int n,m;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so hang:");
        n= sc.nextInt();
        System.out.print("Nhap so cot:");
        m=sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Nhap vao ma tran "+n+"*"+m);
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j]=sc.nextInt();
                if(n<0 || n>100) {
                    System.out.println("Ban da nhap so ngoai pham vi(0-100):");
                    System.exit(0);
                }
            }
        }
        // phan tu lon nhat
        int max=-1;
        int index1=0, index2=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(arr[i][j]>max) {
                    max = arr[i][j];
                    index1= i+1;
                    index2=j+1;
                }
            }
        }
        System.out.println("GTLN cua mang: "+"arr"+"["+index1+"]["+index2+"] ="+max);
        //so nguyen to cua ma tran
        System.out.print("So nguyen to cua ma tran la: ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(soNguyenTo(arr[i][j])){
                    System.out.print(arr[i][j]+" ");
                }

            }
        }
        // cot co nhiue snt nhat
        int count =0,cot=0 ;
        int maxx=0;
        for(int i=0;i<m;i++) {
            for(int j =0;j<n;j++) {
                if(soNguyenTo(arr[j][i])) {
                    count++;
                }
            }
            if(count>maxx) {
                max = count;
                cot = i;
            }
            count =0;
        }
        System.out.println();
        System.out.println("Cot co nhieu so nguyen to nhat: "+cot);

    }
    public static boolean soNguyenTo(int n) {
        if(n==1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

}
