package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p323s.C4123x;
import p323s.C4125z;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static X f20843i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap f20845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p323s.f0 f20846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p323s.g0 f20847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap f20848d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f20849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f20851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f20842h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f20844j = new a(6);

    private static class a extends C4125z {
        public a(int i10) {
            super(i10);
        }

        private static int j(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(j(i10, mode)));
        }

        PorterDuffColorFilter l(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(j(i10, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        Drawable a(X x10, Context context, int i10);

        ColorStateList b(Context context, int i10);

        boolean c(Context context, int i10, Drawable drawable);

        PorterDuff.Mode d(int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C4123x c4123x = (C4123x) this.f20848d.get(context);
            if (c4123x == null) {
                c4123x = new C4123x();
                this.f20848d.put(context, c4123x);
            }
            c4123x.j(j10, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f20845a == null) {
            this.f20845a = new WeakHashMap();
        }
        p323s.g0 g0Var = (p323s.g0) this.f20845a.get(context);
        if (g0Var == null) {
            g0Var = new p323s.g0();
            this.f20845a.put(context, g0Var);
        }
        g0Var.b(i10, colorStateList);
    }

    private void c(Context context) {
        if (this.f20850f) {
            return;
        }
        this.f20850f = true;
        Drawable drawableI = i(context, p197l.a.f48551a);
        if (drawableI == null || !p(drawableI)) {
            this.f20850f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable e(Context context, int i10) {
        if (this.f20849e == null) {
            this.f20849e = new TypedValue();
        }
        TypedValue typedValue = this.f20849e;
        context.getResources().getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f20851g;
        Drawable drawableA = cVar == null ? null : cVar.a(this, context, i10);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableA);
        }
        return drawableA;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized X g() {
        try {
            if (f20843i == null) {
                X x10 = new X();
                f20843i = x10;
                o(x10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f20843i;
    }

    private synchronized Drawable h(Context context, long j10) {
        C4123x c4123x = (C4123x) this.f20848d.get(context);
        if (c4123x == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c4123x.e(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c4123x.l(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterK;
        a aVar = f20844j;
        porterDuffColorFilterK = aVar.k(i10, mode);
        if (porterDuffColorFilterK == null) {
            porterDuffColorFilterK = new PorterDuffColorFilter(i10, mode);
            aVar.l(i10, mode, porterDuffColorFilterK);
        }
        return porterDuffColorFilterK;
    }

    private ColorStateList m(Context context, int i10) {
        p323s.g0 g0Var;
        WeakHashMap weakHashMap = this.f20845a;
        if (weakHashMap == null || (g0Var = (p323s.g0) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) g0Var.f(i10);
    }

    private static void o(X x10) {
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.f) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable q(Context context, int i10) {
        int next;
        p323s.f0 f0Var = this.f20846b;
        if (f0Var == null || f0Var.isEmpty()) {
            return null;
        }
        p323s.g0 g0Var = this.f20847c;
        if (g0Var != null) {
            String str = (String) g0Var.f(i10);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f20846b.get(str) == null)) {
                return null;
            }
        } else {
            this.f20847c = new p323s.g0();
        }
        if (this.f20849e == null) {
            this.f20849e = new TypedValue();
        }
        TypedValue typedValue = this.f20849e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f20847c.b(i10, name);
                b bVar = (b) this.f20846b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e10) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (drawableH == null) {
            this.f20847c.b(i10, "appcompat_skip_skip");
        }
        return drawableH;
    }

    private Drawable u(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i10);
        if (colorStateListL != null) {
            Drawable drawableR = p038c1.a.r(drawable.mutate());
            p038c1.a.o(drawableR, colorStateListL);
            PorterDuff.Mode modeN = n(i10);
            if (modeN != null) {
                p038c1.a.p(drawableR, modeN);
            }
            return drawableR;
        }
        c cVar = this.f20851g;
        if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    static void v(Drawable drawable, f0 f0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = f0Var.f20999d;
        if (z10 || f0Var.f20998c) {
            drawable.setColorFilter(f(z10 ? f0Var.f20996a : null, f0Var.f20998c ? f0Var.f20997b : f20842h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public synchronized Drawable i(Context context, int i10) {
        return j(context, i10, false);
    }

    synchronized Drawable j(Context context, int i10, boolean z10) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = e(context, i10);
            }
            if (drawableQ == null) {
                drawableQ = Z0.b.e(context, i10);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i10, z10, drawableQ);
            }
            if (drawableQ != null) {
                O.b(drawableQ);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableQ;
    }

    synchronized ColorStateList l(Context context, int i10) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i10);
        if (colorStateListM == null) {
            c cVar = this.f20851g;
            colorStateListM = cVar == null ? null : cVar.b(context, i10);
            if (colorStateListM != null) {
                b(context, i10, colorStateListM);
            }
        }
        return colorStateListM;
    }

    PorterDuff.Mode n(int i10) {
        c cVar = this.f20851g;
        if (cVar == null) {
            return null;
        }
        return cVar.d(i10);
    }

    public synchronized void r(Context context) {
        C4123x c4123x = (C4123x) this.f20848d.get(context);
        if (c4123x != null) {
            c4123x.b();
        }
    }

    synchronized Drawable s(Context context, r0 r0Var, int i10) {
        try {
            Drawable drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = r0Var.a(i10);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i10, false, drawableQ);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(c cVar) {
        this.f20851g = cVar;
    }

    boolean w(Context context, int i10, Drawable drawable) {
        c cVar = this.f20851g;
        return cVar != null && cVar.c(context, i10, drawable);
    }
}
