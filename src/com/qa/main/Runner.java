package com.qa.main;

public class Runner {
	
	// How many bottles of beer do we start with? Set it when this is called!
	public static void singSong(int bottlesOfBeer) {
		
		//quick check to make sure number is not negative
		if (bottlesOfBeer < 0) {
			System.out.println("Enter a number greater than or equal to zero if you want to sing the song!");
		}
		
		// i variable to loop
		int i;
		
		// loop through all bottles of beer (going to increment rather than decrement)
		for ( i = 0 ; i <= bottlesOfBeer; i++ ) {
			
			// current bottle count
			int curBottles = bottlesOfBeer - i;
			
			// take one down
			int downBottles = curBottles - 1;
			
			// bottles of beer string
			String repString = "bottles of beer";
			
			// non plural 'bottle of beer' string
			String oneBottle = repString.substring(0,6) + repString.substring(7,15);

			// default first line
			String firstLine = curBottles + " " + repString + " on the wall, " + curBottles + " " + repString + ".\r\n";
			
			// default second line
			String secondLine = "Take one down and pass it around, " + downBottles + " " + repString + " on the wall.\r\n";
			
			// logic
			
			// logic for 2 bottles, second line only has one bottle and needs changing
//			if ( curBottles == 2 ) {
//				
//				// change the second line
//				secondLine = "Take one down and pass it around, " + downBottles + " " + oneBottle + " on the wall.\r\n";
//				
//			} else if ( curBottles == 1 ) { // logic for 1 bottle, first line only has one and second line has 'no more'
//				
//				// change the first line
//				firstLine = curBottles + " " + oneBottle + " on the wall, " + curBottles + " " + oneBottle + ".\r\n";
//				
//				// change the second line
//				secondLine = "Take one down and pass it around, no more " + repString + " on the wall.\r\n";
//
//			} else if ( curBottles == 0 && bottlesOfBeer == 1 ) { // for when someone enters only one bottle to start singing from
//				// change the first line
//				firstLine = "No more " + repString + " on the wall, no more " + repString + ".\r\n";
//				
//				// change the second line
//				secondLine = "Go to the store and buy some more, " + bottlesOfBeer + " " + oneBottle + " on the wall.\r\n";
//			} else if ( curBottles == 0 ) { // logic for 0 bottles, both lines need alterations from the default
//				
//				// change the first line
//				firstLine = "No more " + repString + " on the wall, no more " + repString + ".\r\n";
//				
//				// change the second line
//				secondLine = "Go to the store and buy some more, " + bottlesOfBeer + " " + repString + " on the wall.\r\n";
//				
//			}
			
			if ( curBottles == 0 && bottlesOfBeer == 1 ) { // for when someone enters only one bottle to start singing from
				// change the first line
				firstLine = "No more " + repString + " on the wall, no more " + repString + ".\r\n";
				
				// change the second line
				secondLine = "Go to the store and buy some more, " + bottlesOfBeer + " " + oneBottle + " on the wall.\r\n";
			} else {
				// easier than a lot of if and else if statements!
				switch(curBottles) {
					case 2: // logic for 2 bottles, second line only has one bottle and needs changing
						// change the second line
						secondLine = "Take one down and pass it around, " + downBottles + " " + oneBottle + " on the wall.\r\n";
						break;
					case 1: // logic for 1 bottle, first line only has one and second line has 'no more'
						// change the first line
						firstLine = curBottles + " " + oneBottle + " on the wall, " + curBottles + " " + oneBottle + ".\r\n";
						// change the second line
						secondLine = "Take one down and pass it around, no more " + repString + " on the wall.\r\n";
						break;
					case 0: // logic for 0 bottles, both lines need alterations from the default
						// change the first line
						firstLine = "No more " + repString + " on the wall, no more " + repString + ".\r\n";
						// change the second line
						secondLine = "Go to the store and buy some more, " + bottlesOfBeer + " " + repString + " on the wall.\r\n";	
						break;
					//default: 
				}
			}
			
			// print first and second line
			System.out.println(firstLine + secondLine);
			
		}
	}
	

	public static void main(String[] args) {
		
		// sing the song starting at whatever number you want!  
		singSong(99);

	}

}
