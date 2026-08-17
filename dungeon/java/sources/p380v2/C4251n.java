package p380v2;

import R1.InterfaceC1350j;
import R1.r;
import U1.F;
import java.io.EOFException;

/* JADX INFO: renamed from: v2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4251n implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f56128a = new byte[4096];

    @Override // p380v2.O
    public void b(r rVar) {
    }

    @Override // p380v2.O
    public void c(long j10, int i10, int i11, int i12, O.a aVar) {
    }

    @Override // p380v2.O
    public void e(F f10, int i10, int i11) {
        f10.b0(i10);
    }

    @Override // p380v2.O
    public int g(InterfaceC1350j interfaceC1350j, int i10, boolean z10, int i11) throws EOFException {
        int i12 = interfaceC1350j.read(this.f56128a, 0, Math.min(this.f56128a.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }
}
