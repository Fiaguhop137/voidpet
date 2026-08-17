package p454z4;

import L4.k;
import p310r4.v;

/* JADX INFO: loaded from: classes.dex */
public class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f58468a;

    public b(byte[] bArr) {
        this.f58468a = (byte[]) k.d(bArr);
    }

    @Override // p310r4.v
    public int a() {
        return this.f58468a.length;
    }

    @Override // p310r4.v
    public Class b() {
        return byte[].class;
    }

    @Override // p310r4.v
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f58468a;
    }

    @Override // p310r4.v
    public void recycle() {
    }
}
