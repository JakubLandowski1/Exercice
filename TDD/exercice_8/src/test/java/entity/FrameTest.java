package entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FrameTest {

    @Mock
    private ShootGenerator shootGenerator;
    private Frame frame;



// Série standard
    @Test
    public void addingPointWithFirstShoot() {
        Mockito.when(shootGenerator.getRandomShoot(10)).thenReturn(1);
        frame = new Frame(shootGenerator, 0);
        frame.makeShoot();
        Assertions.assertEquals(1, frame.getScore());
    }

    @Test
    public void addingPointWithSecondShoot() {
        Mockito.when(shootGenerator.getRandomShoot(10)).thenReturn(1);
        frame = new Frame(shootGenerator, 0);
        frame.makeShoot();
        Mockito.when(shootGenerator.getRandomShoot(9)).thenReturn(1);
        frame.makeShoot();
        Assertions.assertEquals(2, frame.getScore());
    }

    @Test
    public void stopSeriesIfStrike () {
        Mockito.when(shootGenerator.getRandomShoot(10)).thenReturn(10);
        frame = new Frame(shootGenerator, 0);
        frame.makeShoot();
        Assertions.assertTrue(frame.stopRound());
    }

    @Test
    public void notAbleToShootMoreThanTwice() {
        Mockito.when(shootGenerator.getRandomShoot(10)).thenReturn(1);
        frame = new Frame(shootGenerator, 0);
        frame.makeShoot();
        frame.makeShoot();
        Assertions.assertThrowsExactly(StopException.class, () -> frame.makeShoot() );
    }

// Série finale

    @Test
    public void reshootAfterStrikeOnLastSeries() {
        Mockito.when(shootGenerator.getRandomShoot(10)).thenReturn(10);
        frame = new Frame(shootGenerator, 10);
        frame.makeShoot();
        frame.makeShoot();
        frame.makeShoot();
        Assertions.assertEquals(30, frame.getScore());
    }

    @Test
    public void upTheScoreAfterOneStrikeAndOneReshoot() {
        Mockito.when(shootGenerator.getRandomShoot(10)).thenReturn(10);
        frame = new Frame(shootGenerator, 10);
        frame.makeShoot();
        Mockito.when(shootGenerator.getRandomShoot(10)).thenReturn(2);
        frame.makeShoot();
        Assertions.assertEquals(12, frame.getScore());
    }


    @Test
    public void newShotAfterOneStrikeAndOneReshoot(){
        Mockito.when(shootGenerator.getRandomShoot(10)).thenReturn(10);
        frame = new Frame(shootGenerator, 10);
        frame.makeShoot();
        frame.makeShoot();
        frame.makeShoot();
        Assertions.assertEquals(30, frame.getScore());

    }

    @Test
    public void upTheScoreAfterStrikeAndReshoot(){
        Mockito.when(shootGenerator.getRandomShoot(10)).thenReturn(10);
        frame = new Frame(shootGenerator, 10);
        frame.makeShoot();
        Mockito.when(shootGenerator.getRandomShoot(10)).thenReturn(2);
        frame.makeShoot();
        Mockito.when(shootGenerator.getRandomShoot(8)).thenReturn(2);
        frame.makeShoot();
        Assertions.assertEquals(14, frame.getScore());
    }

    @Test
    public void reshootDuringSameSeriesIfSpare() {
        Mockito.when(shootGenerator.getRandomShoot(10)).thenReturn(6);
        frame = new Frame(shootGenerator, 10);
        frame.makeShoot();
        Mockito.when(shootGenerator.getRandomShoot(4)).thenReturn(4);
        frame.makeShoot();
        Mockito.when(shootGenerator.getRandomShoot(10)).thenReturn(4);
        frame.makeShoot();
        Assertions.assertEquals(14, frame.getScore());
    }

    @Test
    public void upTheScoreIfSpare() {
        Mockito.when(shootGenerator.getRandomShoot(10)).thenReturn(6);
        frame = new Frame(shootGenerator, 10);
        frame.makeShoot();
        Mockito.when(shootGenerator.getRandomShoot(4)).thenReturn(4);
        frame.makeShoot();
        Mockito.when(shootGenerator.getRandomShoot(10)).thenReturn(6);
        frame.makeShoot();
        Assertions.assertEquals(16,frame.getScore());
    }

    @Test
    public void notAbleToShootMoreThanFourForStandardShoot(){
        Mockito.when(shootGenerator.getRandomShoot(10)).thenReturn(6);
        frame = new Frame(shootGenerator, 10);
        frame.makeShoot();
        Mockito.when(shootGenerator.getRandomShoot(4)).thenReturn(4);
        frame.makeShoot();
        Mockito.when(shootGenerator.getRandomShoot(10)).thenReturn(6);
        frame.makeShoot();
        Assertions.assertThrowsExactly(StopException.class, ()-> frame.makeShoot());

    }
}
