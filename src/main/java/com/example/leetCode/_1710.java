package com.example.leetCode;//You are assigned to put some amount of boxes onto one truck. You are given a 2
//D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:
//
//
// numberOfBoxesi is the number of boxes of type i.
// numberOfUnitsPerBoxi is the number of units in each box of the type i.
//
//
// You are also given an integer truckSize, which is the maximum number of boxes
// that can be put on the truck. You can choose any boxes to put on the truck as l
//ong as the number of boxes does not exceed truckSize.
//
// Return the maximum total number of units that can be put on the truck.
//
//
// Example 1:
//
//
//Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
//Output: 8
//Explanation: There are:
//- 1 box of the first type that contains 3 units.
//- 2 boxes of the second type that contain 2 units each.
//- 3 boxes of the third type that contain 1 unit each.
//You can take all the boxes of the first and second types, and one box of the t
//hird type.
//The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.
//
//
// Example 2:
//
//
//Input: boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
//Output: 91
//
//
//
// Constraints:
//
//
// 1 <= boxTypes.length <= 1000
// 1 <= numberOfBoxesi, numberOfUnitsPerBoxi <= 1000
// 1 <= truckSize <= 106
//
// Related Topics Greedy Sort
// 👍 81 👎 4


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//leetcode submit region begin(Prohibit modification and deletion)
class _1710 {
  public static class Box {
    int numberOfBoxes;
    int numberOfUnitsPerBox;

    public Box(int numberOfBoxes, int numberOfUnitsPerBox) {
      this.numberOfBoxes = numberOfBoxes;
      this.numberOfUnitsPerBox = numberOfUnitsPerBox;
    }

    public int getNumberOfUnitsPerBox() {
      return numberOfUnitsPerBox;
    }
  }

  public int maximumUnits(int[][] boxTypes, int truckSize) {
    int sum = 0;
    List<Box> collect = Arrays.stream(boxTypes)
        .map(e -> new Box(e[0], e[1]))
        .sorted(Comparator.comparing(Box::getNumberOfUnitsPerBox, Comparator.reverseOrder()))
        .collect(Collectors.toList());

    for (Box box : collect) {
      truckSize -= box.numberOfBoxes;
      sum += box.numberOfUnitsPerBox * box.numberOfBoxes;
      if (truckSize <= 0){
        sum -= Math.abs(truckSize) * box.numberOfUnitsPerBox;
        break;
      }
    }

    return sum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
