package me.sourabh.experiments.projects;

import java.util.Base64;
import java.utils.Arrays;

public class main {
    final static String hexString = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d";

    final static String base64String = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d";

    public static void main(String[]args){
        System.out.println("Main | Enter");

        matasanoSet1Prob1(hexString)

        System.out.println("Main | Exit");
    }

    /**
     * the matasano crypto challenges
     * Challenges Set 1 Challenge 1 : Convert hex to base64
     */
    private static void matasanoSet1Prob1(String hexString) {
        String outputString = "";
        char[] hexCharArr = hexString.toCharArray();
        byte[] base64EncodedArr = Base64.getEncoder().encode(hexString.getBytes());
        outputString = base64EncodedArr.toString();
        System.out.println(" Output 1 : " + outputString);
        if(outputString==base64String) {
            System.out.println("matasanoSet1Prob1 | ** Match :: Perfect **");
        } else {
            System.out.println("matasanoSet1Prob1 | Match :: NOT Perfect");
        }
        /*for(char c : hexCharArr) {
            Base64.getEncoder().encode();
        }*/
    }

}