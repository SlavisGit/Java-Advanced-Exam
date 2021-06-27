1. OSPlanning problem description: 
On the first line you will be given some tasks as integer values, separated by comma and space ", ". On the second line you will be given some threads as integer values, separated by a single space. On the third line, you will receive the integer value of a task that you need to kill. Your job is to stop the work of the OS as soon as you get to this task, otherwise your OS will crash. The thread that gets first to this task, kills it.
The OS works in the following way:
•	It takes the first given thread value and the last given task value.
•	If the thread value is greater than or equal to the task value, the task and thread get removed.
•	If the thread value is less than the task value, the thread gets removed, but the task remains.
After you finish the needed task, print on a single line:
"Thread with value {thread} killed task {taskToBeKilled}"
Then print the remaining threads (including the one that killed the task) starting from the first on a single line, separated by a single space

2. Python problem description:
The game starts with a python length of 1.
We get as input the size of the screen in which our python moves. The screen is always a square. After that we receive the commands wich represent the directions in wich the python should move.The python starts from s-position The commands will be: left/right/up/down. If the python reaches the side edge of the screen (left or right), it goes to the opposite side of the same row. If the python reaches the top/bottom edge of the screen it goes on the opposite side of the same column . The possible characters that may appear on the screeen are:
•	*– that is a regular asterisk; it does nothing
•	e – represents an enemy. 
•	f – this is the food
•	s - the place where the game starts

Each time you eat a piece of food your length increases by one. Keep track of the length, because in case you win you have to print it. If you step on an enemy the game is over (the python stops moving) and you have to print the output as shown in the output section. After executing all of the commands there are 3 possible outcomes:
•	you have eaten all the food and you win
•	you get killed by an enemy
•	there is still some food to be eaten
Print the corresponding output depending on the case.

3. Grooming Saloon problem description
First, write a Java class Pet with the following fields:
•	name: String
•	age: int
•	owner: String
The class constructor should receive all fields.  You need to create the appropriate getters and setters. The class should override the toString() method in the following format:
"{name} {age} - ({owner})"
Next, write a Java class GroomingSalon that has data (a collection, which stores the Pets). All entities inside the repository have the same fields. Also, the GroomingSalon class should have those fields:
•	capacity: int
The class constructor should receive capacity, also it should initialize the data with a new instance of the collection. Implement the following features:
•	Field data – List that holds added pets
•	Method add(Pet pet) – adds an entity to the data if there is an empty place in the grooming salon for the pet.
•	Method remove(String name) – removes the pet by given name, if such exists, and returns boolean.
•	Method getPet(String name, String owner) – returns the pet with the given name and owner or null if no such pet exists.
•	Getter getCount – returns the number of pets.
•	getStatistics() – returns a String in the following format:
o	" The grooming salon has the following clients:
{name} {owner}
{name} {owner} 
   (…)"
