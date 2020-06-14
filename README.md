# SortingAlgos
 A collection of 10 commonly used sorting algorithms implemented in Java.

1. Bubble Sort
2. Selection Sort
3. Insertion Sort
4. Merge Sort
5. Quick Sort
6. Heap Sort
7. Counting Sort
8. Shell Sort
9. Radix Sort
10. Bucket Sort

Note: We will see sorting algorithms to sort in ascending order.

### 1. Bubble Sort
##### Intuition: 
**Bubble the largest of the two elements towards the end of the array.** 
Repeat the bubbling process for all the elements.
Decrement the pointer to the end of the array by one and start over. Stop when end pointer is at first element.

##### Use case
Never used. Just for learning purposes.

##### Time Complexity: 
O(n^2)

### 2. Selection Sort
##### Intuition:
**Select the smallest element in the array and move it to start of the array.**
Increment the pointer to the start of array by one and start over. Stop when start pointer is at last element.

##### Use case
Better than bubble sort. Time complexity is invarient of the order of elements in the input array.
Why? We have to go through all the elements anyway to select the smallest element in the unsorted part of the array.

##### Time Complexity: 
O(n^2)

### 3. Insertion Sort
##### Intuition: 
**Insert a new element at an appropriate place in the section of already sorted elements.** Image you are holding some playing cards which are already sorted. Now imagine taking out a card from a deck of playing cards. Put it in appropriate place in the cards in your hands.

##### Use case
**If the input array is partially sorted or array size is small.**
Why? In case of partially sorted array, we can skip the inner loop where we move larger element to make space for the new smaller element. Hence the time complexity in this case becomes nearly O(n).

##### Time Complexity: 
O(n^2)

### 4. Merge Sort
##### Intuition: 

##### Time Complexity: 

### 5. Quick Sort
##### Intuition: 
**Quick sort revolved around finding a pivot and balancing lesser elements to left side and greater elements to right side.**
We sort in two phases: 
1. partition : find the pivote, 
2. sort: sort left side of pivot and sort right side of pivot (recursively).
As the name pivot suggests, the pivot's position remains fixed after every call to partition.

##### Time Complexity: 

### 6. Heap Sort
##### Intuition: 

##### Time Complexity: 
### 7. Counting Sort
##### Intuition: 

##### Time Complexity: 
### 8. Shell Sort
##### Intuition: 

##### Time Complexity: 
### 9. Radix Sort
##### Intuition: 

##### Time Complexity: 
### 10. Bucket Sort
##### Intuition: 

##### Time Complexity: 
