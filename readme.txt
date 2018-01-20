Fortune Teller

Overview

<<<<<<< HEAD
Week One Project for the Spring 2018 WeCanCodeIT cohort. Develop a console application that will tell the user�s fortune based on data received from the user.

Part 1

[ * ] Ask the user for the user�s first name. (6 Points)
[ * ] Ask the user for the user�s last name. (6 Points)
[ * ] Ask the user for the user�s age. (6 Points)
[ * ] Ask the user for the user�s birth month (as an �int�). (6 Points)
[ * ] Ask the user for the user�s favorite ROYGBIV color. (6 Points)
[ * ] If the user does not know what ROYGBIV is, ask the user to enter �Help� to get a list of the ROYGBIV colors. (6 Points)
[ * ] Ask the user for the user�s number of siblings. (6 Points)

Part 2

For each of the below, you will select your own value for each condition. The table will give the conditions and an example for each.

[ * ] Retirement Years (8 Points)
    The user�s number of years until retirement will be based on whether the user�s age is odd or even.

    (condition) If the user�s age is�	(example) then the user will retire in�
=======
Week One Project for the Spring 2018 WeCanCodeIT cohort. Develop a console application that will tell the userâ€™s fortune based on data received from the user.

Part 1

[ * ] Ask the user for the userâ€™s first name. (6 Points)
[ * ] Ask the user for the userâ€™s last name. (6 Points)
[ * ] Ask the user for the userâ€™s age. (6 Points)
[ * ] Ask the user for the userâ€™s birth month (as an â€˜intâ€™). (6 Points)
[ * ] Ask the user for the userâ€™s favorite ROYGBIV color. (6 Points)
[ * ] If the user does not know what ROYGBIV is, ask the user to enter â€œHelpâ€ to get a list of the ROYGBIV colors. (6 Points)
[ * ] Ask the user for the userâ€™s number of siblings. (6 Points)

Part 2

For each of the below, I selected a value for each condition. The table will give the conditions and the value for each.

[ * ] Retirement Years (8 Points)
    The userâ€™s number of years until retirement will be based on whether the userâ€™s age is odd or even.

    (condition) If the userâ€™s age isâ€¦	(example) then the user will retire inâ€¦
>>>>>>> 6a4d852c5548a460b8594906d8d1dfb6623aadb7
    odd					42 years
    even				21 years

[ * ] Vacation Home Location (8 Points)
<<<<<<< HEAD
    The location of the user�s vacation home will be based on how many siblings the user has. If the user enters a number less than zero, give the user a bad location!

	(condition) If the user�s number of siblings is�	then the user�s vacation home will be in�
=======
      The location of the userâ€™s vacation home will be based on how many siblings the user has. If the user enters a number less than         zero, give the user a bad location!

	(condition) If the userâ€™s number of siblings isâ€¦	then the userâ€™s vacation home will be inâ€¦
>>>>>>> 6a4d852c5548a460b8594906d8d1dfb6623aadb7
	0							Maui, Hawaii
	1							Juno, Alaska
	2							Singapore, Thailand
	3							Brisbane, Australia
	greater than three					Paris, France
	less than zero						Pomeroy, Ohio (Sorry Meigs County :( )
[ * ] Mode of Transporation (8 Points)
<<<<<<< HEAD
    The user�s mode of transportation will determined by the user�s favorite color.

	(condition) If the user�s favorite color is�	then the user�s mode of transportation will be�
=======
      The userâ€™s mode of transportation will determined by the userâ€™s favorite color.

	(condition) If the userâ€™s favorite color isâ€¦	then the userâ€™s mode of transportation will beâ€¦
>>>>>>> 6a4d852c5548a460b8594906d8d1dfb6623aadb7
	red						a Mustang
	orange						bicycle
	yellow						bus
	green						a Prius
	blue						row boat
	indigo						a chariot pulled by corgis
	violet						river barge
[ * ] Bank Balance (8 Points)
<<<<<<< HEAD
    The user�s bank balance at retirement will be based on the user�s birth month. If the user enters something other than 1-12 for birth month, the user�s balance will be $0.00.

	(condition) If the user�s birth month is�	The user�s balance will be�
=======
    The userâ€™s bank balance at retirement will be based on the userâ€™s birth month. If the user enters something other than 1-12 for         birth month, the userâ€™s balance will be $0.00.

	(condition) If the userâ€™s birth month isâ€¦	The userâ€™s balance will beâ€¦
>>>>>>> 6a4d852c5548a460b8594906d8d1dfb6623aadb7
	1-4						$452,396.04
	5-8						$952,396.03
	9-12						$252,397.03
	anything else					$-52.01
Part 3
<<<<<<< HEAD
[ * ] Display the user�s fortune in this format:
=======
[ * ] Display the userâ€™s fortune in this format:
>>>>>>> 6a4d852c5548a460b8594906d8d1dfb6623aadb7

*[First Name]* *[Last Name]* will retire in *[# of years]* with *[bank balance]* in the bank,
a vacation home in *[location]*, and travel by *[mode of transporation]*.
Your program should be able to process input whether a user enters capital or lowercase letters.


Stretch Tasks (Optional)
<<<<<<< HEAD
[ ] Give the user the ability to quit the program by typing �Quit� (should not be case sensitive) at any point where the program is looking for user input. The program should print �Nobody likes a quitter�� before ending.

Tip: To do this with the prompts that expect an integer, you will need to read in a String, check for �Quit�, then use Integer.parseInt(value) to convert the user input to an int.
Also tip: You can call System.exit(0); to terminate your program immediately.


[ * ] Research while (page 115 in the Head Start book) or do/while loops and use them to check whether a user typed �Help� for favorite color, printing the list of colors each time the user types �Help�.
=======
[ ] Give the user the ability to quit the program by typing â€œQuitâ€ (should not be case sensitive) at any point where the program is looking for user input. The program should print â€œNobody likes a quitterâ€¦â€ before ending.

Tip: To do this with the prompts that expect an integer, you will need to read in a String, check for â€œQuitâ€, then use Integer.parseInt(value) to convert the user input to an int.
Also tip: You can call System.exit(0); to terminate your program immediately.
<<<<<<< HEAD
[ * ] Research while (page 115 in the Head Start book) or do/while loops and use them to check whether a user typed “Help” for favorite color, printing the list of colors each time the user types “Help”.
=======
[ ] Research while (page 115 in the Head Start book) or do/while loops and use them to check whether a user typed â€œHelpâ€ for favorite color, printing the list of colors each time the user types â€œHelpâ€.
>>>>>>> 362705006091dcbb2fb8bdbdb001103945ab9428
>>>>>>> 6a4d852c5548a460b8594906d8d1dfb6623aadb7

  What is your favorite ROYGBIV color?
  Help
  The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.
  Help
  The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.
<<<<<<< HEAD
  Blue
=======
  Blue
>>>>>>> 6a4d852c5548a460b8594906d8d1dfb6623aadb7
