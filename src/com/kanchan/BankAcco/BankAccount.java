package com.kanchan.BankAcco;

import java.util.Scanner;

public class BankAccount {
      float Balance;
      int PIN = 3032;

        Scanner s = new Scanner(System.in);
      public void checkPin() {
          System.out.println("Enter the Pin: ");
          int enteredPin = s.nextInt();

          if (enteredPin == PIN) {
              menu();
          } else {
              System.out.println("Enter Valid pin!");
          }
      }
            private void menu(){
                System.out.println("Enter Your Choice: ");
                System.out.println("1. Check Your Account Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit ");
                
                int opt = s.nextInt();

                if(opt == 1){
                    checkBalance();
                } else if (opt == 2) {
                    withdrawMoney();

                } else if (opt == 3) {
                    depositMoney();

                } else if (opt == 4) {
                 return;

                }else {
                    System.out.println("Enter a valid choice!!");
                }
            }

            public void checkBalance(){
                System.out.println("Balance is: "+Balance);
                menu();
            }

            public void withdrawMoney(){
                System.out.println("Enter the amount you want to Withdraw: ");
                float amount = s.nextFloat();
                
                if(amount>Balance){
                    System.out.println("Inefficient Amount!!");
                }
                else {
                    Balance = Balance - amount;
                    System.out.println("Money Withdrawal Successfully !");
                }
                menu();

            }

            public void depositMoney(){
                System.out.println("Enter the money you want to deposit: ");
                float amount = s.nextFloat();
                Balance = Balance + amount;
                System.out.println("Money Deposited Successfully !");
            menu();
      }
}
