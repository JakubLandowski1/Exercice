package Entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Search {

    private Town town;

    @Test
    public void searchTownByTwoLettersTest() {
        town = new Town("Pa");
        List<String> result = town.searchTown();
        String excepted = String.valueOf(2);

        Assertions.assertThrows(excepted, result);
    }

    @Test
    public void searchTownByTwoLettersOrMore () {
        town = new Town("Va");
        List<String> result = town.searchTown;
        List<String> excepted = Arrays.asList("Valence", "Vancouver");

        Assertions.assertEquals(excepted, result);
    }

    @Test
    public void searchTownBySpace() {
        town = new Town("Va ");


    }


}
