import java.util.Scanner;
public class ATM {
  public static void main(String[]args){
    int balance = 100000, withdraw, deposit;
    int pin = 1221;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your pin ");
    int p = sc.nextInt();
    if (p != pin){
      System.out.println("invalid pin");
    }
    while(p == pin){
      System.out.println("ATM");
      System.out.println("Choose option");
      System.out.println("Choose 1: Withdraw");
      System.out.println("Choose 2: Deposit");
      System.out.println("Choose 3: Check Balance");
      System.out.println("Choose 4: EXIT");
      int choice = sc.nextInt();
      switch(choice){
        case 1:
        System.out.println("Enter money for withdraw:");
        withdraw = sc.nextInt();
        if (balance >= withdraw){
            balance = balance - withdraw;
            System.out.println("Collect your money");
        }
        else{
            System.out.println("Insufficient balance");
        }
        System.out.println("");
        break;
        case 2:
        System.out.println("Enter money to be deposited");
        deposit = sc.nextInt();
        balance =  balance+deposit;
        System.out.println("Your money succesfully deposited");
        break;
        case 3:
        System.out.println("Balance = ]"+balance);
        case 4:
        System.exit(0);
      }
    }
}  
}

