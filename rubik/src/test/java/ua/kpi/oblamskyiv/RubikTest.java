package ua.kpi.oblamskyiv;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created with IntelliJ IDEA.
 * User: oblamskyiv
 * Date: 3/23/13
 * Time: 11:47 AM
 */
public class RubikTest {

    private Game game;

    @Before
    public void init() {
        game = new Game();
    }

    // Появляється кубик
    @Test
    public void shouldExistRubikWhenGameStarts() {
        assertNotNull(game.getRubik());
    }

    // Кубик має 6 граней
    @Test
     public void shouldExistFrontEdgeWhenRubikCreated() {
        Rubik cube = game.getRubik();
        assertNotNull(cube.getFront());
    }

    @Test
    public void shouldExistBackEdgeWhenRubikCreated() {
        Rubik cube = game.getRubik();
        assertNotNull(cube.getBack());
    }



    // Кубик розміром 3х3х3
    // Кубик випадково перемішується
    // Можна повертати всі грані
    // Коли кожна грань буде однакового кольору - кінець гри


}
