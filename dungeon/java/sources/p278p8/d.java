package p278p8;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f50864b = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f50865a = null;

    public static c a(Context context) {
        return f50864b.b(context);
    }

    public final synchronized c b(Context context) {
        try {
            if (this.f50865a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f50865a = new c(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f50865a;
    }
}
