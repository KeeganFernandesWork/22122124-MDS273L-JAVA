import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class lab5 {
  public static void main(String[] args) {
    //we initialize the object array.
    student[] a = new student[100];
    for(int i =0; i< a.length;i++){
      a[i] = new student();
    }
    Scanner sce = new Scanner(System.in);
    int key = 0;
    // we then begin the loop for the menu.
    do {
      System.out.println("==========================");
      System.out.println("Enter 1 to add a student\nEnter 2 to display a students details \nEnter 3 to Search for a Student");
      System.out.println("==========================");
int value = sce.nextInt();
    switch (value) {
      case 1:
        for(int i= 0; i<a.length ; i++){
          if(a[i].truth()){
            a[i].add_details();
            break;
          }
          else{
            continue;
          }
        }
        break;

      case 2:
        for(int i = 0;i<a.length; i++){
          if(a[i].truth()){
            break;
          }
          a[i].display();
        }
        break;
    
      case 3:
        String[] k = a[0].Tostring();
        for(int i = 0;i<a.length; i++){
          if(a[i].truth()){
            break;
          }
          if(a[i].reg_no.equals(k[1]) && a[i].name.equals(k[0])){
            System.out.println("student Found");
            a[i].display();
          }
        }
        break;
      default:
        break;
    }
    System.out.println("Do you want to continue 1/0?");
    key = sce.nextInt();
    } while (key != 0);
  } 
}
public class student {
  // The variables that we will use are initialized here
  Scanner sc = new Scanner(System.in);
    String reg_no;
    String name;
    String phone_no;
    String clas;
    String department;
  public student(){
    //we then give the values the respective default datatypes
    reg_no = null;
    name = null;
    phone_no = null;
    clas = null;
    department = null;
  }
  public void add_details(){
    //This function allows us to aquire the details of each student
    System.out.println("Enter the registeration number of the Student ");
    reg_no = sc.nextLine();
    
    System.out.println("Enter the name of the Student ");
    name = sc.nextLine();

    System.out.println("Enter the phone number of the Student ");
    phone_no = sc.nextLine();

    System.out.println("Enter the class of the Student ");
    clas = sc.nextLine();

    System.out.println("Enter the department of the Student ");
    department = sc.nextLine();
    
    try{
      // THis block saves the details as a text file
    File file = new File(name+".txt");
    FileWriter wr = new FileWriter(file, true);

    wr.write("name: "+name);
    wr.write("Reg no.: "+reg_no);
    wr.write("phone no.: "+phone_no);
    wr.write("class: "+clas);
    wr.write("department: "+department);
    wr.close();
    }
    catch(Exception e){
      System.out.println("error");
    }
  }
  boolean truth(){
    // This functions returns the boolean value on weather the name and registeration number is null i.e it is a empty object.
    if(name == null && reg_no == null){
      return true;
    }
    else{
      return false;
    }
  }
  void display(){
    // this function displays the details of the respective object.
    System.out.println("The registeration number of the Student is " + reg_no);
    
    System.out.println("The name of the Student is "+ name);

    System.out.println("The phone number of the Student is "+phone_no);
    
    System.out.println("The class of the Student is "+clas);
    
    System.out.println("The department of the Student is "+department);
  }
  String[] Tostring(){
    // This function just returns the name and reg_no of the student the user wishes to search.
        String[] a = new String[2]; 
        System.out.println("Enter the name you wish to search");
        a[0] = sc.nextLine();
        System.out.println("Enter the registeration number you wish to search");
        a[1] = sc.nextLine();

        return a; 
  }
}
