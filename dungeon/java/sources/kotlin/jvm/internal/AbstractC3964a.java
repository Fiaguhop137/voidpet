package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3964a implements InterfaceC3973j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f48352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f48353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f48354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f48355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f48356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f48357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f48358g;

    public AbstractC3964a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f48352a = obj;
        this.f48353b = cls;
        this.f48354c = str;
        this.f48355d = str2;
        this.f48356e = (i11 & 1) == 1;
        this.f48357f = i10;
        this.f48358g = i11 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3964a)) {
            return false;
        }
        AbstractC3964a abstractC3964a = (AbstractC3964a) obj;
        return this.f48356e == abstractC3964a.f48356e && this.f48357f == abstractC3964a.f48357f && this.f48358g == abstractC3964a.f48358g && Intrinsics.b(this.f48352a, abstractC3964a.f48352a) && Intrinsics.b(this.f48353b, abstractC3964a.f48353b) && this.f48354c.equals(abstractC3964a.f48354c) && this.f48355d.equals(abstractC3964a.f48355d);
    }

    @Override // kotlin.jvm.internal.InterfaceC3973j
    public int getArity() {
        return this.f48357f;
    }

    public int hashCode() {
        Object obj = this.f48352a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f48353b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f48354c.hashCode()) * 31) + this.f48355d.hashCode()) * 31) + (this.f48356e ? 1231 : 1237)) * 31) + this.f48357f) * 31) + this.f48358g;
    }

    public String toString() {
        return F.l(this);
    }
}
