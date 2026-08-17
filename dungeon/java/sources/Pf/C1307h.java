package Pf;

import java.io.IOException;

/* JADX INFO: renamed from: Pf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1307h extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Throwable f9130a;

    C1307h(String str) {
        super(str);
    }

    C1307h(String str, Throwable th) {
        super(str);
        this.f9130a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f9130a;
    }
}
