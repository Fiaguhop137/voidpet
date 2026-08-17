package F0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0974h f2821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f2822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f2825e;

    private E(AbstractC0974h abstractC0974h, r rVar, int i10, int i11, Object obj) {
        this.f2821a = abstractC0974h;
        this.f2822b = rVar;
        this.f2823c = i10;
        this.f2824d = i11;
        this.f2825e = obj;
    }

    public /* synthetic */ E(AbstractC0974h abstractC0974h, r rVar, int i10, int i11, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC0974h, rVar, i10, i11, obj);
    }

    public static /* synthetic */ E b(E e10, AbstractC0974h abstractC0974h, r rVar, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            abstractC0974h = e10.f2821a;
        }
        if ((i12 & 2) != 0) {
            rVar = e10.f2822b;
        }
        if ((i12 & 4) != 0) {
            i10 = e10.f2823c;
        }
        if ((i12 & 8) != 0) {
            i11 = e10.f2824d;
        }
        if ((i12 & 16) != 0) {
            obj = e10.f2825e;
        }
        Object obj3 = obj;
        int i13 = i10;
        return e10.a(abstractC0974h, rVar, i13, i11, obj3);
    }

    public final E a(AbstractC0974h abstractC0974h, r rVar, int i10, int i11, Object obj) {
        return new E(abstractC0974h, rVar, i10, i11, obj, null);
    }

    public final AbstractC0974h c() {
        return this.f2821a;
    }

    public final int d() {
        return this.f2823c;
    }

    public final r e() {
        return this.f2822b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return Intrinsics.b(this.f2821a, e10.f2821a) && Intrinsics.b(this.f2822b, e10.f2822b) && p.f(this.f2823c, e10.f2823c) && q.e(this.f2824d, e10.f2824d) && Intrinsics.b(this.f2825e, e10.f2825e);
    }

    public int hashCode() {
        AbstractC0974h abstractC0974h = this.f2821a;
        int iHashCode = (((((((abstractC0974h == null ? 0 : abstractC0974h.hashCode()) * 31) + this.f2822b.hashCode()) * 31) + p.g(this.f2823c)) * 31) + q.f(this.f2824d)) * 31;
        Object obj = this.f2825e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f2821a + ", fontWeight=" + this.f2822b + ", fontStyle=" + ((Object) p.h(this.f2823c)) + ", fontSynthesis=" + ((Object) q.g(this.f2824d)) + ", resourceLoaderCacheKey=" + this.f2825e + ')';
    }
}
