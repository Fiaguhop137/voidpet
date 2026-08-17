package com.swmansion.rnscreens;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0;
import androidx.core.view.C1923o0;
import com.facebook.react.uimanager.C2262k0;
import com.facebook.react.uimanager.C2270o0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001c\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u0014J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0007J\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u0012H\u0016¢\u0006\u0004\b-\u0010+J\u000f\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010\u0007J\u000f\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010\u0007J\u000f\u00100\u001a\u00020\bH\u0000¢\u0006\u0004\b0\u0010\u0007J\u0019\u00103\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104J+\u00109\u001a\u00020\u00192\u0006\u00106\u001a\u0002052\b\u00108\u001a\u0004\u0018\u0001072\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b9\u0010:J!\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u00020\u00192\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b<\u0010=J)\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010>\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u000eH\u0016¢\u0006\u0004\bB\u0010CJ)\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010>\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u000eH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\bH\u0016¢\u0006\u0004\bG\u0010\u0007J\u000f\u0010H\u001a\u00020\bH\u0016¢\u0006\u0004\bH\u0010\u0007J\u0017\u0010I\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\bI\u0010\u0018J\u001f\u0010K\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00106\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0012H\u0016¢\u0006\u0004\bM\u0010\u0014J\u000f\u0010N\u001a\u00020\bH\u0016¢\u0006\u0004\bN\u0010\u0007R\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010VR\u0018\u0010\\\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R$\u0010d\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR0\u0010l\u001a\u0010\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\b\u0018\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0016\u0010p\u001a\u00020m8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010s\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR$\u0010y\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010\"\"\u0004\bw\u0010xR\u0014\u0010}\u001a\u00020z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|¨\u0006~"}, d2 = {"Lcom/swmansion/rnscreens/U;", "Lcom/swmansion/rnscreens/A;", "Lcom/swmansion/rnscreens/V;", "Lcom/swmansion/rnscreens/t;", "screenView", "<init>", "(Lcom/swmansion/rnscreens/t;)V", "()V", "", "z2", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "s2", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "screen", "", "K2", "(Lcom/swmansion/rnscreens/t;)Ljava/lang/Integer;", "q2", "", "P2", "()Z", "Landroid/view/Menu;", "menu", "Q2", "(Landroid/view/Menu;)V", "Landroid/view/View;", "v2", "()Landroid/view/View;", "forceCreation", "LKa/e;", "H2", "(Z)LKa/e;", "LKa/i;", "J2", "()LKa/i;", "k", "G2", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "M2", "(Landroidx/appcompat/widget/Toolbar;)V", "hidden", "N2", "(Z)V", "translucent", "O2", "o", "g2", "u2", "Landroid/os/Bundle;", "savedInstanceState", "D0", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "H0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "c1", "(Landroid/view/View;Landroid/os/Bundle;)V", "transit", "enter", "nextAnim", "Landroid/view/animation/Animation;", "E0", "(IZI)Landroid/view/animation/Animation;", "Landroid/animation/Animator;", "F0", "(IZI)Landroid/animation/Animator;", "a1", "b1", "V0", "Landroid/view/MenuInflater;", "G0", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "r2", "t2", "Lcom/google/android/material/appbar/AppBarLayout;", "l0", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "m0", "Landroidx/appcompat/widget/Toolbar;", "n0", "Z", "isToolbarShadowHidden", "o0", "isToolbarTranslucent", "p0", "Landroid/view/View;", "lastFocusedChild", "Lcom/swmansion/rnscreens/c;", "q0", "Lcom/swmansion/rnscreens/c;", "x2", "()Lcom/swmansion/rnscreens/c;", "setSearchView", "(Lcom/swmansion/rnscreens/c;)V", "searchView", "Lkotlin/Function1;", "r0", "Lkotlin/jvm/functions/Function1;", "getOnSearchViewCreate", "()Lkotlin/jvm/functions/Function1;", "L2", "(Lkotlin/jvm/functions/Function1;)V", "onSearchViewCreate", "LRa/e;", "s0", "LRa/e;", "coordinatorLayout", "t0", "LKa/e;", "dimmingDelegate", "u0", "LKa/i;", "y2", "setSheetDelegate$react_native_screens_release", "(LKa/i;)V", "sheetDelegate", "Lcom/swmansion/rnscreens/M;", "w2", "()Lcom/swmansion/rnscreens/M;", "screenStack", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class U extends A implements V {

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private AppBarLayout appBarLayout;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    private Toolbar toolbar;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    private boolean isToolbarShadowHidden;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    private boolean isToolbarTranslucent;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    private View lastFocusedChild;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private C3192c searchView;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private Function1 onSearchViewCreate;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    private Ra.e coordinatorLayout;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private Ka.e dimmingDelegate;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private Ka.i sheetDelegate;

    public static final class a extends C1923o0.b {
        a() {
            super(0);
        }

        @Override // androidx.core.view.C1923o0.b
        public C0 onProgress(C0 insets, List runningAnimations) {
            Intrinsics.checkNotNullParameter(insets, "insets");
            Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
            return insets;
        }
    }

    public U() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C3208t screenView) {
        super(screenView);
        Intrinsics.checkNotNullParameter(screenView, "screenView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A2(Ka.e eVar, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f10 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f10 != null) {
            eVar.d().setAlpha(f10.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float B2(U u10, Number number) {
        return u10.j().getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float C2(Number number) {
        return Float.valueOf(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D2(U u10, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f10 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f10 != null) {
            u10.j().setTranslationY(f10.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E2(Ka.e eVar, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f10 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f10 != null) {
            eVar.d().setAlpha(f10.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F2(U u10, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Float f10 = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f10 != null) {
            u10.j().setTranslationY(f10.floatValue());
        }
    }

    private final Ka.e H2(boolean forceCreation) {
        Ka.e eVar = this.dimmingDelegate;
        if (eVar == null || forceCreation) {
            if (eVar != null) {
                eVar.f(j().getSheetBehavior());
            }
            this.dimmingDelegate = new Ka.e(j().getReactContext(), j());
        }
        Ka.e eVar2 = this.dimmingDelegate;
        Intrinsics.c(eVar2);
        return eVar2;
    }

    static /* synthetic */ Ka.e I2(U u10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return u10.H2(z10);
    }

    private final Ka.i J2() {
        if (this.sheetDelegate == null) {
            this.sheetDelegate = new Ka.i(j());
        }
        Ka.i iVar = this.sheetDelegate;
        Intrinsics.c(iVar);
        return iVar;
    }

    private final Integer K2(C3208t screen) {
        Integer numValueOf;
        ColorStateList colorStateListD;
        Drawable background = screen.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            numValueOf = Integer.valueOf(colorDrawable.getColor());
        } else {
            Drawable background2 = screen.getBackground();
            p297q9.g gVar = background2 instanceof p297q9.g ? (p297q9.g) background2 : null;
            numValueOf = (gVar == null || (colorStateListD = gVar.D()) == null) ? null : Integer.valueOf(colorStateListD.getDefaultColor());
        }
        if (numValueOf != null) {
            return numValueOf;
        }
        C3211w contentWrapper = screen.getContentWrapper();
        if (contentWrapper == null) {
            return null;
        }
        return Ta.j.a(contentWrapper);
    }

    private final boolean P2() {
        X headerConfig = j().getHeaderConfig();
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() : 0;
        if (headerConfig != null && configSubviewsCount > 0) {
            for (int i10 = 0; i10 < configSubviewsCount; i10++) {
                if (headerConfig.g(i10).getType() == Z.a.SEARCH_BAR) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void Q2(Menu menu) {
        menu.clear();
        if (P2()) {
            Context contextG = G();
            if (this.searchView == null && contextG != null) {
                C3192c c3192c = new C3192c(contextG, this);
                this.searchView = c3192c;
                Function1 function1 = this.onSearchViewCreate;
                if (function1 != null) {
                    function1.invoke(c3192c);
                }
            }
            MenuItem menuItemAdd = menu.add("");
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setActionView(this.searchView);
        }
    }

    private final void q2(C3208t screen) {
        float fI = com.facebook.react.uimanager.H.i(screen.getSheetCornerRadius());
        q9.k.b bVar = new q9.k.b();
        bVar.y(0, fI);
        bVar.D(0, fI);
        p297q9.k kVarM = bVar.m();
        Intrinsics.checkNotNullExpressionValue(kVarM, "build(...)");
        p297q9.g gVar = new p297q9.g(kVarM);
        Integer numK2 = K2(screen);
        gVar.setTint(numK2 != null ? numK2.intValue() : 0);
        screen.setBackground(gVar);
    }

    private final BottomSheetBehavior s2() {
        return new BottomSheetBehavior();
    }

    private final View v2() {
        View viewJ = j();
        while (viewJ != null) {
            if (viewJ.isFocused()) {
                return viewJ;
            }
            viewJ = viewJ instanceof ViewGroup ? ((ViewGroup) viewJ).getFocusedChild() : null;
        }
        return null;
    }

    private final M w2() {
        C3210v container = j().getContainer();
        if (container instanceof M) {
            return (M) container;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
    }

    private final void z2() {
        View viewI0 = i0();
        ViewParent parent = viewI0 != null ? viewI0.getParent() : null;
        if (parent instanceof M) {
            ((M) parent).a0();
        }
    }

    @Override // androidx.fragment.app.i
    public void D0(Bundle savedInstanceState) {
        super.D0(savedInstanceState);
    }

    @Override // androidx.fragment.app.i
    public Animation E0(int transit, boolean enter, int nextAnim) {
        return null;
    }

    @Override // androidx.fragment.app.i
    public Animator F0(int transit, boolean enter, int nextAnim) {
        Ra.e eVar = null;
        if (!Ka.k.d(j())) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Ka.e eVarI2 = I2(this, false, 1, null);
        if (enter) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, eVarI2.e());
            valueAnimatorOfFloat.addUpdateListener(new N(eVarI2));
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new Sa.a(new O(this), new P()), Float.valueOf(j().getHeight()), Float.valueOf(0.0f));
            valueAnimatorOfObject.addUpdateListener(new Q(this));
            AnimatorSet.Builder builderPlay = eVarI2.j(j(), j().getSheetInitialDetentIndex()) ? animatorSet.play(valueAnimatorOfObject) : null;
            if (builderPlay != null) {
                builderPlay.with(valueAnimatorOfFloat);
            }
        } else {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(eVarI2.d().getAlpha(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(new S(eVarI2));
            Ra.e eVar2 = this.coordinatorLayout;
            if (eVar2 == null) {
                Intrinsics.r("coordinatorLayout");
            } else {
                eVar = eVar2;
            }
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, eVar.getBottom() - j().getTop());
            valueAnimatorOfFloat3.addUpdateListener(new T(this));
            animatorSet.play(valueAnimatorOfFloat2).with(valueAnimatorOfFloat3);
        }
        animatorSet.addListener(new La.e(this, new La.i(j()), enter ? La.e.a.ENTER : La.e.a.EXIT));
        return animatorSet;
    }

    @Override // androidx.fragment.app.i
    public void G0(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Q2(menu);
        super.G0(menu, inflater);
    }

    public void G2() {
        Toolbar toolbar;
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null && (toolbar = this.toolbar) != null && toolbar.getParent() == appBarLayout) {
            appBarLayout.removeView(toolbar);
        }
        this.toolbar = null;
    }

    @Override // com.swmansion.rnscreens.A, androidx.fragment.app.i
    public View H0(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        CoordinatorLayout.c scrollingViewBehavior;
        AppBarLayout appBarLayout;
        AppBarLayout appBarLayout2;
        AppBarLayout appBarLayout3;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextG1 = G1();
        Intrinsics.checkNotNullExpressionValue(contextG1, "requireContext(...)");
        this.coordinatorLayout = new Ra.e(contextG1, this);
        C3208t c3208tJ = j();
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        if (Ka.k.d(j())) {
            scrollingViewBehavior = s2();
        } else {
            scrollingViewBehavior = this.isToolbarTranslucent ? null : new AppBarLayout.ScrollingViewBehavior();
        }
        fVar.n(scrollingViewBehavior);
        c3208tJ.setLayoutParams(fVar);
        Ra.e eVar = this.coordinatorLayout;
        if (eVar == null) {
            Intrinsics.r("coordinatorLayout");
            eVar = null;
        }
        eVar.addView(Ma.c.b(j()));
        if (Ka.k.d(j())) {
            j().setClipToOutline(true);
            q2(j());
            j().setElevation(j().getSheetElevation());
            Ka.i iVarJ2 = J2();
            BottomSheetBehavior<C3208t> sheetBehavior = j().getSheetBehavior();
            Intrinsics.c(sheetBehavior);
            Ka.i.d(iVarJ2, sheetBehavior, null, 0, 6, null);
            Ka.e eVarH2 = H2(true);
            C3208t c3208tJ2 = j();
            Ra.e eVar2 = this.coordinatorLayout;
            if (eVar2 == null) {
                Intrinsics.r("coordinatorLayout");
                eVar2 = null;
            }
            eVarH2.h(c3208tJ2, eVar2);
            C3208t c3208tJ3 = j();
            BottomSheetBehavior<C3208t> sheetBehavior2 = j().getSheetBehavior();
            Intrinsics.c(sheetBehavior2);
            eVarH2.g(c3208tJ3, sheetBehavior2);
            C3210v container2 = j().getContainer();
            Intrinsics.c(container2);
            Ra.e eVar3 = this.coordinatorLayout;
            if (eVar3 == null) {
                Intrinsics.r("coordinatorLayout");
                eVar3 = null;
            }
            eVar3.measure(View.MeasureSpec.makeMeasureSpec(container2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(container2.getHeight(), 1073741824));
            Ra.e eVar4 = this.coordinatorLayout;
            if (eVar4 == null) {
                Intrinsics.r("coordinatorLayout");
                eVar4 = null;
            }
            eVar4.layout(0, 0, container2.getWidth(), container2.getHeight());
            androidx.core.view.Z.H0(j(), new a());
        } else {
            Context contextG = G();
            if (contextG != null) {
                appBarLayout = new AppBarLayout(contextG);
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setLayoutParams(new AppBarLayout.d(-1, -2));
            } else {
                appBarLayout = null;
            }
            this.appBarLayout = appBarLayout;
            Ra.e eVar5 = this.coordinatorLayout;
            if (eVar5 == null) {
                Intrinsics.r("coordinatorLayout");
                eVar5 = null;
            }
            eVar5.addView(this.appBarLayout);
            if (this.isToolbarShadowHidden && (appBarLayout3 = this.appBarLayout) != null) {
                appBarLayout3.setTargetElevation(0.0f);
            }
            Toolbar toolbar = this.toolbar;
            if (toolbar != null && (appBarLayout2 = this.appBarLayout) != null) {
                appBarLayout2.addView(Ma.c.b(toolbar));
            }
            O1(true);
        }
        Ra.e eVar6 = this.coordinatorLayout;
        if (eVar6 != null) {
            return eVar6;
        }
        Intrinsics.r("coordinatorLayout");
        return null;
    }

    public final void L2(Function1 function1) {
        this.onSearchViewCreate = function1;
    }

    public void M2(Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        AppBarLayout.d dVar = new AppBarLayout.d(-1, -2);
        dVar.g(0);
        toolbar.setLayoutParams(dVar);
        this.toolbar = toolbar;
    }

    public void N2(boolean hidden) {
        if (this.isToolbarShadowHidden != hidden) {
            AppBarLayout appBarLayout = this.appBarLayout;
            if (appBarLayout != null) {
                appBarLayout.setElevation(hidden ? 0.0f : com.facebook.react.uimanager.H.i(4.0f));
            }
            AppBarLayout appBarLayout2 = this.appBarLayout;
            if (appBarLayout2 != null) {
                appBarLayout2.setStateListAnimator(null);
            }
            this.isToolbarShadowHidden = hidden;
        }
    }

    public void O2(boolean translucent) {
        if (this.isToolbarTranslucent != translucent) {
            ViewGroup.LayoutParams layoutParams = j().getLayoutParams();
            Intrinsics.d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((CoordinatorLayout.f) layoutParams).n(translucent ? null : new AppBarLayout.ScrollingViewBehavior());
            this.isToolbarTranslucent = translucent;
        }
    }

    @Override // androidx.fragment.app.i
    public void V0(Menu menu) {
        X headerConfig;
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (!j().o() || ((headerConfig = j().getHeaderConfig()) != null && !headerConfig.h())) {
            Q2(menu);
        }
        super.V0(menu);
    }

    @Override // androidx.fragment.app.i
    public void a1() {
        View view = this.lastFocusedChild;
        if (view != null) {
            view.requestFocus();
        }
        super.a1();
    }

    @Override // androidx.fragment.app.i
    public void b1() {
        if (Ta.a.f12379a.a(G())) {
            this.lastFocusedChild = v2();
        }
        super.b1();
    }

    @Override // androidx.fragment.app.i
    public void c1(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.c1(view, savedInstanceState);
    }

    @Override // com.swmansion.rnscreens.A
    public void g2() {
        super.g2();
        z2();
        j().e();
    }

    @Override // com.swmansion.rnscreens.A, com.swmansion.rnscreens.B
    public boolean k() {
        return j().o();
    }

    @Override // com.swmansion.rnscreens.A, com.swmansion.rnscreens.B
    public void o() {
        super.o();
        X headerConfig = j().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.l();
        }
    }

    public boolean r2() {
        C3210v container = j().getContainer();
        if (!(container instanceof M)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
        }
        if (!Intrinsics.b(((M) container).getRootScreen(), j())) {
            return true;
        }
        androidx.fragment.app.i iVarT = T();
        if (iVarT instanceof U) {
            return ((U) iVarT).r2();
        }
        return false;
    }

    public void t2() {
        w2().M(this);
    }

    public final void u2() {
        if (t0() && o0()) {
            return;
        }
        C2262k0 reactContext = j().getReactContext();
        int iE = C2270o0.e(reactContext);
        EventDispatcher eventDispatcherC = C2270o0.c(reactContext, j().getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new La.h(iE, j().getId()));
        }
    }

    /* JADX INFO: renamed from: x2, reason: from getter */
    public final C3192c getSearchView() {
        return this.searchView;
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final Ka.i getSheetDelegate() {
        return this.sheetDelegate;
    }
}
