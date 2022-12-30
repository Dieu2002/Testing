package Baitaphcn;

import java.util.Scanner;

public abstract class Hinhchunhat implements HCNInterface {
    private int chieudai;
    private int chieurong;

    public Hinhchunhat(int cd, int cr) {
        this.chieudai = cd;
        this.chieurong = cr;
    }

    public int ChuviHCN() {
        return (chieudai + chieurong) / 2;
    }

    public int DientichHCN() {
        return chieudai * chieurong;
    }

    public int getChieuDai() {
        return chieudai;
    }

    public int getChieuRong() {
        return chieurong;
    }

    @Override
    public String toString() {
        return "\nChiều dài chữ nhật: {" + chieudai +
                ", chiều rộng=" + chieurong
                + ", Chu vi HCN =" + ChuviHCN() +
                 ", Diện tích của HNC =" + DientichHCN()
                + '}';

    }

}