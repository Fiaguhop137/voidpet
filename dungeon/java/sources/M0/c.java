package M0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p037c0.P;
import p037c0.Z;

/* JADX INFO: loaded from: classes.dex */
final class c implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6676b;

    private c(long j10) {
        this.f6676b = j10;
        if (j10 != 16) {
            return;
        }
        H0.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    public /* synthetic */ c(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    @Override // M0.o
    public float a() {
        return Z.n(e());
    }

    @Override // M0.o
    public long e() {
        return this.f6676b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Z.m(this.f6676b, ((c) obj).f6676b);
    }

    public int hashCode() {
        return Z.s(this.f6676b);
    }

    @Override // M0.o
    public P l() {
        return null;
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) Z.t(this.f6676b)) + ')';
    }
}
