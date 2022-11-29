/*
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. 
Compute the result recursively (without loops).
*/

public int factorial(int n) {
  
  //base case, if n = 1 then we return it
  if(n==1) {
    return n;
  }
  //otherwise, we return n * factorial(n-1)
  else {
    return n * factorial(n-1);
  }
}
