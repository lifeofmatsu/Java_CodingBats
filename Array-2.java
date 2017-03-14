//countEvens
//Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

//countEvens([2, 1, 2, 3, 4]) → 3
//countEvens([2, 2, 0]) → 3
//countEvens([1, 3, 5]) → 0

public int countEvens(int[] nums) {
  int count = 0;
  for(int i: nums) {
    if(i % 2 == 0) {
      count++;
    }
  }
  return count;
}

---------------------------------------------------------------------------------------------------------------------------

//bigDiff
//Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. 
//Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

//bigDiff([10, 3, 5, 6]) → 7
//bigDiff([7, 2, 10, 9]) → 8
//bigDiff([2, 10, 7, 2]) → 8

public int bigDiff(int[] nums) {
  int largest = 0;
  for(int i: nums) {
    if(i > largest) {
      largest = i;
    }
  }
  int smallest = largest;
  for(int j: nums) {
    if(j < smallest) {
      smallest = j;
    }
  }
  return largest - smallest;
}

---------------------------------------------------------------------------------------------------------------------------

//centeredAverage
//Return the "centered" average of an array of ints, which we'll say is the mean average of the values, 
//except ignoring the largest and smallest values in the array. 
//If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. 
//Use int division to produce the final average. You may assume that the array is length 3 or more.

//centeredAverage([1, 2, 3, 4, 100]) → 3
//centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
//centeredAverage([-10, -4, -2, -4, -2, 0]) → -3

public int centeredAverage(int[] nums) {
  int result = 0;
  int largest = nums[0];
  int smallest = nums[0];
  
  for(int i: nums) {
    result += i;
    
    if(i > largest) {
      largest = i;
    }
    if(i < smallest) {
      smallest = i;
    }
  }
  result -= (largest + smallest);
  return result /= (nums.length - 2);
}

---------------------------------------------------------------------------------------------------------------------------

//sum13
//Return the sum of the numbers in the array, returning 0 for an empty array. 
//Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

//sum13([1, 2, 2, 1]) → 6
//sum13([1, 1]) → 2
//sum13([1, 2, 2, 1, 13]) → 6

public int sum13(int[] nums) {
  int sum = 0;
  if(nums.length == 0) {
    sum = sum;
  }
  else{
  for(int i = 0; i < nums.length - 1; i++) {
    if(nums[i] == 13) {
      sum = sum;
      nums[i + 1] = 0;
    } else {
      sum += nums[i];
    }
  }
  
  if(nums[nums.length - 1] != 13)
      sum += nums[nums.length - 1];}
   return sum;
}

---------------------------------------------------------------------------------------------------------------------------

//sum67
//Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and 
//extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

//sum67([1, 2, 2]) → 5
//sum67([1, 2, 2, 6, 99, 99, 7]) → 5
//sum67([1, 1, 6, 7, 2]) → 4

public int sum67(int[] nums) {
  int sum = 0;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] != 6) {
      sum += nums[i];
    } else {
      while (nums[i] != 7) {
        i++;
      }
    }
  }
  return sum;
}

---------------------------------------------------------------------------------------------------------------------------

//has22
//Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

//has22([1, 2, 2]) → true
//has22([1, 2, 1, 2]) → false
//has22([2, 1, 2]) → false

public boolean has22(int[] nums) {
  boolean doubleTwo = false;
  for(int i = 0; i < nums.length - 1; i++) {
    if(nums[i] == 2 && nums[i + 1] == 2) {
      doubleTwo = true;
    }
  }
  return doubleTwo;
}

---------------------------------------------------------------------------------------------------------------------------

//lucky13
//Given an array of ints, return true if the array contains no 1's and no 3's.

//lucky13([0, 2, 4]) → true
//lucky13([1, 2, 3]) → false
//lucky13([1, 2, 4]) → false

public boolean lucky13(int[] nums) {
  for(int i: nums) {
    if(i == 1 || i == 3)
    return false;
  }
  return true;
}

---------------------------------------------------------------------------------------------------------------------------

//sum28
//Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

//sum28([2, 3, 2, 2, 4, 2]) → true
//sum28([2, 3, 2, 2, 4, 2, 2]) → false
//sum28([1, 2, 3, 4]) → false

