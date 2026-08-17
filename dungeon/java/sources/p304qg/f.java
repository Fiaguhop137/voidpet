package p304qg;

import Ug.c;
import Wg.a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f51958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f51959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f51960c;

    public f(e eVar, byte[] bArr, byte[] bArr2) {
        this.f51958a = eVar;
        this.f51959b = bArr;
        this.f51960c = bArr2;
    }

    public static f a(Object obj) throws Throwable {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            e eVarE = e.e(dataInputStream.readInt());
            byte[] bArr = new byte[eVarE.c()];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[eVarE.d() * eVarE.c()];
            dataInputStream.readFully(bArr2);
            return new f(eVarE, bArr, bArr2);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(a.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                f fVarA = a(dataInputStream3);
                dataInputStream3.close();
                return fVarA;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        e eVar = this.f51958a;
        if (eVar == null ? fVar.f51958a != null : !eVar.equals(fVar.f51958a)) {
            return false;
        }
        if (Arrays.equals(this.f51959b, fVar.f51959b)) {
            return Arrays.equals(this.f51960c, fVar.f51960c);
        }
        return false;
    }

    @Override // Ug.c
    public byte[] getEncoded() {
        return a.f().i(this.f51958a.f()).d(this.f51959b).d(this.f51960c).b();
    }

    public int hashCode() {
        e eVar = this.f51958a;
        return ((((eVar != null ? eVar.hashCode() : 0) * 31) + Arrays.hashCode(this.f51959b)) * 31) + Arrays.hashCode(this.f51960c);
    }
}
