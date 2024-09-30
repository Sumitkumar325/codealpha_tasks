import java.util.Scanner;

class Destinations{
    Scanner s=new Scanner(System.in);

    public void NumberOfDestinations(){
        System.out.print("Enter Number Of Destinations You Want To Travel : ");
        int n=s.nextInt();
        s.nextLine();
        String[] DestinationNames=new String[n];
        for (int i=0;i<DestinationNames.length;i++){
            System.out.print("Enter "+(i+1)+" Number Destination : ");
            DestinationNames[i]=s.nextLine();
        }
        int[] year=new int[DestinationNames.length];
        int[] Month=new int[DestinationNames.length];
        int[] Date=new int[DestinationNames.length];
        for (int i=0;i<DestinationNames.length;i++){
            System.out.print("Enter Date Of "+DestinationNames[i]+" Travelling : ");
            Date[i]=s.nextInt();
            System.out.print("Enter Month Of "+DestinationNames[i]+" Travelling : ");
            Month[i]=s.nextInt();
            System.out.print("Enter Year Of "+DestinationNames[i]+" Travelling Date : ");
            year[i]=s.nextInt();
        }
        System.out.println("Here is the detailed travelling plan.");
        for (int i=0;i<DestinationNames.length;i++){
            System.out.println(DestinationNames[i]+" Travelling : "+Date[i]+"/"+Month[i]+"/"+year[i]);
        }
    }
}

public class TravelItineraryPlanner {
    public static void main(String[] args) {
         Destinations d=new Destinations();
         d.NumberOfDestinations();
    }
}