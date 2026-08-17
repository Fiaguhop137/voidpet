package p286pg;

import Ug.a;

/* JADX INFO: loaded from: classes3.dex */
public class f extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f51018c;

    public f(d dVar, byte[] bArr) {
        super(true, dVar);
        this.f51018c = a.e(bArr);
    }

    public byte[] c() {
        return a.e(this.f51018c);
    }

    public byte[] getEncoded() {
        return c();
    }
}
