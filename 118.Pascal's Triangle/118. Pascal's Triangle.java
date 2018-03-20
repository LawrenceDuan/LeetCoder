/*
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/

//Accepted
import java.math.BigInteger;
import java.math.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new ArrayList<List<Integer>>();

        if(numRows == 0) return tri;
        for(int i = 0;i < numRows;i++){
            tri.add(rowGenerate(i));
        }
        return tri;
    }

    public List<Integer> rowGenerate(int rowNum) {
        List<Integer> row = new ArrayList<Integer>();
        for(int i = 0;i < rowNum+1;i++){
            BigInteger value = factorial(rowNum).divide(factorial(i).multiply(factorial((rowNum-i))));
            row.add(value.intValue());
        }
        return row;
    }

    public static BigInteger factorial(int number) {
            BigInteger result = BigInteger.valueOf(1);
            for (int i = 2;i <= number;i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
    }
}
