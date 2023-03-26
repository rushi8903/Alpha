package Alpha;
import java.util.*;

public class BinaryToDecimal {
    public static void binaryToDecimal(int num){
        int power =0;
        int DecimalNum=0;
        int binary = num;
        boolean check=true;
        while(num>0){
            if(num%10!=0 && num%10!= 1){
                System.out.println("BSDK binary me "+num%10+" kaha se aya...!");
                check=false;
                break;
            }else if(num%10==1){
                DecimalNum=DecimalNum+((int)Math.pow(2,power));
            }
            power++;
            num = num/10;
        }
        if(check){
        System.out.println("Decimal value of "+ binary +" is = "+DecimalNum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary number :");
        int binaryNum = sc.nextInt();
        binaryToDecimal(binaryNum);
        sc.close();


    }
    
}
