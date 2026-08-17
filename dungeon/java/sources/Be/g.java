package Be;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f735b = new g(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f736a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f738b;

        a(Object obj, int i10) {
            this.f737a = obj;
            this.f738b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f737a == aVar.f737a && this.f738b == aVar.f738b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f737a) * 65535) + this.f738b;
        }
    }

    g() {
        this.f736a = new HashMap();
    }

    private g(boolean z10) {
        this.f736a = Collections.EMPTY_MAP;
    }

    public static g c() {
        return f735b;
    }

    public static g d() {
        return new g();
    }

    public final void a(i.f fVar) {
        this.f736a.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public i.f b(p pVar, int i10) {
        return (i.f) this.f736a.get(new a(pVar, i10));
    }
}
