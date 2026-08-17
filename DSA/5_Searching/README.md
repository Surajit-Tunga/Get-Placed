# Searching

- Searching is the fundamental process of locating a specific element or item within a collection of data. 
- This collection of data can take various forms, such as arrays, lists, trees, or other structured representations.

## Types of Searching Algorithms:

                    ┌──────────────────────┐
                    │ Searching Algorithms │
                    └──────────┬───────────┘
                               │
                 ┌─────────────┴───────────────┐
                 ▼                             ▼
       ┌─────────────────┐            ┌─────────────────┐
       │ Core Algorithms │            │ Other Algorithms│
       └────────┬────────┘            └────────┬────────┘
                │                              │
          ┌─────┴─────┐        ┌──────┬────────┼─────────────┬─────────┐
          ▼           ▼        ▼      ▼        ▼             ▼         ▼
       Linear      Binary   Ternary Jump  Interpolation Fibonacci Exponential
       Search      Search   Search Search    Search      Search     Search
---
## Linear Search: 

- The Linear Search Algorithm, iterate over all the elements and check if it the current element is equal to the target element. If we find any element to be equal to the target element, then return the index of the current element. Otherwise, if no element is equal to the target element, then return -1 as the element is not found. 
- Works on both sorted and unsorted data.
- Linear search is also known as sequential search.

**Example:** 
```text
Input: arr[] = [1, 2, 3, 4], x = 3
Output: 2
Explanation: There is one test case with array as [1, 2, 3 4] and element to be searched as 3. Since 3 is present at index 2, the output is 2.

Input: arr[] = [10, 8, 30], x = 6
Output: -1
Explanation: The element to be searched is 6 and its not present, so we return -1.
```
**Program:** JAVA

```java
public class Main{
    
    public static int linearSearch(int arr[], int n){

        int N = arr.length;

        for (int i = 0; i<N; i++){
            if(arr[i]==n){
                return i;
            }
        }  

        return -1;     
    }

    public static void main(String[] args){
        
        int arr[]= {1,2,3,5,8};
        int n =100;

        System.out.print(linearSearch(arr,n));
    }
}
```

**Complexity:**

- Time Complexity: O(N)  [Best Case: O(1) & Worst Case: O(N) ]
- Space Complexity: O(1)

---

## Binary Search:

- It works on only Sorted Data. 
- It works by repeatedly dividing the data into halves to find a target value.

**Algorithm:**
```text
Divide the search space into two halves by finding the middle index "mid". 
Compare the middle of the search space with the key. 
If the key is found at middle, the process is terminated.
If the key is not found at middle, choose which half will be used as the next search space.
-> If the key is smaller than the middle, then the left side is used for next search.
-> If the key is larger than the middle, then the right side is used for next search.
This process is continued until the key is found or the total search space is exhausted.
```

**Program:** JAVA

```java
public class Main{
    public static int binarySearch(int arr[], int n){

        int N = arr.length;
        int low = 0;
        int high = N-1;
      
        while(low<=high){
              int mid = (low+high)/2;
              if(arr[mid]==n){
                return mid;
              } else if(arr[mid]>n){
                high = mid-1;
              } else if(arr[mid]<n){
                low = mid+1;
              }
        }
        return -1;       
    }

    public static void main(String[] args){
       
        int arr[]= {1,2,3,5,8};
        int n =100;

        System.out.print(binarySearch(arr,n));
    }
}
```
**Complexity:**

- Time(log(N))  [Best Case: O(1) Worst Case: (log(N))]
- Space: O(1)


**Other Safer Logic to calculate Mid:**
```java
int mid = low + (high - low) / 2;   // 0 + (5-0)/2 = 2 OR  3 + (5-3)/2 = 4
```
Reason:

```text
low  = 2,000,000,000
high = 2,100,000,000

low + high = 4,100,000,000  ❌ exceeds int range
```

**Using Recursion:** 

```java
public class Main{
    public static int binarySearch(int arr[], int low, int high, int n){

        if(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid]==n){
                return mid;
              } else if(arr[mid]>n){
                return binarySearch(arr, low, mid-1,n);
              } else if(arr[mid]<n){
                return binarySearch(arr,mid+1,high,n);
              }  
        }
        
        return -1;       
    }

    public static void main(String[] args){
       
        int arr[]= {1,2,3,5,8};
        int n =100;
        int N = arr.length;

        System.out.print(binarySearch(arr,0,N-1,n));
    }
}
```
---