package Entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest {
     @Test
     void testGetGrade() {
          // Arrange
          GradingCalculator gradingCalculator = new GradingCalculator();
          gradingCalculator.setScore(95);
          gradingCalculator.setAttendancePercentage(90);
          // Act
          char result = gradingCalculator.getGrade();
          // Assert
          Assertions.assertEquals('A', result);
     }

     @Test
     void testGetGrade1() {
          // Arrange
          GradingCalculator gradingCalculator = new GradingCalculator();
          gradingCalculator.setScore(85);
          gradingCalculator.setAttendancePercentage(90);
          // Act
          char result = gradingCalculator.getGrade();
          // Assert
          Assertions.assertEquals('B', result);
     }

     @Test
     void testGetGrade2() {
          // Arrange
          GradingCalculator gradingCalculator = new GradingCalculator();
          gradingCalculator.setScore(65);
          gradingCalculator.setAttendancePercentage(90);
          // Act
          char result = gradingCalculator.getGrade();
          // Assert
          Assertions.assertEquals('C', result);
     }

     @Test
     void testGetGrade3() {
          // Arrange
          GradingCalculator gradingCalculator = new GradingCalculator();
          gradingCalculator.setScore(95);
          gradingCalculator.setAttendancePercentage(65);
          // Act
          char result = gradingCalculator.getGrade();
          // Assert
          Assertions.assertEquals('B', result);
     }

     @Test
     void testGetGrade4() {
          // Arrange
          GradingCalculator gradingCalculator = new GradingCalculator();
          gradingCalculator.setScore(95);
          gradingCalculator.setAttendancePercentage(55);
          // Act
          char result = gradingCalculator.getGrade();
          // Assert
          Assertions.assertEquals('F', result);
     }

     void testGetGrade5() {
          // Arrange
          GradingCalculator gradingCalculator = new GradingCalculator();
          gradingCalculator.setScore(65);
          gradingCalculator.setAttendancePercentage(55);
          // Act
          char result = gradingCalculator.getGrade();
          // Assert
          Assertions.assertEquals('F', result);
     }

     void testGetGrade6() {
          // Arrange
          GradingCalculator gradingCalculator = new GradingCalculator();
          gradingCalculator.setScore(50);
          gradingCalculator.setAttendancePercentage(90);
          // Act
          char result = gradingCalculator.getGrade();
          // Assert
          Assertions.assertEquals('F', result);
     }
}

