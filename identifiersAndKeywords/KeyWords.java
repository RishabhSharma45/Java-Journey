package identifiersAndKeywords;

import java.util.Scanner;

public class KeyWords {

	public static void main(String[] args) {
		// Java has 53 reserved Keywords .
		// basically in java some words are reserved to represent some meaning or functionality those words are known as reserved words...
		// out of 53 reserved words ---  50 are keywords where as 3 are literals(true,false,null)
		 // and out of 50 keywords ---- 48 are used whereas 2 are unused keywords(const,goto);
		
		//lets start with Data types
		
		//1
		//byte
		// size - 1 byte , 8 bits . range -> -128 to 127 .... [reserved for sign(1st bit)][][][][][][][]
		byte a = 127;  
		System.out.println(a);
		//byte b = 128 = //will say it is int because of posiible loss of precision
		
		
		//2
		//short
		// size - 2 byte , 16 bits , range -2^15 to 2^15-1 , Rarely used best for 16 bit processor..
		short b = 128;
		System.out.println(b);
		
		//3
		//int
		//size - 4 byte , 32 bits , range -2^31 to 2^31-1 
		int c = 2147483647;
		//int d = 2147483648    out of range
		System.out.println(c);
		
		//4
		//long
		//size - 8 byte , 64 bits , range -2^63 to 2^63-1 
				long d = 2147483648l; // long d = 2147483648;   without l no. is by default int. and it will gave a error for int out of range
				System.out.println(d);
		
		//5
		//float
				//size - 4 byte , 32 bits , range -3.4e38 to 3.4e38  5 to 6 decimal accuracy
				float e = 3.456885298852f; 
				System.out.println(e);
		//6
		//double
				//size - 8 byte , 64 bits , range -1.7e308 to 1.7e308  5 to 6 decimal accuracy
				double f = 3.458566598456885298852f; 
				System.out.println(f);
		
		//7
		//boolean
				//size and range are not applicable in java 
				boolean g = true; 
				System.out.println(g);
		
		//8
		//char
				//size - 2 byte , range 0 to 2^16-1 default value 0 that is pace tab
				char h = '5';
				char i = 95;
				System.out.println(h+""+i);
	
	//9
	//if
				Scanner sc = new Scanner(System.in);
	  int a1 = 10;
	  int a2 = 11;
	  int a3 = 12;
	  
	  if(a1==10) {
		  System.out.println("yes a1==10");
	  }
	
	//10
	//else
	  else {
		  System.out.println("no a1 is not 10");
	  }
	  
	//11
	//switch
	  //12
	  //case
	  //13
	  //default
	  switch(a1) {
	  case 10 :
		  System.out.println("hello from 10");
		  break;
	  case 11 :
		  System.out.println("hello from 11");
		  break;
	  case 12 :
		  System.out.println("hello from 12");
		  break;
		  default :
			  System.out.println("hello from default");
	  }
	
	
	//14
	//while
	  int i1 = 0;
	  while(i1<5) {
		  System.out.println("hello"+ " "+i1);
		  i1++;
	  }
	
	//15
	//do
	  int i2 = 0;
	  do {
		System.out.println(i2);
		i2++;
	  }
	  while(i2<5);
	
	//16
	//for
	  for(int i4=0;i4<5;i4++) {
		  System.out.println(i4);
	  }
	  
	  System.out.println();
	  System.out.println();
	
	//17
	//break
	  //18
	  //continue
	  
	  for(int z1=0;z1<5;z1++) {
		  
		  if(z1==3) {
			  break;
		  }
		  System.out.println(z1);
	  }
	  
	  for(int z=0;z<5;z++) {
		  
		  if(z==3) {
			  continue;
		  }
		  System.out.println(z);
		  //continue;
		  
	  }
	  
	
	//19
	//return
	  for(int i6=0;i6<5;i6++) {
		  if(i6==3) {
			  return;
		  }
		  System.out.println(i6);
	  }
	  
	  //20 public
	//21 protected
	//22 private     ///// will show them explicitly different in modifier package 
	//23 static
	//24 final
	//25 abstract
	  
	  //26 synchronizer
	  //27  strict
	  //28  transient
	  //29  volatile
	  
	  //30 try
	  //31 catch
	  //32 finally   // will see in Exceptional Handling Package
	  //33 throw
	  //34 throws
	  //35 assert
	  
	  //36 class
	  //37 interface
	  //38 extends
	  //39 implements
	  //40 package
	  //41 import
	  //42 new 
	  //43 instanceOf
	  
	  //44 super
	          // will see in SuperAndThisKeyword Class...
	  //45 this
	  
	  //46 void
	  // 47 enum
	  
	  
	

}
}
