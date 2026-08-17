package E0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends ReplacementSpan {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f2592k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f2593l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f2596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f2598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f2599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint.FontMetricsInt f2600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2603j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f2600g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.r("fontMetrics");
        return null;
    }

    public final int b() {
        if (!this.f2603j) {
            H0.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f2602i;
    }

    public final int c() {
        return this.f2599f;
    }

    public final int d() {
        if (!this.f2603j) {
            H0.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f2601h;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float f10;
        int iA;
        this.f2603j = true;
        float textSize = paint.getTextSize();
        this.f2600g = paint.getFontMetricsInt();
        if (!(a().descent > a().ascent)) {
            H0.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i12 = this.f2595b;
        if (i12 == 0) {
            f10 = this.f2594a * this.f2598e;
        } else {
            if (i12 != 1) {
                H0.a.b("Unsupported unit.");
                throw new Ad.g();
            }
            f10 = this.f2594a * textSize;
        }
        this.f2601h = k.a(f10);
        int i13 = this.f2597d;
        if (i13 == 0) {
            iA = k.a(this.f2596c * this.f2598e);
        } else {
            if (i13 != 1) {
                H0.a.b("Unsupported unit.");
                throw new Ad.g();
            }
            iA = k.a(this.f2596c * textSize);
        }
        this.f2602i = iA;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f2599f) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + b();
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int iB = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB;
                        fontMetricsInt.descent = iB + b();
                    }
                    break;
                default:
                    H0.a.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return d();
    }
}
