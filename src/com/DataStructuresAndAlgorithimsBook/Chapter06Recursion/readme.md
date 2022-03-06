## Recursion

<hr>

<p>
<img src="https://github.com/GothamsJoker/DataStructures/blob/master/images/recursion.png">
</p>


### The idea of calling one function from another immediately suggests the possibility of a function calling itself. The function-call mechanism in Java supports this possibility, which is known as `recursion.`

The `"Hello, World"` for recursion is the factorial function, which is defined for positive integers n by the equation
 - n!=n×(n−1)×(n−2)×…×2×1

<hr/>

### The quantity n! is easy to compute with a for loop, but an even easier method in to use the following recursive function:
example:
|-------------------------------------|
|public static long factorial(int n) { |
  |  if (n == 1) return 1; |
 |   return n * factorial(n-1);| 
|} |

<hr/>

We can trace this computation in precisely the same way that we trace any sequence of function calls.

Example:
|---------------------------|
|factorial(5) |
|   factorial(4)| 
|      factorial(3)| 
|         factorial(2)| 
|            factorial(1) | 
|               return 1 | 
|            return 2*1 = 2 | 
|        return 3*2 = 6 | 
|      return 4*6 = 24|  
|    return 5*24 = 120|


Our factorial() implementation exhibits the two main components that are required for every recursive function.

The `base case` returns a value without making any subsequent recursive calls. It does this for one or more special input values for which the function can be evaluated without recursion. For factorial(), the base case is` n = 1.`


The reduction step is the central part of a recursive function. It relates the value of the function at one (or more) input values to the value of the function at one (or more) other input values. Furthermore, the sequence of input values values must converge to the base case. For factorial(), the value of n decreases by 1 for each call, so the sequence of input values converges to the base case.

<hr/>


### Mathematical induction.

Recursive programming is directly related to mathematical induction, `a technique for proving facts about natural numbers.` Proving that a statement involving an integer n is true for infinitely many values of n by mathematical induction involves the following two steps:
- The base case: prove the statement true for some specific value or values of n (usually 0 or 1).
- The induction step: assume that the statement to be true for all positive integers less than n, then use that fact to prove it true for n.


Such a proof suffices to show that the statement is true for infinitely many values of n: we can start at the base case, and use our proof to establish that the statement is true for each larger value of n, one by one.

<hr/>

### Pitfalls of recursion. 

With recursion, you can write compact and elegant programs that fail spectacularly at runtime.
 - Missing base case. 
 - No guarantee of convergence. 
 - Excessive memory requirements. 
    - If a function calls itself recursively an excessive number of times before returning, the memory required by Java to keep track of the recursive calls may be prohibitive. leading to a StackOverflowError.
 - Excessive recomputation. 

[Credit](https://introcs.cs.princeton.edu/java/23recursion/)

