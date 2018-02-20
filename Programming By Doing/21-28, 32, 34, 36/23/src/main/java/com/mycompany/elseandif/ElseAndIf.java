/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.elseandif;

/**
 *
 * @author apprentice
 */
public class ElseAndIf
{
    // 1. If the condition isn't met in the first statement, it will move on to
    //check if the condition is met in the else if statement. If not it will
    //move on the else statement. If the condition is met in any of these the
    //code below will execute and move out of the if, if else, else block and
    //continue on to what's next.
    
    
    // 2. It makes a new if statement and not something nested inside one that
    //already exists.
    
	public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;

		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		else if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		}
		else
		{
			System.out.println( "We can't decide." );
		}


		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}

	}
}
