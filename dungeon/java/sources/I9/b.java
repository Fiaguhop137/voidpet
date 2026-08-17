package I9;

import H9.e;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2651z1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public class b implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f5093c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final S8.a f5094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f5095b;

    b(S8.a aVar) {
        r.l(aVar);
        this.f5094a = aVar;
        this.f5095b = new ConcurrentHashMap();
    }

    public static a c(e eVar, Context context, T9.d dVar) {
        r.l(eVar);
        r.l(context);
        r.l(dVar);
        r.l(context.getApplicationContext());
        if (f5093c == null) {
            synchronized (b.class) {
                try {
                    if (f5093c == null) {
                        Bundle bundle = new Bundle(1);
                        if (eVar.x()) {
                            dVar.b(H9.b.class, d.f5097a, c.f5096a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", eVar.w());
                        }
                        f5093c = new b(C2651z1.s(context, bundle).t());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5093c;
    }

    static /* synthetic */ void d(T9.a aVar) {
        boolean z10 = ((H9.b) aVar.a()).f4244a;
        synchronized (b.class) {
            ((b) r.l(f5093c)).f5094a.c(z10);
        }
    }

    @Override // I9.a
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.b(str2, bundle) && com.google.firebase.analytics.connector.internal.b.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f5094a.a(str, str2, bundle);
        }
    }

    @Override // I9.a
    public void b(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.c(str, str2)) {
            this.f5094a.b(str, str2, obj);
        }
    }
}
