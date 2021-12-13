# AL_FrogHats
* Team FrogHats
* Jacob Ng Kevin Cheng Hamim Seam

# ALTester
In the main method, an ArrayList named Bob gets created and filled with 23 different Integers.
To check if the ArrayList is sorted, the program starts from the left and compares the Integer with the one to its right.
If the current Integer is greater than the one to the right, the program stops and returns false. 
It keeps going until it has compared the second to last Integer to the last one, and in that case returns true.

# OrderedArrayList
* add()
	* There are two different cases when using add():

The array is empty:
The Integer gets added on without making any comparisons. 

The array has some numbers inside:
Starting from the right, the add Integer compares itself with the Integers in the list.
If the array's Integer is greater than the add Integer, the array's Integer copies itself into the slot to the right.
This keeps occurring until the array's Integer is less than or equal to the add Integer.
When this happens, the last array's Integer that's greater will copy itself, and the add Integer will be stored to the left of the copied Integer.
