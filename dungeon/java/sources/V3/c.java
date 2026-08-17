package V3;

import android.content.Context;
import p077e4.r;

/* JADX INFO: loaded from: classes.dex */
public class c implements b {
    @Override // V3.b
    public a a(Context context) {
        return (context == null || r.f(context) != 0.0f) ? a.STANDARD_MOTION : a.REDUCED_MOTION;
    }
}
