//doubleChar
//Given a string, return a string where for every char in the original, there are two chars.

//doubleChar("The") → "TThhee"
//doubleChar("AAbb") → "AAAAbbbb"
//doubleChar("Hi-There") → "HHii--TThheerree"

public String doubleChar(String str) {
  int count = 0;
  int length = str.length();
  String doubled = "";
  for (int i = 0; i < length; i++) {
  char ch = str.charAt(count);
  doubled += ch;
  doubled += ch;
  count++;
  }
  return doubled;
}

----------------------------------------------------------------------------------------------------------------------------

//countHi
//Return the number of times that the string "hi" appears anywhere in the given string.

//countHi("abc hi ho") → 1
//countHi("ABChi hi") → 2
//countHi("hihi") → 2

public int countHi(String str) {
  int count = 0;
  int length = str.length();
  for (int i = 0; i < length-1; i++) {
      if ((str.charAt(i) == 'h') && (str.charAt(i+1) == 'i')) {
        count++;
      } 
  }
  return count;
}

----------------------------------------------------------------------------------------------------------------------------

//catDog
//Return true if the string "cat" and "dog" appear the same number of times in the given string.

//catDog("catdog") → true
//catDog("catcat") → false
//catDog("1cat1cadodog") → true

public boolean catDog(String str) {
  int dog = 0;
  int cat = 0;
  for (int i = 0; i < str.length() - 2; i++) {
    if(str.substring(i,i+3).equals("cat")) {
     cat++;
    }
    if(str.substring(i,i+3).equals("dog")) {
     dog++;
    }
  }
  if (dog == cat) return true;
  else return false;
}

----------------------------------------------------------------------------------------------------------------------------

//countCode
//Return the number of times that the string "code" appears anywhere in the given string, 
//except we'll accept any letter for the 'd', so "cope" and "cooe" count.

//countCode("aaacodebbb") → 1
//countCode("codexxcode") → 2
//countCode("cozexxcope") → 2

public int countCode(String str) {
  int code = 0;
  for (int i = 0; i < str.length() - 3; i++) {
    if (str.substring(i,i+2).equals("co") && str.charAt(i+3) == 'e') {
      code++;
    }
  }
  return code;
}

----------------------------------------------------------------------------------------------------------------------------

//endother
//Given two strings, return true if either of the strings appears at the very end of the other string, 
//ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 
//Note: str.toLowerCase() returns the lowercase version of a string.

//endOther("Hiabc", "abc") → true
//endOther("AbC", "HiaBc") → true
//endOther("abc", "abXabc") → true

public boolean endOther(String a, String b) {
  int one = a.length();
  int two = b.length();
  if (one <= two) { 
    return (b.toLowerCase().substring(two-one, two).equals(a.toLowerCase())); 
  }
  else {
    return(a.toLowerCase().substring(one-two, one).equals(b.toLowerCase())); 
  }
}

----------------------------------------------------------------------------------------------------------------------------

//xyzThere
//Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). 
//So "xxyz" counts but "x.xyz" does not.

//xyzThere("abcxyz") → true
//xyzThere("abc.xyz") → false
//xyzThere("xyz.abc") → true

public boolean xyzThere(String str) {
  str = str.replace(".xyz", "");
  for(int i = 0; i < str.length() - 2; i++) {
    if(str.substring(i, i + 3).equals("xyz")) {
      return true;
    }
  }
  return false;
}

----------------------------------------------------------------------------------------------------------------------------

//bobThere
//Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

//bobThere("abcbob") → true
//bobThere("b9b") → true
//bobThere("bac") → false

public boolean bobThere(String str) {
  if (str.length() < 3) {
    return false;
  //} else if (str.equals("bbc")) {
    //return false;
  } else {
      for(int i = 0; i < str.length() - 2; i++) {
        if((str.charAt(i) == 'b') && (str.charAt(i+2) == 'b')) {
          return true;
        }
      }
  }
  return false;
}

----------------------------------------------------------------------------------------------------------------------------

//xyBalance
//We'll say that a String is xy-balanced if for all the 'x' chars in the string, 
//there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. 
//One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

//xyBalance("aaxbby") → true
//xyBalance("aaxbb") → false
//xyBalance("yaaxbb") → false

public boolean xyBalance(String str) {
  for(int i = str.length()-1; i >= 0; i--) {
    if(str.charAt(i) == 'x') {
      return false;
    }
    if(str.charAt(i) == 'y') {
      return true;
    }
  }
  return true;
}

----------------------------------------------------------------------------------------------------------------------------

//mixString
//Given two strings, a and b, create a bigger string made of the first char of a, 
//the first char of b, the second char of a, the second char of b, and so on. 
//Any leftover chars go at the end of the result.

//mixString("abc", "xyz") → "axbycz"
//mixString("Hi", "There") → "HTihere"
//mixString("xxxx", "There") → "xTxhxexre"

public String mixString(String a, String b) {
  String added = "";
  int minimum = 0;
  if(a.length() < b.length()) {
    minimum = a.length();
    for (int i = 0; i < minimum; i++) {
      added += "" + a.charAt(i) + b.charAt(i);
    }
    return added + b.substring(a.length());
  } else {
    minimum = b.length();
    for (int i = 0; i < minimum; i++) {
      added += "" + a.charAt(i) + b.charAt(i);
    }
    return added + a.substring(b.length());
  }
}

----------------------------------------------------------------------------------------------------------------------------

//repeatEnd
//Given a string and an int n, return a string made of n repetitions of the last n characters of the string. 
//You may assume that n is between 0 and the length of the string, inclusive.

//repeatEnd("Hello", 3) → "llollollo"
//repeatEnd("Hello", 2) → "lolo"
//repeatEnd("Hello", 1) → "o"

public String repeatEnd(String str, int n) {
  String added = "";
  for(int i = 0; i < n; i++) {
    added += str.substring(str.length() - n);
  }
  return added;
}

----------------------------------------------------------------------------------------------------------------------------

//repeatFront
//Given a string and an int n, return a string made of the first n characters of the string, 
//followed by the first n-1 characters of the string, and so on. 
//You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

//repeatFront("Chocolate", 4) → "ChocChoChC"
//repeatFront("Chocolate", 3) → "ChoChC"
//repeatFront("Ice Cream", 2) → "IcI"

public String repeatFront(String str, int n) {
  String temp = "";
  for(int i = n; i > 0; i--) {
    temp += str.substring(0, i);
  }
  return temp;
}

----------------------------------------------------------------------------------------------------------------------------

//repeatSeparator
//Given two strings, word and a separator sep, return a big string made of count occurrences of the word, 
//separated by the separator string.

//repeatSeparator("Word", "X", 3) → "WordXWordXWord"
//repeatSeparator("This", "And", 2) → "ThisAndThis"
//repeatSeparator("This", "And", 1) → "This"

public String repeatSeparator(String word, String sep, int count) {
  String temp = "";
  
  if(count == 0) {
    return temp;
  }
  
  for(int i = 0; i < count - 1; i++) {
    temp += word + sep;
  }
  temp += word;
  return temp;
}

----------------------------------------------------------------------------------------------------------------------------

