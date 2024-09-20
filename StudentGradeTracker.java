import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0,c=0,d=100;
        System.out.println("Task No: 1 Student Grade Tracker Of Java Internship By CodeAlpha");
        System.out.print("Enter Number Of Students In Class : ");
        int s = scanner.nextInt();
        int[] array = new int[s];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Roll No: " + (i + 1) + " Student Grade : ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i=0;i< array.length;i++){
            a=a+array[i];
            if (c<array[i]){
                c=array[i];
            }
            if (d>array[i]){
                d=array[i];
            }
        }
        int b=a/s;
        System.out.println("Average is : "+b);
        System.out.println("Highest Grade is : "+c);
        System.out.println("Lowest Grade is : "+d);
    }
}