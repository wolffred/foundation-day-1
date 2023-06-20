package org.example;

import java.util.HashMap;
import java.util.Map;

public class BalancedParenthesis {

    public String parenthesis;

    public BalancedParenthesis(String parenthesis) {
        this.parenthesis = parenthesis;
    }

    public Boolean isBalanced(){
        Map<String, Integer> forwardBrackets = new HashMap<>();
        forwardBrackets.put("(", 0);

        Map<String, Integer> backwardBrackets = new HashMap<>();
        backwardBrackets.put(")", 0);

        int forwardCount = 0;
        int backwardCount = 0;


        for (int i = 0; i < parenthesis.length(); i++){
            if (parenthesis.charAt(i) == '('){
                forwardCount = forwardBrackets.get("(");
                forwardBrackets.put("(", forwardCount + 1 );
            } else if (parenthesis.charAt(i) == ')') {
                backwardCount = backwardBrackets.get(")");
                backwardBrackets.put(")", backwardCount + 1 );
            }

            if(forwardCount <  backwardCount){
                return false;
            }
        }

        return forwardCount == backwardCount;

    }
}
