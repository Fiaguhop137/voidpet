package L8;

import p170j8.AbstractC3851p;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 implements h8.a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6513b;

    /* synthetic */ v0(int i10, String str, byte[] bArr) {
        this.f6512a = i10;
        this.f6513b = str;
    }

    public static C1171q0 a() {
        return new C1171q0(null);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f6512a == v0Var.f6512a && AbstractC3851p.a(this.f6513b, v0Var.f6513b);
    }

    public final int hashCode() {
        return AbstractC3851p.b(Integer.valueOf(this.f6512a), this.f6513b);
    }
}
