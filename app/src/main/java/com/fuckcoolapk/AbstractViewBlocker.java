package com.fuckcoolapk;

import android.view.View;

/**
 * Created by w568w on 18-5-6.
 *
 * @author w568w
 */
public abstract class AbstractViewBlocker {
    public final void treatOrBlock(View view, String id, String className) {
        if (shouldBlock(view, id, className)) {
            InitHook.ViewBlocker.getInstance().block(view);
        }
    }

    public abstract boolean shouldBlock(View view, String id, String className);
}
