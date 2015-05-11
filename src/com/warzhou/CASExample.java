package com.warzhou;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by warzhou1 on 5/11/15.
 */
public class CASExample {

    private AtomicBoolean locked = new AtomicBoolean(false);

    public boolean lock() {
        return locked.compareAndSet(false, true);
    }

    public boolean unlock() {
        return locked.compareAndSet(true, false);
    }

    public boolean getStatus() {
        return locked.get();
    }

}
