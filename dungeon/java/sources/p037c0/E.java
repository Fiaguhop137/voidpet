package p037c0;

import android.graphics.Canvas;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Canvas f26662a = new Canvas();

    public static final S a(Canvas canvas) {
        D d10 = new D();
        d10.q(canvas);
        return d10;
    }

    public static final Canvas c(S s10) {
        Intrinsics.d(s10, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((D) s10).p();
    }
}
