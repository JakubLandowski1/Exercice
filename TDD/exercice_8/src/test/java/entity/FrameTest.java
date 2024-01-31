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
    private Shoot shoot;
    @BeforeEach
    void setUp() {
        Mockito.when(shootGenerator.getRandomShoot()).thenReturn(1);
        frame = new Frame(shootGenerator);
        frame.makeShoot();
    }


// Série standard
    @Test
    public void addingPointWithFirstShoot() {
        Assertions.assertEquals(1, frame.getScore());
    }

    @Test
    public void addingPointWithSecondShoot() {
        frame.makeShoot();
        Assertions.assertEquals(2, frame.getScore());
    }

    @Test
    public void stopSeriesIfStrike () {
        Mockito.when(shootGenerator.getRandomShoot()).thenReturn(10);
        Assertions.assertTrue(shoot.stopRound());
    }

    @Test
    public void notAbleToShootMoreThanTwice() {
        frame.makeShoot();
        Assertions.assertThrowsExactly(StopException.class, () -> frame.makeShoot() );
    }

// Série finale

    @Test
    public void reshootAfterStrikeOnLastSeries() {
        Mockito.when(shootGenerator.getRandomShoot()).thenReturn(10);
        frame = new Frame(shootGenerator, 10);
        frame.makeShoot();
        frame.makeShoot();
        Assertions.assertEquals(30, frame.getScore());
    }

    @Test
    public void upTheScoreAfterOneStrikeAndOneReshoot() {
        Mockito.when(shootGenerator.getRandomShoot()).thenReturn(10);
        frame = new Frame(shootGenerator, 10);
        frame.makeShoot();
        frame = new Frame(shootGenerator, 2);
        frame.makeShoot();
        Assertions.assertEquals(12, frame.getScore());
    }


    @Test
    public void newShotAfterOneStrikeAndOneReshoot(){
        Mockito.when(shootGenerator.getRandomShoot()).thenReturn(10);
        frame = new Frame(shootGenerator, 10);
        frame.makeShoot();
        frame.makeShoot();
        frame.makeShoot();
        Assertions.assertEquals(30, frame.getScore());

    }

    @Test
    public void upTheScoreAfterStrikeAndReshoot(){
        Mockito.when(shootGenerator.getRandomShoot()).thenReturn(10);
        frame = new Frame(shootGenerator, 10);
        frame.makeShoot();
        frame = new Frame(shootGenerator, 2);
        frame.makeShoot();
        frame = new Frame(shootGenerator, 2);
        frame.makeShoot();
        Assertions.assertEquals(14, frame.getScore());
    }

    @Test
    public void reshootDuringSameSeriesIfSpare() {
        Mockito.when(shootGenerator.getRandomShoot()).thenReturn(6);
        frame = new Frame(shootGenerator, 10);
        frame.makeShoot();
        Mockito.when(shootGenerator.getRandomShoot()).thenReturn(4);
        frame.makeShoot();
        Mockito.when(shootGenerator.getRandomShoot()).thenReturn(4);
        frame.makeShoot();
        Assertions.assertEquals(14, frame.getScore());
    }

    @Test
    public void upTheScoreIfSpare() {
        Mockito.when(shootGenerator.getRandomShoot()).thenReturn(6);
        frame = new Frame(shootGenerator, 10);
        frame.makeShoot();
        Mockito.when(shootGenerator.getRandomShoot()).thenReturn(4);
        frame.makeShoot();
        Mockito.when(shootGenerator.getRandomShoot()).thenReturn(6);
        frame.makeShoot();
        Assertions.assertEquals(16,frame.getScore());
    }

    @Test
    public void notAbleToShootMoreThanFourForStandardShoot(){
        Mockito.when(shootGenerator.getRandomShoot()).thenReturn(6);
        frame = new Frame(shootGenerator, 10);
        frame.makeShoot();
        Mockito.when(shootGenerator.getRandomShoot()).thenReturn(4);
        frame.makeShoot();
        Mockito.when(shootGenerator.getRandomShoot()).thenReturn(6);
        frame.makeShoot();
        Assertions.assertThrowsExactly(StopException.class, ()-> frame.makeShoot());

    }
}
