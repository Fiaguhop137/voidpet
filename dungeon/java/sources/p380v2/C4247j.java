package p380v2;

import R1.InterfaceC1350j;
import R1.v;
import U1.S;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: v2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4247j implements InterfaceC4254q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1350j f56099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f56100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f56101d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f56103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f56104g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f56102e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f56098a = new byte[4096];

    static {
        v.a("media3.extractor");
    }

    public C4247j(InterfaceC1350j interfaceC1350j, long j10, long j11) {
        this.f56099b = interfaceC1350j;
        this.f56101d = j10;
        this.f56100c = j11;
    }

    private void p(int i10) {
        if (i10 != -1) {
            this.f56101d += (long) i10;
        }
    }

    private void q(int i10) {
        int i11 = this.f56103f + i10;
        byte[] bArr = this.f56102e;
        if (i11 > bArr.length) {
            this.f56102e = Arrays.copyOf(this.f56102e, S.o(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private int r(byte[] bArr, int i10, int i11) {
        int i12 = this.f56104g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f56102e, 0, bArr, i10, iMin);
        u(iMin);
        return iMin;
    }

    private int s(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f56099b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    private int t(int i10) {
        int iMin = Math.min(this.f56104g, i10);
        u(iMin);
        return iMin;
    }

    private void u(int i10) {
        int i11 = this.f56104g - i10;
        this.f56104g = i11;
        this.f56103f = 0;
        byte[] bArr = this.f56102e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f56102e = bArr2;
    }

    @Override // p380v2.InterfaceC4254q
    public int a(int i10) throws EOFException, InterruptedIOException {
        int iT = t(i10);
        if (iT == 0) {
            byte[] bArr = this.f56098a;
            iT = s(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        p(iT);
        return iT;
    }

    @Override // p380v2.InterfaceC4254q
    public boolean b(int i10, boolean z10) throws EOFException, InterruptedIOException {
        int iT = t(i10);
        while (iT < i10 && iT != -1) {
            iT = s(this.f56098a, -iT, Math.min(i10, this.f56098a.length + iT), iT, z10);
        }
        p(iT);
        return iT != -1;
    }

    @Override // p380v2.InterfaceC4254q
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        if (!n(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f56102e, this.f56103f - i11, bArr, i10, i11);
        return true;
    }

    @Override // p380v2.InterfaceC4254q
    public void d() {
        this.f56103f = 0;
    }

    @Override // p380v2.InterfaceC4254q
    public boolean g(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iR = r(bArr, i10, i11);
        while (iR < i11 && iR != -1) {
            iR = s(bArr, i10, i11, iR, z10);
        }
        p(iR);
        return iR != -1;
    }

    @Override // p380v2.InterfaceC4254q
    public long getLength() {
        return this.f56100c;
    }

    @Override // p380v2.InterfaceC4254q
    public long getPosition() {
        return this.f56101d;
    }

    @Override // p380v2.InterfaceC4254q
    public long h() {
        return this.f56101d + ((long) this.f56103f);
    }

    @Override // p380v2.InterfaceC4254q
    public void i(int i10) throws EOFException, InterruptedIOException {
        n(i10, false);
    }

    @Override // p380v2.InterfaceC4254q
    public int k(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        C4247j c4247j;
        int iMin;
        q(i11);
        int i12 = this.f56104g;
        int i13 = this.f56103f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            c4247j = this;
            iMin = c4247j.s(this.f56102e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c4247j.f56104g += iMin;
        } else {
            c4247j = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(c4247j.f56102e, c4247j.f56103f, bArr, i10, iMin);
        c4247j.f56103f += iMin;
        return iMin;
    }

    @Override // p380v2.InterfaceC4254q
    public void l(int i10) throws EOFException, InterruptedIOException {
        b(i10, false);
    }

    @Override // p380v2.InterfaceC4254q
    public boolean n(int i10, boolean z10) throws EOFException, InterruptedIOException {
        q(i10);
        int iS = this.f56104g - this.f56103f;
        while (iS < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iS = s(this.f56102e, this.f56103f, i11, iS, z11);
            if (iS == -1) {
                return false;
            }
            this.f56104g = this.f56103f + iS;
            i10 = i11;
            z10 = z11;
        }
        this.f56103f += i10;
        return true;
    }

    @Override // p380v2.InterfaceC4254q
    public void o(byte[] bArr, int i10, int i11) {
        c(bArr, i10, i11, false);
    }

    @Override // p380v2.InterfaceC4254q, R1.InterfaceC1350j
    public int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int iR = r(bArr, i10, i11);
        if (iR == 0) {
            iR = s(bArr, i10, i11, 0, true);
        }
        p(iR);
        return iR;
    }

    @Override // p380v2.InterfaceC4254q
    public void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        g(bArr, i10, i11, false);
    }
}
