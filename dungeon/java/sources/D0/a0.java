package D0;

import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f2049a = new a0();

    private a0() {
    }

    public static final boolean a(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void b(StaticLayout.Builder builder, int i10, int i11) {
        builder.setLineBreakConfig(U.a().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build());
    }
}
