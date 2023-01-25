import java.util.Scanner;

public class information {
    /***
     * Write a Java Program that will collect your basic details 
     * that fall into different data types and displays them.
     * After the details have been displayed, with the help of 
     * conditional statements, check if the gender of 
     * the user is 'm' or 'f'. It should print "MALE" 
     * for 'm' and "FEMALE" for 'f'.
     * * Assume that you can divide the states among India 
     * into four different regions (North, South, East, and West).
     * If you are from the southern part of India; with the help
     *  of a switch statement, it should display 
     * "The Student is from the southern states of India", 
     * along with the basic details.
     */
    public static void main(String[] args) {

        /*
         *Entering All the information 
         */
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your name%n");
        String name = sc.nextLine();
        System.out.printf("Enter your age%n");
        int age = Integer.parseInt(sc.next());
        System.out.printf("Enter your class%n");
        String clas = sc.next();
        System.out.printf("Enter your gender%n");
        String gender = sc.next(); 
        System.out.printf("Enter your state%n");
        String state = sc.nextLine();

        /*
         *Printing All the information 
         */
        System.out.printf("the student %s of class %s is %s years old ",name,clas,age);

        /*
         *Outputting the gender
         */
        if(gender.equals("f")){
            System.out.printf("is female and ");
        }
        else if(gender.equals("m")){
            System.out.printf("is male and ");
        }
        else {
            System.out.printf("has an Unidentified Gender ");
        }
        /*
         *outputting the state information   
         */
        switch(state)
        {
            case "goa":
            {   
                System.out.printf("%n.from the south%n");
                break;
            }
            case "delhi":
            {   
                System.out.printf("%n.Is from the north%n");
                break;
            }
            case "maharastra":
            {   
                System.out.printf("%n.Is from the west%n");
                break;
            }
            case "karnataka":
            {   
                System.out.printf("%n.Is from the south%n");
                break;
            }
            case "tamil nadu":
            {   
                System.out.printf("%n.Is from the south%n");
                break;
            }
            case "west bengal":
            {   
                System.out.printf("%n.Is from the %n");
                break;
            }
            case "kerala":
            {   
                System.out.printf("%n.Is from the south%n");
                break;
            }
            case "bihar":
            {   
                System.out.printf("%n.Is from the north%n");
                break;
            }
            case "haryana":
            {   
                System.out.printf("%n.Is from the north%n");
                break;
            }
            case "andhra pradesh":
            {   
                System.out.printf("%n.Is from the south%n");
                break;
            }
            case "assam":
            {   
                System.out.printf("%n.Is from the east%n");
                break;
            }
            case "chhattisgarh":
            {   
                System.out.printf("%n.Is from the east%n");
                break;
            }
            case "himachal pradesh":
            {   
                System.out.printf("%n.Is from the north%n");
                break;
            }
            case "jharkhand":
            {   
                System.out.printf("%n.Is from the east%n");
                break;
            }
            case "madhya pradesh":
            {   
                System.out.printf("%n.Is from the north%n");
                break;
            }
            case "manipur":
            {   
                System.out.printf("%n.Is from the east%n");
                break;
            }
            case "meghalaya":
            {   
                System.out.printf("%n.Is from the east%n");
                break;
            }
            case "mizoram":
            {   
                System.out.printf("%n.Is from the east%n");
                break;
            }
            case "nagaland":
            {   
                System.out.printf("%n.Is from the east%n");
                break;
            }
            case "odisha":
            {   
                System.out.printf("%n.Is from the east%n");
                break;
            }
            case "punjab":
            {   
                System.out.printf("%n.Is from the east%n");
                break;
            }
            case "uttar pradesh":
            {   
                System.out.printf("%n.Is from the north%n");
                break;
            }
            case "telangana":
            {   
                System.out.printf("%n.Is from the south%n");
                break;
            }
            case "rajasthan":
            {   
                System.out.printf("%n.Is from the west%n");
                break;
            }
            
            default: 
            {
                System.out.printf("has an Unidentified State");
                break;
            }
        }
        sc.close();
    }
}
