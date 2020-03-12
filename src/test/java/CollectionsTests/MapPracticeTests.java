package CollectionsTests;

import Collections.MapPractice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

// Please rewrite the test part as the format I gave here.

public class MapPracticeTests {
    private MapPractice mapPractice;
    private Map map1;
    private Map map2;

    @Before
    public void setup(){
        mapPractice = new MapPractice();
        map1 = new TreeMap<String, String>();
        map1.put("Zelda", "Legend of Zelda");
        map1.put("Soap", "Call of Duty");
        map1.put("Ryu", "Ninja Gaiden");
        map1.put("Inky", "Pac-man");
        map1.put("Dragonborn", "Skyrim");
        map1.put("King Dedede", "Kirby");
        map1.put("Ezio", "Assassin's Creed");
        map1.put("Squirtle", "Pokemon");
        map1.put("Marth", "Fire Emblem");
        map1.put("Tingle", "Legend of Zelda");

        map2=new TreeMap<String,String>();
        map2.put("Aurora","Sleeping Beauty");
        map2.put("Jasmine","Aladdin");
        map2.put("Jafar","Aladdin");
        map2.put("Ariel","The Little Mermaid");
        map2.put("Li Shang", "Mulan");
        map2.put("Gaston","Beauty and the Beast");
        map2.put("Flynn Rider","Tangled");
        map2.put("Elsa","Frozen");
        map2.put("Prince Charming","Cinderella");
        map2.put("Mushu","Mulan");
        map2.put("Mufasa","Lion King");
        map2.put("Anna","Frozen");
        map2.put("Woody","Toy Story");
        map2.put("Simba","Lion King");
        map2.put("Timon","Lion King");
        map2.put("Olaf","Frozen");
        map2.put("Eric", "The Little Mermaid");
        map2.put("Captain Hook","Peter Pan");
        map2.put("Ursula", "The Little Mermaid");
    }

    @Test
    public void findValueOfTest1(){
        // Given
        String key = "Squirtle";
        // When
        String expected = "Pokemon";
        String actual = (String) mapPractice.findValueOf(map1, key);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findValueOfTest2(){
        // Given
        String key = "Zelda";
        // When
        String expected = "Legend of Zelda";
        String actual = (String) mapPractice.findValueOf(map1, key);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findValueOfTest3(){
        // Given
        String key = "Grass";
        // When
        String expected = null;
        String actual = (String) mapPractice.findValueOf(map1, key);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findValueOfTest4(){
        //Given
        String key="Mushu";
        //When
        String expected="Mulan";
        String actual=(String)mapPractice.findValueOf(map2,key);
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findValueOfTest5(){
        //Given
        String key="Bambi";
        //When
        String expected=null;
        String actual=(String)mapPractice.findValueOf(map2,key);
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findKeysOfTest1(){
        // Given
        String value = "Legend of Zelda";
        // When
        Object[] expected = {"Tingle", "Zelda"};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest2(){
        // Given
        String value = "Frozen";
        // When
        Object[] expected = {"Anna","Elsa","Olaf"};
        Object[] actual = mapPractice.findKeysOf(map2, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest3(){
        // Given
        String value = "Fortnite";
        // When
        Object[] expected = {};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest4(){
        //Given
        String value="Snow White";
        //When
        Object[] expected={};
        Object[] actual=mapPractice.findKeysOf(map2,value);
        //Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void fibonacciTreeTest1(){
        // Given
        Integer upTo = 13;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 2);
        expected.put(4, 3);
        expected.put(5, 5);
        expected.put(6, 8);
        expected.put(7, 13);
        expected.put(8, 21);
        expected.put(9, 34);
        expected.put(10, 55);
        expected.put(11,89);
        expected.put(12,144);
        expected.put(13,233);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest2(){
        // Given
        Integer upTo = 3;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 2);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest3(){
        // Given
        Integer upTo = 7;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 2);
        expected.put(4, 3);
        expected.put(5, 5);
        expected.put(6, 8);
        expected.put(7, 13);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest4(){
        // Given
        Integer upTo = 1;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest5(){
        // Given
        Integer upTo = 0;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest1(){
        // Given
        Integer upTo = 12;
        Integer first = 5;
        Integer second = 5;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 5);
        expected.put(2, 5);
        expected.put(3, 10);
        expected.put(4, 15);
        expected.put(5, 25);
        expected.put(6, 40);
        expected.put(7, 65);
        expected.put(8, 105);
        expected.put(9, 170);
        expected.put(10, 275);
        expected.put(11,445);
        expected.put(12,720);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest2(){
        // Given
        Integer upTo = 5;
        Integer first = 7;
        Integer second = 4;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 7);
        expected.put(2, 4);
        expected.put(3, 11);
        expected.put(4, 15);
        expected.put(5, 26);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest3(){
        // Given
        Integer upTo = 9;
        Integer first = 3;
        Integer second = -7;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 3);
        expected.put(2, -7);
        expected.put(3, -4);
        expected.put(4, -11);
        expected.put(5, -15);
        expected.put(6, -26);
        expected.put(7, -41);
        expected.put(8, -67);
        expected.put(9, -108);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest4(){
        // Given
        Integer upTo = 2;
        Integer first = 100;
        Integer second = -2;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 100);
        expected.put(2,-2);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest5(){
        // Given
        Integer upTo = 0;
        Integer first = 123456;
        Integer second = -987654;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }



}
