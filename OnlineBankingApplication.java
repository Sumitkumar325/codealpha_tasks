import java.util.Scanner;
class ATM_{
    private double Balance=1000000;
    private float Pin=9999;
    Scanner sc=new Scanner(System.in);
    public void checkPin(){
        System.out.println("Hint: 9999");
        System.out.print("Enter your pin: ");
        int pin= sc.nextInt();
        if (pin==Pin)
        {
            menu();
        }
        else {
            System.out.println("Invalid pin! Please re-enter your pin.");
            checkPin();
        }
    }
    public void menu(){
        String[] arr={"1.Check your balance","2.Withdraw Money","3.Deposit Money","4.Want To Change Pin Number","5.EXIT"};
        for(String option : arr) {
            System.out.println(option);
        }
        System.out.print("Enter your choice:");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice){
            //choice 1
            case 1:
                System.out.println("Your current balance is "+Balance+"/-\n\n");
                menu();
                break;

            //choice 2
            case 2:
                WithDraw();
                break;

            //choice 3
            case 3:
                Deposit();
                break;

            //choice 4
            case 4:
                ChangePin();
                break;

            //choice 5
            case 5:
                return;

            //invalid choice
            default:
                System.out.println("Invalid choice!\n\n");
                System.out.println("Please re-enter your choice");
                menu();

        }
    }
    public void WithDraw(){
        System.out.print("Enter amount you want to withdraw: ");
        float WA=sc.nextFloat();
        if (WA>0 && WA <= Balance)
        {
            System.out.println("You have credited amount of "+WA);
            Balance-=WA;
            System.out.println("Now your current balance is "+Balance);
            System.out.println("\n");
            menu();
        }
        else
        {
            System.out.println("Please enter valid amount\n\n");
            menu();
        }
    }

    public void Deposit(){

        System.out.print("Enter amount you want to deposit: ");
        float DepositAmount=sc.nextFloat();
        Balance+=DepositAmount;
        System.out.println("Your amount is deposited successfully");
        System.out.println("Now your current balance is "+Balance);
        System.out.println("\n");
        menu();

    }

    public void ChangePin(){
        System.out.print("Enter your old pin: ");
        int OP=sc.nextInt();
        if (OP==Pin){
            System.out.print("Now,Enter your new pin: ");
            int NP=sc.nextInt();
            Pin=NP;
            System.out.println("You have changed your ATM Pin Successfully!");
            checkPin();
        }
        else {
            System.out.println("Wrong Pin entered!Please re-enter your old pin");
            ChangePin();
        }
    }
}
public class OnlineBankingApplication {
    public static void main(String[] args) {
        ATM_ obj=new ATM_();
        obj.checkPin();
    }
}