public boolean sum28(int[] nums) {
  int twoCount = 0;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 2) {
      twoCount++;
    }
  }
  if(twoCount * 2 == 8) {
    return true;
  } else {
    return false;
  }
}

---------------------------------------------------------------------------------------------------------------------------

//more14
//Given an array of ints, return true if the number of 1's is greater than the number of 4's

//more14([1, 4, 1]) → true
//more14([1, 4, 1, 4]) → false
//more14([1, 1]) → true

public boolean more14(int[] nums) {
  int fourCount = 0;
  int oneCount = 0;
  for(int element: nums) {
    if(element == 4) {
      fourCount++;
    } else if(element == 1) {
      oneCount++;
    }
  }
  if(oneCount > fourCount) {
    return true;
  } else {
    return false;
  }
}

---------------------------------------------------------------------------------------------------------------------------

//fizzArray
//Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. 
//The given n may be 0, in which case just return a length 0 array. 
//You do not need a separate if-statement for the length-0 case; 
//the for-loop should naturally execute 0 times in that case, so it just works. 
//The syntax to make a new int array is: new int[desired_length]   (See also: FizzBuzz Code)

//fizzArray(4) → [0, 1, 2, 3]
//fizzArray(1) → [0]
//fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

public int[] fizzArray(int n) {
  int [] array = new int [n];
  for(int i = 0; i < n; i++) {
    array[i] = i;
  }
  return array;
}

---------------------------------------------------------------------------------------------------------------------------

//only14
//Given an array of ints, return true if every element is a 1 or a 4.

//only14([1, 4, 1, 4]) → true
//only14([1, 4, 2, 4]) → false
//only14([1, 1]) → true

public boolean only14(int[] nums) {
  int count = 0;
  for(int element: nums) {
    if(element != 4 && element != 1) {
      count++;
    }
  }
  if(count > 0) {
    return false;
  } else {
      return true;

  }
}

---------------------------------------------------------------------------------------------------------------------------

//fizzArray2
//Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. 
//N may be 0, in which case just return a length 0 array. 
//Note: String.valueOf(xxx) will make the String form of most types. 
//The syntax to make a new string array is: new String[desired_length]  (See also: FizzBuzz Code)

//fizzArray2(4) → ["0", "1", "2", "3"]
//fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
//fizzArray2(2) → ["0", "1"]

public String[] fizzArray2(int n) {
   String [] array2 = new String[n];
  for(int i = 0; i < n; i++) {
    array2[i] = String.valueOf(i);
  }
  return array2;
}

---------------------------------------------------------------------------------------------------------------------------

//no14
//Given an array of ints, return true if it contains no 1's or it contains no 4's.

//no14([1, 2, 3]) → true
//no14([1, 2, 3, 4]) → false
//no14([2, 3, 4]) → true

public boolean no14(int[] nums) {
  int one = 0;
  int four = 0;
  for(int element: nums) {
    if(element == 1) {
      one++;
    }
    if(element == 4) {
      four++;
    }
  }
  if(one == 0) {
    return true;
  } else if(four == 0) {
    return true;
  } else {
    return false;
  }
}

---------------------------------------------------------------------------------------------------------------------------

//shiftleft
//Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. 
//You may modify and return the given array, or return a new array.

//shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
//shiftLeft([1, 2]) → [2, 1]
//shiftLeft([1]) → [1]

public int[] shiftLeft(int[] nums) {
  if(nums.length == 0 || nums.length == 1) {
    return nums;
  }
  int temp = nums[0];
  for(int i = 0; i < nums.length - 1; i++) {
    nums[i] = nums[i + 1];
  }
  nums[nums.length - 1] = temp;
  return nums;
}

---------------------------------------------------------------------------------------------------------------------------

/*
For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, 
until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
*/
  
public int[] tenRun(int[] nums) {
  int value = -1;
  int[] array = new int[nums.length];
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] % 10 == 0) {
      value = nums[i];
      array[i] = value;
    } else if(value == -1) {
      array[i] = nums[i];
    } else {
      array[i] = value;
    }
  }
  return array;
}

---------------------------------------------------------------------------------------------------------------------------
  
/*
Given a non-empty array of ints, return a new array containing the elements from the original array that come before the 
first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create 
an array of length 0.

pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]
*/
  
