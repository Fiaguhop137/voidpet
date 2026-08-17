package p304qg;

import Ug.c;
import Wg.a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f51979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f51980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[][] f51981d;

    public j(int i10, f fVar, k kVar, byte[][] bArr) {
        this.f51978a = i10;
        this.f51979b = fVar;
        this.f51980c = kVar;
        this.f51981d = bArr;
    }

    public static j a(Object obj) throws Throwable {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int i10 = dataInputStream.readInt();
            f fVarA = f.a(obj);
            k kVarE = k.e(dataInputStream.readInt());
            int iC = kVarE.c();
            byte[][] bArr = new byte[iC][];
            for (int i11 = 0; i11 < iC; i11++) {
                byte[] bArr2 = new byte[kVarE.d()];
                bArr[i11] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new j(i10, fVarA, kVarE, bArr);
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
                j jVarA = a(dataInputStream3);
                dataInputStream3.close();
                return jVarA;
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
        j jVar = (j) obj;
        if (this.f51978a != jVar.f51978a) {
            return false;
        }
        f fVar = this.f51979b;
        if (fVar == null ? jVar.f51979b != null : !fVar.equals(jVar.f51979b)) {
            return false;
        }
        k kVar = this.f51980c;
        if (kVar == null ? jVar.f51980c == null : kVar.equals(jVar.f51980c)) {
            return Arrays.deepEquals(this.f51981d, jVar.f51981d);
        }
        return false;
    }

    @Override // Ug.c
    public byte[] getEncoded() {
        return a.f().i(this.f51978a).d(this.f51979b.getEncoded()).i(this.f51980c.f()).e(this.f51981d).b();
    }

    public int hashCode() {
        int i10 = this.f51978a * 31;
        f fVar = this.f51979b;
        int iHashCode = (i10 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        k kVar = this.f51980c;
        return ((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31) + Arrays.deepHashCode(this.f51981d);
    }
}
