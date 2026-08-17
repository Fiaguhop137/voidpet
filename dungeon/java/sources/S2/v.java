package S2;

import R1.InterfaceC1350j;
import R1.y;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.F;
import U1.S;
import java.io.EOFException;
import p380v2.O;

/* JADX INFO: loaded from: classes.dex */
final class v implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f11539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s.a f11540b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s f11546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private R1.r f11547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f11548j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f11541c = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11543e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11544f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f11545g = S.f12881f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F f11542d = new F();

    public v(O o10, s.a aVar) {
        this.f11539a = o10;
        this.f11540b = aVar;
    }

    private void i(int i10) {
        int length = this.f11545g.length;
        int i11 = this.f11544f;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f11543e;
        int iMax = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f11545g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f11543e, bArr2, 0, i12);
        this.f11543e = 0;
        this.f11544f = i12;
        this.f11545g = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(e eVar, long j10, int i10) {
        AbstractC1459a.i(this.f11547i);
        byte[] bArrA = this.f11541c.a(eVar.f11501a, eVar.f11503c);
        this.f11542d.X(bArrA);
        this.f11539a.f(this.f11542d, bArrA.length);
        long j11 = eVar.f11502b;
        if (j11 == -9223372036854775807L) {
            AbstractC1459a.g(this.f11547i.f10282t == Long.MAX_VALUE);
        } else {
            long j12 = this.f11547i.f10282t;
            j10 = j12 == Long.MAX_VALUE ? j10 + j11 : j11 + j12;
        }
        this.f11539a.c(j10, i10 | 1, bArrA.length, 0, null);
    }

    @Override // p380v2.O
    public void b(R1.r rVar) {
        AbstractC1459a.e(rVar.f10277o);
        AbstractC1459a.a(y.k(rVar.f10277o) == 3);
        if (!rVar.equals(this.f11547i)) {
            this.f11547i = rVar;
            this.f11546h = this.f11540b.a(rVar) ? this.f11540b.c(rVar) : null;
        }
        if (this.f11546h == null) {
            this.f11539a.b(rVar);
        } else {
            this.f11539a.b(rVar.b().y0("application/x-media3-cues").U(rVar.f10277o).C0(Long.MAX_VALUE).Y(this.f11540b.b(rVar)).P());
        }
    }

    @Override // p380v2.O
    public void c(long j10, int i10, int i11, int i12, O.a aVar) {
        if (this.f11546h == null) {
            this.f11539a.c(j10, i10, i11, i12, aVar);
            return;
        }
        AbstractC1459a.b(aVar == null, "DRM on subtitles is not supported");
        int i13 = (this.f11544f - i12) - i11;
        try {
            this.f11546h.b(this.f11545g, i13, i11, s.b.b(), new u(this, j10, i10));
        } catch (RuntimeException e10) {
            if (!this.f11548j) {
                throw e10;
            }
            AbstractC1477t.i("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e10);
        }
        int i14 = i13 + i11;
        this.f11543e = i14;
        if (i14 == this.f11544f) {
            this.f11543e = 0;
            this.f11544f = 0;
        }
    }

    @Override // p380v2.O
    public void e(F f10, int i10, int i11) {
        if (this.f11546h == null) {
            this.f11539a.e(f10, i10, i11);
            return;
        }
        i(i10);
        f10.q(this.f11545g, this.f11544f, i10);
        this.f11544f += i10;
    }

    @Override // p380v2.O
    public int g(InterfaceC1350j interfaceC1350j, int i10, boolean z10, int i11) throws EOFException {
        if (this.f11546h == null) {
            return this.f11539a.g(interfaceC1350j, i10, z10, i11);
        }
        i(i10);
        int i12 = interfaceC1350j.read(this.f11545g, this.f11544f, i10);
        if (i12 != -1) {
            this.f11544f += i12;
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void k(boolean z10) {
        this.f11548j = z10;
    }
}
