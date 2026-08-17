package p160ig;

import Pf.AbstractC1333y;
import Pf.C1303f;
import Pf.C1320n0;
import Pf.C1321o;
import Pf.r;
import Pf.r0;
import Ug.a;

/* JADX INFO: loaded from: classes3.dex */
public class o extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f44134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f44135b;

    public o(byte[] bArr, byte[] bArr2) {
        this.f44134a = a.e(bArr);
        this.f44135b = a.e(bArr2);
    }

    @Override // Pf.r, Pf.InterfaceC1301e
    public AbstractC1333y g() {
        C1303f c1303f = new C1303f();
        c1303f.a(new C1321o(0L));
        c1303f.a(new C1320n0(this.f44134a));
        c1303f.a(new C1320n0(this.f44135b));
        return new r0(c1303f);
    }
}
