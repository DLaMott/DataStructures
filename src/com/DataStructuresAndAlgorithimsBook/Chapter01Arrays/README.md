### Arrays
An array in Java is a group of like-typed variables referred to by a common name.
### Following are some important points about Java arrays. 

- In Java, all arrays are dynamically allocated. (discussed below)
- Since arrays are objects in Java, we can find their length using the object property ***length***. This is different from C/C++, where we find length using sizeof.
- A Java array variable can also be declared like other variables with [] after the data type.
- The variables in the array are ordered, and each has an index beginning from 0.
- Java array can be also be used as a static field, a local variable, or a method parameter.
- The size of an array must be specified by int or short value and not long.
- The direct superclass of an array type is Object.
- Every array type implements the interfaces Cloneable and java.io.serializable.
- The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), or null (for reference types).


<hr/>

### Java Arrays declarations and initialization
Declare first and initialize later:


- int [] numbers = new int[10];

This declares an array object to hold 10 integer numbers (primitive array).

 <hr/> 
 
### When declaring an array of primitive type, remember these rules:

- All numbers are initialized to zeroes by default. That means the above array numbers contain 10 numbers which are all zeroes, even we haven’t initialized the array yet.
- Boolean elements are initialized to false by default.
- Then we initialize values for each element of the array like this:

  - numbers[0] = 10;
  - numbers[1] = 500;
  - numbers[2] = 1000;
  
<hr/>

### The following statement declares an array of String objects:

- String[] names = new String[5];
This array holds 5 String objects. And by default, all elements of Object type are initialized to null.

`NOTE: In Java, you can place the brackets [] either after the type or after the variable name. Hence these declarations are both correct:`

- String[] names = new String[5];
- String titles[] = new String[10];

`However, it’s recommended to use the [] after the type for readability: You can easily realize this is an array of Strings, or that is an array of integer numbers.`

<hr/>

### You can also declare and initialize elements of an array in one statement. For example:


- int[]  numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

This creates an array with 10 integer numbers which are initialized up declaration. This is a handy shortcut for declaring arrays whose elements are already known at compile time.

<hr/>

### This statement declares and initializes an array of Strings:


- String[] columnNames = {“No”, “Name”, “Email”, “Address”};
 
 <hr/>

### Java Multi-dimensional arrays
We can create an array of arrays (2-dimension array). For instance:

- float[][] matrix = new float[5][3];


This creates a 2D array with is equivalent to a matrix of 5 rows and 3 columns.

Another example:
|--------------------------|
|String[][] sampleData = { |
|       {"a", "b", "c", "d"}, |
|        {"e", "f", "g", "h"},|                  
|        {"i", "j", "k", "l"},|
|        {"m", "n", "o", "p"},|              
|    };|
This creates a 4x4 array and initializes all the elements.

We can also create a 3D array, 4D array, etc using the same technique. 

<hr/>

### Arrays Manipulation in Java
We access elements in the array by index (remember 0-based):

- String firstColumn = columnNames[0];


This statement takes value of the first element in the String array columnNamesand assigns it to the variable firstColumn.

<hr/>

### The following statement illustrates accessing an element in a 2D array:

- String[] firstRow = sampleData[0];


This gets the first element in the sampleData array, which returns an array.

### The following statement takes the element at 3rd row and 2nd column in the above 2D array:

- String letter = sampleData[4][3];


And these examples show how to assign values to elements in arrays:
|------------------------------------------------------------------|
|columnNames[2] = “Phone;|
|columnNames[4] = new String(“City”);|
|numbers[4] = 1024;|
|sampleData[4][2] = “xyz”;|

<hr/>

### Loop access
A common operation is iterating an array using a loop statement like the for statement. The following example uses the for loop to iterate over all elements in an array of integer numbers, and prints value of each element:

Example:
|------------------------------------------------|
|int[]  numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; |
|for (int i = 0; i < numbers.length; i++) {| 
|    System.out.println(numbers[i]);|
|}|
 
<hr/>

### For arrays of objects you can use the for eachsyntax to iterate. 

For example:
|-------------------------------------------------------------------------|
|String[] nameList = {"Tom", "Mary", "Peter", "John", "Adam", "Justin"};|
|for (String aName : nameList) {|
|    System.out.println(aName);|
|}|
