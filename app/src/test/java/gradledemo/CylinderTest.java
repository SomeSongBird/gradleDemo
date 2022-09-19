package gradledemo;

import org.junit.Test;
import static org.junit.Assert.*;

public class CylinderTest{
    @Test public void testVolume(){
        float result = Cylinder.volume(16,29);
        assertEquals(result,23323.18,.01);
    }
    @Test public void testSA(){
        float result = Cylinder.surfaceArea(16,29);
        assertEquals(result,4523.89,.01);
    }
    @Test public void testLSA(){
        float result = Cylinder.lateralSurfaceArea(16,29);
        assertEquals(result,2915.39,.01);
    }
    @Test public void testTSA(){
        float result = Cylinder.topSurfaceArea(16,29);
        assertEquals(result,804.24,.01);
    }
}