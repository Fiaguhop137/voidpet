package p304qg;

import Wg.a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f51926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f51927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f51928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f51929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f51930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f51931h;

    private c(int i10, List list, List list2, long j10, long j11, boolean z10) {
        super(true);
        this.f51930g = 0L;
        this.f51925b = i10;
        this.f51927d = Collections.unmodifiableList(list);
        this.f51928e = Collections.unmodifiableList(list2);
        this.f51930g = j10;
        this.f51929f = j11;
        this.f51926c = z10;
    }

    public static c b(Object obj) throws Throwable {
        Throwable th;
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException("unknown version for hss private key");
            }
            int i10 = dataInputStream.readInt();
            long j10 = dataInputStream.readLong();
            long j11 = dataInputStream.readLong();
            boolean z10 = dataInputStream.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(h.f(obj));
            }
            for (int i12 = 0; i12 < i10 - 1; i12++) {
                arrayList2.add(j.a(obj));
            }
            return new c(i10, arrayList, arrayList2, j10, j11, z10);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return b(a.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                c cVarB = b(dataInputStream3);
                dataInputStream3.close();
                return cVarB;
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

    public static c c(byte[] bArr, byte[] bArr2) throws Throwable {
        c cVarB = b(bArr);
        cVarB.f51931h = d.b(bArr2);
        return cVarB;
    }

    private static c g(c cVar) {
        try {
            return b(cVar.getEncoded());
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    protected Object clone() {
        return g(this);
    }

    public int d() {
        return this.f51925b;
    }

    public synchronized d e() {
        return new d(this.f51925b, f().j());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f51925b == cVar.f51925b && this.f51926c == cVar.f51926c && this.f51929f == cVar.f51929f && this.f51930g == cVar.f51930g && this.f51927d.equals(cVar.f51927d)) {
            return this.f51928e.equals(cVar.f51928e);
        }
        return false;
    }

    h f() {
        return (h) this.f51927d.get(0);
    }

    @Override // p304qg.g, Ug.c
    public synchronized byte[] getEncoded() {
        a aVarA;
        try {
            aVarA = a.f().i(0).i(this.f51925b).j(this.f51930g).j(this.f51929f).a(this.f51926c);
            Iterator it = this.f51927d.iterator();
            while (it.hasNext()) {
                aVarA.c((h) it.next());
            }
            Iterator it2 = this.f51928e.iterator();
            while (it2.hasNext()) {
                aVarA.c((j) it2.next());
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVarA.b();
    }

    public int hashCode() {
        int iHashCode = ((((((this.f51925b * 31) + (this.f51926c ? 1 : 0)) * 31) + this.f51927d.hashCode()) * 31) + this.f51928e.hashCode()) * 31;
        long j10 = this.f51929f;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f51930g;
        return i10 + ((int) (j11 ^ (j11 >>> 32)));
    }
}
