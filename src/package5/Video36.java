package package5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Video36 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> arrNumber = new ArrayList<Double>();

        while (true) {
            System.out.println("Nhập vào một số thực bất kỳ");
            double input = scanner.nextDouble();
            arrNumber.add(input);
            scanner.nextLine();//enter
            System.out.println("Countine? Y/N");
            String option = scanner.nextLine();
            if (option.equals("N")|| option.equals("n")){
                break;
            }



        }
        System.out.println("Check" + arrNumber);

        double sum = 0;
        for (int i = 0; i < arrNumber.size(); i++){
            sum += arrNumber.get(i);
        
        }
        System.out.println("Sum= " +sum );

    } 
}
