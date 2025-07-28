//package com.example;
//
///**
// * Hello world!
// *
// */
//public class App
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
//}

package com.example;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String text = "Hello, Maven!";
        String reversedText = StringUtils.reverse(text);
        System.out.println("Original : " + text);
        System.out.println("Reversed : " + reversedText);
    }
}