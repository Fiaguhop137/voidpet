package p223m7;

import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f49167d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f49170c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public n(int i10, int i11, i what) {
        Intrinsics.checkNotNullParameter(what, "what");
        this.f49168a = i10;
        this.f49169b = i11;
        this.f49170c = what;
    }

    public final void a(SpannableStringBuilder builder, int i10) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (i10 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        int i11 = this.f49168a == 0 ? 18 : 34;
        int i12 = 255 - i10;
        if (i12 < 0) {
            W4.a.I("SetSpanOperation", "Text tree size exceeded the limit, styling may become unpredictable");
        }
        builder.setSpan(this.f49170c, this.f49168a, this.f49169b, ((Math.max(i12, 0) << 16) & 16711680) | (i11 & (-16711681)));
    }
}
