package homework4.junittestcase;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestCases {

    @Test
    public void test0() {
        int a = 5;
        int b = 10;
        int actualTotal;
        int expectedTotal = 15;
        actualTotal = a + b;

        Assert.assertEquals(expectedTotal, actualTotal);
        System.out.println("test0 passed");

    }

    @Test
    public void test1() {
        int a = 5;
        int b = 10;
        int actualTotal;
        int expectedTotal = 17;
        actualTotal = a + b;

        Assert.assertEquals(expectedTotal, actualTotal);
        System.out.println("test1 passed");
    }

    @Test
    public void test2() {
        int a = 34;
        int b = 20;
        int actualSubTotal;
        int expectedTotal = 14;
        actualSubTotal = a - b;

        Assert.assertEquals(expectedTotal, actualSubTotal);
        System.out.println("test2 passed");

    }

    @Test
    public void test3() {
        int a = 9;
        int b = 5;
        int actualMulTotal;
        int expectedTotal = 45;
        actualMulTotal = a * b;

        Assert.assertEquals(expectedTotal, actualMulTotal);
        System.out.println("test3 passed");

    }

    @Test
    public void test4() {
        String txt = "Chrome";
        String str1 = "rome";

        Assert.assertTrue(txt.contains(str1));
        System.out.println("test4 passed");

    }

    @Test
    public void test5() {
        String txt = "Chrome";
        String Can = "Toc";

        Assert.assertTrue(txt.contains(Can));
        System.out.println("test5 passed");

    }

    @Test
    public void test6() {
        char[] data1 = {'c', 'h', 'r', 'o', 'm', 'e'};
        char[] data = "chrome".toCharArray();

        Assert.assertArrayEquals(data1, data);
        System.out.println("test6 passed");

    }

    @Test
    public void test7() {
        char[] succer = {'b', 'a', 'l', 'l'};
        char[] data = "chrome".toCharArray();

        Assert.assertArrayEquals(succer, data);
        System.out.println("test7 passed");

    }

    @Test
    public void test8() {

        Map<String, String> vehicle = new HashMap<>();

        vehicle.put("nissan", "elantra");
        vehicle.put("toyota", "camry");
        vehicle.put("honda", "civic");
        vehicle.put("chevrolet", "malibu");
        Assert.assertTrue(vehicle.containsKey("honda"));
        System.out.println("test 8 passed");

    }

    @Test
    public void test9() {
        Map<String, Integer> fruit = new HashMap<>();

        fruit.put("apple", 5);
        fruit.put("peach", 4);
        fruit.put("banana", 3);
        fruit.put("walermelon",1);
        Assert.assertTrue(fruit.containsValue(4));
        System.out.println("test  passed");
    }


}



