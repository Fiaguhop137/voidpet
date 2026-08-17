package Ia;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.H;
import java.util.Arrays;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: Ia.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1098d {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final b f5151J = new b(null);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final Void f5152K = null;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static MotionEvent.PointerProperties[] f5153L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static MotionEvent.PointerCoords[] f5154M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static short f5155N;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private i f5156A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private r f5157B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private e f5158C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f5159D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f5160E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f5161F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f5162G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f5163H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f5164I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f5165a = new int[12];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f5167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f5169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f5171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f5172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private WritableArray f5176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WritableArray f5177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C0105d[] f5180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f5181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float[] f5182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private short f5183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f5184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f5185u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f5186v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f5187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f5188x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f5189y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f5190z;

    /* JADX INFO: renamed from: Ia.d$a */
    public static final class a extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC1098d handler, MotionEvent event, IllegalArgumentException e10) {
            super(StringsKt.j("\n    handler: " + F.b(handler.getClass()).p() + "\n    state: " + handler.S() + "\n    view: " + handler.W() + "\n    orchestrator: " + handler.P() + "\n    isEnabled: " + handler.d0() + "\n    isActive: " + handler.Z() + "\n    isAwaiting: " + handler.a0() + "\n    trackedPointersCount: " + handler.f5166b + "\n    trackedPointers: " + AbstractC3952n.m0(handler.f5165a, ", ", null, null, 0, null, null, 62, null) + "\n    while handling event: " + event + "\n      "), e10);
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(e10, "e");
        }
    }

    /* JADX INFO: renamed from: Ia.d$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(float f10) {
            return !Float.isNaN(f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(int i10) {
            if (AbstractC1098d.f5153L == null) {
                AbstractC1098d.f5153L = new MotionEvent.PointerProperties[12];
                AbstractC1098d.f5154M = new MotionEvent.PointerCoords[12];
            }
            while (i10 > 0) {
                MotionEvent.PointerProperties[] pointerPropertiesArr = AbstractC1098d.f5153L;
                MotionEvent.PointerCoords[] pointerCoordsArr = null;
                if (pointerPropertiesArr == null) {
                    Intrinsics.r("pointerProps");
                    pointerPropertiesArr = null;
                }
                int i11 = i10 - 1;
                if (pointerPropertiesArr[i11] != null) {
                    return;
                }
                MotionEvent.PointerProperties[] pointerPropertiesArr2 = AbstractC1098d.f5153L;
                if (pointerPropertiesArr2 == null) {
                    Intrinsics.r("pointerProps");
                    pointerPropertiesArr2 = null;
                }
                pointerPropertiesArr2[i11] = new MotionEvent.PointerProperties();
                MotionEvent.PointerCoords[] pointerCoordsArr2 = AbstractC1098d.f5154M;
                if (pointerCoordsArr2 == null) {
                    Intrinsics.r("pointerCoords");
                } else {
                    pointerCoordsArr = pointerCoordsArr2;
                }
                pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
                i10--;
            }
        }
    }

    /* JADX INFO: renamed from: Ia.d$c */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5191a = new a(null);

        /* JADX INFO: renamed from: Ia.d$c$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void b(AbstractC1098d abstractC1098d, ReadableMap readableMap) {
                if (readableMap.getType("hitSlop") == ReadableType.Number) {
                    float fH = H.h(readableMap.getDouble("hitSlop"));
                    abstractC1098d.z0(fH, fH, fH, fH, Float.NaN, Float.NaN);
                    return;
                }
                ReadableMap map = readableMap.getMap("hitSlop");
                Intrinsics.c(map);
                float fH2 = map.hasKey("horizontal") ? H.h(map.getDouble("horizontal")) : Float.NaN;
                float fH3 = fH2;
                float fH4 = map.hasKey("vertical") ? H.h(map.getDouble("vertical")) : Float.NaN;
                float fH5 = fH4;
                if (map.hasKey("left")) {
                    fH2 = H.h(map.getDouble("left"));
                }
                float f10 = fH2;
                if (map.hasKey("top")) {
                    fH4 = H.h(map.getDouble("top"));
                }
                float f11 = fH4;
                if (map.hasKey("right")) {
                    fH3 = H.h(map.getDouble("right"));
                }
                float f12 = fH3;
                if (map.hasKey("bottom")) {
                    fH5 = H.h(map.getDouble("bottom"));
                }
                abstractC1098d.z0(f10, f11, f12, fH5, map.hasKey("width") ? H.h(map.getDouble("width")) : Float.NaN, map.hasKey("height") ? H.h(map.getDouble("height")) : Float.NaN);
            }
        }

        protected abstract AbstractC1098d a(Context context);

        public final AbstractC1098d b(Context context, int i10) {
            AbstractC1098d abstractC1098dA = a(context);
            abstractC1098dA.I0(i10);
            return abstractC1098dA;
        }

        public abstract Ja.b c(AbstractC1098d abstractC1098d);

        public abstract String d();

        public abstract Class e();

        public void f(AbstractC1098d handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            handler.s0();
            if (config.hasKey("shouldCancelWhenOutside")) {
                handler.G0(config.getBoolean("shouldCancelWhenOutside"));
            }
            if (config.hasKey("enabled")) {
                handler.y0(config.getBoolean("enabled"));
            }
            if (config.hasKey("hitSlop")) {
                f5191a.b(handler, config);
            }
            if (config.hasKey("needsPointerData")) {
                handler.C0(config.getBoolean("needsPointerData"));
            }
            if (config.hasKey("manualActivation")) {
                handler.f5186v = config.getBoolean("manualActivation");
            }
            if (config.hasKey("mouseButton")) {
                handler.B0(config.getInt("mouseButton"));
            }
        }
    }

    /* JADX INFO: renamed from: Ia.d$d, reason: collision with other inner class name */
    private static final class C0105d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f5192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f5193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f5194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f5195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f5196e;

        public C0105d(int i10, float f10, float f11, float f12, float f13) {
            this.f5192a = i10;
            this.f5193b = f10;
            this.f5194c = f11;
            this.f5195d = f12;
            this.f5196e = f13;
        }

        public final float a() {
            return this.f5195d;
        }

        public final float b() {
            return this.f5196e;
        }

        public final int c() {
            return this.f5192a;
        }

        public final float d() {
            return this.f5193b;
        }

        public final float e() {
            return this.f5194c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0105d)) {
                return false;
            }
            C0105d c0105d = (C0105d) obj;
            return this.f5192a == c0105d.f5192a && Float.compare(this.f5193b, c0105d.f5193b) == 0 && Float.compare(this.f5194c, c0105d.f5194c) == 0 && Float.compare(this.f5195d, c0105d.f5195d) == 0 && Float.compare(this.f5196e, c0105d.f5196e) == 0;
        }

        public final void f(float f10) {
            this.f5195d = f10;
        }

        public final void g(float f10) {
            this.f5196e = f10;
        }

        public final void h(float f10) {
            this.f5193b = f10;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f5192a) * 31) + Float.hashCode(this.f5193b)) * 31) + Float.hashCode(this.f5194c)) * 31) + Float.hashCode(this.f5195d)) * 31) + Float.hashCode(this.f5196e);
        }

        public final void i(float f10) {
            this.f5194c = f10;
        }

        public String toString() {
            return "PointerData(pointerId=" + this.f5192a + ", x=" + this.f5193b + ", y=" + this.f5194c + ", absoluteX=" + this.f5195d + ", absoluteY=" + this.f5196e + ")";
        }
    }

    public AbstractC1098d() {
        int[] iArr = new int[2];
        for (int i10 = 0; i10 < 2; i10++) {
            iArr[i10] = 0;
        }
        this.f5167c = iArr;
        this.f5174j = true;
        C0105d[] c0105dArr = new C0105d[12];
        for (int i11 = 0; i11 < 12; i11++) {
            c0105dArr[i11] = null;
        }
        this.f5180p = c0105dArr;
        this.f5159D = 3;
    }

    private final void A(MotionEvent motionEvent, MotionEvent motionEvent2) {
        C();
        this.f5176l = null;
        this.f5178n = 3;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f5180p[pointerId] = new C0105d(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - this.f5167c[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - this.f5167c[1]);
        C0105d c0105d = this.f5180p[pointerId];
        Intrinsics.c(c0105d);
        n(c0105d);
        this.f5180p[pointerId] = null;
        this.f5179o--;
        y();
    }

    private final void C() {
        this.f5177m = null;
        for (C0105d c0105d : this.f5180p) {
            if (c0105d != null) {
                o(c0105d);
            }
        }
    }

    private final int E() {
        int[] iArr;
        int i10 = 0;
        while (i10 < this.f5166b) {
            int i11 = 0;
            while (true) {
                iArr = this.f5165a;
                if (i11 >= iArr.length || iArr[i11] == i10) {
                    break;
                }
                i11++;
            }
            if (i11 == iArr.length) {
                break;
            }
            i10++;
        }
        return i10;
    }

    private final void F0(MotionEvent motionEvent) {
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        int i10 = 1;
        if (toolType == 1) {
            i10 = 0;
        } else if (toolType != 2) {
            i10 = 3;
            if (toolType == 3) {
                i10 = 2;
            }
        }
        this.f5159D = i10;
    }

    private final Activity H(Context context) {
        if (context instanceof ReactContext) {
            return ((ReactContext) context).getCurrentActivity();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return H(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC1098d abstractC1098d) {
        abstractC1098d.q();
    }

    private final boolean b0(int i10) {
        int i11 = this.f5160E;
        if (i11 == 0) {
            return i10 == 1;
        }
        return (i10 & i11) != 0;
    }

    private final boolean e0(int i10) {
        return this.f5165a[i10] != -1;
    }

    private final void h0(int i10) {
        UiThreadUtil.assertOnUiThread();
        if (this.f5170f == i10) {
            return;
        }
        if (this.f5179o > 0 && (i10 == 5 || i10 == 3 || i10 == 1)) {
            r();
        }
        int i11 = this.f5170f;
        this.f5170f = i10;
        if (i10 == 4) {
            short s10 = f5155N;
            f5155N = (short) (s10 + 1);
            this.f5183s = s10;
        }
        i iVar = this.f5156A;
        Intrinsics.c(iVar);
        iVar.A(this, i10, i11);
        p0(i10, i11);
    }

    private final boolean i0(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f5166b) {
            return true;
        }
        int length = this.f5165a.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = this.f5165a[i10];
            if (i11 != -1 && i11 != i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    private final MotionEvent m(MotionEvent motionEvent) throws a {
        int actionIndex;
        MotionEvent.PointerProperties[] pointerPropertiesArr;
        MotionEvent.PointerProperties[] pointerPropertiesArr2;
        MotionEvent.PointerCoords[] pointerCoordsArr;
        if (!i0(motionEvent)) {
            return motionEvent;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 2;
        int i11 = 0;
        if (actionMasked == 0) {
            actionIndex = motionEvent.getActionIndex();
            if (this.f5165a[motionEvent.getPointerId(actionIndex)] != -1) {
                if (this.f5166b == 1) {
                    i10 = 0;
                } else {
                    i10 = 5;
                }
            }
        } else if (actionMasked == 1) {
            actionIndex = motionEvent.getActionIndex();
            if (this.f5165a[motionEvent.getPointerId(actionIndex)] != -1) {
                if (this.f5166b == 1) {
                    i10 = 1;
                } else {
                    i10 = 6;
                }
            }
        } else if (actionMasked == 5) {
            actionIndex = motionEvent.getActionIndex();
            if (this.f5165a[motionEvent.getPointerId(actionIndex)] != -1) {
                if (this.f5166b == 1) {
                    i10 = 0;
                } else {
                    i10 = 5;
                }
            }
        } else if (actionMasked != 6) {
            i10 = actionMasked;
            actionIndex = -1;
        } else {
            actionIndex = motionEvent.getActionIndex();
            if (this.f5165a[motionEvent.getPointerId(actionIndex)] != -1) {
                if (this.f5166b == 1) {
                    i10 = 1;
                } else {
                    i10 = 6;
                }
            }
        }
        f5151J.d(this.f5166b);
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        int pointerCount = motionEvent.getPointerCount();
        int i12 = i10;
        int i13 = 0;
        while (true) {
            pointerPropertiesArr = null;
            MotionEvent.PointerCoords[] pointerCoordsArr2 = null;
            if (i11 >= pointerCount) {
                break;
            }
            int pointerId = motionEvent.getPointerId(i11);
            if (this.f5165a[pointerId] != -1) {
                MotionEvent.PointerProperties[] pointerPropertiesArr3 = f5153L;
                if (pointerPropertiesArr3 == null) {
                    Intrinsics.r("pointerProps");
                    pointerPropertiesArr3 = null;
                }
                motionEvent.getPointerProperties(i11, pointerPropertiesArr3[i13]);
                MotionEvent.PointerProperties[] pointerPropertiesArr4 = f5153L;
                if (pointerPropertiesArr4 == null) {
                    Intrinsics.r("pointerProps");
                    pointerPropertiesArr4 = null;
                }
                MotionEvent.PointerProperties pointerProperties = pointerPropertiesArr4[i13];
                Intrinsics.c(pointerProperties);
                pointerProperties.id = this.f5165a[pointerId];
                MotionEvent.PointerCoords[] pointerCoordsArr3 = f5154M;
                if (pointerCoordsArr3 == null) {
                    Intrinsics.r("pointerCoords");
                } else {
                    pointerCoordsArr2 = pointerCoordsArr3;
                }
                motionEvent.getPointerCoords(i11, pointerCoordsArr2[i13]);
                if (i11 == actionIndex) {
                    i12 |= i13 << 8;
                }
                i13++;
            }
            i11++;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr5 = f5153L;
        if (pointerPropertiesArr5 == null) {
            Intrinsics.r("pointerProps");
            pointerPropertiesArr5 = null;
        }
        if (pointerPropertiesArr5.length != 0) {
            MotionEvent.PointerCoords[] pointerCoordsArr4 = f5154M;
            if (pointerCoordsArr4 == null) {
                Intrinsics.r("pointerCoords");
                pointerCoordsArr4 = null;
            }
            if (pointerCoordsArr4.length != 0) {
                try {
                    long downTime = motionEvent.getDownTime();
                    long eventTime = motionEvent.getEventTime();
                    MotionEvent.PointerProperties[] pointerPropertiesArr6 = f5153L;
                    if (pointerPropertiesArr6 == null) {
                        Intrinsics.r("pointerProps");
                        pointerPropertiesArr2 = null;
                    } else {
                        pointerPropertiesArr2 = pointerPropertiesArr6;
                    }
                    MotionEvent.PointerCoords[] pointerCoordsArr5 = f5154M;
                    if (pointerCoordsArr5 == null) {
                        Intrinsics.r("pointerCoords");
                        pointerCoordsArr = null;
                    } else {
                        pointerCoordsArr = pointerCoordsArr5;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(downTime, eventTime, i12, i13, pointerPropertiesArr2, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
                    Intrinsics.checkNotNullExpressionValue(motionEventObtain, "obtain(...)");
                    float f10 = -rawX;
                    float f11 = -rawY;
                    motionEvent.offsetLocation(f10, f11);
                    motionEventObtain.offsetLocation(f10, f11);
                    return motionEventObtain;
                } catch (IllegalArgumentException e10) {
                    throw new a(this, motionEvent, e10);
                }
            }
        }
        MotionEvent.PointerCoords[] pointerCoordsArr6 = f5154M;
        if (pointerCoordsArr6 == null) {
            Intrinsics.r("pointerCoords");
            pointerCoordsArr6 = null;
        }
        int length = pointerCoordsArr6.length;
        MotionEvent.PointerProperties[] pointerPropertiesArr7 = f5153L;
        if (pointerPropertiesArr7 == null) {
            Intrinsics.r("pointerProps");
        } else {
            pointerPropertiesArr = pointerPropertiesArr7;
        }
        throw new IllegalStateException("pointerCoords.size=" + length + ", pointerProps.size=" + pointerPropertiesArr.length);
    }

    private final void n(C0105d c0105d) {
        if (this.f5176l == null) {
            this.f5176l = Arguments.createArray();
        }
        WritableArray writableArray = this.f5176l;
        Intrinsics.c(writableArray);
        writableArray.pushMap(u(c0105d));
    }

    private final void o(C0105d c0105d) {
        if (this.f5177m == null) {
            this.f5177m = Arguments.createArray();
        }
        WritableArray writableArray = this.f5177m;
        Intrinsics.c(writableArray);
        writableArray.pushMap(u(c0105d));
    }

    private final void r() {
        this.f5178n = 4;
        this.f5176l = null;
        C();
        for (C0105d c0105d : this.f5180p) {
            if (c0105d != null) {
                n(c0105d);
            }
        }
        this.f5179o = 0;
        AbstractC3952n.y(this.f5180p, null, 0, 0, 6, null);
        y();
    }

    private final WritableMap u(C0105d c0105d) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", c0105d.c());
        writableMapCreateMap.putDouble("x", H.g(c0105d.d()));
        writableMapCreateMap.putDouble("y", H.g(c0105d.e()));
        writableMapCreateMap.putDouble("absoluteX", H.g(c0105d.a()));
        writableMapCreateMap.putDouble("absoluteY", H.g(c0105d.b()));
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    private final void x(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f5176l = null;
        this.f5178n = 1;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f5180p[pointerId] = new C0105d(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - this.f5167c[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - this.f5167c[1]);
        this.f5179o++;
        C0105d c0105d = this.f5180p[pointerId];
        Intrinsics.c(c0105d);
        n(c0105d);
        C();
        y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(boolean z10) {
        if (this.f5169e != null && this.f5174j != z10) {
            UiThreadUtil.runOnUiThread(new RunnableC1097c(this));
        }
        this.f5174j = z10;
    }

    private final void z(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.f5176l = null;
        this.f5178n = 2;
        float rawX = motionEvent2.getRawX() - motionEvent2.getX();
        float rawY = motionEvent2.getRawY() - motionEvent2.getY();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            C0105d c0105d = this.f5180p[motionEvent.getPointerId(i11)];
            if (c0105d != null && (c0105d.d() != motionEvent.getX(i11) || c0105d.e() != motionEvent.getY(i11))) {
                c0105d.h(motionEvent.getX(i11));
                c0105d.i(motionEvent.getY(i11));
                c0105d.f((motionEvent2.getX(i11) + rawX) - this.f5167c[0]);
                c0105d.g((motionEvent2.getY(i11) + rawY) - this.f5167c[1]);
                n(c0105d);
                i10++;
            }
        }
        if (i10 > 0) {
            C();
            y();
        }
    }

    public final void A0(e eVar) {
        this.f5158C = eVar;
    }

    public final void B() {
        int i10 = this.f5170f;
        if (i10 == 2 || i10 == 4) {
            h0(5);
        }
    }

    protected final void B0(int i10) {
        this.f5160E = i10;
    }

    public final void C0(boolean z10) {
        this.f5181q = z10;
    }

    public final void D() {
        int i10 = this.f5170f;
        if (i10 == 4 || i10 == 0 || i10 == 2) {
            k0();
            h0(1);
        }
    }

    protected final void D0(int i10) {
        this.f5189y = i10;
    }

    public final void E0(r rVar) {
        this.f5157B = rVar;
    }

    public final int F() {
        return this.f5175k;
    }

    public final int G() {
        return this.f5161F;
    }

    protected final void G0(boolean z10) {
        this.f5190z = z10;
    }

    public final void H0(boolean z10) {
        this.f5164I = z10;
    }

    public final short I() {
        return this.f5183s;
    }

    public final void I0(int i10) {
        this.f5168d = i10;
    }

    public final float J() {
        return (this.f5184t + this.f5187w) - this.f5167c[0];
    }

    protected final boolean J0(MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (sourceEvent.getToolType(0) == 3) {
            if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 1 || sourceEvent.getAction() == 6 || sourceEvent.getAction() == 5 || !(sourceEvent.getAction() == 2 || b0(sourceEvent.getActionButton()))) {
                return false;
            }
            if (sourceEvent.getAction() == 2 && !b0(sourceEvent.getButtonState())) {
                return false;
            }
        }
        return true;
    }

    public final float K() {
        return (this.f5185u + this.f5188x) - this.f5167c[1];
    }

    public boolean K0(AbstractC1098d handler) {
        e eVar;
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this || (eVar = this.f5158C) == null) {
            return false;
        }
        return eVar.a(this, handler);
    }

    public final float L() {
        return this.f5184t;
    }

    public boolean L0(AbstractC1098d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this) {
            return true;
        }
        e eVar = this.f5158C;
        if (eVar != null) {
            return eVar.b(this, handler);
        }
        return false;
    }

    public final float M() {
        return this.f5185u;
    }

    public boolean M0(AbstractC1098d handler) {
        e eVar;
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this || (eVar = this.f5158C) == null) {
            return false;
        }
        return eVar.c(this, handler);
    }

    public final boolean N() {
        return this.f5181q;
    }

    public final boolean N0(AbstractC1098d handler) {
        e eVar;
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this || (eVar = this.f5158C) == null) {
            return false;
        }
        return eVar.d(this, handler);
    }

    public final int O() {
        return this.f5189y;
    }

    public final void O0(int i10) {
        if (e0(i10)) {
            return;
        }
        this.f5165a[i10] = E();
        this.f5166b++;
    }

    protected final i P() {
        return this.f5156A;
    }

    public final void P0(int i10) {
        if (e0(i10)) {
            this.f5165a[i10] = -1;
            this.f5166b--;
        }
    }

    public final int Q() {
        return this.f5159D;
    }

    protected final PointF Q0(PointF point) {
        PointF pointFL;
        Intrinsics.checkNotNullParameter(point, "point");
        i iVar = this.f5156A;
        if (iVar != null && (pointFL = iVar.L(this.f5169e, point)) != null) {
            return pointFL;
        }
        point.x = Float.NaN;
        point.y = Float.NaN;
        return point;
    }

    public final boolean R() {
        return this.f5164I;
    }

    public final void R0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (event.getActionMasked() == 0 || event.getActionMasked() == 5) {
            x(event, sourceEvent);
            z(event, sourceEvent);
        } else if (event.getActionMasked() == 1 || event.getActionMasked() == 6) {
            z(event, sourceEvent);
            A(event, sourceEvent);
        } else if (event.getActionMasked() == 2) {
            z(event, sourceEvent);
        }
    }

    public final int S() {
        return this.f5170f;
    }

    public final boolean S0(MotionEvent event) {
        int i10;
        Intrinsics.checkNotNullParameter(event, "event");
        return (!this.f5174j || (i10 = this.f5170f) == 1 || i10 == 3 || i10 == 5 || !e0(event.getPointerId(event.getActionIndex()))) ? false : true;
    }

    public final int T() {
        return this.f5168d;
    }

    public final void T0(Function0 closure) {
        Intrinsics.checkNotNullParameter(closure, "closure");
        this.f5173i = true;
        closure.invoke();
        this.f5173i = false;
    }

    public final int U() {
        return this.f5178n;
    }

    public final int V() {
        return this.f5179o;
    }

    public final View W() {
        return this.f5169e;
    }

    public final void X(MotionEvent transformedEvent, MotionEvent sourceEvent) {
        int i10;
        Intrinsics.checkNotNullParameter(transformedEvent, "transformedEvent");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (!this.f5174j || (i10 = this.f5170f) == 3 || i10 == 1 || i10 == 5 || this.f5166b < 1) {
            return;
        }
        try {
            MotionEvent[] motionEventArr = {m(transformedEvent), m(sourceEvent)};
            MotionEvent motionEvent = motionEventArr[0];
            MotionEvent motionEvent2 = motionEventArr[1];
            this.f5171g = motionEvent.getX();
            this.f5172h = motionEvent.getY();
            this.f5189y = motionEvent.getPointerCount();
            boolean zG0 = g0(this.f5169e, this.f5171g, this.f5172h);
            this.f5173i = zG0;
            if (this.f5190z && !zG0) {
                int i11 = this.f5170f;
                if (i11 == 4) {
                    q();
                    return;
                } else {
                    if (i11 == 2) {
                        D();
                        return;
                    }
                    return;
                }
            }
            k kVar = k.f5218a;
            this.f5184t = kVar.b(motionEvent, true);
            this.f5185u = kVar.c(motionEvent, true);
            this.f5187w = motionEvent.getRawX() - motionEvent.getX();
            this.f5188x = motionEvent.getRawY() - motionEvent.getY();
            if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 9 || sourceEvent.getAction() == 7) {
                F0(sourceEvent);
            }
            if (com.swmansion.gesturehandler.react.a.c(sourceEvent)) {
                m0(motionEvent, motionEvent2);
            } else {
                l0(motionEvent, motionEvent2);
            }
            if (!Intrinsics.b(motionEvent, transformedEvent)) {
                motionEvent.recycle();
            }
            if (Intrinsics.b(motionEvent2, sourceEvent)) {
                return;
            }
            motionEvent2.recycle();
        } catch (a unused) {
            D();
        }
    }

    public final boolean Y(AbstractC1098d other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = this.f5165a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f5165a[i10] != -1 && other.f5165a[i10] != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z() {
        return this.f5162G;
    }

    public final boolean a0() {
        return this.f5163H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0018, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c0(Ia.AbstractC1098d r4) {
        /*
            r3 = this;
            java.lang.String r0 = "of"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.view.View r0 = r3.f5169e
            r1 = 0
            if (r0 == 0) goto Lf
            android.view.ViewParent r0 = r0.getParent()
            goto L10
        Lf:
            r0 = r1
        L10:
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L17
            android.view.View r0 = (android.view.View) r0
            goto L18
        L17:
            r0 = r1
        L18:
            if (r0 == 0) goto L2f
            android.view.View r2 = r4.f5169e
            boolean r2 = kotlin.jvm.internal.Intrinsics.b(r0, r2)
            if (r2 == 0) goto L24
            r4 = 1
            return r4
        L24:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L17
            android.view.View r0 = (android.view.View) r0
            goto L18
        L2f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Ia.AbstractC1098d.c0(Ia.d):boolean");
    }

    public final boolean d0() {
        return this.f5174j;
    }

    public final boolean f0() {
        return this.f5173i;
    }

    public final boolean g0(View view, float f10, float f11) {
        float f12;
        Ha.g.a aVar = Ha.g.f4278a;
        Intrinsics.c(view);
        if (aVar.e(view)) {
            return aVar.c(view, f10, f11);
        }
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.f5182r;
        float f13 = 0.0f;
        if (fArr != null) {
            float f14 = fArr[0];
            float f15 = fArr[1];
            float f16 = fArr[2];
            float f17 = fArr[3];
            b bVar = f5151J;
            float f18 = bVar.c(f14) ? 0.0f - f14 : 0.0f;
            f13 = bVar.c(f15) ? 0.0f - f15 : 0.0f;
            if (bVar.c(f16)) {
                width += f16;
            }
            if (bVar.c(f17)) {
                height += f17;
            }
            float f19 = fArr[4];
            float f20 = fArr[5];
            if (bVar.c(f19)) {
                if (!bVar.c(f14)) {
                    f18 = width - f19;
                } else if (!bVar.c(f16)) {
                    width = f19 + f18;
                }
            }
            if (bVar.c(f20)) {
                if (!bVar.c(f15)) {
                    f13 = height - f20;
                } else if (!bVar.c(f17)) {
                    height = f20 + f13;
                }
            }
            f12 = f13;
            f13 = f18;
        } else {
            f12 = 0.0f;
        }
        return f13 <= f10 && f10 <= width && f12 <= f11 && f11 <= height;
    }

    protected void j0() {
    }

    public final void k() {
        l(false);
    }

    protected void k0() {
    }

    public void l(boolean z10) {
        if (!this.f5186v || z10) {
            int i10 = this.f5170f;
            if (i10 == 0 || i10 == 2) {
                h0(4);
            }
        }
    }

    protected abstract void l0(MotionEvent motionEvent, MotionEvent motionEvent2);

    protected void m0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
    }

    protected void n0() {
    }

    protected void o0() {
    }

    public final void p() {
        if (this.f5170f == 0) {
            h0(2);
        }
    }

    protected void p0(int i10, int i11) {
    }

    public final void q() {
        int i10 = this.f5170f;
        if (i10 == 4 || i10 == 0 || i10 == 2 || this.f5163H) {
            j0();
            h0(3);
        }
    }

    public final void q0(View view, i iVar) {
        if (this.f5169e != null || this.f5156A != null) {
            throw new IllegalStateException("Already prepared or hasn't been reset");
        }
        Arrays.fill(this.f5165a, -1);
        this.f5166b = 0;
        this.f5170f = 0;
        this.f5169e = view;
        this.f5156A = iVar;
        Activity activityH = H(view != null ? view.getContext() : null);
        View viewFindViewById = activityH != null ? activityH.findViewById(16908290) : null;
        if (viewFindViewById != null) {
            viewFindViewById.getLocationOnScreen(this.f5167c);
        } else {
            int[] iArr = this.f5167c;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        n0();
    }

    public final void r0() {
        this.f5169e = null;
        this.f5156A = null;
        Arrays.fill(this.f5165a, -1);
        this.f5166b = 0;
        this.f5179o = 0;
        AbstractC3952n.y(this.f5180p, null, 0, 0, 6, null);
        this.f5178n = 0;
        o0();
    }

    public final WritableArray s() {
        WritableArray writableArray = this.f5177m;
        this.f5177m = null;
        return writableArray;
    }

    public void s0() {
        this.f5181q = false;
        this.f5186v = false;
        this.f5190z = false;
        y0(true);
        this.f5182r = (float[]) f5152K;
        this.f5160E = 0;
    }

    public final WritableArray t() {
        WritableArray writableArray = this.f5176l;
        this.f5176l = null;
        return writableArray;
    }

    public void t0() {
    }

    public String toString() {
        String simpleName;
        View view = this.f5169e;
        if (view == null) {
            simpleName = null;
        } else {
            Intrinsics.c(view);
            simpleName = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.f5168d + "]:" + simpleName;
    }

    public final void u0(int i10) {
        this.f5175k = i10;
    }

    public void v(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        r rVar = this.f5157B;
        if (rVar != null) {
            rVar.b(this, event);
        }
    }

    public final void v0(int i10) {
        this.f5161F = i10;
    }

    public void w(int i10, int i11) {
        r rVar = this.f5157B;
        if (rVar != null) {
            rVar.c(this, i10, i11);
        }
    }

    public final void w0(boolean z10) {
        this.f5162G = z10;
    }

    public final void x0(boolean z10) {
        this.f5163H = z10;
    }

    public void y() {
        r rVar;
        if (this.f5176l == null || (rVar = this.f5157B) == null) {
            return;
        }
        rVar.a(this);
    }

    public final void z0(float f10, float f11, float f12, float f13, float f14, float f15) {
        if (this.f5182r == null) {
            this.f5182r = new float[6];
        }
        float[] fArr = this.f5182r;
        Intrinsics.c(fArr);
        fArr[0] = f10;
        float[] fArr2 = this.f5182r;
        Intrinsics.c(fArr2);
        fArr2[1] = f11;
        float[] fArr3 = this.f5182r;
        Intrinsics.c(fArr3);
        fArr3[2] = f12;
        float[] fArr4 = this.f5182r;
        Intrinsics.c(fArr4);
        fArr4[3] = f13;
        float[] fArr5 = this.f5182r;
        Intrinsics.c(fArr5);
        fArr5[4] = f14;
        float[] fArr6 = this.f5182r;
        Intrinsics.c(fArr6);
        fArr6[5] = f15;
        b bVar = f5151J;
        if (bVar.c(f14) && bVar.c(f10) && bVar.c(f12)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        }
        if (bVar.c(f14) && !bVar.c(f10) && !bVar.c(f12)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        }
        if (bVar.c(f15) && bVar.c(f13) && bVar.c(f11)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        }
        if (bVar.c(f15) && !bVar.c(f13) && !bVar.c(f11)) {
            throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
        }
    }
}
