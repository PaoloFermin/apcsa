import java.util.Scanner;
public class nameinbox
{
 public static void main(String[] args) 
   {
	String A ="$";// you can change this one
	String B ="%";// you can change this one
	String C ="!";// you can change this one
	String D ="*";// you can change this one
	String E ="#";// you can change this one
	String X ;//DONT CHANGE
	String Y ;//DONT CHANGE		
   System.out.println("What's your name?");
   Scanner Q_1 = new Scanner(System.in);
   String name = Q_1.nextLine();
   int namelength= name.length();
   System.out.println("Which do you like?\n\tA."+A+"\n\tB."+B+"\n\tC."+C+"\n\tD."+D+"\n\tE."+E+"\n\tF.Box");//loop from here
   Scanner Q_2 = new Scanner(System.in);
   String choice = Q_2.nextLine();
   if(choice=="A") {
	   X = A; 
   }else if(choice=="B"){
	   X = B;
   }else if(choice=="C"){
	   X = C;
   }else if(choice=="D"){
	   X = D;
   }else if(choice=="E"){
	   X = E;
   }else if(choice=="F"){
	   Y = "_";
	
   }else {
	   System.out.println("Type A, B, C, D, E, or F");//to here if they get else
   }
   
   for (int i = 0; i < namelength; i++) {
      System.out.print(X);
   }
   
   if(Y == "_") {
	   if(namelength==1) {
		   System.out.println("Why is your name so short? I can't think of any names that are one letter long!");
	   }else if(namelength==2) {
		   System.out.println(Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+"\n\t|          |"+"\n\t|    "+name+"    |"+"\n\t|          |"+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y);
	   }else if (namelength==3) {
	   System.out.println(Y+Y+Y+Y+Y+Y+Y+Y+Y+"\n\t|         |"+"\n\t|   "+name+"   |"+"\n\t|         |"+Y+Y+Y+Y+Y+Y+Y+Y+Y);
	   }else if (namelength==4) {
	   System.out.println(Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+"\n\t|          |"+"\n\t|    "+name+"    |"+"\n\t|         |"+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y);
	   }else if(namelength==5) {
	   System.out.println(Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+"\n\t|           |"+"\n\t|   "+name+"   |"+"\n\t|           |"+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y);
	   }else if (namelength==6) {
	   System.out.println(Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+"\n\t|          |"+"\n\t|    "+name+"    |"+"\n\t|          |"+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y);
	   }else if(namelength==7) {
	   System.out.println(Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+"\n\t|           |"+"\n\t|   "+name+"   |"+"\n\t|           |"+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y+Y);
	   }else if(namelength>=7) {
	   System.out.println("Your name is too long. Go get a shorter name.(only 7 letters)");
	   }else {
		   System.out.println("Nick you FUCKED up");
	   }
   
   }else{
   if(namelength==2) {
	   System.out.println(X+X+X+X+X+X+X+X+X+X+"\n\t"+X+"          "+X+"\n\t"+X+"    "+name+"    "+X+"\n\t"+X+"          "+X+X+X+X+X+X+X+X+X+X);
   }else if (namelength==3) {
   System.out.println(X+X+X+X+X+X+X+X+X+"\n\t"+X+"         "+X+"\n\t"+X+"    "+name+"    "+X+"\n\t"+X+"         "+X+X+X+X+X+X+X+X+X);
   }else if (namelength==4) {
   System.out.println(X+X+X+X+X+X+X+X+X+X+X+"\n\t"+X+"            "+X+"\n\t"+X+"    "+name+"    "+X+"\n\t"+X+"            "+X+X+X+X+X+X+X+X+X+X+X+X);
   }else if(namelength==5) {
   System.out.println(X+X+X+X+X+X+X+X+X+X+X+"\n\t"+X+"           "+X+"\n\t"+X+"    "+name+"    "+X+"\n\t"+X+"           "+X+X+X+X+X+X+X+X+X+X+X);
   }else if (namelength==6) {
   System.out.println(X+X+X+X+X+X+X+X+X+X+X+X+X+"\n\t"+X+"              "+X+"\n\t"+X+"    "+name+"    "+X+"\n\t"+X+"              "+X+X+X+X+X+X+X+X+X+X+X+X+X+X);
   }else if(namelength==7) {
   System.out.println(X+X+X+X+X+X+X+X+X+X+X+X+X+"\n\t"+X+"             "+X+"\n\t"+X+"    "+name+"    "+X+"\n\t"+X+"             "+X+X+X+X+X+X+X+X+X+X+X+X+X);
   }else if(namelength>=7) {
   System.out.println("Your name is too long. Go get a shorter name you box hater.(only 7 letters)");
   }else {
	   System.out.println("Nick you FUCKED up again");
   }
   }
   }
}