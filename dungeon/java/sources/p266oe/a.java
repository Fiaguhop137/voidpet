package p266oe;

import Re.AbstractC1388d0;
import Re.G;
import Re.I0;
import java.util.Set;
import kotlin.collections.W;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p015ae.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends G {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I0 f50593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f50594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f50595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f50596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f50597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC1388d0 f50598i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(I0 howThisTypeIsUsed, c flexibility, boolean z10, boolean z11, Set set, AbstractC1388d0 abstractC1388d0) {
        super(howThisTypeIsUsed, set, abstractC1388d0);
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        this.f50593d = howThisTypeIsUsed;
        this.f50594e = flexibility;
        this.f50595f = z10;
        this.f50596g = z11;
        this.f50597h = set;
        this.f50598i = abstractC1388d0;
    }

    public /* synthetic */ a(I0 i10, c cVar, boolean z10, boolean z11, Set set, AbstractC1388d0 abstractC1388d0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? c.INFLEXIBLE : cVar, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : set, (i11 & 32) != 0 ? null : abstractC1388d0);
    }

    public static /* synthetic */ a f(a aVar, I0 i10, c cVar, boolean z10, boolean z11, Set set, AbstractC1388d0 abstractC1388d0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = aVar.f50593d;
        }
        if ((i11 & 2) != 0) {
            cVar = aVar.f50594e;
        }
        if ((i11 & 4) != 0) {
            z10 = aVar.f50595f;
        }
        if ((i11 & 8) != 0) {
            z11 = aVar.f50596g;
        }
        if ((i11 & 16) != 0) {
            set = aVar.f50597h;
        }
        if ((i11 & 32) != 0) {
            abstractC1388d0 = aVar.f50598i;
        }
        Set set2 = set;
        AbstractC1388d0 abstractC1388d1 = abstractC1388d0;
        return aVar.e(i10, cVar, z10, z11, set2, abstractC1388d1);
    }

    @Override // Re.G
    public AbstractC1388d0 a() {
        return this.f50598i;
    }

    @Override // Re.G
    public I0 b() {
        return this.f50593d;
    }

    @Override // Re.G
    public Set c() {
        return this.f50597h;
    }

    public final a e(I0 howThisTypeIsUsed, c flexibility, boolean z10, boolean z11, Set set, AbstractC1388d0 abstractC1388d0) {
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return new a(howThisTypeIsUsed, flexibility, z10, z11, set, abstractC1388d0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.b(aVar.a(), a()) && aVar.b() == b() && aVar.f50594e == this.f50594e && aVar.f50595f == this.f50595f && aVar.f50596g == this.f50596g;
    }

    public final c g() {
        return this.f50594e;
    }

    public final boolean h() {
        return this.f50596g;
    }

    @Override // Re.G
    public int hashCode() {
        AbstractC1388d0 abstractC1388d0A = a();
        int iHashCode = abstractC1388d0A != null ? abstractC1388d0A.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + b().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f50594e.hashCode();
        int i10 = iHashCode3 + (iHashCode3 * 31) + (this.f50595f ? 1 : 0);
        return i10 + (i10 * 31) + (this.f50596g ? 1 : 0);
    }

    public final boolean i() {
        return this.f50595f;
    }

    public final a j(boolean z10) {
        return f(this, null, null, z10, false, null, null, 59, null);
    }

    public a k(AbstractC1388d0 abstractC1388d0) {
        return f(this, null, null, false, false, null, abstractC1388d0, 31, null);
    }

    public final a l(c flexibility) {
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return f(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // Re.G
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a d(m0 typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        return f(this, null, null, false, false, c() != null ? W.k(c(), typeParameter) : W.c(typeParameter), null, 47, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f50593d + ", flexibility=" + this.f50594e + ", isRaw=" + this.f50595f + ", isForAnnotationParameter=" + this.f50596g + ", visitedTypeParameters=" + this.f50597h + ", defaultType=" + this.f50598i + ')';
    }
}
