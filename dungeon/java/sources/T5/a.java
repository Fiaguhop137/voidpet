package T5;

import W5.C1598a;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import p079e6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f12268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1598a f12269b;

    public a(i bitmapPool, C1598a closeableReferenceFactory) {
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        this.f12268a = bitmapPool;
        this.f12269b = closeableReferenceFactory;
    }

    @Override // T5.d
    public Z4.a d(int i10, int i11, Bitmap.Config bitmapConfig) {
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Bitmap bitmap = (Bitmap) this.f12268a.get(p222m6.c.i(i10, i11, bitmapConfig));
        if (bitmap.getAllocationByteCount() < i10 * i11 * p222m6.c.h(bitmapConfig)) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap.reconfigure(i10, i11, bitmapConfig);
        Z4.a aVarC = this.f12269b.c(bitmap, this.f12268a);
        Intrinsics.checkNotNullExpressionValue(aVarC, "create(...)");
        return aVarC;
    }
}
