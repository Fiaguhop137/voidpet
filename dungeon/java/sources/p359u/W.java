package p359u;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class W implements InterfaceC4210i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4223w f54837c;

    public W(int i10, int i11, InterfaceC4223w interfaceC4223w) {
        this.f54835a = i10;
        this.f54836b = i11;
        this.f54837c = interfaceC4223w;
    }

    public /* synthetic */ W(int i10, int i11, InterfaceC4223w interfaceC4223w, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? AbstractC4225y.c() : interfaceC4223w);
    }

    public boolean equals(Object obj) {
        if (obj instanceof W) {
            W w10 = (W) obj;
            if (w10.f54835a == this.f54835a && w10.f54836b == this.f54836b && Intrinsics.b(w10.f54837c, this.f54837c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p359u.InterfaceC4210i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public y0 a(X x10) {
        return new y0(this.f54835a, this.f54836b, this.f54837c);
    }

    public int hashCode() {
        return (((this.f54835a * 31) + this.f54837c.hashCode()) * 31) + this.f54836b;
    }
}