public int[] pre4(int[] nums) {
  int count = 0;
  for(int i: nums) {
    if(i == 4) break;
    count++;
  }
  int [] array = new int [count];
  for(int i = 0; i < count; i++) {
    array[i] = nums[i];
  }
  return array;
}

---------------------------------------------------------------------------------------------------------------------------
  
/*
Given a non-empty array of ints, return a new array containing the elements from the original array that come after 
the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to 
create an array of length 0.

post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
*/
  
public int[] post4(int[] nums) {
  int last4 = 0;
  for (int i = nums.length - 1; i >= 0; i--) {
    if (nums[i] == 4) {
      last4 = i;
      break;
    }
  }
  int[] temp = new int[nums.length - 1 - last4];
  int ctr1 = 0;
  for (int i = last4 + 1; i < nums.length; i++){
    temp[ctr1] = nums[i];
    ctr1++;
  }
  return temp;
}

---------------------------------------------------------------------------------------------------------------------------
  
/*
We'll say that an element in an array is "alone" if there are values before and after it, and those values are different 
from it. Return a version of the given array where every instance of the given value which is alone is replaced 
by whichever value to its left or right is larger.

notAlone([1, 2, 3], 2) → [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) → [3, 4]
*/
  
public int[] notAlone(int[] nums, int val) {
  for (int i = 1; i < nums.length - 1; i++)
    if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val)
      nums[i] = Math.max(nums[i - 1], nums[i + 1]);
    return nums;
}

---------------------------------------------------------------------------------------------------------------------------
  
/*
Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped 
at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. 
You may modify and return the given array or make a new array.

zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]
*/
  
public int[] zeroFront(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 0) {
      nums[i] = nums[count];
      nums[count] = 0;
      count++;
    }
  }
  return nums;
}

---------------------------------------------------------------------------------------------------------------------------
  
/*
Return a version of the given array where all the 10's have been removed. The remaining elements should shift left towards 
the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields 
{1, 2, 0, 0}. You may modify and return the given array or make a new array.

withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]
*/
  
public int[] withoutTen(int[] nums) {
  int [] a = new int[nums.length];
  int count = 0;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] != 10) {
      a[count] = nums[i];
      count++;
    }
  }
  for(int i = count; i < nums.length; i++) {
    a[i] = 0;
  }
  return a;
}

---------------------------------------------------------------------------------------------------------------------------
  
/*
Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of 
the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.

zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
*/
  
public int[] zeroMax(int[] nums) {
  int maxOdd = -1;
  for (int i = nums.length - 1; i >= 0; i--) {
    if (nums[i] != 0) {
      if ((nums[i] >= maxOdd) && (nums[i] % 2 == 1)){
        maxOdd = nums[i];
      }
    } else {
      if (maxOdd != -1) {
        nums[i] = maxOdd;
      }
    }
  }
  return nums;
}

---------------------------------------------------------------------------------------------------------------------------
  
/*
Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come 
before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, 
or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
*/
  
public int[] evenOdd(int[] nums) {
  int [] a = new int[nums.length];
  int count = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] % 2 == 0) {
      a[count] = nums[i];
      count++;
    }
  }
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] % 2 != 0) {
      a[count] = nums[i];
      count++;
    }
  }
  return a;
}

---------------------------------------------------------------------------------------------------------------------------
  
/*
This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for 
job interviews. (See also: FizzBuzz Code.) Consider the series of numbers beginning at start and running up to but not 
including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the 
string form of these numbers, except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", 
and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int or other 
type. This version is a little more complicated than the usual version since you have to allocate and index into an array 
instead of just printing, and we vary the start/end instead of just always doing 1..100.

fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
*/
  
public String[] fizzBuzz(int start, int end) {
  String [] fb = new String[end - start];
  int count = 0;
  
  for(int i = start; i < end; i++) {
    if(i % 3 == 0 && i % 5 == 0) 
      fb[count] = "FizzBuzz";
    else if(i % 3 == 0) 
      fb[count] = "Fizz";
    else if(i % 5 == 0) 
      fb[count] = "Buzz";
    else 
      fb[count] = String.valueOf(i);
    count++;
  }
  return fb;
}

---------------------------------------------------------------------------------------------------------------------------
