package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StringReverse stringReverse = new StringReverse("reverse of a word");
        System.out.println(stringReverse.reverseWord());


        Balance balancedParenthesis = new Balance(")(");
        System.out.println(balancedParenthesis.isBalanced());

        List<Character> chars = new ArrayList<>();

        CharacterCount characterCount = new CharacterCount(new ArrayList<>(List.of('q','q','r','s','x','x')));
        System.out.println(characterCount.countEachCharacter());

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

    }
}