package StringsTests;

import Strings.BasicStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Please rewrite the test part as the format I gave here.

public class BasicStringsTest {
    private BasicStrings basicStrings;

    @Before
    public void setup(){
        basicStrings = new BasicStrings();
    }

    @Test
    public void flipConcatTest1(){
        // Given
        String string1 = " Pew";
        String string2 = "Pepe Le";
        String expected = "Pepe Le Pew";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void flipConcatTest2(){
        // Given
        String string1 = " Birthday!";
        String string2 = "Happy";
        String expected = "Happy Birthday!";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void flipConcatTest3(){
        // Given
        String string1 = "World!";
        String string2 = "Hello ";
        String expected = "Hello World!";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCharTest1(){
        // Given
        String string1 = "I believe I can fly!";
        char expected = 'i';
        // When
        char actual = basicStrings.getChar(string1, 5);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCharTest2(){
        // Given
        String string1 = "I believe I can fly!";
        char expected = ' ';
        // When
        char actual = basicStrings.getChar(string1, 1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest1(){
        // Given
        String string1 = "Help";
        String expected = "    ";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest2(){
        // Given
        String string1 = "I Can't See!";
        String expected = "            ";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest3(){
        // Given
        String string1 = "   ";
        String expected = "   ";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loudAndClearTest1(){
        // Given
        String string = "";
        String expected = "";
        // When
        String actual = basicStrings.loudAndClear(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loudAndClearTest2(){
        // Given
        String string = "ThEsE aRe RaNdOm WoRdS";
        String expected = "THESE ARE RANDOM WORDS";
        // When
        String actual = basicStrings.loudAndClear(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest1(){
        // Given
        String string = "ThEsE aRe RaNdOm WoRdS";
        String expected = "tHeSe ArE rAnDoM wOrDs";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest2(){
        // Given
        String string = "gOOdBYE!";
        String expected = "GooDbye!";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest3(){
        // Given
        String string = "";
        String expected = "";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest(){
        // Given
        String string1 = "";
        String string2 = "";
        String expected = "";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest2(){
        // Given
        String string1 = "Sce ihr";
        String string2 = "ertCpe";
        String expected = "Secret Cipher";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest3(){
        // Given
        String string1 = "JmsBn 0";
        String string2 = "ae od07";
        String expected = "James Bond 007";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }



}
