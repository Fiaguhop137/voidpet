package Z4;

import V4.k;
import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Cloneable, Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f18768f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f18771a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final i f18772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f18773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Throwable f18774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Class f18767e = a.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final h f18769g = new C0233a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c f18770h = new b();

    /* JADX INFO: renamed from: Z4.a$a, reason: collision with other inner class name */
    class C0233a implements h {
        C0233a() {
        }

        @Override // Z4.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Closeable closeable) {
            try {
                V4.b.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    class b implements c {
        b() {
        }

        @Override // Z4.a.c
        public void a(i iVar, Throwable th) {
            Object objF = iVar.f();
            W4.a.G(a.f18767e, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), objF == null ? null : objF.getClass().getName());
        }

        @Override // Z4.a.c
        public boolean b() {
            return false;
        }
    }

    public interface c {
        void a(i iVar, Throwable th);

        boolean b();
    }

    protected a(i iVar, c cVar, Throwable th) {
        this.f18772b = (i) k.g(iVar);
        iVar.b();
        this.f18773c = cVar;
        this.f18774d = th;
    }

    protected a(Object obj, h hVar, c cVar, Throwable th, boolean z10) {
        this.f18772b = new i(obj, hVar, z10);
        this.f18773c = cVar;
        this.f18774d = th;
    }

    public static a F(Object obj, h hVar, c cVar, Throwable th) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Bitmap) || (obj instanceof d)) {
            int i10 = f18768f;
            if (i10 == 1) {
                return new Z4.c(obj, hVar, cVar, th);
            }
            if (i10 == 2) {
                return new g(obj, hVar, cVar, th);
            }
            if (i10 == 3) {
                return new e(obj);
            }
        }
        return new Z4.b(obj, hVar, cVar, th);
    }

    public static a e(a aVar) {
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }

    public static List f(Collection collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(e((a) it.next()));
        }
        return arrayList;
    }

    public static void g(a aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    public static void h(Iterable iterable) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g((a) it.next());
            }
        }
    }

    public static boolean r(a aVar) {
        return aVar != null && aVar.p();
    }

    public static a s(Closeable closeable) {
        return x(closeable, f18769g);
    }

    public static a u(Closeable closeable, c cVar) {
        if (closeable == null) {
            return null;
        }
        return F(closeable, f18769g, cVar, cVar.b() ? new Throwable() : null);
    }

    public static a x(Object obj, h hVar) {
        return z(obj, hVar, f18770h);
    }

    public static a z(Object obj, h hVar, c cVar) {
        if (obj == null) {
            return null;
        }
        return F(obj, hVar, cVar, cVar.b() ? new Throwable() : null);
    }

    /* JADX INFO: renamed from: c */
    public abstract a clone();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.f18771a) {
                    return;
                }
                this.f18771a = true;
                this.f18772b.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized a d() {
        if (!p()) {
            return null;
        }
        return clone();
    }

    public synchronized Object m() {
        k.i(!this.f18771a);
        return k.g(this.f18772b.f());
    }

    public int o() {
        if (p()) {
            return System.identityHashCode(this.f18772b.f());
        }
        return 0;
    }

    public synchronized boolean p() {
        return !this.f18771a;
    }
}
