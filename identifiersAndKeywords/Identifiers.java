package identifiersAndKeywords;

public class Identifiers {

	public static void main(String[] args) {
		// Identifiers basically used in java to name a Class , Variable and methods for identification purpose .
		
		// allowed characters in identifier -
		 /*
		  * A-Z
		  * a-z
		  * $
		  * _
		  * and numbers....0-9
		  */
		
		//Possible naming combinations
		int a = 5;
		int a_ = 5;
		int a1 = 5;
		int a_1 = 5;
		int A_ = 5;
		int a_$ = 5;
		int $ = 0;
		int $asd = 5;
		int _dfgh=6;
		System.out.println($ + " " + _dfgh);
		
		//no. will never come at first
		// int 1as = 5;   gave error...
		
		//there is no length limit in java for a identifier
		int awsedrtfytugyihuoipoiuytrewsedrftgyhujikokojihugyftdrfessdfdghyjukjilopolikujyhtgrewesdrtyui = 5;
		System.out.println(awsedrtfytugyihuoipoiuytrewsedrftgyhujikokojihugyftdrfessdfdghyjukjilopolikujyhtgrewesdrtyui);
		
		int String = 5;
		int Runnable = 7;
		System.out.println(String+ " " + Runnable);

	}

}
