package Q;

import I.D;
import I.J;
import I.S0;
import I.i2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l extends N.d implements S0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f9212i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f9213j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final l f9214k;

    public static final class a extends N.f implements S0.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private l f9215g;

        public a(l lVar) {
            super(lVar);
            this.f9215g = lVar;
        }

        @Override // N.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof D) {
                return q((D) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof i2) {
                return r((i2) obj);
            }
            return false;
        }

        @Override // N.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof D) {
                return s((D) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof D) ? obj2 : t((D) obj, (i2) obj2);
        }

        @Override // N.f
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public l build() {
            l lVar;
            if (g() == this.f9215g.s()) {
                lVar = this.f9215g;
            } else {
                m(new P.e());
                lVar = new l(g(), size());
            }
            this.f9215g = lVar;
            return lVar;
        }

        public /* bridge */ boolean q(D d10) {
            return super.containsKey(d10);
        }

        public /* bridge */ boolean r(i2 i2Var) {
            return super.containsValue(i2Var);
        }

        @Override // N.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof D) {
                return v((D) obj);
            }
            return null;
        }

        public /* bridge */ i2 s(D d10) {
            return (i2) super.get(d10);
        }

        public /* bridge */ i2 t(D d10, i2 i2Var) {
            return (i2) super.getOrDefault(d10, i2Var);
        }

        public /* bridge */ i2 v(D d10) {
            return (i2) super.remove(d10);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a() {
            return l.f9214k;
        }
    }

    static {
        N.t tVarA = N.t.f7150e.a();
        Intrinsics.d(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f9214k = new l(tVarA, 0);
    }

    public l(N.t tVar, int i10) {
        super(tVar, i10);
    }

    public /* bridge */ boolean A(i2 i2Var) {
        return super.containsValue(i2Var);
    }

    public /* bridge */ i2 B(D d10) {
        return (i2) super.get(d10);
    }

    public /* bridge */ i2 C(D d10, i2 i2Var) {
        return (i2) super.getOrDefault(d10, i2Var);
    }

    @Override // I.I
    public Object a(D d10) {
        return J.b(this, d10);
    }

    @Override // N.d, kotlin.collections.AbstractC3944f, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof D) {
            return z((D) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC3944f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof i2) {
            return A((i2) obj);
        }
        return false;
    }

    @Override // N.d, kotlin.collections.AbstractC3944f, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof D) {
            return B((D) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof D) ? obj2 : C((D) obj, (i2) obj2);
    }

    @Override // I.S0
    public S0 l(D d10, i2 i2Var) {
        N.t.b bVarP = s().P(d10.hashCode(), d10, i2Var, 0);
        return bVarP == null ? this : new l(bVarP.a(), size() + bVarP.b());
    }

    @Override // N.d
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public a builder() {
        return new a(this);
    }

    public /* bridge */ boolean z(D d10) {
        return super.containsKey(d10);
    }
}
