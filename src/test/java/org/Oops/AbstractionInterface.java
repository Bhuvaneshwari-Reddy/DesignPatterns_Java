package org.Oops;


    interface BankAccount1{
        void deposit(double amount);
        void withdraw(double amount);
        double getBalance();
    }

    class SavingsAccount implements  BankAccount1{
        private double balance;
        public  SavingsAccount(double initialBalance){
            this.balance=initialBalance;
        }

        @Override
        public void deposit(double amount) {
            balance +=amount;
            System.out.println("Deposited amount : "+amount);
        }
        @Override
        public  void withdraw(double amount){
            if(amount<=balance){
                balance-=amount;
                System.out.println("Withdraw amount :"+amount);
            }else {
                System.out.println("Insufficient funds");
            }
        }
        @Override
        public  double  getBalance(){
            return  balance;
        }
    }


    class CurrentAccount implements  BankAccount1{
        private double balance;
        public  CurrentAccount (double initialBalance){
            this.balance=initialBalance;
        }

        @Override
        public void deposit(double amount) {
            balance +=amount;
            System.out.println("Deposited amount : "+amount);
        }
        @Override
        public  void withdraw(double amount){
            if(amount<=balance){
                balance-=amount;
                System.out.println("Withdraw amount :"+amount);
            }else {
                System.out.println("Insufficient funds");
            }
        }
        @Override
        public  double  getBalance(){
            return  balance;
        }
    }



public class AbstractionInterface {

    public static void main(String[] args){
        BankAccount1 savings=new SavingsAccount(5000);
        BankAccount1 current=new CurrentAccount(2000);
        savings.deposit(200);
        savings.withdraw(2000);
        System.out.println(savings.getBalance());


        current.deposit(500);
        current.withdraw(300);
        System.out.println(current.getBalance());
    }
}
