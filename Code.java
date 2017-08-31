import java.util.Scanner;
public class Code{
   public static void main(String args[]){
      Scanner scan = new Scanner (System.in);
      String code;
      int choice = 0;
      System.out.print("type your mesage::");
      code = scan.nextLine();
      System.out.print(code);
      System.out.println(" Is the mesage, correct? \n\t[1]YES\n\t[2]NO\ntype number");
      choice = scan.nextInt();
      if (choice==1){
         System.out.println("OK");
         char codeArray[]=code.toCharArray();
         
         System.out.println("would you like to encode or decode. \n\t[1]encode\n\t[2]decode\ntype number");
         choice = scan.nextInt();
         if (choice==1){
            String result=encode(codeArray);
            System.out.println(result);
         }
         else if(choice==2){
            String result=decode(codeArray);
            System.out.println(result);
         }
      }
      else{
         System.out.println("OPPS");
      }
   }
   
   public static String encode(char input[]){
      int codeLength=input.length;
      String outCode="";
      for(int i=0;i<codeLength;i++){
         input[i]=(char)(input[i]+'a');
      }
      outCode = String.valueOf(input);
      return outCode;
   }
   
   public static String decode(char input[]){
      int codeLength=input.length;
      String outCode="";
      for(int i=0;i<codeLength;i++){
         input[i]=(char)(input[i]-'a');
      }
      outCode = String.valueOf(input);
      return outCode;
   }
}