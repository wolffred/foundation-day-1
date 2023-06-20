package org.example;

import java.util.HashMap;
import java.util.Map;

public class Balance {

    public String parenthesis;

    public Balance(String parenthesis) {
        this.parenthesis = parenthesis;
    }

    public Boolean isBalanced(){

        int forwardCount = 0;
        int backwardCount = 0;


        for (int i = 0; i < parenthesis.length(); i++){
            if (parenthesis.charAt(i) == '('){
                forwardCount += 1;
            } else if (parenthesis.charAt(i) == ')') {
                backwardCount += 1;
            }

            if(forwardCount <  backwardCount){
                return false;
            }
        }

        return forwardCount == backwardCount;

    }
}
