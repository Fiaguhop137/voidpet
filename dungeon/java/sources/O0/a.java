package O0;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final d a(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        P0.a aVarB = P0.b.f8570a.b(f10);
        if (aVarB == null) {
            aVarB = new u(f10);
        }
        return new g(f11, f10, aVarB);
    }
}
