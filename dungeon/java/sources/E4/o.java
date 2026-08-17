package E4;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import p323s.C4101a;
import p436y4.t;

/* JADX INFO: loaded from: classes.dex */
public class o implements Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f2658f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile com.bumptech.glide.l f2659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f2660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4101a f2661c = new C4101a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f2662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m f2663e;

    class a implements b {
        a() {
        }

        @Override // E4.o.b
        public com.bumptech.glide.l a(com.bumptech.glide.c cVar, j jVar, p pVar, Context context) {
            return new com.bumptech.glide.l(cVar, jVar, pVar, context);
        }
    }

    public interface b {
        com.bumptech.glide.l a(com.bumptech.glide.c cVar, j jVar, p pVar, Context context);
    }

    public o(b bVar) {
        bVar = bVar == null ? f2658f : bVar;
        this.f2660b = bVar;
        this.f2663e = new m(bVar);
        this.f2662d = b();
    }

    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static i b() {
        return (t.f57928f && t.f57927e) ? new h() : new f();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private com.bumptech.glide.l f(Context context) {
        if (this.f2659a == null) {
            synchronized (this) {
                try {
                    if (this.f2659a == null) {
                        this.f2659a = this.f2660b.a(com.bumptech.glide.c.d(context.getApplicationContext()), new E4.a(), new g(), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f2659a;
    }

    private static boolean g(Context context) {
        Activity activityC = c(context);
        return activityC == null || !activityC.isFinishing();
    }

    public com.bumptech.glide.l d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (L4.l.s() && !(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.j) {
                return e((androidx.fragment.app.j) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return d(contextWrapper.getBaseContext());
                }
            }
        }
        return f(context);
    }

    public com.bumptech.glide.l e(androidx.fragment.app.j jVar) {
        if (L4.l.r()) {
            return d(jVar.getApplicationContext());
        }
        a(jVar);
        this.f2662d.a(jVar);
        boolean zG = g(jVar);
        return this.f2663e.b(jVar, com.bumptech.glide.c.d(jVar.getApplicationContext()), jVar.y(), jVar.h0(), zG);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }
}
