package p037c0;

import androidx.compose.ui.graphics.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class A0 {
    public static final long a(float f10, float f11) {
        return i.b((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }
}
