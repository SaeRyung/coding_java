package java.programmers.level0;

import java.util.*;
import java.io.*;

public class Virus {
    class Solution {
        public int solution(int n, int t) {
            int result = n;
            for(int i=0; i<t; i++){
                result *= 2;
            }
            return result;
        }
    }
}
