# Check if an Array is Sorted: 

- Given an array arr[], check if it is sorted in ascending order or not. Equal values are allowed in an array and two consecutive equal values are considered sorted.
```text
Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.

Input: arr[] = [90, 80, 100, 70, 40, 30]
Output: false
Explanation: The given array is not sorted.
```

**Solution-Java:**

```java
public class Main{
    public static boolean isSorted(int arr[], int n){
        for (int i=0; i<n-1;i++){
            if(arr[i]<= arr[i+1]){
                continue;
            } else {
                return false; 
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("Program to Check if an Array is Sortedin ascending order or not.");

        int arr[] = {10,20,30,40,50};
        int n = arr.length;

        System.out.println(isSorted(arr,n));
        

    }
}
```

**Or the logic can be written as:**

```java
public static boolean isSorted(int arr[],int n){
    for (int i = 1; i<n; i++){
        if(arr[i]<arr[i-1]){
            return false;
        }
    }
    return true;
}
```

**Complexity:**

Time Complexity: O(n)
Space Complexity: O(1) 

---