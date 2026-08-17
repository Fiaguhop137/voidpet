package p216m0;

import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {
    public static final void a(long j10, Function1 function1) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j10, j10, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        function1.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static final void b(C3993p c3993p, long j10, Function1 function1) {
        d(c3993p, j10, function1, true);
    }

    public static final void c(C3993p c3993p, long j10, Function1 function1) {
        d(c3993p, j10, function1, false);
    }

    private static final void d(C3993p c3993p, long j10, Function1 function1, boolean z10) {
        MotionEvent motionEventF = c3993p.f();
        if (motionEventF == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventF.getAction();
        if (z10) {
            motionEventF.setAction(3);
        }
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        motionEventF.offsetLocation(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        function1.invoke(motionEventF);
        motionEventF.offsetLocation(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        motionEventF.setAction(action);
    }
}
