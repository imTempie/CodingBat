public int triangle(int rows) {
  if (rows == 0) {
    return 0;
  }
  else {
    //return the amount of blocks in bottom row, plus ones above recursivly
    return rows + triangle(rows-1);
  }
}
