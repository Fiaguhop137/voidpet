package D0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: D0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0916e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0916e f2055a = new C0916e();

    private C0916e() {
    }

    public final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i10, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z10, boolean z11, TextUtils.TruncateAt truncateAt, int i11) {
        if (!(i10 >= 0)) {
            H0.a.a("negative width");
        }
        if (!(i11 >= 0)) {
            H0.a.a("negative ellipsized width");
        }
        return Build.VERSION.SDK_INT >= 33 ? C0915d.a(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, z11, truncateAt, i11) : C0917f.a(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, truncateAt, i11);
    }

    public final boolean b(BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return C0915d.c(boringLayout);
        }
        return false;
    }

    public final BoringLayout.Metrics c(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return Build.VERSION.SDK_INT >= 33 ? C0915d.b(charSequence, textPaint, textDirectionHeuristic) : C0917f.b(charSequence, textPaint, textDirectionHeuristic);
    }
}
