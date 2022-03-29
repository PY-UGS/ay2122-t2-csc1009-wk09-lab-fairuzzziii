package OOPG.Week9;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class RandomCharacterTest {
    @Test //test for lowercase method
    public void allValuesShouldBeLowerCaseLetters(){
        RandomCharacter random = new RandomCharacter();
        assertTrue((int)((random.getRandomLowerCaseCharacter())) >= 97 );
        assertTrue((int)((random.getRandomLowerCaseCharacter())) <= 122 );
    }

    @Test //test for uppercase method
    public void allValuesShouldBeUpperCaseLetters(){
        RandomCharacter random = new RandomCharacter();
        assertTrue((int)((random.getRandomUpperCaseCharacter())) >= 65 );
        assertTrue((int)((random.getRandomUpperCaseCharacter())) <= 90 );
    }

    @Test //test for all digits method
    public void allValuesShouldBeDigits(){
        RandomCharacter random = new RandomCharacter();
        assertTrue(random.getRandomDigit() >= 0 );
        assertTrue(random.getRandomDigit() <= 9 );
    }

    @Test //test for all characters method
    public void allValuesShouldBeCharacter(){
        RandomCharacter random = new RandomCharacter();
        assertTrue(random.getRandomCharacter() >= 0);
        assertTrue(random.getRandomCharacter() <= 127);
    }

    @Test //test for prime numbers method
    public void allValuesShouldBePrimeNumber(){
        RandomCharacter random = new RandomCharacter();
        int randomValue = random.getRandomDigit();
        if (randomValue == 2 || randomValue ==3){
            assertTrue(true);
        } else{
            assertFalse((randomValue%2) == 0 || (randomValue%3) == 0);
        }
    }}


    

