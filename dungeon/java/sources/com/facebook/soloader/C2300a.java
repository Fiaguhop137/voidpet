package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* JADX INFO: renamed from: com.facebook.soloader.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2300a extends E implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C2305f f31349b;

    public C2300a(Context context, int i10) {
        this.f31348a = i10;
        this.f31349b = new C2305f(f(context), i10);
    }

    private static File f(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // com.facebook.soloader.w
    public E b(Context context) {
        this.f31349b = new C2305f(f(context), this.f31348a | 1);
        return this;
    }

    @Override // com.facebook.soloader.E
    public String c() {
        return "ApplicationSoSource";
    }

    @Override // com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return this.f31349b.d(str, i10, threadPolicy);
    }

    @Override // com.facebook.soloader.E
    protected void e(int i10) {
        this.f31349b.e(i10);
    }

    @Override // com.facebook.soloader.E
    public String toString() {
        return c() + "[" + this.f31349b.toString() + "]";
    }
}
