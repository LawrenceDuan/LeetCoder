/*Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.\

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false
*/

//Wrong Answer
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        
        for(char move : moves.toCharArray()){
            if(moves == "U"){
                y++;
            }
            else if (moves == "D")
            {
                y--;
            }
            else if (moves == "L")
            {
                x--;
            }
            else if (moves == "R")
            {
                x++;
            }
        }
        return x == 0 && y == 0;
    }
}

//Compile Error
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        
        for(char move : moves.toCharArray()){
            if(move == "U"){
                y++;
            }
            else if (move == "D")
            {
                y--;
            }
            else if (move == "L")
            {
                x--;
            }
            else if (move == "R")
            {
                x++;
            }
        }
        return x == 0 && y == 0;
    }
}

//Accepted
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        
        for(char move : moves.toCharArray()){
            if(move == 'U'){
                y++;
            }
            else if (move == 'D')
            {
                y--;
            }
            else if (move == 'L')
            {
                x--;
            }
            else if (move == 'R')
            {
                x++;
            }
        }
        return x == 0 && y == 0;
    }
}

//------------------------------------------------------------------------------------------------------
//Approach #1: Simulation [Accepted]
/*
Intuition
We can simulate the position of the robot after each command.

Algorithm
Initially, the robot is at (x, y) = (0, 0). If the move is 'U', the robot goes to (x, y-1); if the move is 'R', the robot goes to (x, y) = (x+1, y), and so on.
*/
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char move: moves.toCharArray()) {
            if (move == 'U') y--;
            else if (move == 'D') y++;
            else if (move == 'L') x--;
            else if (move == 'R') x++;
        }
        return x == 0 && y == 0;
    }
}
/*
Complexity Analysis

Time Complexity: O(N), where N is the length of moves. We iterate through the string.

Space Complexity: O(1). In Java, our character array is O(N).
*/