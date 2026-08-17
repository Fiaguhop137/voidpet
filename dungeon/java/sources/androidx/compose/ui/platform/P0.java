package androidx.compose.ui.platform;

import android.view.MotionEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P0 f21936a = new P0();

    private P0() {
    }

    public final boolean a(@NotNull MotionEvent motionEvent, int i10) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i10)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i10)) & Integer.MAX_VALUE) < 2139095040;
    }
}
