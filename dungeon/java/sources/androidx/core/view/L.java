package androidx.core.view;

import android.content.Context;
import android.view.PointerIcon;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointerIcon f23146a;

    static class a {
        static PointerIcon a(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }
    }

    private L(PointerIcon pointerIcon) {
        this.f23146a = pointerIcon;
    }

    public static L b(Context context, int i10) {
        return new L(a.a(context, i10));
    }

    public Object a() {
        return this.f23146a;
    }
}
