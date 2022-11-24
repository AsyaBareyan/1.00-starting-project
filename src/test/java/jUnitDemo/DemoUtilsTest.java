package jUnitDemo;

import com.luv2code.junitdemo.DemoUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {
    DemoUtils demoUtils;
    @BeforeEach
    void setupBeforeEach(){
        demoUtils=new DemoUtils();
    }
    @Test
    @DisplayName("Equals or not equals")
    void testEqualsOrNotEquals(){

        assertEquals(6,demoUtils.add(2,4),"2+4 must be 6");
        assertNotEquals(6,demoUtils.add(1,9),"1+9 must not be 6");

    }
    @Test
    void testNullOrNotNull(){
        String str1=null;
        String str2="luv2code";
        assertNull(demoUtils.checkNull(str1),"Object should be null");
        assertNotNull(demoUtils.checkNull(str2),"Object should be not null");

    }
    @Test
    void testSameOrNotSame(){
        String str="luv2code";
        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate(),"Objects should refer to same object");
        assertNotSame(str,demoUtils.getAcademy(),"Objects should refer to same object");
    }
    @Test
    void testTrueFalse(){
        int gradeOne=10;
        int gradeTwo=5;
        assertTrue(demoUtils.isGreater(gradeOne,gradeTwo),"This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo,gradeOne),"This should return false");
    }

    @Test
    void testArrayEquals(){
        String[] strinArray={"A","B","C"};
        assertArrayEquals(strinArray,demoUtils.getFirstThreeLettersOfAlphabet(),"Arrays should same");
    }

    @Test
    void testIterableEquals(){
        List<String> theList=List.of("luv","2","code");
        assertIterableEquals(theList,demoUtils.getAcademyInList(),"Expected list should be same");

    }
    @Test
    void testLinesMatch(){
        List<String> theList=List.of("luv","2","code");
        assertIterableEquals(theList,demoUtils.getAcademyInList(),"lines should match");

    }

    @Test
    void testThrowsAndDoesNotThrow(){
        assertThrows(Exception.class,()->{demoUtils.throwException(-1);},"should throw exception");
        assertDoesNotThrow(()->{demoUtils.throwException(5);},"should not throw exception");
    }
    @Test
    void testTimeout(){
        assertTimeoutPreemptively(Duration.ofSeconds(3),()->{demoUtils.checkTimeout();},"method should execute in 3 seconds" );
    }
    @Test
    void testMultiply(){
        assertEquals(12,demoUtils.multiply(3,4),"must be 12");
    }
}
