package p026b7;

import kotlin.ranges.e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final float a(float f10, float f11) {
        float fPow;
        if (f10 < Math.abs(f11)) {
            float f12 = 1;
            fPow = f12 + ((float) Math.pow((f10 / Math.abs(f11)) - f12, 3));
        } else {
            fPow = 1.0f;
        }
        return e.d(f10 + (f11 * fPow), 0.0f);
    }
}
