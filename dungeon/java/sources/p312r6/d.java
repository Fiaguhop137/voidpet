package p312r6;

import Ad.v;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.N;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f52403a = new d();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f52404a = d.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f52405b = true;

        public final Map a() {
            if (!this.f52405b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f52405b = false;
            return this.f52404a;
        }

        public final a b(Object obj, Object obj2) {
            if (!this.f52405b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f52404a.put(obj, obj2);
            return this;
        }
    }

    private d() {
    }

    public static final a a() {
        return new a();
    }

    public static final HashMap b() {
        return new HashMap();
    }

    public static final Map c(Object obj, Object obj2) {
        return N.k(v.a(obj, obj2));
    }

    public static final Map d(Object obj, Object obj2, Object obj3, Object obj4) {
        return N.k(v.a(obj, obj2), v.a(obj3, obj4));
    }

    public static final Map e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return N.k(v.a(obj, obj2), v.a(obj3, obj4), v.a(obj5, obj6));
    }
}
