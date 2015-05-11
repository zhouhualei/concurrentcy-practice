package com.warzhou;

import org.junit.Test;

import static org.junit.Assert.*;

public class CASExampleTest {

    @Test
    public void testLock1() throws Exception {
        CASExample example = new CASExample();
        example.lock();
        assertEquals(example.getStatus(), true);
    }

    @Test
    public void testUnlock1() throws Exception {
        CASExample example = new CASExample();
        example.unlock();
        assertEquals(example.getStatus(), false);
    }

    @Test
    public void testLockThenUnlock() throws Exception {
        CASExample example = new CASExample();
        example.lock();
        assertEquals(example.getStatus(), true);
        example.unlock();
        assertEquals(example.getStatus(), false);
    }}