Fortune Teller

Overview

Week One Project for the Spring 2018 WeCanCodeIT cohort. Develop a console application that will tell the user’s fortune based on data received from the user.
	
Version History
	ver 1.0 meets all requirements plus the second stretch goal.  
	ver 1.1 meets all requirements and stretch goals.

Part 1

[ * ] Ask the user for the user’s first name. (6 Points)
[ * ] Ask the user for the user’s last name. (6 Points) 
[ * ] Ask the user for the user’s age. (6 Points) 
[ * ] Ask the user for the user’s birth month (as an ‘int’). (6 Points) 
[ * ] Ask the user for the user’s favorite ROYGBIV color. (6 Points) 
[ * ] If the user does not know what ROYGBIV is, ask the user to enter “Help” to get a list of the ROYGBIV colors. (6 Points) 
[ * ] Ask the user for the user’s number of siblings. (6 Points)

Part 2

For each of the below, you will select your own value for each condition. The table will give the conditions and an example for each.

[ * ] Retirement Years (8 Points) The user’s number of years until retirement will be based on whether the user’s age is odd or even.

	(condition) If the user’s age is…	(example) then the user will retire in…
	odd					42 years
	even					21 years
[ * ] Vacation Home Location (8 Points) The location of the user’s vacation home will be based on how many siblings the user has. If the user enters a number less than zero, give the user a bad location!

	(condition) If the user’s number of siblings is…	then the user’s vacation home will be in…
	0							Maui, Hawaii
	1							Juno, Alaska
	2							Singapore, Thailand
	3							Brisbane, Australia
	greater than three					Paris, France
	less than zero						Pomeroy, Ohio (Sorry Meigs County :( )
[ * ] Mode of Transporation (8 Points) The user’s mode of transportation will determined by the user’s favorite color.

	(condition) If the user’s favorite color is…	then the user’s mode of transportation will be…
	red						a Mustang
	orange						bicycle
	yellow						bus
	green						a Prius
	blue						row boat
	indigo						a chariot pulled by corgis
	violet						river barge
[ * ] Bank Balance (8 Points) The user’s bank balance at retirement will be based on the user’s birth month. If the user enters something other than 1-12 for birth month, the user’s balance will be $0.00.

	(condition) If the user’s birth month is…	The user’s balance will be…
	1-4						$452,396.04
	5-8						$952,396.03
	9-12						$252,397.03
	anything else					$-52.01

Part 3 

[ * ] Display the user’s fortune in this format:

[First Name] [Last Name] will retire in [# of years] with [bank balance] in the bank, a vacation home in [location], and travel by [mode of transporation]. 

Your program should be able to process input whether a user enters capital or lowercase letters.

Stretch Tasks (Optional) 
[ ] Give the user the ability to quit the program by typing “Quit” (should not be case sensitive) at any point where the program is looking for user input. The program should print “Nobody likes a quitter…” before ending.

Tip: To do this with the prompts that expect an integer, you will need to read in a String, check for “Quit”, then use Integer.parseInt(value) to convert the user input to an int. Also tip: You can call System.exit(0); to terminate your program immediately. 

[ * ] Research while (page 115 in the Head Start book) or do/while loops and use them to check whether a user typed “Help” for favorite color, printing the list of colors each time the user types “Help”.

What is your favorite ROYGBIV color? 
Help 
The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet. 
Help 
The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet. 