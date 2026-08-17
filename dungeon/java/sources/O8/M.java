package O8;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
import p170j8.AbstractC3857w;
import p170j8.C3859y;
import p170j8.InterfaceC3858x;

/* JADX INFO: loaded from: classes2.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3858x f8482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f8483b = new AtomicLong(-1);

    M(Context context, String str) {
        this.f8482a = AbstractC3857w.b(context, C3859y.a().b("mlkit:vision").a());
    }

    public static M a(Context context) {
        return new M(context, "mlkit:vision");
    }
}
