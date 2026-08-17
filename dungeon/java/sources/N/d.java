package N;

import java.util.Set;
import kotlin.collections.AbstractC3944f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class d extends AbstractC3944f implements L.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f7125f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f7126g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d f7127h = new d(t.f7150e.a(), 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t f7128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7129e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            d dVar = d.f7127h;
            Intrinsics.d(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dVar;
        }
    }

    public d(t tVar, int i10) {
        this.f7128d = tVar;
        this.f7129e = i10;
    }

    private final L.d q() {
        return new n(this);
    }

    @Override // kotlin.collections.AbstractC3944f, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f7128d.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractC3944f
    public final Set d() {
        return q();
    }

    @Override // kotlin.collections.AbstractC3944f
    public int f() {
        return this.f7129e;
    }

    @Override // kotlin.collections.AbstractC3944f, java.util.Map
    public Object get(Object obj) {
        return this.f7128d.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // L.f
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public f builder() {
        return new f(this);
    }

    @Override // kotlin.collections.AbstractC3944f
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public L.d e() {
        return new p(this);
    }

    public final t s() {
        return this.f7128d;
    }

    @Override // kotlin.collections.AbstractC3944f
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public L.b g() {
        return new r(this);
    }

    public d v(Object obj, Object obj2) {
        t.b bVarP = this.f7128d.P(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return bVarP == null ? this : new d(bVarP.a(), size() + bVarP.b());
    }

    public d w(Object obj) {
        t tVarQ = this.f7128d.Q(obj != null ? obj.hashCode() : 0, obj, 0);
        if (this.f7128d == tVarQ) {
            return this;
        }
        return tVarQ == null ? f7125f.a() : new d(tVarQ, size() - 1);
    }
}
