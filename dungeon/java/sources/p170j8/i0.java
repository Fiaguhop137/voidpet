package p170j8;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f46988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f46989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC3839d f46990c;

    public i0(AbstractC3839d abstractC3839d, Object obj) {
        Objects.requireNonNull(abstractC3839d);
        this.f46990c = abstractC3839d;
        this.f46988a = obj;
        this.f46989b = false;
    }

    protected abstract void a(Object obj);

    public final void b() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f46988a;
                if (this.f46989b) {
                    String string = toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f46989b = true;
        }
        c();
    }

    public final void c() {
        d();
        AbstractC3839d abstractC3839d = this.f46990c;
        synchronized (abstractC3839d.c0()) {
            abstractC3839d.c0().remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f46988a = null;
        }
    }
}
