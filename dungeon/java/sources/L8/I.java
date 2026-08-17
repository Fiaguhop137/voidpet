package L8;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class I {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference f6424e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f6425f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f6426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1156j f6427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p404w8.o f6428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.games.internal.v2.appshortcuts.f f6429d;

    private I(Application application, C1156j c1156j, p404w8.o oVar, com.google.android.gms.games.internal.v2.appshortcuts.f fVar) {
        this.f6426a = application;
        this.f6427b = c1156j;
        this.f6428c = oVar;
        this.f6429d = fVar;
    }

    public static void a(Context context) {
        p170j8.r.a(context != null);
        AtomicReference atomicReference = f6424e;
        if (atomicReference.get() == null) {
            synchronized (atomicReference) {
                try {
                    if (atomicReference.get() == null) {
                        Context applicationContext = context.getApplicationContext();
                        Application application = applicationContext != null ? (Application) applicationContext : (Application) context;
                        I i10 = new I(application, C1156j.a(application), p404w8.o.a(application), com.google.android.gms.games.internal.v2.appshortcuts.f.b(context));
                        atomicReference.set(i10);
                        i10.f6429d.a();
                        i10.f6427b.b();
                        i10.f6428c.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f6425f = true;
    }

    public static void b() {
        p170j8.r.p(f6425f, "PlayGamesSdk has not been initialized. Ensure that PlayGamesSdk.initialize() has been called.");
    }

    public static Application c() {
        b();
        return ((I) f6424e.get()).f6426a;
    }
}
