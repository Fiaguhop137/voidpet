package p314r8;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.AbstractC2346o;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f52424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f52425b;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected c(String str) {
        this.f52424a = str;
    }

    protected abstract Object a(IBinder iBinder);

    protected final Object b(Context context) throws a {
        if (this.f52425b == null) {
            r.l(context);
            Context contextD = AbstractC2346o.d(context);
            if (contextD == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.f52425b = a((IBinder) contextD.getClassLoader().loadClass(this.f52424a).newInstance());
            } catch (ClassNotFoundException e10) {
                throw new a("Could not load creator class.", e10);
            } catch (IllegalAccessException e11) {
                throw new a("Could not access creator.", e11);
            } catch (InstantiationException e12) {
                throw new a("Could not instantiate creator.", e12);
            }
        }
        return this.f52425b;
    }
}
