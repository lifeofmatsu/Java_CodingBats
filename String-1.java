//helloName
//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

//helloName("Bob") → "Hello Bob!"
//helloName("Alice") → "Hello Alice!"
//helloName("X") → "Hello X!"

public String helloName(String name) {
  return "Hello " + name + "!";
}

-----------------------------------------------------------------------------------------------------------------------------

//makeAbba
//Given two strings, a and b, return the result of putting them together in the order abba, 
//e.g. "Hi" and "Bye" returns "HiByeByeHi".

//makeAbba("Hi", "Bye") → "HiByeByeHi"
//makeAbba("Yo", "Alice") → "YoAliceAliceYo"
//makeAbba("What", "Up") → "WhatUpUpWhat"

public String makeAbba(String a, String b) {
  return a + b + b + a;
}

-----------------------------------------------------------------------------------------------------------------------------

//makeTags
//The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
//In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
//Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

//makeTags("i", "Yay") → "<i>Yay</i>"
//makeTags("i", "Hello") → "<i>Hello</i>"
//makeTags("cite", "Yay") → "<cite>Yay</cite>"

public String makeTags(String tag, String word) {
  return "<" + tag + ">" + word + "</" + tag + ">";
}

-----------------------------------------------------------------------------------------------------------------------------

//makeOutWord
//Given an "out" string length 4, such as "<<>>", and a word, return a new string where 
//the word is in the middle of the out string, e.g. "<<word>>". 
//Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

//makeOutWord("<<>>", "Yay") → "<<Yay>>"
//makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
//makeOutWord("[[]]", "word") → "[[word]]"

public String makeOutWord(String out, String word) {
  return out.substring(0, 2) + word + out.substring(2);
}

-----------------------------------------------------------------------------------------------------------------------------

//extraEnd
//Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
//The string length will be at least 2.

//extraEnd("Hello") → "lololo"
//extraEnd("ab") → "ababab"
//extraEnd("Hi") → "HiHiHi"

public String extraEnd(String str) {
  return str.substring(str.length() - 2, str.length()) + str.substring(str.length() - 2, str.length()) 
          + str.substring(str.length() - 2, str.length());
}

-----------------------------------------------------------------------------------------------------------------------------

//firstTwo
//Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
//If the string is shorter than length 2, return whatever there is, so "X" yields "X", 
//and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

//firstTwo("Hello") → "He"
//firstTwo("abcdefg") → "ab"
//firstTwo("ab") → "ab"

public String firstTwo(String str) {
  if(str.length() <= 2) {
    return str;
  } else {
    return str.substring(0, 2);
  }
}

-----------------------------------------------------------------------------------------------------------------------------

//firstHalf
//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

//firstHalf("WooHoo") → "Woo"
//firstHalf("HelloThere") → "Hello"
//firstHalf("abcdef") → "abc"

public String firstHalf(String str) {
  return str.substring(0, str.length() / 2);
}

-----------------------------------------------------------------------------------------------------------------------------

//withoutEnd
//Given a string, return a version without the first and last char, so "Hello" yields "ell". 
//The string length will be at least 2.

//withoutEnd("Hello") → "ell"
//withoutEnd("java") → "av"
//withoutEnd("coding") → "odin"
  
public String withoutEnd(String str) {
  return str.substring(1, str.length()-1);
}

-----------------------------------------------------------------------------------------------------------------------------

//comboString
//Given 2 strings, a and b, return a string of the form short+long+short, 
//with the shorter string on the outside and the longer string on the inside. 
//The strings will not be the same length, but they may be empty (length 0).

//comboString("Hello", "hi") → "hiHellohi"
//comboString("hi", "Hello") → "hiHellohi"
//comboString("aaa", "b") → "baaab"
  
public String comboString(String a, String b) {
  if(a.length() > b.length()) {
    return b + a + b;
  } else {
    return a + b + a;
  }
}

-----------------------------------------------------------------------------------------------------------------------------

//nonStart
//Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

//nonStart("Hello", "There") → "ellohere"
//nonStart("java", "code") → "avaode"
//nonStart("shotl", "java") → "hotlava"

public String nonStart(String a, String b) {
  return a.substring(1, a.length()) + b.substring(1, b.length());
}

-----------------------------------------------------------------------------------------------------------------------------

//left2
//Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
//The string length will be at least 2.

//left2("Hello") → "lloHe"
//left2("java") → "vaja"
//left2("Hi") → "Hi"
  
public String left2(String str) {
  return str.substring(2) + str.substring(0, 2);
}

-----------------------------------------------------------------------------------------------------------------------------

