package p223m7;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p extends ReplacementSpan implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49175a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Spannable spannable, TextView textView) {
            Intrinsics.checkNotNullParameter(spannable, "spannable");
            Object[] spans = spannable.getSpans(0, spannable.length(), p.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
            for (Object obj : spans) {
                p pVar = (p) obj;
                pVar.c();
                pVar.g(textView);
            }
        }
    }

    public abstract Drawable a();

    public abstract int b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g(TextView textView);
}
