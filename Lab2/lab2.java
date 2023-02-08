import java.util.*;

public class lab2{
	public static void main(String[] args ){
		String[] a = new String[1028];
		Scanner sc = new Scanner(System.in);
		int key = 1;
		do{	
			int condition;
			System.out.printf("Enter 1 to enter a name%n");
			System.out.printf("Enter 2 to search to a name%n");
			System.out.printf("Enter 3 to remove a name%n");
			System.out.printf("Enter 4 to show all names%n");
			condition =  Integer.parseInt(sc.next());
			switch(condition){
				case 2 :
					{
						System.out.println("Enter the name you wish to search");
						String name = sc.next();
						int found = 0;
						for(int i = 0;i<a.length;i++){
							if(a[i] == null) break;
							if(a[i].equals(name)){
								System.out.println("Found at "+i);
								found = 1;
							}
						}
						if(found == 0){
							System.out.println("Not Found");
						}
						break;
					}
				case 1:
					{
						System.out.println("Enter the name you wish to enter");
						String name = sc.next();
						for(int i =0;i<a.length;i++){
							if(a[i] == null){
								a[i] = name;
								break;
							}
							if(a[i].equals(name)){
								System.out.println("THE NAME ALREADY EXISTS");
								break;
							}
						
						}
							
						break;
					}
				case 3:
					{
						int y = 0;
						System.out.println("Enter the name you want to remove");
						String name = sc.next();
						for(int i=0;i<a.length;i++){
							if(a[i] == null) break;
							if(a[i].equals(name)){
								name= "0";
								y = 1;
							}
							a[i] = a[i+y];
						}
						break;
					}
				case 4:
					{
						for(int i= 0;i<a.length;i++){
							if(a[i] == null) break;
							System.out.print(a[i] +",");
						}
						System.out.println();
						break;
					}



				default:{
						System.out.println("Incorrect value Entered");
						break;
				}
			}
			System.out.println("Do you wish to continue");
			key = Integer.parseInt(sc.next());
		}while(key == 1);
		}}
