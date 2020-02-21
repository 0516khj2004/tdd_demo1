package com.example.test_demo;

//junit -> 자바 j , 테스트 unit
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    //@ -> annotaion -> 부가 설명,  기능을 코드 없이 설정
    @Test
    public void testAdd(){
        Calculator calc = new Calculator();
        int result = calc.add(10,20);
        assertTrue(result == 30);
    }

    @Test
    public void testSub(){
        Calculator calc = new Calculator();
        int result = calc.sub(20,10);
        assertTrue(result == 10);
    }

    @Test
    public void testAddError(){
        Calculator calc = new Calculator();
        int result = calc.add(20,10);
        assertFalse(result != 30);
    }

    @Test
    public void testSubError(){
        Calculator calc = new Calculator();
        int result = calc.sub(20,10);
        assertFalse(result != 10);
//        assertEquals(20, result, "결과는 10이어야 합니다");
    }
}
