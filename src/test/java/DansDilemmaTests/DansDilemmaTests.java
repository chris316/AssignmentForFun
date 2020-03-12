package DansDilemmaTests;

import DansDilemma.DansDilemma;
import Strings.BasicStrings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Please rewrite the test part as the format I gave here.
public class DansDilemmaTests {

    private DansDilemma dansDilemma;

    @Before
    public void setup(){
        dansDilemma = new DansDilemma();
    }

    @Test
    public void dilemmaOfTwoDoubleTest1(){
        // Given
        Double input1 = 7d;
        Double input2 = 2d;
        // When
        Integer actual = dansDilemma.dilemmaOfTwo(input1, input2);
        // Then
        Integer expected = 6;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void dilemmaOfTwoDoubleTest2(){
        // Given
        Double input1 = 4d;
        Double input2 = 4d;
        // When
        Integer actual = dansDilemma.dilemmaOfTwo(input1, input2);
        // Then
        Integer expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfTwoDoubleTest3(){
        // Given
        Double input1 = 872346123958d;
        Double input2 = 95193461298721d;
        // When
        Integer actual = dansDilemma.dilemmaOfTwo(input1, input2);
        // Then
        Integer expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfTwoDoubleTest4(){
        // Given
        Double input1 = 0d;
        Double input2 = 0d;
        // When
        Integer actual = dansDilemma.dilemmaOfTwo(input1, input2);
        // Then
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfThreeDoubleTest1(){
        // Given
        Double input1 = 9d;
        Double input2 = 8d;
        Double input3 = 7d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 16;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfThreeDoubleTest2(){
        // Given
        Double input1 = 32d;
        Double input2 = 7d;
        Double input3 = 32d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 10;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfThreeDoubleTest3(){
        // Given
        Double input1 = 10.2;
        Double input2 = 62d;
        Double input3 = 4d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 18;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfThreeDoubleTest4(){
        // Given
        Double input1 = 0d;
        Double input2 = 0d;
        Double input3 = 0d;
        // When
        Integer actual = dansDilemma.dilemmaOfThree(input1, input2, input3);
        // Then
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfNTest1(){
        // Given
        Double[] inputs = {1d, 2d, 3d, 4d,5d};
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 31;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfNTest2(){
        // Given
        Double[] inputs = {8d, 51d};
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfNTest3(){
        // Given
        Double[] inputs = {9d, 4d, 16d, 2d, 24d, 2048d, 6d};
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 97;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfNTest4(){
        // Given
        Double[] inputs = new Double[50];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = (double) i;
        }
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 2271;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dilemmaOfNTest5(){
        // Given
        Double[] inputs = new Double[3000];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = (double) i;
        }
        // When
        Integer actual = dansDilemma.dilemmaOfN(inputs);
        // Then
        Integer expected = 7590128;
        Assert.assertEquals(expected, actual);
    }

}
