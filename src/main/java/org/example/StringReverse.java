package org.example;

public class StringReverse {

    private String word;


    public StringReverse(String word) {
        this.word = word;
    }

    public String reverseWord(){

        StringBuilder reverseString  = new StringBuilder();

        for (int i =word.length() -1 ; i >=0 ; i--) {
            reverseString.append(word.charAt(i));
        }

        return reverseString.toString();
    }
}
