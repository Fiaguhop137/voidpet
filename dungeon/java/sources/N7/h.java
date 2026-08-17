package N7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L7.c f7962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f7963b;

    public h(L7.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f7962a = cVar;
        this.f7963b = bArr;
    }

    public byte[] a() {
        return this.f7963b;
    }

    public L7.c b() {
        return this.f7962a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f7962a.equals(hVar.f7962a)) {
            return Arrays.equals(this.f7963b, hVar.f7963b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f7962a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7963b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f7962a + ", bytes=[...]}";
    }
}
