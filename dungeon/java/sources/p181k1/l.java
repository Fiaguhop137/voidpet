package p181k1;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import p199l1.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements Spannable {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f47786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f47787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f47788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f47789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f47790e;

        /* JADX INFO: renamed from: k1.l$a$a, reason: collision with other inner class name */
        public static class C0559a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextPaint f47791a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f47793c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f47794d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f47792b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0559a(TextPaint textPaint) {
                this.f47791a = textPaint;
            }

            public a a() {
                return new a(this.f47791a, this.f47792b, this.f47793c, this.f47794d);
            }

            public C0559a b(int i10) {
                this.f47793c = i10;
                return this;
            }

            public C0559a c(int i10) {
                this.f47794d = i10;
                return this;
            }

            public C0559a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f47792b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f47786a = params.getTextPaint();
            this.f47787b = params.getTextDirection();
            this.f47788c = params.getBreakStrategy();
            this.f47789d = params.getHyphenationFrequency();
            this.f47790e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f47790e = k.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f47790e = null;
            }
            this.f47786a = textPaint;
            this.f47787b = textDirectionHeuristic;
            this.f47788c = i10;
            this.f47789d = i11;
        }

        public boolean a(a aVar) {
            if (this.f47788c != aVar.b() || this.f47789d != aVar.c() || this.f47786a.getTextSize() != aVar.e().getTextSize() || this.f47786a.getTextScaleX() != aVar.e().getTextScaleX() || this.f47786a.getTextSkewX() != aVar.e().getTextSkewX() || this.f47786a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f47786a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f47786a.getFlags() != aVar.e().getFlags() || !this.f47786a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return false;
            }
            if (this.f47786a.getTypeface() == null) {
                return aVar.e().getTypeface() == null;
            }
            return this.f47786a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f47788c;
        }

        public int c() {
            return this.f47789d;
        }

        public TextDirectionHeuristic d() {
            return this.f47787b;
        }

        public TextPaint e() {
            return this.f47786a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f47787b == aVar.d();
        }

        public int hashCode() {
            return c.b(Float.valueOf(this.f47786a.getTextSize()), Float.valueOf(this.f47786a.getTextScaleX()), Float.valueOf(this.f47786a.getTextSkewX()), Float.valueOf(this.f47786a.getLetterSpacing()), Integer.valueOf(this.f47786a.getFlags()), this.f47786a.getTextLocales(), this.f47786a.getTypeface(), Boolean.valueOf(this.f47786a.isElegantTextHeight()), this.f47787b, Integer.valueOf(this.f47788c), Integer.valueOf(this.f47789d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f47786a.getTextSize());
            sb2.append(", textScaleX=" + this.f47786a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f47786a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f47786a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f47786a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f47786a.getTextLocales());
            sb2.append(", typeface=" + this.f47786a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f47786a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f47787b);
            sb2.append(", breakStrategy=" + this.f47788c);
            sb2.append(", hyphenationFrequency=" + this.f47789d);
            sb2.append("}");
            return sb2.toString();
        }
    }
}
