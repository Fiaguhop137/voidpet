package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1957m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile C1957m f23519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C1957m f23520c = new C1957m(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f23521a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f23522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23523b;

        a(Object obj, int i10) {
            this.f23522a = obj;
            this.f23523b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f23522a == aVar.f23522a && this.f23523b == aVar.f23523b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f23522a) * 65535) + this.f23523b;
        }
    }

    C1957m(boolean z10) {
    }

    public static C1957m b() {
        C1957m c1957mA;
        if (W.f23399d) {
            return f23520c;
        }
        C1957m c1957m = f23519b;
        if (c1957m != null) {
            return c1957m;
        }
        synchronized (C1957m.class) {
            try {
                c1957mA = f23519b;
                if (c1957mA == null) {
                    c1957mA = AbstractC1956l.a();
                    f23519b = c1957mA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1957mA;
    }

    public AbstractC1963t.c a(K k10, int i10) {
        android.support.v4.media.session.b.a(this.f23521a.get(new a(k10, i10)));
        return null;
    }
}
