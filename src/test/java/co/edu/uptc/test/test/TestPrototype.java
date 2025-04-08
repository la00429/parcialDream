package co.edu.uptc.test.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import co.edu.uptc.model.Dream;
import co.edu.uptc.prototype.DreamListImplementation;

public class TestPrototype {

    private Dream createSampleDream(long id) {
        return new Dream(id, "Lucid dream " + id, 2.5, 7.0, 8.5);
    }

    @Test
    public void testShallowClone() {
        Dream dream1 = createSampleDream(1);
        Dream dream2 = createSampleDream(2);

        DreamListImplementation original = new DreamListImplementation();
        original.clone().getDreams().add(dream1);
        original.getDreams().add(dream2);

        DreamListImplementation shallowClone = original.clone();

        assertNotSame(original, shallowClone, "The shallow clone should be a different object");
        assertEquals(original.getDreams(), shallowClone.getDreams(), "Dream lists should be equal in content");
        assertSame(original.getDreams().get(0), shallowClone.getDreams().get(0), "Dream objects should be same reference");
    }

    @Test
    public void testDeepClone() {
        Dream dream1 = createSampleDream(1);
        Dream dream2 = createSampleDream(2);

        DreamListImplementation original = new DreamListImplementation();
        original.getDreams().add(dream1);
        original.getDreams().add(dream2);

        DreamListImplementation deepClone = original.deepClone();

        assertNotSame(original, deepClone, "The deep clone should be a different object");
        assertEquals(original.getDreams().size(), deepClone.getDreams().size(), "Both lists should have same size");

        for (int i = 0; i < original.getDreams().size(); i++) {
            Dream originalDream = original.getDreams().get(i);
            Dream clonedDream = deepClone.getDreams().get(i);

            assertNotSame(originalDream, clonedDream, "Dream object should be a different reference");
            assertEquals(originalDream, clonedDream, "Dream object should have same content");
        }
    }

    @Test
    public void testModifyingShallow() {
        Dream dream = createSampleDream(1);

        DreamListImplementation original = new DreamListImplementation();
        original.getDreams().add(dream);

        DreamListImplementation shallowClone = original.clone();
        shallowClone.getDreams().get(0).setDescription("Changed in clone");

        assertEquals("Changed in clone", original.getDreams().get(0).getDescription(),
        "Change in shallow clone affects original (shared object)");
    }

    @Test
    public void testModifyingDeepClone() {
        Dream dream = createSampleDream(1);

        DreamListImplementation original = new DreamListImplementation();
        original.getDreams().add(dream);

        DreamListImplementation deepClone = original.deepClone();
        deepClone.getDreams().get(0).setDescription("Changed in deep clone");

        assertEquals("Lucid dream 1", original.getDreams().get(0).getDescription(),
                "Original should not be affected by changes in deep clone");
        assertEquals("Changed in deep clone", deepClone.getDreams().get(0).getDescription(),
                "Clone should reflect the new description");
    }

    @Test
    public void testCloneOfSingleDream() {
        Dream original = createSampleDream(1);
        Dream clone = original.clone();

        assertNotSame(original, clone, "Dream clone should be a different object");
        assertEquals(original, clone, "Dream clone should have the same content");
    }

    @Test
    public void testDeepCloneOfSingleDream() {
        Dream original = createSampleDream(2);
        Dream deepClone = original.deepClone();

        assertNotSame(original, deepClone, "Dream deep clone should be a different object");
        assertEquals(original, deepClone, "Dream deep clone should have the same content");
    }

    @Test
    public void testMultipleLevelsOfCloning() {
        DreamListImplementation original = new DreamListImplementation();
        original.getDreams().add(createSampleDream(1));
        original.getDreams().add(createSampleDream(2));

        DreamListImplementation clone1 = original.clone();
        DreamListImplementation deepClone1 = original.deepClone();

        DreamListImplementation deepClone2 = deepClone1.deepClone();
        DreamListImplementation clone2 = clone1.clone();

        assertEquals(2, clone2.getDreams().size());
        assertEquals(2, deepClone2.getDreams().size());

        deepClone2.getDreams().get(0).setDescription("Completely altered");

        assertNotEquals("Completely altered", original.getDreams().get(0).getDescription());
        assertNotEquals("Completely altered", deepClone1.getDreams().get(0).getDescription());
    }
}