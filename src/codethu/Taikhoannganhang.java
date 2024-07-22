package codethu;



public class Taikhoannganhang {
    private double soDu;
   
    public void napTien(double soTien){
        if (soTien<1000) {
        System.out.println("Số tiền nạp phải lớn hơn 0");
        
        }
        else{
        soDu = soDu+soTien;}
    

    }
    public void rutTien(double soTien){
        if (soTien<1000) {
            System.out.println("Số tiền rút phải lớn hơn 0");
            
            }
            else{
        soDu = soDu - soTien;}
    }
    public double getsoDu(){
        
        return soDu;
    }

}



    

