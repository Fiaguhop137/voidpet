package Lb;

import android.graphics.Bitmap;
import android.util.Base64;
import com.bumptech.glide.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6598a;

    public d(String str) {
        this.f6598a = str;
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
    public void e(h priority, com.bumptech.glide.load.data.d.a callback) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            byte[] bArrDecode = Base64.decode(this.f6598a, 0);
            a aVar = a.f6587a;
            Intrinsics.c(bArrDecode);
            callback.f(aVar.b(bArrDecode));
        } catch (Exception e10) {
            callback.c(new b(this.f6598a, e10));
        }
    }
}
