package Entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsBissextileTest {

    private Annee annee ;

    @Test
    void isBissextileTest () {
        annee = new Annee(400);

        Boolean result = annee.isBissextile() ;

        Assertions.assertTrue(result);

    }

    @Test
    void isBissextileTest2 () {
        annee = new Annee(100);

        Boolean result = annee.isBissextile() ;

        Assertions.assertFalse(result);

    }

    @Test
    void isBissextileTest4 () {
        annee = new Annee(4000);

        Boolean result = annee.isBissextile() ;

        Assertions.assertTrue(result);

    }

}
