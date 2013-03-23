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
     public void shouldExistEdgesWhenRubikCreated() {
        Rubik cube = game.getRubik();
        assertEdgesExistence(cube);
    }

    private void assertEdgesExistence(Rubik cube) {
        assertNotNull("front", cube.getFront());
        assertNotNull("back", cube.getBack());
        assertNotNull("up", cube.getUp());
        assertNotNull("down", cube.getDown());
        assertNotNull("left", cube.getLeft());
        assertNotNull("right", cube.getRight());
    }


    // Кубик розміром 3х3х3
    // Кубик випадково перемішується
    // Можна повертати всі грані
    // Коли кожна грань буде однакового кольору - кінець гри


}
