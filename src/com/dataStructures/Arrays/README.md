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
