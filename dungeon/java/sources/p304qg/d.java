package p304qg;

import Wg.a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class d extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f51933c;

    public d(int i10, i iVar) {
        super(false);
        if (iVar == null) {
            throw new NullPointerException("lmsPublicKey");
        }
        this.f51932b = i10;
        this.f51933c = iVar;
    }

    public static d b(Object obj) throws Throwable {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj instanceof DataInputStream) {
            return new d(((DataInputStream) obj).readInt(), i.b(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return b(a.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                d dVarB = b(dataInputStream2);
                dataInputStream2.close();
                return dVarB;
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public int c() {
        return this.f51932b;
    }

    public i d() {
        return this.f51933c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f51932b != dVar.f51932b) {
            return false;
        }
        return this.f51933c.equals(dVar.f51933c);
    }

    @Override // p304qg.g, Ug.c
    public byte[] getEncoded() {
        return a.f().i(this.f51932b).d(this.f51933c.getEncoded()).b();
    }

    public int hashCode() {
        return (this.f51932b * 31) + this.f51933c.hashCode();
    }
}
