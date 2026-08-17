package p304qg;

import Ug.a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class i extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f51974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f51975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f51976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f51977e;

    public i(k kVar, e eVar, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f51974b = kVar;
        this.f51975c = eVar;
        this.f51976d = a.e(bArr2);
        this.f51977e = a.e(bArr);
    }

    public static i b(Object obj) throws Throwable {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            k kVarE = k.e(dataInputStream.readInt());
            e eVarE = e.e(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[kVarE.d()];
            dataInputStream.readFully(bArr2);
            return new i(kVarE, eVarE, bArr2, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return b(Wg.a.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                i iVarB = b(dataInputStream3);
                dataInputStream3.close();
                return iVarB;
            } catch (Throwable th) {
                th = th;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    byte[] c() {
        return a.f().i(this.f51974b.f()).i(this.f51975c.f()).d(this.f51976d).d(this.f51977e).b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f51974b.equals(iVar.f51974b) && this.f51975c.equals(iVar.f51975c) && a.b(this.f51976d, iVar.f51976d)) {
            return a.b(this.f51977e, iVar.f51977e);
        }
        return false;
    }

    @Override // p304qg.g, Ug.c
    public byte[] getEncoded() {
        return c();
    }

    public int hashCode() {
        return (((((this.f51974b.hashCode() * 31) + this.f51975c.hashCode()) * 31) + a.n(this.f51976d)) * 31) + a.n(this.f51977e);
    }
}
