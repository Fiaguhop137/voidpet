package p231mf;

import p088ef.K;
import p195kf.AbstractC3934l;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f49331i = new c();

    private c() {
        super(j.f49343c, j.f49344d, j.f49345e, j.f49341a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p088ef.K
    public K m0(int i10, String str) {
        AbstractC3934l.a(i10);
        return i10 >= j.f49343c ? AbstractC3934l.b(this, str) : super.m0(i10, str);
    }

    @Override // p088ef.K
    public String toString() {
        return "Dispatchers.Default";
    }
}
