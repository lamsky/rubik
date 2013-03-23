package ua.kpi.oblamskyiv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created with IntelliJ IDEA.
 * User: oblamskyiv
 * Date: 3/23/13
 * Time: 11:47 AM
 */
public class RubikTest {

    // Появляється кубик
    @Test
    public void shouldExistRubikWhenGameStarts() {
        Game game = new Game();
        assertNotNull(game.getRubik());
    }

    // Кубик розміром 3х3х3
    @Test
    public void shouldSizeBe3x3WhenCreated() {
        Game game = new Game();
        Rubik cube = game.getRubik();
        assertEquals(3, cube.getSize());
    }

    // Кубик випадково перемішується
    // Можна повертати всі грані
    // Коли кожна грань буде однакового кольору - кінець гри


}
