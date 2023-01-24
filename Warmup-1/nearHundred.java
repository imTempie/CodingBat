/*
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
*/

public boolean nearHundred(int n) {
  int N = Math.abs(n);
  
  if(n < 0) {
    return false;
  }
  else if ((N > 89 && N < 111 || N > 189 && N < 211)) {
    return true;
  }
  else {
    return false;
  }
}
