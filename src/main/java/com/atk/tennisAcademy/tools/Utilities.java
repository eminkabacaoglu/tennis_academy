package com.atk.tennisAcademy.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utilities {

    public static String generateUsername(String firstName,String lastName){
        char[] currentLetter = new char[] { 'ı','ü', 'ç',  'ş','ö' };
        char[] newLetter = new char[] { 'i', 'u','c', 's','o' };
        String usernameTextPart = (firstName+lastName.charAt(0)+lastName.charAt(1)).toLowerCase();
        for (int sayac = 0; sayac < currentLetter.length; sayac++)
        {
            usernameTextPart = usernameTextPart.replace(currentLetter[sayac], newLetter[sayac]);
        }

       return usernameTextPart + new Random().nextInt(1000);


    }
}
