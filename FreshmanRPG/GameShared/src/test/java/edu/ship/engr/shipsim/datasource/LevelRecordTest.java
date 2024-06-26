package edu.ship.engr.shipsim.datasource;

import edu.ship.engr.shipsim.testing.annotations.GameTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for LevelRecord
 *
 * @author Merlin
 */
@GameTest("GameShared")
public class LevelRecordTest
{

    /**
     * Test the compare to method in Level Record because it implements
     * Comparable<LevelRecord> Comparable only compares the experience points
     * required to get past a level
     */
    @Test
    public void testCompareTo()
    {
        LevelRecord a = new LevelRecord("a", 34, 1, 1);
        LevelRecord b = new LevelRecord("b", 35, 1, 1);
        LevelRecord c = new LevelRecord("b", 35, 1, 1);

        assertTrue(a.compareTo(b) < 0);
        assertTrue(b.compareTo(c) == 0);
        assertTrue(b.compareTo(a) > 0);
    }

}
