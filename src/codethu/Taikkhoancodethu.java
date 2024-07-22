package codethu;

public class Taikkhoancodethu {
    public static void main(String[] args) {
        Taikhoannganhang taiKhoannCodeThu = new Taikhoannganhang();
        taiKhoannCodeThu.napTien(0);
        taiKhoannCodeThu.rutTien(2000);
        System.out.println("Số dư: " + taiKhoannCodeThu.getsoDu());   
    }
    
}