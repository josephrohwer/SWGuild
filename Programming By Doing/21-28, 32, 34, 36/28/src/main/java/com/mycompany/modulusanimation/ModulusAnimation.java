/*
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
 */
package com.mycompany.modulusanimation;


/*
 
  @author apprentice
 */
public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<80; i++ )
		{
			if ( i%16 == 0 )
				System.out.print(" (O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)                 \r");
			else if ( i%16 == 1 )
				System.out.print("          (O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)               \r");
			else if ( i%16 == 2 )
				System.out.print(" (O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)             \r");
			else if ( i%16 == 3 )
				System.out.print("          (O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)           \r");
			else if ( i%16 == 4 )
				System.out.print(" (O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)         \r");
			else if ( i%16 == 5 )
				System.out.print("          (O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)       \r");
			else if ( i%16 == 6 )
				System.out.print(" (O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)     \r");
			else if ( i%16 == 7 )
				System.out.print("          (O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)   \r");
			else if ( i%16 == 8 )
				System.out.print(" (O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O) \r");
			else if ( i%16 == 9 )
				System.out.print("          (O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)   \r");
			else if ( i%16 == 10 )
				System.out.print(" (O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)     \r");
			else if ( i%16 == 11 )
				System.out.print("          (O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)       \r");
			else if ( i%16 == 12 )
				System.out.print(" (O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)         \r");
			else if ( i%16 == 13 )
				System.out.print("          (O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)           \r");
			else if ( i%16 == 14 )
				System.out.print(" (O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)             \r");
			else if ( i%16 == 15 )
				System.out.print("          (O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)(O_O)               \r");

			Thread.sleep(200);
		}
		
	}
}
