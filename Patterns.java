package Alpha;

import java.util.Scanner;

public class Patterns {
    static void hollowRectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int row = sc.nextInt();
        System.out.println("Enter the number of coloums :");
        int column = sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(i==1 || j==1 || i==row || j==column){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    static void leftHalfPyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of a pyramid :");
        int height = sc.nextInt();

        for(int i=1;i<=height;i++){
            for(int j=1;j<=height;j++){
                if(i+j>=height+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    static void rightHalfPyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of a pyramid :");
        int height = sc.nextInt();

        for(int i=1;i<=height;i++){
            for(int j=1;j<=height;j++){
                if(i>=j){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    static void invertedLeftHalfPyramidWithNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of a pyramid :");
        int height = sc.nextInt();

        for(int i=1;i<=height;i++){
            for(int j=1;j<=height;j++){
                if(i+j<=height+1){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    static void invertedRightHalfPyramidWithNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of a pyramid :");
        int height = sc.nextInt();

        for(int i=1;i<=height;i++){
            for(int j=1;j<=height;j++){
                if(i<=j){
                    System.out.print(j+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    static void floydsPyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of a pyramid :");
        int height = sc.nextInt();
        int a=1;

        for(int i=1;i<=height;i++){
            for(int j=1;j<=height;j++){
                if(i>=j){
                    System.out.print(a+" ");
                    a++;
                }
            }
            System.out.println();
        }
        sc.close();
    }

    static void zeroOneTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of a pyramid :");
        int height = sc.nextInt();

        for(int i=1;i<=height;i++){
            for(int j=1;j<=height;j++){
                if(i>=j){
                    System.out.print((i+j+1)%2+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
    static void butterfly(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of butterfly :");
        int height = sc.nextInt();

        for(int i=1;i<=2*height;i++){
            for(int j=1;j<=2*height;j++){
                if(i<=height && j<=height){
                    if(i>=j){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }else if(i<=height && j>height){
                    if(i+j>=2*height+1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }else if(i>height && j<=height){
                    if(i+j<=2*height+1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    if(i<=j){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }

    static void solidRhombus(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of a Rhombus :");
        int height = sc.nextInt();

        for(int i=1;i<=height;i++){
            for(int j=1;j<2*height;j++){
                if(i+j<=height){
                    System.out.print("  ");
                }else if(i+j>2*height){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    static void hollowRhombus(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of a Rhombus :");
        int height = sc.nextInt();
        int n= height-1;

        for(int i=1;i<=height;i++){
            for(int j=1;j<=n;j++){
                System.out.print("  ");
            }
            n--;
            System.out.print("* ");
            for(int j=1;j<=height-2;j++){
                if(i==1 || i==height){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("* ");
            System.out.println();
        }       
        sc.close();
    }

    static void diamand(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of a pyramid :");
        int height = sc.nextInt();
        int n=height;

        for(int i=1;i<=height;i++){
            for(int j=1;j<=n-1;j++){
                System.out.print("  ");
            }
            n--;
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println(); 
        }
        height--;
        n=height;
        for(int i=1;i<=height;i++){
            System.out.print("  ");
            for(int j=0;j<i;j++){
                if(j!=0){
                System.out.print("  ");
                }
            }
            for(int j=1;j<=2*n-1;j++){
                System.out.print("* ");
            }
            n--;
            System.out.println(); 
        }

        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Types of patterns :\n\t1. Hollow rectangle\n\t2. Left half-pyramid\n\t3. Right half-pyramid\n\t4. Inverted left half-pyramid with numbers\n\t5. Inverted right half-pyramid with numbers\n\t6. FLOYD'S pyramid\n\t7. Zero one triangle\n\t8. Butterfly\n\t9. Solid Rhombus\n\t10. Hollow Rhombus\n\t11. Diamand");
        System.out.println("Enter the choice :");
        int choice = sc.nextInt();
        switch(choice){
            case 1 :
                hollowRectangle();
                break;
            case 2:
                leftHalfPyramid();
                break;
            case 3:
                rightHalfPyramid();
                break;
            case 4:
                invertedLeftHalfPyramidWithNumbers();
                break;
            case 5:
                invertedRightHalfPyramidWithNumbers();
                break;
            case 6:
                floydsPyramid();
                break;
            case 7:
                zeroOneTriangle();
                break;
            case 8:
                butterfly();
                break;
            case 9:
                solidRhombus();
                break;
            case 10:
                hollowRhombus();
                break;
            case 11:
                diamand();
                break;
            default:
                System.out.println("Enter valid choice.");
        }
        sc.close();
    }
}
