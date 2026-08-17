package Ka;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.C2262k0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.C3208t;
import com.swmansion.rnscreens.U;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2262k0 f6140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f6141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f6142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BottomSheetBehavior.f f6143d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends BottomSheetBehavior.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3208t f6144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f6145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f6146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f6147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f6148e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f6149f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ValueAnimator f6150g;

        public a(C3208t screen, View viewToAnimate, float f10) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(viewToAnimate, "viewToAnimate");
            this.f6144a = screen;
            this.f6145b = viewToAnimate;
            this.f6146c = f10;
            this.f6147d = f(screen.getSheetLargestUndimmedDetentIndex());
            float f11 = f(kotlin.ranges.e.m(screen.getSheetLargestUndimmedDetentIndex() + 1, 0, screen.getSheetDetents().size() - 1));
            this.f6148e = f11;
            this.f6149f = f11 - this.f6147d;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f10);
            valueAnimatorOfFloat.setDuration(1L);
            valueAnimatorOfFloat.addUpdateListener(new d(this));
            this.f6150g = valueAnimatorOfFloat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(a aVar, ValueAnimator it) {
            Intrinsics.checkNotNullParameter(it, "it");
            View view = aVar.f6145b;
            Object animatedValue = it.getAnimatedValue();
            Intrinsics.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue).floatValue());
        }

        private final float f(int i10) {
            int size = this.f6144a.getSheetDetents().size();
            if (size == 1) {
                return (i10 == -1 || i10 != 0) ? -1.0f : 1.0f;
            }
            if (size == 2) {
                if (i10 == -1) {
                    return -1.0f;
                }
                if (i10 != 0) {
                    return i10 != 1 ? -1.0f : 1.0f;
                }
                return 0.0f;
            }
            if (size != 3 || i10 == -1) {
                return -1.0f;
            }
            if (i10 == 0) {
                return 0.0f;
            }
            if (i10 != 1) {
                return i10 != 2 ? -1.0f : 1.0f;
            }
            BottomSheetBehavior<C3208t> sheetBehavior = this.f6144a.getSheetBehavior();
            Intrinsics.c(sheetBehavior);
            return sheetBehavior.o0();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View bottomSheet, float f10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            float f11 = this.f6147d;
            if (f11 >= f10 || f10 >= this.f6148e) {
                return;
            }
            this.f6150g.setCurrentFraction((f10 - f11) / this.f6149f);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View bottomSheet, int i10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (i10 == 1 || i10 == 2) {
                this.f6147d = f(this.f6144a.getSheetLargestUndimmedDetentIndex());
                float f10 = f(kotlin.ranges.e.m(this.f6144a.getSheetLargestUndimmedDetentIndex() + 1, 0, this.f6144a.getSheetDetents().size() - 1));
                this.f6148e = f10;
                this.f6149f = f10 - this.f6147d;
            }
        }
    }

    public e(C2262k0 reactContext, C3208t screen) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f6140a = reactContext;
        this.f6141b = b(screen);
        this.f6142c = 0.3f;
    }

    private final b b(C3208t c3208t) {
        b bVar = new b(this.f6140a, this.f6142c);
        bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        bVar.setOnClickListener(new c(c3208t));
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3208t c3208t, View view) {
        if (c3208t.getSheetClosesOnTouchOutside()) {
            androidx.fragment.app.i fragment = c3208t.getFragment();
            Intrinsics.d(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
            ((U) fragment).u2();
        }
    }

    private final BottomSheetBehavior.f i(C3208t c3208t, boolean z10) {
        if (this.f6143d == null || z10) {
            this.f6143d = new a(c3208t, this.f6141b, this.f6142c);
        }
        BottomSheetBehavior.f fVar = this.f6143d;
        Intrinsics.c(fVar);
        return fVar;
    }

    public final b d() {
        return this.f6141b;
    }

    public final float e() {
        return this.f6142c;
    }

    public final void f(BottomSheetBehavior bottomSheetBehavior) {
        BottomSheetBehavior.f fVar = this.f6143d;
        if (fVar == null || bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.A0(fVar);
    }

    public final void g(C3208t screen, BottomSheetBehavior behavior) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        behavior.Y(i(screen, true));
    }

    public final void h(C3208t screen, ViewGroup root) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(root, "root");
        root.addView(this.f6141b, 0);
        if (j(screen, screen.getSheetInitialDetentIndex())) {
            this.f6141b.setAlpha(this.f6142c);
        } else {
            this.f6141b.setAlpha(0.0f);
        }
    }

    public final boolean j(C3208t screen, int i10) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return i10 > screen.getSheetLargestUndimmedDetentIndex();
    }
}
