package G0;

import C0.L0;
import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: renamed from: G0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1013i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1013i f3760a = new C1013i();

    private C1013i() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, L0 l10, p019b0.g gVar) {
        int iR;
        int iR2;
        if (!gVar.k() && (iR = l10.r(gVar.h())) <= (iR2 = l10.r(gVar.c()))) {
            while (true) {
                builder.addVisibleLineBounds(l10.s(iR), l10.v(iR), l10.t(iR), l10.m(iR));
                if (iR == iR2) {
                    break;
                }
                iR++;
            }
        }
        return builder;
    }
}
