package p079e6;

import V4.m;
import android.graphics.Bitmap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f40516a;

    public s() {
        Set setB = m.b();
        Intrinsics.checkNotNullExpressionValue(setB, "newIdentityHashSet(...)");
        this.f40516a = setB;
    }

    @Override // Y4.f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i10) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i10) / 2.0d), Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.f40516a.add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // Y4.f, Z4.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f40516a.remove(value);
        value.recycle();
    }
}
