package p180k0;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final long a(KeyEvent keyEvent) {
        return f.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? c.f47765a.c() : c.f47765a.b();
        }
        return c.f47765a.a();
    }

    public static final boolean c(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
