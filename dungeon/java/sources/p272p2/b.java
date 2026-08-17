package p272p2;

import S2.j;
import S2.k;
import S2.s;

/* JADX INFO: loaded from: classes.dex */
final class b extends j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final s f50727p;

    public b(String str, s sVar) {
        super(str);
        this.f50727p = sVar;
    }

    @Override // S2.j
    protected k B(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f50727p.reset();
        }
        return this.f50727p.a(bArr, 0, i10);
    }
}
