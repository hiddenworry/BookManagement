import java.util.Scanner;

public class samurai {

    public static void main(String[] args) {
        inputAProfile ();
    }
    public static void inputAProfile(){
        String name, address;
        int yob;
        Scanner sc = new Scanner (System.in);
        System.out.print ("Input name:  " );
        name = sc.nextLine ().toUpperCase ();

        try {
            System.out.print ("Input yob:  " );
            yob = Integer.parseInt (sc.nextLine ());
        } catch (Exception e) {


        }


        System.out.print ("Input address:  " );
        address = sc.nextLine ().toUpperCase ();

        System.out.println ("Here is your profile:  ");
        System.out.println ("Your name: " + name  );
        System.out.println ("Your address: " + address  );
        System.out.println ("Your name: " + yob  );


    }



}
