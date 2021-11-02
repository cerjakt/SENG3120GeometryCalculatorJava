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

        //invoking prompts or terminating the program based on the user input
        if (input == 1)
        {
            promptCone();
            scanner.close();
        }
        else if (input == 2)
        {
            promptCylinder();
            scanner.close();
        }
        else if (input == 3)
        {
            promptSphere();
            scanner.close();
        }   
        else if (input == 0)
        {
            System.out.println("\nTerminating Program...\n");
            scanner.close();
        } 
    }

    //Cone prompt
    /////////////
    private static void promptCone()
    {

    System.out.println("--------------------------------------------------------");
    System.out.println("PYTHON PROGRAM TO FIND VOLUME AND SURFACE AREA OF A CONE");
    System.out.println("--------------------------------------------------------");

    Scanner scanner = new Scanner(System.in);  //creating scanner object

    System.out.println("Please enter the radius: ");
    int radius = scanner.nextInt();  //reading user input

    System.out.println("Please enter the height: ");
    int height = scanner.nextInt();  //reading user input

    float slant = cone.slant(radius, height); //invokes slant method in cone class
    float surfaceArea = cone.surfaceArea(radius, height); //invokes surfaceArea method in cone class
    float volume = cone.volume(radius, height); //invokes volume method in cone class
    float latSurfaceArea = cone.lateralSurfaceArea(radius, height); //invokes latSurfaceArea method in cone class

    System.out.println("\nLength of a Side (Slant) of a Cone = " + slant); //prints slant
    System.out.println("The Surface Area of a Cone = " + surfaceArea); //prints surface area
    System.out.println("The Volume of a Cone = " + volume); //prints out the volume
    System.out.println("The Lateral Surface Area of a Cone = " + latSurfaceArea); //prints lateral surface area
    System.out.println("--------------------------------------------------------");
    System.out.println("\n");
    
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

    System.out.println("Please enter the height: ");
    int height = scanner.nextInt();  //reading user input

    float surfaceArea = cylinder.surfaceArea(radius, height); //invokes surfaceArea method in cylinder class
    float volume = cylinder.volume(radius, height); //invokes volume method in cylinder class
    float lateralSurfaceArea = cylinder.lateralSurfaceArea(radius, height); //invokes lateralSurfaceArea method in cylinder class
    float topBottomArea = cylinder.topBottomArea(radius); //invokes topBottomArea method in cylinder class

    System.out.println("\nThe Surface Area of a Cylinder = " + surfaceArea); //prints out the surface area
    System.out.println("The Volume of a Cylinder = " + volume); //prints out the volume
    System.out.println("Lateral Surface Area of a Cylinder = " + lateralSurfaceArea); //prints out the lateral surface area
    System.out.println("Top or Bottom Surface Area of a Cylinder = " + topBottomArea); //prints out the top bottom surface area
    System.out.println("------------------------------------------------------------");
    System.out.println("\n");

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

    float surfaceArea = sphere.surfaceArea(radius); //invokes surfaceArea method in sphere class
    float volume = sphere.volume(radius); //invokes volume method in sphere class

    System.out.println("\nThe Surface Area of a Sphere = " + surfaceArea); //prints out the surface area
    System.out.println("The Volume of a Sphere = " + volume); //prints out the volume
    System.out.println("----------------------------------------------------------");
    System.out.println("\n"); //new line

    menu(); //invokes menu again
    }

    public static void main(String[] args) //instantiating new shapes
    {
        cone = new cone();
        cylinder = new cylinder();
        sphere = new sphere();
        menu();
    }
}


