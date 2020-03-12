package CollectionsTests;

import Collections.ArrayLists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

// Please rewrite the test part as the format I gave here.

public class ArrayListsTest {
    private ArrayLists arrayLists;

    @Before
    public void setup(){
        arrayLists = new ArrayLists();
    }

    @Test
    public void addShitTest1(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(1);
        original1.add(2);
        original1.add(3);
        original1.add(4);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(5);
        original2.add(6);
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        original1.add(5);
        original1.add(6);
        // Then
        Assert.assertEquals(original1, actual);
    }

    @Test
    public void addShitTest2(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(3);
        original1.add(4);
        original1.add(3);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        // Then
        Assert.assertEquals(original1, actual);
    }

    @Test
    public void addShitTest3(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        // Then
        Assert.assertEquals(original1, actual);
    }

    @Test
    public void addShitTest4(){
        //Given
        ArrayList<Integer>original1=new ArrayList<Integer>();
        original1.add(7);
        original1.add(10);
        original1.add(15);
        original1.add(2);
        original1.add(0);
        ArrayList<Integer>original2=new ArrayList<Integer>();
        original2.add(3);
        //When
        ArrayList<Integer>actual=arrayLists.addShit(original1,original2);
        //Then
        Assert.assertEquals(original1,actual);
    }

    @Test
    public void addShitTogetherTest1(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(10);
        original1.add(10);
        original1.add(10);
        original1.add(10);
        original1.add(10);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(25);
        original2.add(25);
        // When
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 100;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addShitTogetherTest2(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(3);
        original1.add(5);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        // when
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 8;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addShitTogetherTest3(){
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        // When
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 0;
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllTest1(){
        // Given
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(1);
        original.add(1);
        original.add(1);
        original.add(1);
        original.add(2);
        original.add(1);
        original.add(1);
        original.add(1);
        original.add(2);
        // When
        Integer toRemove = 2;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        original.remove(4);
        original.remove(5);
        // Then
        Assert.assertEquals(original, actual);
    }

    @Test
    public void removeAllTest2(){
        // Given
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(10);
        original.add(3);
        original.add(4);
        original.add(10);
        original.add(10);
        // When
        Integer toRemove = 4;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        original.remove(2);
        // Then
        Assert.assertEquals(original, actual);
    }

    @Test
    public void removeAllTest3(){
        // Given
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(4);
        original.add(5);
        original.add(6);
        original.add(7);
        original.add(8);
        // When
        Integer toRemove = null;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        // Then
        Assert.assertEquals(original, actual);
    }

    @Test
    public void removeAllTest4(){
        // Given
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(4);
        original.add(5);
        original.add(6);
        original.add(7);
        original.add(8);
        // When
        Integer toRemove = 2;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        // Then
        Assert.assertEquals(original, actual);
    }

    @Test
    public void happyListTest1(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("hefound");
        original.add("the");
        original.add("chocolatecovered");
        original.add("roachesquite");
        original.add("tasty");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void happyListTest2(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("Then");
        original.add("I");
        original.add("took");
        original.add("an");
        original.add("arrow");
        original.add("tothe");
        original.add("knee");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void happyListTest3(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void happyListTest4(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("Hellow World!");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void happyListTest5(){
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("Keepcalm");
        original.add("and");
        original.add("code");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

}
