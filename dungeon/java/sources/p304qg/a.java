package p304qg;

import Ug.c;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f51922a = new ByteArrayOutputStream();

    private a() {
    }

    public static a f() {
        return new a();
    }

    public a a(boolean z10) {
        this.f51922a.write(z10 ? 1 : 0);
        return this;
    }

    public byte[] b() {
        return this.f51922a.toByteArray();
    }

    public a c(c cVar) {
        try {
            this.f51922a.write(cVar.getEncoded());
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public a d(byte[] bArr) {
        try {
            this.f51922a.write(bArr);
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public a e(byte[][] bArr) {
        try {
            for (byte[] bArr2 : bArr) {
                this.f51922a.write(bArr2);
            }
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public a g(int i10, int i11) {
        while (this.f51922a.size() < i11) {
            this.f51922a.write(i10);
        }
        return this;
    }

    public a h(int i10) {
        int i11 = i10 & 65535;
        this.f51922a.write((byte) (i11 >>> 8));
        this.f51922a.write((byte) i11);
        return this;
    }

    public a i(int i10) {
        this.f51922a.write((byte) (i10 >>> 24));
        this.f51922a.write((byte) (i10 >>> 16));
        this.f51922a.write((byte) (i10 >>> 8));
        this.f51922a.write((byte) i10);
        return this;
    }

    public a j(long j10) {
        i((int) (j10 >>> 32));
        i((int) j10);
        return this;
    }
}
