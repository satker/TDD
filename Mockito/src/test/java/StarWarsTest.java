import org.junit.Rule;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class StarWarsTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();// rule может быть немколько в отличие от Runner

    @Mock
    private
    Robot r2d2;

    @InjectMocks
    private
    LukeSkywalker luke;

    @Test
    public void test() {
        Robot r2d2 = mock(Robot.class);
        List<String> fakeMemories =
                Arrays.asList("Death Star Planes",
                        "Flighter Control Instruction",
                        "Naboo Travel Guide");
        when(r2d2.getMemories()).thenReturn(fakeMemories);
        LukeSkywalker luce = new LukeSkywalker(r2d2);
        List<String> deathStarMemories = luce.askRobotAbout("Death Star");
        assertEquals(2, deathStarMemories.size());
    }

    @Test
    public void testVerify() {
        Robot c3po = mock(Robot.class);
        //List<String> fakeMemories = Arrays.asList("English", "French", "Jaja");
        LukeSkywalker luke = new LukeSkywalker(c3po);
        luke.makeRobotForget("Jaja");
        verify(c3po).removeMemoriesAbout("Jaja");
        verify(c3po, never()).removeMemoriesAbout("Death Star");
        verify(c3po, times(1)).removeMemoriesAbout("Jaja");
        verify(c3po, atLeastOnce()).removeMemoriesAbout("Jaja");
    }

    @Test
    public void bdd_style() {
        Robot r2d2 = mock(Robot.class);

        List<String> fakeMemories =
                Arrays.asList("Death Star Planes",
                        "Flighter Control Instruction",
                        "Naboo Travel Guide");

        // given
        given(r2d2.getMemories()).willReturn(fakeMemories);

        // when
        LukeSkywalker luce = new LukeSkywalker(r2d2);

        List<String> deathStarMemories = luce.askRobotAbout("Death Star");

        // then
        assertThat(deathStarMemories.size(), is(2));
    }

    @Test
    public void testCaptor() {
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        Robot r2d2 = mock(Robot.class);

        List<String> fakeMemories =
                Arrays.asList("Death Star Planes",
                        "Flighter Control Instruction",
                        "Naboo Travel Guide");

        when(r2d2.getMemories()).thenReturn(fakeMemories);

        LukeSkywalker luke = new LukeSkywalker(r2d2);

        luke.askRobotAbout("Death Star");

        verify(r2d2).removeMemoriesAbout(captor.capture());

        assertEquals("Death Star", captor.getValue());
    }

    @Test
    public void testXtra() {
        List<String> fakeMemories =
                Arrays.asList("Death Star Planes",
                        "Flighter Control Instruction",
                        "Naboo Travel Guide");

        when(r2d2.getMemories()).thenReturn(fakeMemories);

        List<String> d = luke.askRobotAbout("Death Star");

        assertEquals(2, d.size());
    }
}