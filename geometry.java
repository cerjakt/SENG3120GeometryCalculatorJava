import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class geometry
{
    private static cone cone;
    private static cylinder cylinder;
    private static sphere sphere;

    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);  //creating scanner object
        System.out.println("Welcome to the Java Geometry Program!");
        System.out.println("Select from these Options: ");
        System.out.println("1. Cone");
        System.out.println("2. Cylinder");
        System.out.println("3. Sphere");
        System.out.println("0. Exit\n");
        int input = scanner.nextInt();  //reading user input
        scanner.close();

        if (input == 1)
        {
            promptCone();
        }
        else if (input == 2)
        {
            promptCylinder();
        }
        else if (input == 3)
        {
            promptSphere();
        }   
        else if (input == 0)
        {
            System.out.println("\nTerminating Program...\n");
        } 
    }

    //Cone prompt
    /////////////
    private static void promptCone()
    {

    System.out.println("--------------------------------------------------------");
    System.out.println("PYTHON PROGRAM TO FIND VOLUME AND SURFACE AREA OF A CONE");
    System.out.println("--------------------------------------------------------");

    int radius = Integer.parseInt(inputOutput("Please enter the radius: "));
    int height = Integer.parseInt(inputOutput("Please enter the height: "));

    double volume = cone.volume(radius, height); //invokes volume method in cone class

    System.out.println("\nThe Volume of a Cylinder = " + volume); //prints out the volume

    menu(); //invokes menu again
    }

    //Cylinder prompt
    /////////////////
    private static void promptCylinder()
    {

    System.out.println("------------------------------------------------------------");
    System.out.println("PYTHON PROGRAM TO FIND VOLUME AND SURFACE AREA OF A CYLINDER");
    System.out.println("------------------------------------------------------------");

    Scanner scanner = new Scanner(System.in);  //creating scanner object
    System.out.println("Please enter the radius: ");
    int radius = scanner.nextInt();  //reading user input

    Scanner scanner2 = new Scanner(System.in);  //creating scanner object
    System.out.println("Please enter the height: ");
    int height = scanner2.nextInt();  //reading user input

    double volume = cylinder.volume(radius, height); //invokes volume method in cylinder class

    scanner.close(); //closes the scanner
    scanner2.close(); //closes the scanner

    System.out.println("\nThe Volume of a Cylinder = " + volume); //prints out the volume

    menu(); //invokes menu again
    }

    //Sphere prompt
    ///////////////
    private static void promptSphere()
    {

    System.out.println("----------------------------------------------------------");
    System.out.println("PYTHON PROGRAM TO FIND VOLUME AND SURFACE AREA OF A SPHERE");
    System.out.println("----------------------------------------------------------");

    Scanner scanner = new Scanner(System.in);  //creating scanner object
    System.out.println("Please enter the radius: ");
    int radius = scanner.nextInt();  //reading user input

    double volume = sphere.volume(radius); //invokes volume method in sphere class

    scanner.close(); //closes the scanner

    System.out.println("\nThe Volume of a Sphere = " + volume); //prints out the volume

    menu(); //invokes menu again
    }

    //method for reading user input
    private static String inputOutput(String message) 
    {
        System.out.println(message);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String returnString = "";
        try 
        {
            returnString = br.readLine();
        }
        catch (IOException e){
            System.out.println("Error reading in value");
            menu();
        }
        return returnString;
    }

    public static void main(String[] args) 
    {
        cone = new cone();
        cylinder = new cylinder();
        sphere = new sphere();
        menu();
    }

}


