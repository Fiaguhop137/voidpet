package p220m4;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f49105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f49106c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f49104a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49107d = 0;

    private boolean b() {
        return this.f49106c.f49092b != 0;
    }

    private int d() {
        try {
            return this.f49105b.get() & 255;
        } catch (Exception unused) {
            this.f49106c.f49092b = 1;
            return 0;
        }
    }

    private void e() {
        this.f49106c.f49094d.f49080a = n();
        this.f49106c.f49094d.f49081b = n();
        this.f49106c.f49094d.f49082c = n();
        this.f49106c.f49094d.f49083d = n();
        int iD = d();
        boolean z10 = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        b bVar = this.f49106c.f49094d;
        bVar.f49084e = (iD & 64) != 0;
        if (z10) {
            bVar.f49090k = g(iPow);
        } else {
            bVar.f49090k = null;
        }
        this.f49106c.f49094d.f49089j = this.f49105b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f49106c;
        cVar.f49093c++;
        cVar.f49095e.add(cVar.f49094d);
    }

    private void f() {
        int iD = d();
        this.f49107d = iD;
        if (iD <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                int i12 = this.f49107d;
                if (i10 >= i12) {
                    return;
                }
                i11 = i12 - i10;
                this.f49105b.get(this.f49104a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f49107d, e10);
                }
                this.f49106c.f49092b = 1;
                return;
            }
        }
    }

    private int[] g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f49105b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & 255);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f49106c.f49092b = 1;
            return iArr;
        }
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f49106c.f49093c <= i10) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 == 1) {
                    q();
                } else if (iD2 == 249) {
                    this.f49106c.f49094d = new b();
                    j();
                } else if (iD2 == 254) {
                    q();
                } else if (iD2 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f49104a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (iD == 44) {
                c cVar = this.f49106c;
                if (cVar.f49094d == null) {
                    cVar.f49094d = new b();
                }
                e();
            } else if (iD != 59) {
                this.f49106c.f49092b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void j() {
        d();
        int iD = d();
        b bVar = this.f49106c.f49094d;
        int i10 = (iD & 28) >> 2;
        bVar.f49086g = i10;
        if (i10 == 0) {
            bVar.f49086g = 1;
        }
        bVar.f49085f = (iD & 1) != 0;
        int iN = n();
        if (iN < 2) {
            iN = 10;
        }
        b bVar2 = this.f49106c.f49094d;
        bVar2.f49088i = iN * 10;
        bVar2.f49087h = d();
        d();
    }

    private void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f49106c.f49092b = 1;
            return;
        }
        l();
        if (!this.f49106c.f49098h || b()) {
            return;
        }
        c cVar = this.f49106c;
        cVar.f49091a = g(cVar.f49099i);
        c cVar2 = this.f49106c;
        cVar2.f49102l = cVar2.f49091a[cVar2.f49100j];
    }

    private void l() {
        this.f49106c.f49096f = n();
        this.f49106c.f49097g = n();
        int iD = d();
        c cVar = this.f49106c;
        cVar.f49098h = (iD & 128) != 0;
        cVar.f49099i = (int) Math.pow(2.0d, (iD & 7) + 1);
        this.f49106c.f49100j = d();
        this.f49106c.f49101k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f49104a;
            if (bArr[0] == 1) {
                this.f49106c.f49103m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f49107d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f49105b.getShort();
    }

    private void o() {
        this.f49105b = null;
        Arrays.fill(this.f49104a, (byte) 0);
        this.f49106c = new c();
        this.f49107d = 0;
    }

    private void q() {
        int iD;
        do {
            iD = d();
            this.f49105b.position(Math.min(this.f49105b.position() + iD, this.f49105b.limit()));
        } while (iD > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f49105b = null;
        this.f49106c = null;
    }

    public c c() {
        if (this.f49105b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f49106c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f49106c;
            if (cVar.f49093c < 0) {
                cVar.f49092b = 1;
            }
        }
        return this.f49106c;
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f49105b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f49105b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
