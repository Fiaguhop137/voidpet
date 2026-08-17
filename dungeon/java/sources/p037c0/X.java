package p037c0;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X f26692a = new X();

    private X() {
    }

    public final void a(Canvas canvas, boolean z10) {
        if (z10) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
