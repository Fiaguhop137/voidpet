package Eb;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f2756d;

    public a(String str, int i10, int i11, float f10) {
        this.f2753a = str;
        this.f2754b = i10;
        this.f2755c = i11;
        this.f2756d = f10;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public p274p4.a d() {
        return p274p4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.h priority, com.bumptech.glide.load.data.d.a callback) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Bitmap bitmapD = b.d(b.f2757a, this.f2753a, this.f2754b, this.f2755c, this.f2756d, false, 16, null);
        if (bitmapD == null) {
            callback.c(new c(this.f2753a));
        } else {
            callback.f(bitmapD);
        }
    }
}
