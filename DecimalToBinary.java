package Alpha;
import java.util.*;

public class DecimalToBinary {

    public static void decimalToBinary(int num){
        int power =0;
        int BinaryNum=0;
        int Decimal = num;
        while(num>0){
            if(num%2==1){
                BinaryNum=BinaryNum+((int)Math.pow(10,power));
            }
            power++;
            num = num/2;
        }
        
        System.out.println("Binary value of "+ Decimal +" is = "+BinaryNum);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number :");
        int DecimalNum = sc.nextInt();
        decimalToBinary(DecimalNum);
        sc.close();


    }
}