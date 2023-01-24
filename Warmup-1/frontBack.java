/*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
*/

public String frontBack(String str) {
  
  int len = str.length();
  
  if (len == 1 || len == 0) {
    return str;
  }
  else{

    String front = str.substring(0, 1);
    String back = str.substring(len-1, len);
    String middle = str.substring(1, len-1);
  
    return back + middle + front;
    
  }
  
}
