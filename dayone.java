package winterCamp;

import java.io.*;
import java.util.Arrays;
public class dayone {
    public static void main(String[] args) {
        //find the no. of occurrence of character in a string without using loop
        //reverse string to re
        //replace a substring inside a string with other string --done
        String name="ShrutiVats";
//        String target = "ash";
//        String name_new = name.replace("ruti",target);
//        System.out.print(name_new);
        int namelen = name.length();
        String name_new = name.replace("t","");
        int name_newlen = name_new.length();
        System.out.println("No of t in string " + (namelen-name_newlen));

    }
}
