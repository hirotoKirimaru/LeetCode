package com.example.leetCode;

/**
 * Forward declaration of guess API.
 *
 * @param num your guess
 * @return -1 if num is lower than the guess number 1 if num is higher than the guess number
 * otherwise return 0 int guess(int num);
 */
class GuessGame {
  int guess(int mid1) {
    return 0;
  }

}


public class _374 extends GuessGame {

  public int guessNumber(int n) {
    int low = 1;
    int high = n;
    while (low <= high) {
      int mid1 = low + (high - low) / 3;
      int mid2 = high - (high - low) / 3;
      int res1 = guess(mid1);
      int res2 = guess(mid2);
      if (res1 == 0) {
        return mid1;
      }
      if (res2 == 0) {
        return mid2;
      } else if (res1 < 0) {
        high = mid1 - 1;
      } else if (res2 > 0) {
        low = mid2 + 1;
      } else {
        low = mid1 + 1;
        high = mid2 - 1;
      }
    }
    return -1;
  }

}