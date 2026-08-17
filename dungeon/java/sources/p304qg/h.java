package p304qg;

import Vf.j;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class h extends g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static a f51961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static a[] f51962m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f51963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f51964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f51965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f51966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f51967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f51968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f51969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j f51970i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f51971j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private i f51972k;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f51973a;

        a(int i10) {
            this.f51973a = i10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && ((a) obj).f51973a == this.f51973a;
        }

        public int hashCode() {
            return this.f51973a;
        }
    }

    static {
        a aVar = new a(1);
        f51961l = aVar;
        a[] aVarArr = new a[129];
        f51962m = aVarArr;
        aVarArr[1] = aVar;
        int i10 = 2;
        while (true) {
            a[] aVarArr2 = f51962m;
            if (i10 >= aVarArr2.length) {
                return;
            }
            aVarArr2[i10] = new a(i10);
            i10++;
        }
    }

    public h(k kVar, e eVar, int i10, byte[] bArr, int i11, byte[] bArr2) {
        super(true);
        this.f51964c = kVar;
        this.f51965d = eVar;
        this.f51971j = i10;
        this.f51963b = Ug.a.e(bArr);
        this.f51966e = i11;
        this.f51967f = Ug.a.e(bArr2);
        this.f51969h = 1 << (kVar.c() + 1);
        this.f51968g = new WeakHashMap();
        this.f51970i = b.d(kVar);
    }

    private byte[] b(int i10) {
        int iC = 1 << k().c();
        if (i10 >= iC) {
            m.a(e(), this.f51970i);
            m.c(i10, this.f51970i);
            m.b((short) -32126, this.f51970i);
            m.a(l.a(i(), e(), i10 - iC, h()), this.f51970i);
            byte[] bArr = new byte[this.f51970i.d()];
            this.f51970i.a(bArr, 0);
            return bArr;
        }
        int i11 = i10 * 2;
        byte[] bArrC = c(i11);
        byte[] bArrC2 = c(i11 + 1);
        m.a(e(), this.f51970i);
        m.c(i10, this.f51970i);
        m.b((short) -31869, this.f51970i);
        m.a(bArrC, this.f51970i);
        m.a(bArrC2, this.f51970i);
        byte[] bArr2 = new byte[this.f51970i.d()];
        this.f51970i.a(bArr2, 0);
        return bArr2;
    }

    private byte[] d(a aVar) {
        byte[] bArrB;
        synchronized (this.f51968g) {
            try {
                bArrB = (byte[]) this.f51968g.get(aVar);
                if (bArrB == null) {
                    bArrB = b(aVar.f51973a);
                    this.f51968g.put(aVar, bArrB);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrB;
    }

    public static h f(Object obj) throws Throwable {
        Throwable th;
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException("expected version 0 lms private key");
            }
            k kVarE = k.e(dataInputStream.readInt());
            e eVarE = e.e(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            int i10 = dataInputStream.readInt();
            int i11 = dataInputStream.readInt();
            int i12 = dataInputStream.readInt();
            if (i12 < 0) {
                throw new IllegalStateException("secret length less than zero");
            }
            if (i12 <= dataInputStream.available()) {
                byte[] bArr2 = new byte[i12];
                dataInputStream.readFully(bArr2);
                return new h(kVarE, eVarE, i10, bArr, i11, bArr2);
            }
            throw new IOException("secret length exceeded " + dataInputStream.available());
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return f(Wg.a.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                h hVarF = f(dataInputStream3);
                dataInputStream3.close();
                return hVarF;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 == null) {
                    throw th;
                }
                dataInputStream2.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static h g(byte[] bArr, byte[] bArr2) throws Throwable {
        h hVarF = f(bArr);
        hVarF.f51972k = i.b(bArr2);
        return hVarF;
    }

    byte[] c(int i10) {
        if (i10 >= this.f51969h) {
            return b(i10);
        }
        a[] aVarArr = f51962m;
        return d(i10 < aVarArr.length ? aVarArr[i10] : new a(i10));
    }

    public byte[] e() {
        return Ug.a.e(this.f51963b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f51971j != hVar.f51971j || this.f51966e != hVar.f51966e || !Ug.a.b(this.f51963b, hVar.f51963b)) {
            return false;
        }
        k kVar = this.f51964c;
        if (kVar == null ? hVar.f51964c != null : !kVar.equals(hVar.f51964c)) {
            return false;
        }
        e eVar = this.f51965d;
        if (eVar == null ? hVar.f51965d == null : eVar.equals(hVar.f51965d)) {
            return Ug.a.b(this.f51967f, hVar.f51967f);
        }
        return false;
    }

    @Override // p304qg.g, Ug.c
    public byte[] getEncoded() {
        return p304qg.a.f().i(0).i(this.f51964c.f()).i(this.f51965d.f()).d(this.f51963b).i(this.f51971j).i(this.f51966e).i(this.f51967f.length).d(this.f51967f).b();
    }

    public byte[] h() {
        return Ug.a.e(this.f51967f);
    }

    public int hashCode() {
        int iN = ((this.f51971j * 31) + Ug.a.n(this.f51963b)) * 31;
        k kVar = this.f51964c;
        int iHashCode = (iN + (kVar != null ? kVar.hashCode() : 0)) * 31;
        e eVar = this.f51965d;
        return ((((iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f51966e) * 31) + Ug.a.n(this.f51967f);
    }

    public e i() {
        return this.f51965d;
    }

    public i j() {
        i iVar;
        synchronized (this) {
            try {
                if (this.f51972k == null) {
                    this.f51972k = new i(this.f51964c, this.f51965d, d(f51961l), this.f51963b);
                }
                iVar = this.f51972k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public k k() {
        return this.f51964c;
    }
}
