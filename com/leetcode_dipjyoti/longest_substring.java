package com.leetcode_dipjyoti;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class longest_substring {
    public static void main(String[] args) {
    String orig1="abcabcdc";
    String orig2="pwwkew";
    findString(orig1);
    findString(orig2);
    }
    static String findString(String str){
        String substr="";
        ArrayList<String> temp_arr=new ArrayList<String>(0);//temp
        ArrayList<String> temp_str=new ArrayList<String>(0);//copy
        for (int i = 0; i < str.length(); i++) {
            temp_str.add(str.charAt(i), str);
        }
    

        for (int i = 0; i < temp_str.size(); i++) {
            if(temp_arr.size()==0){
                temp_arr[i]=temp_str[i];
                
            }


        }

        return substr;
    }
}

