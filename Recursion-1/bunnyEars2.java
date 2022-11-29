/*
We have bunnies standing in a line, numbered 1, 2, ... 
The odd bunnies (1, 3, ..) have the normal 2 ears.
The even bunnies (2, 4, ..) we'll say have 3 ears,
because they each have a raised foot. 
Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
*/

public int bunnyEars2(int bunnies) {
  if (bunnies == 0) {
    return 0;
  }
  else {
    // check if current bunny is even or odd
    if (bunnies % 2 == 0) {
      //bunny is even, so return 3 for that bunny
      // + the next bunny, which will go through 
      // the function again
      return 3 + bunnyEars2(bunnies-1);
    }
    return 2 + bunnyEars2(bunnies-1);
  }
  // Example
  /*
  bunnyEars(3)
  3 != 0, so goes to else
  3 % 2 != 0
  so off, returns 2 + bunnyEars2(bunnies-1);
  
  so we execute
  bunnyEars2(2)
  2 != 0, so goes to else
  2 % 2 == 0
  so even, returns 3 + bunnyEars2(bunnies-1);
  
  so we execute
  bunnyEars2(1)
  1 != 0, so goes to else
  1 % 2 != 0
  so odd, returns 2 + bunnyEars2(bunnies-1);
  
  so we execute 
  bunnyEars2(0)
  0 == 0
  so returns 0;
  
  
  So now we add up 2 + 3 + 2
  = 7
  */
}

