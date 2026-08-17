package p223m7;

import android.text.TextPaint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f49166a;

    public l(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        this.f49166a = textPaint;
    }

    public final TextPaint a() {
        return this.f49166a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.b(this.f49166a, ((l) obj).f49166a);
    }

    public int hashCode() {
        return this.f49166a.hashCode();
    }

    public String toString() {
        return "ReactTextPaintHolderSpan(textPaint=" + this.f49166a + ")";
    }
}
