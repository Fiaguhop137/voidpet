package com.facebook.react.devsupport;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.AbstractC2232l;
import com.facebook.react.AbstractC2234n;
import com.facebook.react.bridge.ReactContext;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class V extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f29633d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f29634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.facebook.react.modules.debug.h f29635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f29636c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f29637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f29639c;

        public b() {
        }

        public final void a() {
            this.f29637a = false;
            V.this.post(this);
        }

        public final void b() {
            this.f29637a = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29637a) {
                return;
            }
            this.f29638b += V.this.f29635b.d() - V.this.f29635b.g();
            this.f29639c += V.this.f29635b.c();
            V v10 = V.this;
            v10.c(v10.f29635b.e(), V.this.f29635b.f(), this.f29638b, this.f29639c, V.this.f29635b.j());
            V.this.f29635b.k();
            V.this.postDelayed(this, 500L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(ReactContext reactContext) {
        super(reactContext);
        Intrinsics.c(reactContext);
        View.inflate(reactContext, AbstractC2234n.f30004c, this);
        View viewFindViewById = findViewById(AbstractC2232l.f29830p);
        Intrinsics.d(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.f29634a = (TextView) viewFindViewById;
        com.facebook.react.modules.debug.h hVar = new com.facebook.react.modules.debug.h(reactContext);
        this.f29635b = hVar;
        this.f29636c = new b();
        c(0.0d, 0.0d, 0, 0, hVar.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(double d10, double d11, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.J j10 = kotlin.jvm.internal.J.f48342a;
        Locale locale = Locale.US;
        String str = String.format(locale, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far", Arrays.copyOf(new Object[]{Double.valueOf(d10), Integer.valueOf(i10), Integer.valueOf(i11)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        if (!z10) {
            String str2 = String.format(locale, "\nJS: %.1f fps", Arrays.copyOf(new Object[]{Double.valueOf(d11)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            str = str + str2;
        }
        this.f29634a.setText(str);
        W4.a.b("ReactNative", str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29635b.k();
        com.facebook.react.modules.debug.h.m(this.f29635b, 0.0d, 1, null);
        this.f29636c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29635b.o();
        this.f29636c.b();
    }
}
