import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.Test;


public class LoopTutorial {


	
	
	@Test
	public static void main(String[] args) /*{
		
	int alex ,masha, arina,alina;
	alex=5;
	masha=10;
	arina= masha+alex;
	alina = arina;
	System.out.print(alina);
	}*/

	{ for (int x=2; x<5; x++){
   int a = 6;
   
   if (a==3) 
   {
   
   System.out.println("x must be 3");
  
   } else {
        
	   System.out.println("x is not  3");
   }
	System.out.println("This runs no matter what"); 
	
	if (x < 1){
		System.out.println("x les then 5");	
	}
	else {
		for (int w=2; w<5; w++){
		System.out.println("x must be 6");}
	}
}
}
}