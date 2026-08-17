package p216m0;

import android.view.MotionEvent;
import p019b0.e;

/* JADX INFO: renamed from: m0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C3988k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3988k f48877a = new C3988k();

    private C3988k() {
    }

    public final long a(MotionEvent motionEvent, int i10) {
        float rawX = motionEvent.getRawX(i10);
        return e.e((((long) Float.floatToRawIntBits(motionEvent.getRawY(i10))) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
    }
}
