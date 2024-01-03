package com.leetcode_dipjyoti;
public class longest_substring {
    public static void main(String[] args) {
    String orig1="abcabcdc";
    String orig2="pwwkew";
    System.out.println("First string "+findString(orig1));
    System.out.println("Second string "+findString(orig2));
    }
    static String findString(String str){
        String string="";
        String temp="";
        String long_str="";
        for (int i = 0; i < str.length(); i++) {
            if(string.isEmpty()==true){
                string=string+str.charAt(i);
            }
            else{
                for (int j = 0  ; j < string.length(); j++) {
                    if(string.charAt(j)!=str.charAt(i)){
                        if (j==string.length()-1) {
                            string=string+str;
                        }
                    }
                    else{
                     temp=string;
                     string="";
                     break;
                    }

                }
            }
            if (temp.length()>long_str.length()) {
                long_str=temp;
            }
        }

        return long_str;
    }
}

