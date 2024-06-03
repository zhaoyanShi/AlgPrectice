package leetcode.top100liked.slidewindow;

import java.util.List;

public class FindAllAnagramsInString_Test {

    public static void main(String[] args) {
        FindAllAnagramsInString instance = new FindAllAnagramsInString();
        long s = 0, e = 0;
        String s1 = null, s2 = null;

        List<Integer> anagrams = null;
        anagrams = instance.findAnagrams("cbaebabacd", "abc");
        System.out.println(anagrams + " expected [0, 6]");

        anagrams = instance.findAnagrams("abab", "ab");
        System.out.println(anagrams + " expected [0, 1, 2]");

//        s1 = buildString("aaaaaaaaaa", 1000) + "b" + buildString("aaaaaaaaaa", 1000);
//        s2 = buildString("aaaaaaaaaa", 1000); // a*10000
//        s = System.currentTimeMillis();
//        anagrams = instance.findAnagrams(s1, s2);
//        e = System.currentTimeMillis();
//        System.out.println(anagrams + " expected [0, 10001] takse" + (e - s) + "ms");


        s1 = buildString("abcdefghijklmnopqrstuvwxyz", 773);
        s2 = buildString("abcdefghijklmnopqrstuvwxyz", 386);
        s = System.currentTimeMillis();
        anagrams = instance.findAnagrams(s1, s2);
        e = System.currentTimeMillis();
        System.out.println(anagrams );
        System.out.println(" expected [0,1,2,3,4,5,...] takse" + (e - s) + "ms");


    }

    static String buildString(String s, int repeat){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(s);
        }
        return sb.toString();
    }



    static String buildS1() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("aaaaaaaaaa");
        }
        sb.append("b");
        for (int i = 0; i < 1000; i++) {
            sb.append("aaaaaaaaaa");
        }
        return sb.toString();
    }

    static String buildS2() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("aaaaaaaaaa");
        }
        return sb.toString();
    }
}
