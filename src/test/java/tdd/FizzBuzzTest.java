package tdd;

import com.luv2code.tdd.FizzBuzz;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTest {
    @DisplayName("Divisible by Three")
    @Test
    @Order(1)
    void testForDivisibleByThree(){
//        fail("fail");
        String expected="Fizz";
        assertEquals(expected, FizzBuzz.compute(3),"should be return Fizz");
    }
    @DisplayName("Divisible by Five")
    @Test
    @Order(2)
    void testForDivisibleByFive(){
        String expected="Buzz";
        assertEquals(expected,FizzBuzz.compute(5),"should be return Buzz");
    }
    @DisplayName("Divisible by Three and Five")
    @Test
    @Order(3)
    void testForDivisibleByThreeAndFive(){
        String expected="FizzBuzz";
        assertEquals(expected,FizzBuzz.compute(15),"should be return FizzBuzz");
    }

    @DisplayName("Not Divisible by Three or Five")
    @Test
    @Order(4)
    void testForNotDivisibleByThreeOrFive(){
        String expected="1";
        assertEquals(expected,FizzBuzz.compute(1),"should be return 1");
    }


}
