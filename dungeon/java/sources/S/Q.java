package S;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class Q extends S implements Iterator, Nd.a {

    public static final class a implements Map.Entry, Nd.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f11323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f11324b;

        a() {
            Map.Entry entryD = Q.this.d();
            Intrinsics.c(entryD);
            this.f11323a = entryD.getKey();
            Map.Entry entryD2 = Q.this.d();
            Intrinsics.c(entryD2);
            this.f11324b = entryD2.getValue();
        }

        public void a(Object obj) {
            this.f11324b = obj;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f11323a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f11324b;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Q q10 = Q.this;
            if (q10.f().f() != ((S) q10).f11328c) {
                throw new ConcurrentModificationException();
            }
            Object value = getValue();
            q10.f().put(getKey(), obj);
            a(obj);
            return value;
        }
    }

    public Q(H h10, Iterator it) {
        super(h10, it);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        c();
        if (d() != null) {
            return new a();
        }
        throw new IllegalStateException();
    }
}
