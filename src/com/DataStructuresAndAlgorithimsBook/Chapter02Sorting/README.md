## Common sorting methods:

<hr>

### Bubblesort
Bubble sort is implemented by starting a sort where the smallest element is placed at the start of an array and the largest is placed at the end a.length-1. 
The outer loop starts at the end of an array if items are greater than OUT will be sorted. The inner loop starts at the beginning of an array exiting when out is reached. 
in and in+1 are compared and swapped if "in" is greater than "in+1". Bubble sort is slow and inefficient for large arrays. 
O(n2) speed.

<hr>

### Insertion sort
Insertion sort partially sorts an array up to a marked point. After the marked point is created the array will be compared to elements to the right of the marked point.
Elements will then be inserted into the sorted portion of the array based on whether the marked element is greater or lesser then elements compared.

<hr>

### Selection sort
 The selection sort by comparision is faster than the bubble sort. Selection sorting still holds O(N2) speed. For sorting a min counter is implemented. 
 This minimum value is changed as a smaller element is found. The new smaller element is then pushed to the start of the array.

<hr>

<p> 
<img src="https://github.com/GothamsJoker/DataStructures/blob/master/images/Sorting.png">
</p>