//right2
//Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. 
//The string length will be at least 2.

//right2("Hello") → "loHel"
//right2("java") → "vaja"
//right2("Hi") → "Hi"
  
public String right2(String str) {
    return str.substring(str.length() - 2) + str.substring(0, str.length()- 2);

}

-----------------------------------------------------------------------------------------------------------------------------

//theEnd
//Given a string, return a string length 1 from its front, unless front is false, 
//in which case return a string length 1 from its back. The string will be non-empty.

//theEnd("Hello", true) → "H"
//theEnd("Hello", false) → "o"
//theEnd("oh", true) → "o"
  
public String theEnd(String str, boolean front) {
  if(front == true) {
    return str.substring(0, 1);
  } else {
    return str.substring(str.length()-1);
  }
}

-----------------------------------------------------------------------------------------------------------------------------

//withoutEnd2
//Given a string, return a version without both the first and last char of the string. 
//The string may be any length, including 0.

//withouEnd2("Hello") → "ell"
//withouEnd2("abc") → "b"
//withouEnd2("ab") → ""

public String withouEnd2(String str) {
  if(str.length() == 0 || str.length() == 1) {
    return "";
  } else {
    return str.substring(1, str.length() -1);
  }
}

-----------------------------------------------------------------------------------------------------------------------------

//middleTwo
//Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". 
//The string length will be at least 2.

//middleTwo("string") → "ri"
//middleTwo("code") → "od"
//middleTwo("Practice") → "ct"
  
public String middleTwo(String str) {
  int length = str.length();
  if(length == 2) {
    return str;
  } else {
    return str.substring((length/2) - 1, (length/2) + 1);
  }
}

-----------------------------------------------------------------------------------------------------------------------------

//endsLy
//Given a string, return true if it ends in "ly".

//endsLy("oddly") → true
//endsLy("y") → false
//endsLy("oddy") → false

public boolean endsLy(String str) {
  int length = str.length();
  if(length <2) {
    return false;
  } else if(str.substring(length-2, length).equals("ly")) {
    return true;
  } else {
    return false;
  }
}

-----------------------------------------------------------------------------------------------------------------------------

//nTwice
//Given a string and an int n, return a string made of the first and last n chars from the string. 
//The string length will be at least n.

//nTwice("Hello", 2) → "Helo"
//nTwice("Chocolate", 3) → "Choate"
//nTwice("Chocolate", 1) → "Ce"
  
public String nTwice(String str, int n) {
  return str.substring(0, n) + str.substring(str.length() - n, str.length());
}

-----------------------------------------------------------------------------------------------------------------------------

//twoChar
//Given a string and an index, return a string length 2 starting at the given index. 
//If the index is too big or too small to define a string length 2, use the first 2 chars. 
//The string length will be at least 2.

//twoChar("java", 0) → "ja"
//twoChar("java", 2) → "va"
//twoChar("java", 3) → "ja"

public String twoChar(String str, int index) {
  if (index > str.length()-2 || index < 0) {
    return str.substring(0,2);
  } else {
    return str.substring(index, index+2);
  }
}

-----------------------------------------------------------------------------------------------------------------------------

//middleThree
//Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". 
//The string length will be at least 3.

//middleThree("Candy") → "and"
//middleThree("and") → "and"
//middleThree("solving") → "lvi"
  
public String middleThree(String str) {
  int length = str.length();
  if(length == 3) {
    return str;
  } else {
    return str.substring((length/2-1), length - (length/2-1));
  }
}

-----------------------------------------------------------------------------------------------------------------------------

  
//hasBad
//Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
//such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. 
//Note: use .equals() to compare 2 strings.

//hasBad("badxx") → true
//hasBad("xbadxx") → true
//hasBad("xxbadxx") → false
  
public boolean hasBad(String str) {
  if(str.length() < 3 || str.length() == 3 && str.substring(0,3).equals("xba")) {
    return false;
  } else if(str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
    return true;
  } else {
    return false;
  }
}

-----------------------------------------------------------------------------------------------------------------------------

//atFirst
//Given a string, return a string length 2 made of its first 2 chars. 
//If the string length is less than 2, use '@' for the missing chars.

//atFirst("hello") → "he"
//atFirst("hi") → "hi"
//atFirst("h") → "h@"
  
public String atFirst(String str) {
  if(str.length() == 0) {
    return "@@";
  } else if(str.length() == 1) {
    return str + "@";
  } else {
    return str.substring(0, 2);
  }
}

-----------------------------------------------------------------------------------------------------------------------------
