package Entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FibTest {

    @Test
    void testGetFibSeries (){
        //Arrange
        Fib fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();
        List<Integer> expected = Arrays.asList(0);

        // Assert
        Assertions.assertEquals(expected,result );
    }


    @Test
    void testGetFibSeries2 (){
        //Arrange
        Fib fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();
        List<Integer> expected = Arrays.asList(0,1,1,2,3,5);

        // Assert
        Assertions.assertEquals(expected,result );
    }



}
