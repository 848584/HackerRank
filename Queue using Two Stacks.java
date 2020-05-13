import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

               Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();

        Stack<Integer> one = new Stack<Integer>();
        Stack<Integer> two = new Stack<Integer>();

        int command;
        for (int i = 0 ; i < queries ; i++) {
            command = sc.nextInt();

            if (command == 1) {
                one.push(sc.nextInt());
            }

            else if(command == 2) {
                if(two.isEmpty()) {
                    while(!one.isEmpty()) {
                        two.push(one.pop());
                    }

                }
                two.pop();
            }

            else if(command == 3) {
               if(two.isEmpty()) {
                    while(!one.isEmpty()) {
                        two.push(one.pop());
                    }
               }
               System.out.println(two.peek());
            }
        }
    }
}