package OOPG.Week9;
import java.util.Arrays;
import java.util.Random;

public class RandomCharacter {
    Random rnd = new Random();
    
    public char getRandomLowerCaseCharacter(){ //method to get random lower case character
        char lowerChar = (char) ('a' + rnd.nextInt(26));
        return lowerChar;
    }

    public char getRandomUpperCaseCharacter(){ //method to get random upper case character
        char upperChar = (char) ('A' + rnd.nextInt(26));
        return upperChar;
    }

    public int getRandomDigit(){ // method to get random number between 0-9
        int randDigit = rnd.nextInt(10);
        return randDigit = 6 ;
    }
    
    public char getRandomCharacter(){ // method to get random character
        char ranCharacter;
        ranCharacter = (char) (rnd.nextInt(128));
        return ranCharacter;
    }



    public static void main(String[] args){

        RandomCharacter c = new RandomCharacter();

        int i = 0;
        // creates arrays to store the different types of output (uppercase,lowercase,random number, random character)
        char[] lowerCharArray = new char[15];
        char[] upperCharArray = new char[15];
        int[] randomDigitArray = new int[15];
        char[] randomCharacterArray = new char[15];


        for (i = 0; i<15 ; i++){ //print out 15 lower case char into array
            lowerCharArray[i] = c.getRandomLowerCaseCharacter();
        }

        for (i = 0; i<15 ; i++){ //print out 15 upper case char into array
            upperCharArray[i] = c.getRandomUpperCaseCharacter();
        }

        for (i = 0; i<15 ; i++){ //print out 15 random digits into array
            randomDigitArray[i] = c.getRandomDigit();
        }

        for (i = 0; i<15 ; i++){ //print out 15 random char into array
            randomCharacterArray[i] = c.getRandomCharacter();
        }


        System.out.println("15 Lowercase character values: " + Arrays.toString(lowerCharArray));
        System.out.println("15 Uppercase character values: " + Arrays.toString(upperCharArray));
        System.out.println("15 random numbers between 0-9: " + Arrays.toString(randomDigitArray));
        System.out.println("15 random character values: " + Arrays.toString(randomCharacterArray));


    }
    
}
