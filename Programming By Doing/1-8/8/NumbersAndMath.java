//Describes the entity
public class NumbersAndMath
{
	//The entry point for any Java program. Not an ordinary method.	
	public static void main( String[] args )
	{
		//Displays a sentence
		System.out.println( "I will now count my chickens:" );
		//Displays Hens and then solves the following equation and displays the result
		System.out.println( "Hens " + ( 25.0f + 30.0f / 6.0f ) );
		//Displays roosters and then solves the following equation and displays the result
		System.out.println( "Roosters " + ( 100.0f - 25.0f * 3.0f % 4.0f ) );
		//Displays a sentence
		System.out.println( "Now I will count the eggs:" );
		//Math equation that counts the eggs
		System.out.println( 3.0f + 2.0f + 1.0f - 5.0f + 4.0f % 2.0f - 1.0f / 4.0f + 6.0f );
		//Displays a sentence
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
		//Tells whether the following is true or false
		System.out.println( 3.0f + 2.0f < 5.0f - 7.0f );
		//Solves an equation
		System.out.println( "What is 3.0f + 2.0f? " + ( 3.0f + 2.0f ) );
		//Solves an equation
		System.out.println( "What is 5.0f - 7.0f? " + ( 5.0f - 7.0f ) );
		//Displays a sentence
		System.out.println( "Oh, that's why it's false." );
		//Displays a sentence
		System.out.println( "How about some more." );
		//Displays a sentence and the following equation will output either true or false
		System.out.println( "Is it greater? " + ( 5.0f > -2.0f ) );
		//Displays a sentence and the following equation will output either true or false
		System.out.println( "Is it greater or equal? " + ( 5.0f >= -2.0f ) );
		//Displays a sentence and the following equation will output either true or false
		System.out.println( "Is it less or equal? " + ( 5.0f <= -2.0f ) );
	}
}
