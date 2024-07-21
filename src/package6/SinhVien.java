package package6;

public class SinhVien {
    protected String id;
    protected String name;
    protected double price;
    protected double tax;

    public double getPrice(){
        return this.price*this.tax;
    
    }
}
