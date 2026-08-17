package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import io.sentry.C3833z3;
import io.sentry.android.replay.f;
import io.sentry.android.replay.util.q;
import io.sentry.android.replay.util.r;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f45629m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f45630n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f45631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f45632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f45633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f45635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f45636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f45637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f45638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f45639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f45640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f45641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f45642l;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(Class cls, Set set) {
            while (cls != null) {
                if (set.contains(cls.getName())) {
                    return true;
                }
                cls = cls.getSuperclass();
            }
            return false;
        }

        private final boolean c(View view, C3833z3 c3833z3) {
            String strE = c3833z3.getSessionReplay().e();
            if (strE == null) {
                return false;
            }
            return Intrinsics.b(view.getClass().getName(), strE);
        }

        private final boolean d(ViewParent viewParent, C3833z3 c3833z3) {
            String strS = c3833z3.getSessionReplay().s();
            if (strS == null) {
                return false;
            }
            return Intrinsics.b(viewParent.getClass().getName(), strS);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0028  */
        /* JADX WARN: Code duplicated, block: B:17:0x003e  */
        /* JADX WARN: Code duplicated, block: B:19:0x0046  */
        /* JADX WARN: Code duplicated, block: B:20:0x0049  */
        /* JADX WARN: Code duplicated, block: B:22:0x004c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0060  */
        /* JADX WARN: Code duplicated, block: B:31:0x0076  */
        /* JADX WARN: Code duplicated, block: B:33:0x007c  */
        /* JADX WARN: Code duplicated, block: B:37:0x0091 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:40:0x00a9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
        private final boolean e(View view, C3833z3 c3833z3) {
            Object tag;
            String str;
            Class<?> cls;
            Set setR;
            ViewParent parent;
            String lowerCase;
            Object tag2 = view.getTag();
            String str2 = tag2 instanceof String ? (String) tag2 : null;
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (lowerCase2 == null || !StringsKt.U(lowerCase2, "sentry-unmask", false, 2, null)) {
                    if (!Intrinsics.b(view.getTag(f.f45438a), "unmask")) {
                        tag = view.getTag();
                        if (tag instanceof String) {
                            str = (String) tag;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            lowerCase = str.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            if (lowerCase != null || !StringsKt.U(lowerCase, "sentry-mask", false, 2, null)) {
                                if (!Intrinsics.b(view.getTag(f.f45438a), "mask")) {
                                    if (!c(view, c3833z3) && view.getParent() != null) {
                                        parent = view.getParent();
                                        Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                                        if (d(parent, c3833z3)) {
                                            return false;
                                        }
                                    }
                                    cls = view.getClass();
                                    setR = c3833z3.getSessionReplay().r();
                                    Intrinsics.checkNotNullExpressionValue(setR, "getUnmaskViewClasses(...)");
                                    if (b(cls, setR)) {
                                        return false;
                                    }
                                    Class<?> cls2 = view.getClass();
                                    Set setD = c3833z3.getSessionReplay().d();
                                    Intrinsics.checkNotNullExpressionValue(setD, "getMaskViewClasses(...)");
                                    return b(cls2, setD);
                                }
                            }
                        } else if (!Intrinsics.b(view.getTag(f.f45438a), "mask")) {
                            if (!c(view, c3833z3)) {
                                parent = view.getParent();
                                Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                                if (d(parent, c3833z3)) {
                                    return false;
                                }
                            }
                            cls = view.getClass();
                            setR = c3833z3.getSessionReplay().r();
                            Intrinsics.checkNotNullExpressionValue(setR, "getUnmaskViewClasses(...)");
                            if (b(cls, setR)) {
                                return false;
                            }
                            Class<?> cls3 = view.getClass();
                            Set setD2 = c3833z3.getSessionReplay().d();
                            Intrinsics.checkNotNullExpressionValue(setD2, "getMaskViewClasses(...)");
                            return b(cls3, setD2);
                        }
                        c3833z3.getSessionReplay().N();
                        return true;
                    }
                }
            } else if (!Intrinsics.b(view.getTag(f.f45438a), "unmask")) {
                tag = view.getTag();
                if (tag instanceof String) {
                    str = (String) tag;
                } else {
                    str = null;
                }
                if (str != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (lowerCase != null) {
                        if (!Intrinsics.b(view.getTag(f.f45438a), "mask")) {
                            if (!c(view, c3833z3)) {
                                parent = view.getParent();
                                Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                                if (d(parent, c3833z3)) {
                                    return false;
                                }
                            }
                            cls = view.getClass();
                            setR = c3833z3.getSessionReplay().r();
                            Intrinsics.checkNotNullExpressionValue(setR, "getUnmaskViewClasses(...)");
                            if (b(cls, setR)) {
                                return false;
                            }
                            Class<?> cls4 = view.getClass();
                            Set setD3 = c3833z3.getSessionReplay().d();
                            Intrinsics.checkNotNullExpressionValue(setD3, "getMaskViewClasses(...)");
                            return b(cls4, setD3);
                        }
                    } else if (!Intrinsics.b(view.getTag(f.f45438a), "mask")) {
                        if (!c(view, c3833z3)) {
                            parent = view.getParent();
                            Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                            if (d(parent, c3833z3)) {
                                return false;
                            }
                        }
                        cls = view.getClass();
                        setR = c3833z3.getSessionReplay().r();
                        Intrinsics.checkNotNullExpressionValue(setR, "getUnmaskViewClasses(...)");
                        if (b(cls, setR)) {
                            return false;
                        }
                        Class<?> cls5 = view.getClass();
                        Set setD4 = c3833z3.getSessionReplay().d();
                        Intrinsics.checkNotNullExpressionValue(setD4, "getMaskViewClasses(...)");
                        return b(cls5, setD4);
                    }
                } else if (!Intrinsics.b(view.getTag(f.f45438a), "mask")) {
                    if (!c(view, c3833z3)) {
                        parent = view.getParent();
                        Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
                        if (d(parent, c3833z3)) {
                            return false;
                        }
                    }
                    cls = view.getClass();
                    setR = c3833z3.getSessionReplay().r();
                    Intrinsics.checkNotNullExpressionValue(setR, "getUnmaskViewClasses(...)");
                    if (b(cls, setR)) {
                        return false;
                    }
                    Class<?> cls6 = view.getClass();
                    Set setD5 = c3833z3.getSessionReplay().d();
                    Intrinsics.checkNotNullExpressionValue(setD5, "getMaskViewClasses(...)");
                    return b(cls6, setD5);
                }
                c3833z3.getSessionReplay().N();
                return true;
            }
            c3833z3.getSessionReplay().N();
            return false;
        }

        public final b a(View view, b bVar, int i10, C3833z3 options) {
            Drawable drawable;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(options, "options");
            Pair pairG = r.g(view);
            boolean zBooleanValue = ((Boolean) pairG.getFirst()).booleanValue();
            Rect rect = (Rect) pairG.getSecond();
            boolean z10 = zBooleanValue && e(view, options);
            if (!(view instanceof TextView)) {
                if (!(view instanceof ImageView)) {
                    return new C0535b(view.getX(), view.getY(), view.getWidth(), view.getHeight(), (bVar != null ? bVar.a() : 0.0f) + view.getElevation(), i10, bVar, z10, false, zBooleanValue, rect);
                }
                if (bVar != null) {
                    bVar.g(true);
                }
                ImageView imageView = (ImageView) view;
                return new c(imageView.getX(), imageView.getY(), imageView.getWidth(), imageView.getHeight(), (bVar != null ? bVar.a() : 0.0f) + imageView.getElevation(), i10, bVar, z10 && (drawable = imageView.getDrawable()) != null && r.f(drawable), true, zBooleanValue, rect);
            }
            if (bVar != null) {
                bVar.g(true);
            }
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            io.sentry.android.replay.util.a aVar = layout != null ? new io.sentry.android.replay.util.a(layout) : null;
            int iJ = r.j(textView.getCurrentTextColor());
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int iC = r.c(textView);
            float x10 = textView.getX();
            float y10 = textView.getY();
            int width = textView.getWidth();
            float fA = 0.0f;
            int height = textView.getHeight();
            if (bVar != null) {
                fA = bVar.a();
            }
            return new d(aVar, Integer.valueOf(iJ), totalPaddingLeft, iC, x10, y10, width, height, fA + textView.getElevation(), i10, bVar, z10, true, zBooleanValue, rect);
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.b$b, reason: collision with other inner class name */
    public static final class C0535b extends b {
        public C0535b(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect) {
            super(f10, f11, i10, i11, f12, i12, bVar, z10, z11, z12, rect, null);
        }
    }

    public static final class c extends b {
        public c(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect) {
            super(f10, f11, i10, i11, f12, i12, bVar, z10, z11, z12, rect, null);
        }
    }

    public static final class d extends b {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final q f45643o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final Integer f45644p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f45645q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f45646r;

        public d(q qVar, Integer num, int i10, int i11, float f10, float f11, int i12, int i13, float f12, int i14, b bVar, boolean z10, boolean z11, boolean z12, Rect rect) {
            super(f10, f11, i12, i13, f12, i14, bVar, z10, z11, z12, rect, null);
            this.f45643o = qVar;
            this.f45644p = num;
            this.f45645q = i10;
            this.f45646r = i11;
        }

        public /* synthetic */ d(q qVar, Integer num, int i10, int i11, float f10, float f11, int i12, int i13, float f12, int i14, b bVar, boolean z10, boolean z11, boolean z12, Rect rect, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? null : qVar, (i15 & 2) != 0 ? null : num, (i15 & 4) != 0 ? 0 : i10, (i15 & 8) != 0 ? 0 : i11, f10, f11, i12, i13, f12, i14, (i15 & 1024) != 0 ? null : bVar, (i15 & 2048) != 0 ? false : z10, (i15 & 4096) != 0 ? false : z11, (i15 & 8192) != 0 ? false : z12, (i15 & 16384) != 0 ? null : rect);
        }

        public final Integer i() {
            return this.f45644p;
        }

        public final q j() {
            return this.f45643o;
        }

        public final int k() {
            return this.f45645q;
        }

        public final int l() {
            return this.f45646r;
        }
    }

    private b(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect) {
        this.f45631a = f10;
        this.f45632b = f11;
        this.f45633c = i10;
        this.f45634d = i11;
        this.f45635e = f12;
        this.f45636f = i12;
        this.f45637g = bVar;
        this.f45638h = z10;
        this.f45639i = z11;
        this.f45640j = z12;
        this.f45641k = rect;
    }

    public /* synthetic */ b(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, i10, i11, f12, i12, bVar, z10, z11, z12, rect);
    }

    public final float a() {
        return this.f45635e;
    }

    public final int b() {
        return this.f45634d;
    }

    public final boolean c() {
        return this.f45638h;
    }

    public final Rect d() {
        return this.f45641k;
    }

    public final int e() {
        return this.f45633c;
    }

    public final void f(List list) {
        this.f45642l = list;
    }

    public final void g(boolean z10) {
        for (b bVar = this.f45637g; bVar != null; bVar = bVar.f45637g) {
            bVar.f45639i = z10;
        }
    }

    public final void h(Function1 callback) {
        List list;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!((Boolean) callback.invoke(this)).booleanValue() || (list = this.f45642l) == null) {
            return;
        }
        Intrinsics.c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((b) it.next()).h(callback);
        }
    }
}
