package com.zjr.llikou;

public class run {
    public static void main(String[] args) {
        int vowels = maxVowels("weallloveyou", 7);
        System.out.println(vowels);
    }
    public  static int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();
        int res = 0;
        for (int i = 0; i <= chars.length - k; i++) {
            res = Math.max(res, getNum(s.substring(i, i + k)));
        }
        return res;
    }
    public static int getNum(String str){
        char[] chars = str.toCharArray();
        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u'){
                res++;
            }
        }
        return res;
    }
}
