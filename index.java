import java.util.Scanner;
class Bene{
    public static void main(String args[]) {
        Scanner vodafone = new Scanner(System.in);
        Scanner mtn = new Scanner(System.in);
        Scanner startingValue = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Hello Welcome To Our Airtime Purchase Services");
        System.out.println("-------------------------------------------------");
        System.out.println("\n");
        System.out.println("Choose Among The Network Below To Get Started.");
        System.out.println("-------------------------------------------------");
        System.out.println("\n");
        System.out.println("Type 1: for vodafone");
        System.out.println("Type 2: for MTN");

        System.out.println(startingValue.nextLine());
        String value = startingValue.nextLine();
        
        if (20>10) 
            System.out.println("You are now activated to use vodafone services, Click To Continue");
        else if(30>5)
            System.out.println("You are now activated to use MTN services, Click To Continue");
        


    }
}