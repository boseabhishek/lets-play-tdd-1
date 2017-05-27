package lets.play.tdd;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OcrAlarmTest {


    private OcrAlaramClock clock;

    @Before
    public void setUp() throws Exception {
        clock = new OcrAlaramClock();
    }

    @Test
    public void testOcrAlarmClockTicksEveryMinute() {
        String result = clock.generateOcrAlarmSounds("10:45");
        assertEquals("tick", result);
    }

    @Test
    public void tsetOcrAlarmClockBeepsEeveryHour() {
        String result = clock.generateOcrAlarmSounds("10:00");
        assertEquals("beep", result);
    }

    @Test
    public void testOcrClockTicksWhenTimeIsQuarterPast10() {
        String result = clock.generateOcrAlarmSounds("10:15");
        assertEquals("tick", result);
    }

    @Test
    public void testOcrAlarmClockBeepsAt12Noon() {
        String result = clock.generateOcrAlarmSounds("12:00");
        assertEquals("beep", result);
    }

    @Test
    public void testWakesYouUpAt7() {
        String result = clock.generateOcrAlarmSounds("07:00");
        assertEquals("wake up", result);
    }


}
