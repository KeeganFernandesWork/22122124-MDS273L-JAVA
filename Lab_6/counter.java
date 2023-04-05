import java.io.File;
import java.util.Scanner;

class counter{
  
  static void word_counter(String name){
    File x;
    Scanner sc;
    String[] words = new String[150];
    int[] count = new int[150];
    try {
       x = new File(name);

       sc = new Scanner(x);
       int word_count = 0;
       sc.useDelimiter(" ");
       String[] p = sc.nextLine().split("\\W+");
       int cnt = p.length;
       int k = 0;
       while(k<cnt){
         String a = p[k];
         if(a.equals(" ")){
           k++;
           continue;
         }
         for(int i=0; i<150;i++){
           if(words[i] == null){
             words[i] = a;
             count[i]++;
             word_count++;
             break;
           }
           if(words[i].equals(a)){
             count[i]++;
             break;
           }
         }
         k++;
       }
       
       int[] top = new int[5];
       int[] bottom = new int[5];
       int[] top_count = new int[5];
       int[] bottom_count = new int[5];
       for(int i=0;i<5;i++){
        int max = -1;
        int min = 500;
         for(int j=0;j<word_count;j++){
           if(count[j] > max && count[j]>0){
             max = count[j];
             top[i] = j;
           }
           if(count[j] < min && count[j] > 0){
             min = count[j];
             bottom[i] = j;
           }
          
         }
         top_count[i] = max;
         bottom_count[i] = min;
         count[top[i]] = -1;
         count[bottom[i]] = -1;

       }
         System.out.println("Top Words");
         for(int i=0;i<5;i++){
          System.out.println(i+ ": "+words[top[i]]+" : "+ top_count[i]);
         }
         System.out.println("Bottom Words");
         for(int i=0;i<5;i++){
          System.out.println(i+ ": "+words[bottom[i]]+" : "+ bottom_count[i]);
         }
       sc.close();
  }
     catch (Exception e) {
      System.out.println("Error");
    }

  }
  static void vowels_and_digits_counter(String name){
    File x;
    Scanner sc;
    String paragraph;
    char[] vowels = new char[15];
    int[] count = new int[15];
    vowels[0] = 'a';
    vowels[1] = 'e';
    vowels[2] = 'i';
    vowels[3] = 'o';
    vowels[4] = 'u';
    vowels[5] = '1';
    vowels[6] = '2';
    vowels[7] = '3';
    vowels[8] = '4';
    vowels[9] = '5';
    vowels[10] = '6';
    vowels[11] = '7';
    vowels[12] = '8';
    vowels[13] = '9';
    vowels[14] = '0';
    try {
       x = new File(name);

       sc = new Scanner(x);
       sc.useDelimiter("");
       String s = "";
       while(sc.hasNextLine()){
         s = s + sc.next();
       }
       s = s.toLowerCase();
       char[] p = s.toCharArray();
       int cnt = p.length;
       int k = 0;
       
       while(k<cnt){
         char a = p[k];
         for(int i=0; i<15;i++){
           if(vowels[i] == a){
             count[i]++;
           }
         }
         k++;
       }
       
         System.out.println("Vowels and digits");
         for(int i=0;i<15;i++){
          System.out.println(vowels[i]+" : "+count[i]);
         }
       sc.close();
  }
     catch (Exception e) {
      System.out.println("Error");
    }

  }
  static void character_counter(String name){
    File x;
    Scanner sc;
    String[] words = new String[150];
    int[] count = new int[150];
    try {
       x = new File(name);

       sc = new Scanner(x);
       sc.useDelimiter("");
       int word_count = 0;
       while(sc.hasNextLine()){
         String a = sc.next();
         if(a.equals(" ")){
           continue;
         }
         for(int i=0; i<150;i++){
           if(words[i] == null ){
             words[i] = a;
             count[i]++;
             word_count++;
             break;
           }
           if(words[i].equals(a) && !words[i].equals(" ")){
             count[i]++;
             break;
           }
         }
       }
       
        
       int[] top = new int[5];
       int[] bottom = new int[5];
       int[] top_count = new int[5];
       int[] bottom_count = new int[5];
       for(int i=0;i<5;i++){
        int max = -1;
        int min = 500;
         for(int j=0;j<word_count;j++){
           if(count[j] > max && count[j]>0){
             max = count[j];
             top[i] = j;
           }
           if(count[j] < min && count[j] > 0){
             min = count[j];
             bottom[i] = j;
           }
          
         }
         top_count[i] = max;
         bottom_count[i] = min;
         count[top[i]] = -1;
         count[bottom[i]] = -1;

       }
       
         System.out.println("Top Characters");
         for(int i=0;i<5;i++){
          System.out.println(i+ ": "+words[top[i]]+" : "+top_count[i]);
         }
         System.out.println("Bottom Characters");
         for(int i=0;i<5;i++){
          System.out.println(i+ ": "+words[bottom[i]]+" : "+ bottom_count[i]);
         }
       sc.close();
  }
     catch (Exception e) {
      System.out.println("Error");
    }

  }
  
   static void top(String name){
    File x;
    Scanner sc;
    try {
       x = new File(name);

       sc = new Scanner(x);
       int k = 0;
       int l = 0;
       int count = 0;
       String[] words = new String[10];
       String cat = "https://indianexpress.com/section/";
       int len = cat.length();

       while(sc.hasNextLine()){
         String a = sc.nextLine();
         k = a.indexOf(cat,k);
         l = a.indexOf("/",k+1+len);
         if(k != -1){
           String s = a.substring(k+len, l); 
         for(int i = 0;i<10;i++){
           if(words[i] == null){
             words[i] = s;
             count++;
             break;
           }
           if(s.equals(words[i])){
             break;
           }
         }
         }
         k++;
         
       } 
       System.out.println("Top Categories");
       for(int i=0;i<count;i++){
         System.out.println(words[i]);
       }
       
  }
     catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
  public static void main(String[] args) {
    word_counter("text.txt");
    character_counter("text.txt");
    vowels_and_digits_counter("text.txt");
    top("htmlFile.txt");
  }
}
