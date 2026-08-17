package p168j6;

import N5.c;

/* JADX INFO: loaded from: classes2.dex */
public class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46863a;

    public h(int i10) {
        this.f46863a = i10;
    }

    @Override // p168j6.d
    public c createImageTranscoder(c cVar, boolean z10) {
        return new g(z10, this.f46863a);
    }
}
