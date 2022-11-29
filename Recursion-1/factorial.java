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
