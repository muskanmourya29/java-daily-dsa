import java.util.*;
class Pangram{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String");
      String s=sc.nextLine();
      int len=s.length();
      char ch=s.charAt(len-1);
      String s1=s;
      if(ch=='.'||ch=='?'||ch==','||ch=='!'){
       s1=s.substring(0,len-1);
      }
        s1=s1.toLowerCase();
        int k=0;
        char ch2='a';
        while(ch2<='z'){
            int c=0;
         for(int i=0;i<s1.length(); i++){
            char ch1=s1.charAt(i);
            if(ch1==ch2)
            c++;
         }
         if(c==0){
            k=1;
            break;
         }
         ch2++;
        } 
        if(k==0)
        System.out.println("Pangram");
        else
        System.out.println(" Not a Pangram") ; 
          sc.close();
          }

    }
