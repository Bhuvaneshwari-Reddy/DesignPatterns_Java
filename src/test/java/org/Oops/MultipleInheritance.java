package org.Oops;

    interface  AccountService{
        void deposit(double amount);
        void withdraw(double amount);
    }

    interface  LoanService{
        void applyLoan(double amount);
    }

    interface Bank extends AccountService,LoanService{
        void checkBalance();
    }
    class BankAccount implements Bank{
        private double balance=0;

        public  void deposit(double amount){
            balance += amount;
            System.out.println("Deposited amount:"+ amount);
        }
        public  void withdraw(double amount){
            if(amount<=balance){
                balance -= amount;
                System.out.println("Withdraw amount:"+amount);
            }
            else {
                System.out.println("Insufficient fund ");
            }
        }
        public  void applyLoan(double amount){
            System.out.println("Loan applied for :"+amount);
        }

        public void checkBalance(){
            System.out.println("Current balance:"+balance);
        }
    }


public class MultipleInheritance {

    public static void main(String[] args){
        BankAccount bank=new BankAccount();
        bank.deposit(50000);
        bank.withdraw(20000);
        bank.applyLoan(100000);
        bank.checkBalance();
    }
}
