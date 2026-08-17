package Pf;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
abstract class P0 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final InputStream f9087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9088b;

    P0(InputStream inputStream, int i10) {
        this.f9087a = inputStream;
        this.f9088b = i10;
    }

    int a() {
        return this.f9088b;
    }

    protected void b(boolean z10) {
        InputStream inputStream = this.f9087a;
        if (inputStream instanceof M0) {
            ((M0) inputStream).d(z10);
        }
    }
}
