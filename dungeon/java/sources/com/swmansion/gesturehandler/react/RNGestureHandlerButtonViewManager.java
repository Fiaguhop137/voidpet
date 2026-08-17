package com.swmansion.gesturehandler.react;

import Ia.AbstractC1098d;
import Ia.q;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AbstractC1905f0;
import com.facebook.react.AbstractC2232l;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.C2262k0;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p134h7.C3493n;
import p134h7.InterfaceC3495o;

/* JADX INFO: loaded from: classes2.dex */
@G6.a(name = "RNGestureHandlerButton")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002?@B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0018\u0010\u0012J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001a\u0010\u0012J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0017¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\"\u0010\u001eJ\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001bH\u0017¢\u0006\u0004\b$\u0010\u001eJ\u001f\u0010&\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001bH\u0017¢\u0006\u0004\b&\u0010\u001eJ\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u001bH\u0017¢\u0006\u0004\b(\u0010\u001eJ!\u0010*\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b0\u0010+J\u001f\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0013H\u0017¢\u0006\u0004\b2\u0010\u0016J\u001f\u00104\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u000eH\u0017¢\u0006\u0004\b4\u0010\u0012J\u001f\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u000eH\u0017¢\u0006\u0004\b6\u0010\u0012J\u0017\u00107\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000109H\u0014¢\u0006\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "Lh7/o;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/k0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/k0;)Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "view", "", "useDrawableOnForeground", "", "setForeground", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Z)V", "", "backgroundColor", "setBackgroundColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;I)V", "useBorderlessDrawable", "setBorderless", "enabled", "setEnabled", "", "borderRadius", "setBorderRadius", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;F)V", "borderTopLeftRadius", "setBorderTopLeftRadius", "borderTopRightRadius", "setBorderTopRightRadius", "borderBottomLeftRadius", "setBorderBottomLeftRadius", "borderBottomRightRadius", "setBorderBottomRightRadius", "borderWidth", "setBorderWidth", "borderColor", "setBorderColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/Integer;)V", "borderStyle", "setBorderStyle", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/String;)V", "rippleColor", "setRippleColor", "rippleRadius", "setRippleRadius", "exclusive", "setExclusive", "touchSoundDisabled", "setTouchSoundDisabled", "onAfterUpdateTransaction", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;)V", "Lcom/facebook/react/uimanager/B0;", "getDelegate", "()Lcom/facebook/react/uimanager/B0;", "mDelegate", "Lcom/facebook/react/uimanager/B0;", "Companion", "a", "b", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<a> implements InterfaceC3495o {

    @NotNull
    public static final String REACT_CLASS = "RNGestureHandlerButton";

    @NotNull
    private final B0 mDelegate;

    public static final class a extends ViewGroup implements q.e {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static a f38848v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static a f38849w;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f38851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f38852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f38853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f38854d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f38855e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f38856f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f38857g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f38858h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f38859i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f38860j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Integer f38861k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f38862l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f38863m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f38864n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f38865o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f38866p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f38867q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f38868r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f38869s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final C0428a f38846t = new C0428a(null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static TypedValue f38847u = new TypedValue();

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static View.OnClickListener f38850x = new b();

        /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a$a, reason: collision with other inner class name */
        public static final class C0428a {
            private C0428a() {
            }

            public /* synthetic */ C0428a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a(Context context) {
            super(context);
            this.f38862l = "solid";
            this.f38863m = true;
            this.f38866p = -1L;
            this.f38867q = -1;
            setOnClickListener(f38850x);
            setClickable(true);
            setFocusable(true);
            this.f38865o = true;
            setClipChildren(false);
        }

        private final boolean getHasBorderRadii() {
            return (this.f38855e == 0.0f && this.f38856f == 0.0f && this.f38857g == 0.0f && this.f38858h == 0.0f && this.f38859i == 0.0f) ? false : true;
        }

        private final float[] j() {
            float f10 = this.f38856f;
            float f11 = this.f38857g;
            float f12 = this.f38859i;
            float f13 = this.f38858h;
            float[] fArr = {f10, f10, f11, f11, f12, f12, f13, f13};
            ArrayList arrayList = new ArrayList(8);
            for (int i10 = 0; i10 < 8; i10++) {
                float f14 = fArr[i10];
                if (f14 == 0.0f) {
                    f14 = this.f38855e;
                }
                arrayList.add(Float.valueOf(f14));
            }
            return CollectionsKt.R0(arrayList);
        }

        private final PathEffect k() {
            String str = this.f38862l;
            if (Intrinsics.b(str, "dotted")) {
                float f10 = this.f38860j;
                return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
            }
            if (!Intrinsics.b(str, "dashed")) {
                return null;
            }
            float f11 = this.f38860j;
            float f12 = 3;
            return new DashPathEffect(new float[]{f11 * f12, f11 * f12, f11 * f12, f11 * f12}, 0.0f);
        }

        private final Drawable l() {
            PaintDrawable paintDrawable = new PaintDrawable(0);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(j());
            }
            if (this.f38860j > 0.0f) {
                Paint paint = paintDrawable.getPaint();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.f38860j);
                Integer num = this.f38861k;
                paint.setColor(num != null ? num.intValue() : -16777216);
                paint.setPathEffect(k());
            }
            return paintDrawable;
        }

        private final Drawable m() {
            ColorStateList colorStateList;
            Integer num = this.f38851a;
            if (num != null && num.intValue() == 0) {
                return null;
            }
            int[][] iArr = {new int[]{16842910}};
            Integer num2 = this.f38852b;
            Integer num3 = this.f38851a;
            if (num3 != null) {
                Intrinsics.c(num3);
                colorStateList = new ColorStateList(iArr, new int[]{num3.intValue()});
            } else {
                getContext().getTheme().resolveAttribute(16843820, f38847u, true);
                colorStateList = new ColorStateList(iArr, new int[]{f38847u.data});
            }
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, null, this.f38854d ? null : new ShapeDrawable(new RectShape()));
            if (num2 != null) {
                rippleDrawable.setRadius((int) H.i(num2.intValue()));
            }
            return rippleDrawable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(View view) {
        }

        private final l o() {
            l lVar = null;
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof l) {
                    lVar = (l) parent;
                }
            }
            return lVar;
        }

        private final boolean p(Sequence sequence) {
            Iterator it = sequence.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view instanceof a) {
                    a aVar = (a) view;
                    if (aVar.f38869s || aVar.isPressed()) {
                        return true;
                    }
                }
                if ((view instanceof ViewGroup) && p(AbstractC1905f0.a((ViewGroup) view))) {
                    return true;
                }
            }
            return false;
        }

        static /* synthetic */ boolean q(a aVar, Sequence sequence, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sequence = AbstractC1905f0.a(aVar);
            }
            return aVar.p(sequence);
        }

        private final void r() {
            if (f38848v == this) {
                f38848v = null;
                f38849w = this;
            }
        }

        private final boolean s() {
            if (q(this, null, 1, null)) {
                return false;
            }
            a aVar = f38848v;
            if (aVar == null) {
                f38848v = this;
                return true;
            }
            if (this.f38863m) {
                return aVar == this;
            }
            return !(aVar != null ? aVar.f38863m : false);
        }

        private final void u(int i10, Drawable drawable, Drawable drawable2) {
            PaintDrawable paintDrawable = new PaintDrawable(i10);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(j());
            }
            setBackground(new LayerDrawable(drawable2 != null ? new Drawable[]{paintDrawable, drawable2, drawable} : new Drawable[]{paintDrawable, drawable}));
        }

        @Override // Ia.q.e
        public boolean a() {
            return q.e.a.f(this);
        }

        @Override // Ia.q.e
        public boolean b(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() == 3 || event.getAction() == 1 || event.getActionMasked() == 6) {
                return false;
            }
            boolean zS = s();
            if (zS) {
                this.f38869s = true;
            }
            return zS;
        }

        @Override // Ia.q.e
        public boolean c() {
            return q.e.a.h(this);
        }

        @Override // Ia.q.e
        public boolean d(View view) {
            return q.e.a.b(this, view);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDrawableHotspotChanged(float f10, float f11) {
        }

        @Override // android.view.View
        public void drawableHotspotChanged(float f10, float f11) {
            a aVar = f38848v;
            if (aVar == null || aVar == this) {
                super.drawableHotspotChanged(f10, f11);
            }
        }

        @Override // Ia.q.e
        public Boolean e(View view, MotionEvent motionEvent) {
            return q.e.a.e(this, view, motionEvent);
        }

        @Override // Ia.q.e
        public void f(MotionEvent motionEvent) {
            q.e.a.d(this, motionEvent);
        }

        @Override // Ia.q.e
        public Boolean g(AbstractC1098d abstractC1098d) {
            return q.e.a.g(this, abstractC1098d);
        }

        public final float getBorderBottomLeftRadius() {
            return this.f38858h;
        }

        public final float getBorderBottomRightRadius() {
            return this.f38859i;
        }

        @Nullable
        public final Integer getBorderColor() {
            return this.f38861k;
        }

        public final float getBorderRadius() {
            return this.f38855e;
        }

        @Nullable
        public final String getBorderStyle() {
            return this.f38862l;
        }

        public final float getBorderTopLeftRadius() {
            return this.f38856f;
        }

        public final float getBorderTopRightRadius() {
            return this.f38857g;
        }

        public final float getBorderWidth() {
            return this.f38860j;
        }

        public final boolean getExclusive() {
            return this.f38863m;
        }

        @Nullable
        public final Integer getRippleColor() {
            return this.f38851a;
        }

        @Nullable
        public final Integer getRippleRadius() {
            return this.f38852b;
        }

        public final boolean getUseBorderlessDrawable() {
            return this.f38854d;
        }

        public final boolean getUseDrawableOnForeground() {
            return this.f38853c;
        }

        @Override // Ia.q.e
        public void h(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            r();
            this.f38869s = false;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            super.onInitializeAccessibilityNodeInfo(info);
            Object tag = super.getTag(AbstractC2232l.f29836v);
            if (tag instanceof String) {
                info.setViewIdResourceName((String) tag);
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (super.onInterceptTouchEvent(event)) {
                return true;
            }
            onTouchEvent(event);
            return isPressed();
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i10, KeyEvent keyEvent) {
            this.f38868r = true;
            return super.onKeyUp(i10, keyEvent);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            long eventTime = event.getEventTime();
            int action = event.getAction();
            a aVar = f38848v;
            if (aVar != null && aVar != this) {
                Intrinsics.c(aVar);
                if (aVar.f38863m) {
                    if (isPressed()) {
                        setPressed(false);
                    }
                    this.f38866p = eventTime;
                    this.f38867q = action;
                    return false;
                }
            }
            if (event.getAction() == 3) {
                r();
            }
            if (this.f38866p == eventTime && this.f38867q == action && action != 3) {
                return false;
            }
            this.f38866p = eventTime;
            this.f38867q = action;
            return super.onTouchEvent(event);
        }

        @Override // android.view.View
        public boolean performClick() {
            if (!q(this, null, 1, null)) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (com.swmansion.gesturehandler.react.a.d(context)) {
                    l lVarO = o();
                    if (lVarO != null) {
                        lVarO.v(this);
                    }
                } else if (this.f38868r) {
                    l lVarO2 = o();
                    if (lVarO2 != null) {
                        lVarO2.v(this);
                    }
                    this.f38868r = false;
                }
                if (f38849w == this) {
                    r();
                    f38849w = null;
                    return super.performClick();
                }
            }
            return false;
        }

        @Override // android.view.View
        public void setBackgroundColor(int i10) {
            this.f38864n = i10;
            this.f38865o = true;
        }

        public final void setBorderBottomLeftRadius(float f10) {
            this.f38858h = f10 * getResources().getDisplayMetrics().density;
            this.f38865o = true;
        }

        public final void setBorderBottomRightRadius(float f10) {
            this.f38859i = f10 * getResources().getDisplayMetrics().density;
            this.f38865o = true;
        }

        public final void setBorderColor(@Nullable Integer num) {
            this.f38861k = num;
            this.f38865o = true;
        }

        public final void setBorderRadius(float f10) {
            this.f38855e = f10 * getResources().getDisplayMetrics().density;
            this.f38865o = true;
        }

        public final void setBorderStyle(@Nullable String str) {
            this.f38862l = str;
            this.f38865o = true;
        }

        public final void setBorderTopLeftRadius(float f10) {
            this.f38856f = f10 * getResources().getDisplayMetrics().density;
            this.f38865o = true;
        }

        public final void setBorderTopRightRadius(float f10) {
            this.f38857g = f10 * getResources().getDisplayMetrics().density;
            this.f38865o = true;
        }

        public final void setBorderWidth(float f10) {
            this.f38860j = f10 * getResources().getDisplayMetrics().density;
            this.f38865o = true;
        }

        public final void setExclusive(boolean z10) {
            this.f38863m = z10;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0017  */
        @Override // android.view.View
        public void setPressed(boolean z10) {
            boolean z11;
            if (!this.f38863m) {
                a aVar = f38848v;
                z11 = (aVar == null || !aVar.f38863m) && !q(this, null, 1, null);
            }
            if (!z10 || f38848v == this || z11) {
                this.f38869s = z10;
                super.setPressed(z10);
            }
            if (z10 || f38848v != this) {
                return;
            }
            this.f38869s = false;
        }

        public final void setRippleColor(@Nullable Integer num) {
            this.f38851a = num;
            this.f38865o = true;
        }

        public final void setRippleRadius(@Nullable Integer num) {
            this.f38852b = num;
            this.f38865o = true;
        }

        public final void setTouched(boolean z10) {
            this.f38869s = z10;
        }

        public final void setUseBorderlessDrawable(boolean z10) {
            this.f38854d = z10;
        }

        public final void setUseDrawableOnForeground(boolean z10) {
            this.f38853c = z10;
            this.f38865o = true;
        }

        public final void t() {
            if (this.f38865o) {
                this.f38865o = false;
                if (this.f38864n == 0) {
                    setBackground(null);
                }
                setForeground(null);
                Drawable drawableM = m();
                Drawable drawableL = l();
                if (getHasBorderRadii() && (drawableM instanceof RippleDrawable)) {
                    PaintDrawable paintDrawable = new PaintDrawable(-1);
                    paintDrawable.setCornerRadii(j());
                    ((RippleDrawable) drawableM).setDrawableByLayerId(16908334, paintDrawable);
                }
                if (this.f38853c) {
                    setForeground(drawableM);
                    int i10 = this.f38864n;
                    if (i10 != 0) {
                        u(i10, drawableL, null);
                        return;
                    }
                    return;
                }
                int i11 = this.f38864n;
                if (i11 == 0 && this.f38851a == null) {
                    setBackground(new LayerDrawable(new Drawable[]{drawableM, drawableL}));
                } else {
                    u(i11, drawableL, drawableM);
                }
            }
        }
    }

    public RNGestureHandlerButtonViewManager() {
        super(null, 1, null);
        this.mDelegate = new C3493n(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public a createViewInstance(@NotNull C2262k0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new a(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    protected B0 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RNGestureHandlerButton";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.t();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC2273q
    public /* bridge */ /* synthetic */ void removeAllViews(@NotNull View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @Y6.a(name = "backgroundColor")
    public void setBackgroundColor(@NotNull a view, int backgroundColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackgroundColor(backgroundColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @Y6.a(name = "borderBottomLeftRadius")
    public void setBorderBottomLeftRadius(@NotNull a view, float borderBottomLeftRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderBottomLeftRadius(borderBottomLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @Y6.a(name = "borderBottomRightRadius")
    public void setBorderBottomRightRadius(@NotNull a view, float borderBottomRightRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderBottomRightRadius(borderBottomRightRadius);
    }

    @Override // p134h7.InterfaceC3495o
    @Y6.a(name = "borderColor")
    public void setBorderColor(@NotNull a view, @Nullable Integer borderColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderColor(borderColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @Y6.a(name = "borderRadius")
    public void setBorderRadius(@NotNull a view, float borderRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderRadius(borderRadius);
    }

    @Override // p134h7.InterfaceC3495o
    @Y6.a(name = "borderStyle")
    public void setBorderStyle(@NotNull a view, @Nullable String borderStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderStyle(borderStyle);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @Y6.a(name = "borderTopLeftRadius")
    public void setBorderTopLeftRadius(@NotNull a view, float borderTopLeftRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderTopLeftRadius(borderTopLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @Y6.a(name = "borderTopRightRadius")
    public void setBorderTopRightRadius(@NotNull a view, float borderTopRightRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderTopRightRadius(borderTopRightRadius);
    }

    @Override // p134h7.InterfaceC3495o
    @Y6.a(name = "borderWidth")
    public void setBorderWidth(@NotNull a view, float borderWidth) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderWidth(borderWidth);
    }

    @Override // p134h7.InterfaceC3495o
    @Y6.a(name = "borderless")
    public void setBorderless(@NotNull a view, boolean useBorderlessDrawable) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUseBorderlessDrawable(useBorderlessDrawable);
    }

    @Override // p134h7.InterfaceC3495o
    @Y6.a(name = "enabled")
    public void setEnabled(@NotNull a view, boolean enabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(enabled);
    }

    @Override // p134h7.InterfaceC3495o
    @Y6.a(name = "exclusive")
    public void setExclusive(@NotNull a view, boolean exclusive) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setExclusive(exclusive);
    }

    @Override // p134h7.InterfaceC3495o
    @Y6.a(name = "foreground")
    @TargetApi(23)
    public void setForeground(@NotNull a view, boolean useDrawableOnForeground) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUseDrawableOnForeground(useDrawableOnForeground);
    }

    @Override // p134h7.InterfaceC3495o
    @Y6.a(name = "rippleColor")
    public void setRippleColor(@NotNull a view, @Nullable Integer rippleColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRippleColor(rippleColor);
    }

    @Override // p134h7.InterfaceC3495o
    @Y6.a(name = "rippleRadius")
    public void setRippleRadius(@NotNull a view, int rippleRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRippleRadius(Integer.valueOf(rippleRadius));
    }

    @Override // p134h7.InterfaceC3495o
    @Y6.a(name = "touchSoundDisabled")
    public void setTouchSoundDisabled(@NotNull a view, boolean touchSoundDisabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSoundEffectsEnabled(!touchSoundDisabled);
    }
}
