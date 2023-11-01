/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  String st="mahfil saji hai";
	  String ve="king of the lord";
/* 	  for(int i=0;i<st.length();i++)
     { 
         System.out.println(st.charAt(i));
	}}

*/

/*   substring (note: strings are immutable (once created a string cant be changed we need to change the string in new varibale of type string))
       System.out.println(st.substring(7,12));
*/
// ARRAYS 
int[] marks=new int [4];
marks[0]=1;marks[1]=78;marks[3]=7;
 /*for(int i=0;i<4;i++)
     { 
         System.out.println(marks[i]);
	}
}*/
// initially values are  assigned as 0 as compared tto cpp whre they were insitialis with garbage 
// ismein arry i property hoti hai toh bracket nhi lgana length k liye directly write marks.length bus 

// Arrays.sort(marks);
// System.out.println(marks[3]);

//casting 

//   implicit casting 
/*double price=100.00;
double finalprice=price+52;
System.out.println(finalprice);

//explict casting
int p=10;
int fp=p+(int)18.99;
System.out.println(fp);*/

// constant 
// final float PI=3.14F same sa constant or define in cpp
//min and max and random function 
// System.out.println(Math.min(5,6));
// System.out.println(Math.max(5,6));
// System.out.println(Math.random(5,6));//always give between 0 and 1;

// /input 

// Scanner sc=new Scanner (System.in);
// System.out.println("input your age");
// int ge=sc.nextInt();//can be nextFloat //nextChar 
// System.out.println(ge);

//input for strings 
// String name=sc.next();//take a single word and sc.nextline() pura input lega
// System.out.println(name);

//comparison operator is same as cpp
//same if else as cpp
// Same logical operators && || etc 

//exception handling 

// int[] marks={45,8,56};
// System.out.println(marks[4]);//
try{
    System.out.println(marks[5]);
}
catch(Exception exception){
    
}
System.out.println("baaki ka chalta rhe");
	    
	}
}
