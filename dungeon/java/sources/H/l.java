package H;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f4082f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f4083g = {16842919, 16842910};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f4084h = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f4085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f4086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f4087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f4088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Function0 f4089e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void c(boolean z10) {
        r rVar = new r(z10);
        setBackground(rVar);
        this.f4085a = rVar;
    }

    private final void setRippleState(boolean z10) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f4088d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f4087c;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f4083g : f4084h;
            r rVar = this.f4085a;
            if (rVar != null) {
                rVar.setState(iArr);
            }
        } else {
            k kVar = new k(this);
            this.f4088d = kVar;
            postDelayed(kVar, 50L);
        }
        this.f4087c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(l this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        r rVar = this$0.f4085a;
        if (rVar != null) {
            rVar.setState(f4084h);
        }
        this$0.f4088d = null;
    }

    public final void b(p431y.n interaction, boolean z10, long j10, int i10, long j11, float f10, Function0 onInvalidateRipple) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(onInvalidateRipple, "onInvalidateRipple");
        if (this.f4085a == null || !Intrinsics.b(Boolean.valueOf(z10), this.f4086b)) {
            c(z10);
            this.f4086b = Boolean.valueOf(z10);
        }
        r rVar = this.f4085a;
        Intrinsics.c(rVar);
        this.f4089e = onInvalidateRipple;
        f(j10, i10, j11, f10);
        if (z10) {
            rVar.setHotspot(p019b0.e.m(interaction.a()), p019b0.e.n(interaction.a()));
        } else {
            rVar.setHotspot(rVar.getBounds().centerX(), rVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void d() {
        this.f4089e = null;
        Runnable runnable = this.f4088d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f4088d;
            Intrinsics.c(runnable2);
            runnable2.run();
        } else {
            r rVar = this.f4085a;
            if (rVar != null) {
                rVar.setState(f4084h);
            }
        }
        r rVar2 = this.f4085a;
        if (rVar2 == null) {
            return;
        }
        rVar2.setVisible(false, false);
        unscheduleDrawable(rVar2);
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j10, int i10, long j11, float f10) {
        r rVar = this.f4085a;
        if (rVar == null) {
            return;
        }
        rVar.c(i10);
        rVar.b(j11, f10);
        Rect rect = new Rect(0, 0, Od.a.c(p019b0.k.i(j10)), Od.a.c(p019b0.k.g(j10)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        rVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        Function0 function0 = this.f4089e;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}
