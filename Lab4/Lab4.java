import java.util.Scanner;
import java.sql.Timestamp;
import java.time.Instant;

class Lab4{
  static int acc_no = 22122124;
  static String acc_name = "Keegan Fernandes";
  static float balance = 0;
  public static String deposit(float amount) {
    balance += amount;
    String a = amount+ " has been deposited " + "current balance is "+ balance +" Time "; 
    return a;
  }
  public static String withdraw(float amount) {
    if(amount > balance){
      System.out.println("Not Enough Cash");
      return "";
    }
    balance -= amount;
    String a = amount+ " has been withdrawn " + "current balance is "+ balance +" Time "; 
    return a;
    
  }
  public static void transaction(String transaction) {
    System.out.println("The following transactions were made in the account:\n");
    System.out.println(transaction);
    
  }
  public static void summary() {
  System.out.printf("Account NO.:- %d %nAccount Name:- %s %nBalance:- %f%n",acc_no,acc_name,balance);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Name");
    acc_name = sc.next();
    System.out.println("Enter your account number");
    acc_no = Integer.parseInt(sc.next());
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    System.out.println("Enter your account balance");
    balance = Integer.parseInt(sc.next());
    int key = 1;
    String transaction = "";
    float amount= 0;
    int val;
    do {
    System.out.println("1.Deposit \n2.Withdraw \n3.Trancaction output \n4.Account Summary");
    val = sc.nextInt();
    switch (val) {
      case 1:
      System.out.println("Enter the amount to be deposited");
      amount = sc.nextFloat();
      transaction += deposit(amount);
      transaction += timestamp + "\n";

      break;
    
      case 2:
      System.out.println("Enter the amount to be Withdrawn");
      amount = sc.nextFloat();
      transaction += withdraw(amount);
      transaction += timestamp + "\n";
      break;
      
      case 3:
      transaction(transaction);
      break;
      
      case 4:
      summary();
      break;

      default:
      System.out.println("Incorrect Input");
      break;
     } 
    System.out.println("Do you want to continue (1/0)");
    key = sc.nextInt();
    } while (key != 0);
  }
}
