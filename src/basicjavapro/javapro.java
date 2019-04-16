package basicjavapro;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

import basicjavapro.bad.honey;
class Sample {
// INSTANCE VARIABLE
	  protected int g=100;  protected int h=200;    
   boolean y=true;   boolean z=false; private  int r; private String n;
	char[] ch= {'P','E','R','F','I','C','I','E','N','T'};
	String s= new String(ch);
	//STATIC KEYWORD
	static String company = "PERFICIENT"; 
	byte c=10;byte d=20;
	float tot=(d%c)+(d/c);long l =(++d)-(++c);double e=(d<<c)*c;
	//BOOLEAN LOGICAL OPERATOR
	boolean boo=(c>d &&d>c);
	int ter=(c>d)?c:d;
	void data() {
	System.out.println( "DATA TYPES AND OPERATORS : FLOAT = "+tot+" ; LONG = "+l+" ; DOUBLE = "+e+ " ; CHAR = "+s);
	System.out.println("BITWISE OPERATOR : "+boo+" TERNARY OPERATOR = "+ter);
	System.out.println("ASSIGNMENT OPERATOR : a = "+(c/=10)+" b = "+(d*=5)+" c = "+(c%=2));
	}
	//DEFAULT CONSTRUCTOR
	  Sample(){
		  System.out.println("Default Constructor");
	 n="viji";
		r=005;
		System.out.println("name = " +n +" roll = "+r);
	 }
	//PARAMETERIZED CONSTRUCTOR
	  Sample(int roll, String name) {
		this.r=roll;
		this.n=name;
		company=company;}
		    void show() {
		   //LOCAL VARIABLE	
		    short a = 2019;   short b = 2020;
		       System.out.println("Parameterized Constructor and this & static keyword");
		       System.out.println("roll= " + this.r + "; name= " + this.n + "; company= "+company);
	       int age=20;
	       if (age<17) {
	          System.out.println("school student");
	      } else if (age<=20) {
	         System.out.println("college student"); 
	     } else {
	         System.out.println("professional");
	       }
	       switch(age) {
	       case 19:System.out.println("before teen age");
	      break; 
	       case 20:System.out.println("after teen age");
	      break;}
	      for(int i = 0; i < 5; ++i) {
	          for(int j = 0; j <=i; ++j) {
	           System.out.print("*");
	       }
	        System.out.println(" ");      }
	      int i=1;  
	      while(i<=10){  
	      System.out.print(i);  
	      i++;  
	      }  System.out.println();
	    int j=10; 
	    do {
	    	  System.out.print(  j);
	    	  j--;}
	    	  while(j>=1);
	      int arr[] = {10, 20, 30, 40, 50};{
	    	   System.out.println("\n Print the array elements using enhanced for loop");  
	    	   for(int k:arr) {
	    	     System.out.println(k);
	    	   } }
	      int ar[][]= {{1,2,3},{2,3,1},{3,1,2}};
	    	  for(i=0;i<3;i++) {
	    		  for(j=0;j<3;j++) {
	    	  System.out.print(ar[i][j]+" ");
	      }
	    		  System.out.println();}
	      
	      }
	      
