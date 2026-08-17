package p236n2;

import U1.AbstractC1459a;
import U1.F;
import W1.f;
import W1.j;
import W1.x;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: n2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C4026x implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f49870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f49872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f49873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49874e;

    /* JADX INFO: renamed from: n2.x$a */
    public interface a {
        void b(F f10);
    }

    public C4026x(f fVar, int i10, a aVar) {
        AbstractC1459a.a(i10 > 0);
        this.f49870a = fVar;
        this.f49871b = i10;
        this.f49872c = aVar;
        this.f49873d = new byte[1];
        this.f49874e = i10;
    }

    private boolean p() {
        if (this.f49870a.read(this.f49873d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f49873d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f49870a.read(bArr, i12, i11);
            if (i13 == -1) {
                return false;
            }
            i12 += i13;
            i11 -= i13;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f49872c.b(new F(bArr, i10));
        }
        return true;
    }

    @Override // W1.f
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // W1.f
    public Uri e() {
        return this.f49870a.e();
    }

    @Override // W1.f
    public Map f() {
        return this.f49870a.f();
    }

    @Override // W1.f
    public void j(x xVar) {
        AbstractC1459a.e(xVar);
        this.f49870a.j(xVar);
    }

    @Override // W1.f
    public long m(j jVar) {
        throw new UnsupportedOperationException();
    }

    @Override // R1.InterfaceC1350j
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f49874e == 0) {
            if (!p()) {
                return -1;
            }
            this.f49874e = this.f49871b;
        }
        int i12 = this.f49870a.read(bArr, i10, Math.min(this.f49874e, i11));
        if (i12 != -1) {
            this.f49874e -= i12;
        }
        return i12;
    }
}
