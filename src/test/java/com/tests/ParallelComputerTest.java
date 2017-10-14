package com.tests;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

public class ParallelComputerTest {

    // https://gist.github.com/djangofan/4997487
    @Test
    public void test(){
        Class[] cls={IMDBTests.class,Firefox.class };
        JUnitCore.runClasses(ParallelComputer.classes(), cls);
    }
}
