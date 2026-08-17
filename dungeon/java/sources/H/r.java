package H;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p037c0.AbstractC2073b0;
import p037c0.Z;

/* JADX INFO: loaded from: classes.dex */
final class r extends RippleDrawable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f4111e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f4112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Z f4113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f4114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4115d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f4116a = new b();

        private b() {
        }

        public final void a(@NotNull RippleDrawable ripple, int i10) {
            Intrinsics.checkNotNullParameter(ripple, "ripple");
            ripple.setRadius(i10);
        }
    }

    public r(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f4112a = z10;
    }

    private final long a(long j10, float f10) {
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        return Z.k(j10, kotlin.ranges.e.h(f10, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final void b(long j10, float f10) {
        long jA = a(j10, f10);
        Z z10 = this.f4113b;
        if (z10 == null ? false : Z.m(z10.u(), jA)) {
            return;
        }
        this.f4113b = Z.g(jA);
        setColor(ColorStateList.valueOf(AbstractC2073b0.g(jA)));
    }

    public final void c(int i10) {
        Integer num = this.f4114c;
        if (num != null && num.intValue() == i10) {
            return;
        }
        this.f4114c = Integer.valueOf(i10);
        b.f4116a.a(this, i10);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.f4112a) {
            this.f4115d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        Intrinsics.checkNotNullExpressionValue(dirtyBounds, "super.getDirtyBounds()");
        this.f4115d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.f4115d;
    }
}
