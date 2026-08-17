package G0;

import android.view.inputmethod.CursorAnchorInfo;
import p037c0.s0;

/* JADX INFO: renamed from: G0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1011g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1011g f3759a = new C1011g();

    private C1011g() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, p019b0.g gVar) {
        return builder.setEditorBoundsInfo(AbstractC1006b.a().setEditorBounds(s0.c(gVar)).setHandwritingBounds(s0.c(gVar)).build());
    }
}
