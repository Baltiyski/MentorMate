# Green vs. Red
Game conditions:

Each cell on this grid can be either green (represented by 1) or red (represented by 0). The game always recive an initial state of the grid which we will call 'Generation Zero'. After that a set of 4 rules are aplplied across the grid and those rules form the next generation.

Rules that create the next generation:

	1. Each red cell that is surrounded by exactly 3 or exactly 6 green cells will also become green in the next generation.
	2. A red cell will stay red in the next generation if it has either 0,1,2,4,5,7 or 8 green neighbours.
	3. Each green cell surrounded by 0,1,4,5,7 or 8 green neighbours will become red in the next generation.
	4. A green cell will stay green in the next generation if it has either 2, 3 or 6 green neighbours.
	
Important facts:

	- Each cell can be surroinded by up to 8 cells. 4 on the sides and 4 on the corners. Exceptions are the corners and the sides of the gird.
	- All the 4 rules apply at the same time for the whole grid in order for the next generation to be formated.

Task:

	Create a program that accepts:
	The size of our grid - x,y (x being the width and y being the height)
	Then the next y lines should contain strings (long x characters) created by 0s and 1s which will represent the 'Generation Zero' state and help us build the grid.
	The last aruguments to the program should be cooridnates (x1 and y1) and the number N.
	
(x1 and y1) will be coordinates of a cell in the grid. We would like to calculate in how many generations from Generation Zero until generation N this cell was green. ( The calculation should include Generation Zero and generation N)