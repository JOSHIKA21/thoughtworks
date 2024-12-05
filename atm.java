import java.util.ArrayList;
import java.util.Scanner;
public class atm {
    private int bamt;
    Scanner sc=new Scanner(System.in);
    ArrayList<String> ls=new ArrayList<>();
    void operation(){
        System.out.println("What operation you like to do? ");
        String c;
        do { 
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Balance Inquiry");
            System.out.println("4. Mini Statement");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    balanceInquiry();
                    break;
                case 4:
                    miniStatement();
                    break;
                default:
                    System.out.println("Please choose correct operation to perform");
            }
            System.err.println("Do you want to continue the operation? Y/N");
            c=sc.next();
        } while (c.equals("Y")||c.equals("y"));
    }
    void deposit(){
        System.out.print("Enter amount to be deposited: ");
        int damt=sc.nextInt();
        bamt+=damt;
        ls.add("Deposit: "+damt);
        System.out.println("Transaction successful. New balance: "+bamt+" Rs.");
    }
    void withdraw(){
        System.out.println("Enter amount to be withdraw" );
        int wamt=sc.nextInt();
        if(bamt>=wamt){
            bamt-=wamt;
            ls.add("Withdraw: "+wamt);
            System.out.println("Transaction successful. New balance: "+bamt+" Rs.");
        }
        else{
            System.out.println("Insufficient balance");
        }
        
    }
    void balanceInquiry(){
        System.out.println("Your Current balance is : "+bamt);
    }
    void miniStatement(){
        int size=ls.size();
        if(size>5){
            for(int i=size;i>size-5;i--){
                System.out.println(ls.get(i));
            }
        }
        else{
            for(String s:ls){
                System.out.println(s);
            }
        }
    }

}
