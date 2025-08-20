package org.example.BinarySearch.Lec1;

public class Test {

    public static void runner() {
        String s1 = "Hello";
        String s2 = s1;
        String s3 = new String("Hello");

        System.out.println("S1.equals(s2) ==>"+s1.equals(s2));
        System.out.println("S1.equals(s3)==>"+s1.equals(s3));

        System.out.println("S1 == s2===> "+(s1 == s2));
        System.out.println("S1 == s3===> "+(s1 == s3));

    }
}
