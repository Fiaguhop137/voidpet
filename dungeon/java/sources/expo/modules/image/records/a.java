package expo.modules.image.records;

import Db.e;
import Db.k;
import H4.f;
import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import p310r4.j;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f40995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f40997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f40998d;

    public a(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f40995a = drawable;
        this.f40996b = drawable.getIntrinsicWidth();
        this.f40997c = drawable.getIntrinsicHeight();
        this.f40998d = 1.0d;
    }

    @Override // expo.modules.image.records.b
    public k createGlideModelProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new e(this.f40995a);
    }

    @Override // expo.modules.image.records.b
    public f createGlideOptions(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        H4.a aVarG = ((f) new f().f0(true)).g(j.f52265b);
        Intrinsics.checkNotNullExpressionValue(aVarG, "diskCacheStrategy(...)");
        return (f) aVarG;
    }

    @Override // expo.modules.image.records.b
    public int getHeight() {
        return this.f40997c;
    }

    @Override // expo.modules.image.records.b
    public double getPixelCount() {
        return b.a.a(this);
    }

    @Override // expo.modules.image.records.b
    public double getScale() {
        return this.f40998d;
    }

    @Override // expo.modules.image.records.b
    public int getWidth() {
        return this.f40996b;
    }

    @Override // expo.modules.image.records.b
    public boolean usesPlaceholderContentFit() {
        return b.a.b(this);
    }
}
