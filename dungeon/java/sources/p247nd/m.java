package p247nd;

import kotlin.jvm.internal.Intrinsics;
import p158id.d;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f50111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f50112b;

    public m(d dVar, boolean z10) {
        this.f50111a = dVar;
        this.f50112b = z10;
    }

    public final d a() {
        return this.f50111a;
    }

    public final boolean b() {
        return this.f50112b;
    }

    public final d c() {
        return this.f50111a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.b(this.f50111a, mVar.f50111a) && this.f50112b == mVar.f50112b;
    }

    public int hashCode() {
        d dVar = this.f50111a;
        return ((dVar == null ? 0 : dVar.hashCode()) * 31) + Boolean.hashCode(this.f50112b);
    }

    public String toString() {
        return "ProcessSuccessLoaderResult(availableUpdate=" + this.f50111a + ", didRollBackToEmbedded=" + this.f50112b + ")";
    }
}
