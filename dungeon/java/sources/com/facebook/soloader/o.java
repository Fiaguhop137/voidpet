package com.facebook.soloader;

/* JADX INFO: loaded from: classes2.dex */
public class o implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f31384a;

    public o(x xVar) {
        this.f31384a = xVar;
    }

    @Override // com.facebook.soloader.x
    public void a(String str, int i10) {
        p259o7.b.j(this.f31384a, "load", i10);
        try {
            this.f31384a.a(str, i10);
            p259o7.b.i(null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p259o7.b.i(th);
                throw th2;
            }
        }
    }
}
