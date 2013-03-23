package ua.kpi.oblamskyiv;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
    @Test
    public void shouldSizeBe3WhenCubeCreated() {
        Rubik cube = game.getRubik();
        assertRubiksSize(3, cube);
    }

    private void assertRubiksSize(int size, Rubik cube) {
        assertEquals("front size", size, cube.getFront().size());
        assertEquals("back size", size, cube.getBack().size());
        assertEquals("up size", size, cube.getUp().size());
        assertEquals("down size", size, cube.getDown().size());
        assertEquals("left size", size, cube.getLeft().size());
        assertEquals("right size", size, cube.getRight().size());
    }

    // На початку кожна грань має свій колір (число)
    @Test
    public void shouldEdgesHaveCorrespondingColorsWhenCreated() {
        Rubik cube = game.getRubik();
        assertEdgeColor("front color", Rubik.FRONT_COLOR_ID, cube.getFront());
        assertEdgeColor("back color", Rubik.BACK_COLOR_ID, cube.getBack());
        assertEdgeColor("up color", Rubik.UP_COLOR_ID, cube.getUp());
        assertEdgeColor("down color", Rubik.DOWN_COLOR_ID, cube.getDown());
        assertEdgeColor("left color", Rubik.LEFT_COLOR_ID, cube.getLeft());
        assertEdgeColor("right color", Rubik.RIGHT_COLOR_ID, cube.getRight());
    }

    private void assertEdgeColor(String info, int colorID, Edge edge) {
        int[][] expected =
                {{colorID, colorID, colorID},
                {colorID, colorID, colorID},
                {colorID, colorID, colorID}};
        assertTrue(info, ArrayUtils.isEquals(expected, edge.toArray()));
    }


    // Кубик випадково перемішується
    // Можна повертати всі грані
    // Коли кожна грань буде однакового кольору - кінець гри


}