	 void meth(int a, int b) {
	       System.out.println("METHOD OVERLOADING AND OVERRIDING : " + (a + b));
	 }
	   void meth(int a, int b, int c) {
	  System.out.println("METHOD OVERLOADING");
	       System.out.println(a + b + c); 
	} void disp() {
		class inner{
			void disp() {
				System.out.println("INNER CLASS : "+r);
			}
		}inner object =new inner();
		object.disp();
	}
	   }
	 class javaprog extends  Sample{
	  //  public void finalize() {
	       //System.out.println("Finalize method");
	    //} 
	    void meth(int a, int b) {
	       System.out.println("METHOD OVERRIDING : " + a + b);
	   }   void fun(Sample obj1) {
	       obj1.g =obj1.g-50;
	   }
	   
	   }
	public class javapro{ 
		static void display1(String... name) {
	       System.out.println("Variable Argument");  
	       for(String s:name)
	         System.out.println(s);      }
	 static int fact(int n) {
	    	if(n==1)
	       return  1 ;
	    	else
	    		  return fact(n - 1) * n;}
	 char[] ch= {'P','E','R','F','O','R','M','A','N','C','E'};
	 String s=new String(ch);
	 char c=s.charAt(4);
	 String str ="Java is the high LEVEL Programming LAnguagE"; 
	 String str1="programmming";
	 String st=new String("PERFECT");
	 String st1=new String ("PERFECT");
	 String st2=new String ("perfect");
	 String s1=new String("BETTER");
	 String s2=new String("SINCERE");
	 char a='A'; char b='B';
	 String s3=("");
	 //CONCAT
	 { System.out.println("concat : "+st.concat(" ").concat(s1).concat(" ").concat(s2));
	 // comapreTo
	 System.out.println(" string : "+s+"  charAt : "+c+"  compareTo : "+s.compareTo(st)+"  compareTo : "+s.compareTo(s1)+
	 		"  compareTo : "+s.compareTo(s2));
	 //CONTAINS
	 System.out.println("contains : "+str.contains("high level")+" contains : "+ str.contains("machine language"));
	 //ENDSWITH
	 System.out.println("endswith : "+str.endsWith("E")+" endswith : "+str.endsWith("d"));
	 //EQUALS
	 System.out.println("equals : "+st.equals(st1)+" equals : "+st.equals(s1));
	 //EQUALSIGNORECASE
	 System.out.println("equalsIgnorecase : "+st.equalsIgnoreCase(st1)+" equalsIgnorecase : "+st.equalsIgnoreCase(st2));
	 //INDEXOF
	 System.out.println("indexOf : "+str.indexOf("the")+" indexOf : "+st.indexOf('P'));
	 //lastIndexOf
	 System.out.println("lastIndexOf : "+str.lastIndexOf('s'));
	 //isEmpty
	 System.out.println("isEmpty : "+s3.isEmpty()+" isEmpty : "+s2.isEmpty());
	 //join
	 String s4=String.join("-","hai","hello");  
	 System.out.println("join : "+s4); 
	 //LENGTH
	 System.out.println("length : "+st1.length());
	 //REPLACE AND REPLACE ALL
	 System.out.println("replace : "+s1.replace('E','U')+"  replaceAll : "+str.replaceAll("the","a"));
	 //startWith
	 System.out.println("startWith : "+s2.startsWith("S")+" startWith : "+s2.startsWith("I"));
	 //subString
	 System.out.println("subString : "+str.substring(23,34));
	 //toLowerCase and toUpperCase
	 System.out.println("toLowerCase : "+str.toLowerCase()+"\n toUpperCase : "+str.toUpperCase()); 
	 //TRIM
	 System.out.println("trim : "+str1.trim()+"language");
	 //valueOf
	 System.out.println("valueOf : "+String.valueOf(a)+" ; valueOf : "+String.valueOf(b));
		StringBuffer buffer=new StringBuffer("Java is Object Oriented Oriented");
		//buffer.replace(," an ");
		System.out.println("STRINGBUFFER : \n append : "+buffer.append(" and it is a programming language ")+"\n  insert : "+buffer.insert(7, " the ")+
		"\n replace : "+buffer.replace(8,11,"an ")+"\n delete : "+buffer.delete(28,37)+"\n reverse : "+buffer.reverse()+"\n capacity : "+buffer.capacity());}
	 public enum cmpy{CTS , TCS , WIPRO , PERFICIENT , INFOSYS}
	{System.out.println("values()....");
			for(cmpy com:cmpy.values()){
			System.out.println(com);}
			cmpy com=cmpy.valueOf("PERFICIENT"); 	
			System.out.println("valueOf()....");
			System.out.println(com);
			
			System.out.println("switch statement...");
			cmpy comp=cmpy.PERFICIENT;
			switch(comp) {
			case CTS:
				System.out.println("cts");
				break;
			case TCS:
				System.out.println("tcs");
				break;
			case PERFICIENT:
				System.out.println("perficient");
				break;
		default:
				System.out.println("no one is correct");
			}
	int a=5;
	Integer j=new Integer(a);
	System.out.println("AUTOBOXING " +j);
	Integer i=new Integer(10);
	int b=i;
	System.out.println("AUTO BOXING : "+b);
	ArrayList<String> arr=new ArrayList<String>();
	arr.add("chandra");
	arr.add("santhi");
	arr.add("sanjay");
	arr.add("lekha");
	Iterator<String> it=arr.iterator();
	System.out.println("ARRAY LIST : ");
	while(it.hasNext()) {
		System.out.println(it.next());
}
arr.remove("lekha");
arr.remove(1);
for(String s:arr) {
System.out.println(s);	
}arr.set(0,"malar");
for(String s:arr) {
System.out.println(s);	
}arr.removeAll(arr);
System.out.println(" "+arr);}
public static void main(String[] args) {
	     Sample obj = new Sample();
	     obj.data();
	       Sample obj2 = new Sample(2, "vijay");
	      obj2.show();
	     //CALL BY VALUE
	       obj.meth(5, 5, 5);
	    obj.meth(6, 4);
	    javaprog obj1 = new javaprog();
	    obj1.disp();
	       System.out.println("before changing the value : " + obj1.g);
	     //CALL BY REFERENCE
	       obj1.fun(obj1);
	     System.out.println("after changing the value : " + obj1.g);
	       System.out.println("Factorial of 5 : " + fact(5));
	     display1();
	       display1("hai,hello,welcome");
	      javapro displayy=new javapro();
	      honey bee=new honey();
	      bee.girls();
	      bee.boys();
	      bee.show();
	      bee.abs();
	      bee.abst();
	      javapro b=new javapro();
	  		b.pani();}
	  void alpha()throws IOException {
	  		throw new IOException();}
	  	//	System.out.println("alpha class");}
	  	void pani() {
	  		try {
	  			try { alpha();
	  			}
	  		catch(Exception e) {
	  			System.out.println(e);
	  		}try {
	  			int c=2/0;
	  		}catch(ArithmeticException e)
	  		{System.out.println(e);}}
	  		catch(Exception e )
	  		{System.out.println(e);}}}