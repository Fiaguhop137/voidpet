package p223m7;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.facebook.react.views.text.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends MetricAffectingSpan implements i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f49155f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f49158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f49159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AssetManager f49160e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(Paint paint, int i10, int i11, String str, String str2, AssetManager assetManager) {
            Typeface typefaceA = q.a(paint.getTypeface(), i10, i11, str2, assetManager);
            paint.setFontFeatureSettings(str);
            paint.setTypeface(typefaceA);
            paint.setSubpixelText(true);
        }
    }

    public c(int i10, int i11, String str, String str2, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        this.f49156a = i10;
        this.f49157b = i11;
        this.f49158c = str;
        this.f49159d = str2;
        this.f49160e = assetManager;
    }

    public final String a() {
        return this.f49159d;
    }

    public final String b() {
        return this.f49158c;
    }

    public final int c() {
        int i10 = this.f49156a;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public final int d() {
        int i10 = this.f49157b;
        if (i10 == -1) {
            return 400;
        }
        return i10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        f49155f.b(ds, this.f49156a, this.f49157b, this.f49158c, this.f49159d, this.f49160e);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        f49155f.b(paint, this.f49156a, this.f49157b, this.f49158c, this.f49159d, this.f49160e);
    }
}
