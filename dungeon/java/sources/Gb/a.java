package Gb;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f3970a;

    public a(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f3970a = drawable;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return Drawable.class;
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
    public void e(h priority, com.bumptech.glide.load.data.d.a callback) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.f(this.f3970a);
    }
}
