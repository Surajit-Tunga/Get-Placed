# Generating All Subarrays

- Given an array arr[], the task is to generate all the possible subarrays of the given array.

**Examples:** 
```text
Input: arr[] = [1, 2, 3]
Output: [ [1], [1, 2], [2], [1, 2, 3], [2, 3], [3] ]

Input: arr[] = [1, 2]
Output: [ [1], [1, 2], [2] ]
```

**Solution:** JAVA

```java
public class Main{

    public static void getSubarrays (int [] arr){

        int n = arr.length;

        for (int i = 0; i < n; i ++) {
            for (int j = i; j < n; j++){
                System.out.print("[");
                for (int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.print("],");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){

        int[] arr = {1,2,3};

        getSubarrays(arr);
    }
}
```

**Output:**

```text
[1 ],[1 2 ],[1 2 3 ],
[2 ],[2 3 ],
[3 ],
```

**Complexity:**

- Time: O(n3)
- Space: O(1)

---