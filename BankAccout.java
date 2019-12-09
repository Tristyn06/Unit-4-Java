
public class BankAccount {
 private String account;
 private double balance;
 private String balanceString;
 private String currency;
 private DecimalFormat money = new DecimalFormat("0.00");
 private double yearlyInt = .02;



 public BankAccount(String name, String type, double intDeposit){
   account = name;
   currency = type;
   balanceString = balance + "";
   balanceString = money.format(intDeposit);
   System.out.println(account + " account was created with and initial deposit of " + balanceString + " " + currency + " dollars.");
 }



 public void deposit(double amount) {
   balance = balance + amount;
   balanceString = money.format(balance);
   System.out.println(amount + " " + currency + " dollars was deposited to " + account + " account.\nNew balance is " + balanceString + " " + currency + " dollars.");
 }



 public void withdrawl(double amount) {
   if ((balance - amount) >= 0) {
     balance = balance - amount;
     balanceString = money.format(balance);
     System.out.println(amount + " " + currency + " dollars was withdrawn from " + account + " account.\nNew balance is " + balanceString + " " + currency + " dollars.");
   }
   else {
     System.out.println("Error: Insufficient funds.\nPlease withdrawl a smaller amount.");
   }
 }



 public void fiscalYear() {
   balance = balance + (balance * yearlyInt);
   balanceString = money.format(balance);
   System.out.println("Your balance increased by 2%!\nYour new balance is: " + balanceString + " " + currency + " dollars.");
 }



}
