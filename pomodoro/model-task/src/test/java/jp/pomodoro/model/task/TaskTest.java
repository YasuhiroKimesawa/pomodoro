package jp.pomodoro.model.task;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskTest
{

    @Test
    public void testSampleCals()
    {
        assertEquals( 4, new Task().sampleCals() );
    }

}
