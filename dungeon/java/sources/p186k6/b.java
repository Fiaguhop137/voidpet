package p186k6;

import Z4.a;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f48028a = new b();

    private b() {
    }

    public static final boolean a(a aVar, a aVar2) {
        if (aVar == null || aVar2 == null) {
            return false;
        }
        Object objM = aVar2.m();
        Intrinsics.checkNotNullExpressionValue(objM, "get(...)");
        Bitmap bitmap = (Bitmap) objM;
        if (aVar.a()) {
            bitmap.setHasAlpha(true);
        }
        aVar.b(bitmap);
        return true;
    }
}
