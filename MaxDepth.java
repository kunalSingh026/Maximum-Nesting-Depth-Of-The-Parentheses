// This is the solution of the Daily challenge of the Leetcode Problem Name Maximum depth of the Parentheses using Java.
// Time Complexity :- 0(n)
// Run Time :- 0ms



class Solution {
    public int maxDepth(String s) {
        int depth =0, count=1;
        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                count++;
            }
            if(c == ')')
            {
                count--;
                depth =Math.max(depth, count);
            }
        }
        return depth;
    }
}
