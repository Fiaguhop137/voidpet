package p017ag;

import Ug.a;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f19783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19784b;

    public c(byte[] bArr, int i10) {
        this.f19783a = a.e(bArr);
        this.f19784b = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (cVar.f19784b != this.f19784b) {
            return false;
        }
        return a.b(this.f19783a, cVar.f19783a);
    }

    public int hashCode() {
        return this.f19784b ^ a.n(this.f19783a);
    }
}
