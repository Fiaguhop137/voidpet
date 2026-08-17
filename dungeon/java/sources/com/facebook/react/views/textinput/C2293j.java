package com.facebook.react.views.textinput;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.C1824l;
import androidx.core.view.Z;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.uimanager.C2241a;
import com.facebook.react.uimanager.C2270o0;
import com.facebook.react.uimanager.C2281y;
import com.facebook.react.uimanager.EnumC2282z;
import com.facebook.react.uimanager.InterfaceC2260j0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC3966c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.facebook.react.views.textinput.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2293j extends C1824l {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final a f31192P = new a(null);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final boolean f31193Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final KeyListener f31194R;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private String f31195A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f31196B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f31197C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f31198D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f31199E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f31200F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f31201G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private String f31202H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private p080e7.q f31203I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private InterfaceC2260j0 f31204J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f31205K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f31206L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private EventDispatcher f31207M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private c f31208N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f31209O;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InputMethodManager f31210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f31211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f31212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f31213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f31214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f31215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CopyOnWriteArrayList f31216m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f31217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f31218o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f31219p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f31220q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f31221r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private L f31222s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private InterfaceC2284a f31223t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private K f31224u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private b f31225v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f31226w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f31227x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final com.facebook.react.views.text.t f31228y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f31229z;

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(Editable editable, SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            if (i10 > spannableStringBuilder.length() || i11 > spannableStringBuilder.length()) {
                return false;
            }
            while (i10 < i11) {
                if (editable.charAt(i10) != spannableStringBuilder.charAt(i10)) {
                    return false;
                }
                i10++;
            }
            return true;
        }

        public final boolean b() {
            return C2293j.f31193Q;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$b */
    private static final class b implements KeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f31230a;

        public final void a(int i10) {
            this.f31230a = i10;
        }

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(View view, Editable content, int i10) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(content, "content");
            C2293j.f31194R.clearMetaKeyState(view, content, i10);
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.f31230a;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(View view, Editable text, int i10, KeyEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(event, "event");
            return C2293j.f31194R.onKeyDown(view, text, i10, event);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(View view, Editable text, KeyEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(event, "event");
            return C2293j.f31194R.onKeyOther(view, text, event);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(View view, Editable text, int i10, KeyEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(event, "event");
            return C2293j.f31194R.onKeyUp(view, text, i10, event);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$c */
    private final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            Intrinsics.checkNotNullParameter(s10, "s");
            if (C2293j.this.E() || (copyOnWriteArrayList = C2293j.this.f31216m) == null) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(s10);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s10, int i10, int i11, int i12) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            Intrinsics.checkNotNullParameter(s10, "s");
            if (C2293j.this.E() || (copyOnWriteArrayList = C2293j.this.f31216m) == null) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(s10, i10, i11, i12);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s10, int i10, int i11, int i12) {
            CopyOnWriteArrayList copyOnWriteArrayList;
            Intrinsics.checkNotNullParameter(s10, "s");
            if (C2293j.f31192P.b()) {
                W4.a.m(C2293j.this.f31211h, "onTextChanged[" + C2293j.this.getId() + "]: " + ((Object) s10) + " " + i10 + " " + i11 + " " + i12);
            }
            if (!C2293j.this.E() && (copyOnWriteArrayList = C2293j.this.f31216m) != null) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(s10, i10, i11, i12);
                }
            }
            C2293j.this.d0();
            C2293j.this.M();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$d */
    public static final class d implements ActionMode.Callback {
        d() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(item, "item");
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(menu, "menu");
            if (C2293j.this.f31199E) {
                return false;
            }
            menu.removeItem(16908337);
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(menu, "menu");
            return true;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$e */
    public static final class e extends com.facebook.react.uimanager.J {
        e(boolean z10, int i10) {
            super(C2293j.this, z10, i10);
        }

        @Override // com.facebook.react.uimanager.J, androidx.core.view.C1894a
        public boolean j(View host, int i10, Bundle bundle) {
            Intrinsics.checkNotNullParameter(host, "host");
            if (i10 != 16) {
                return super.j(host, i10, bundle);
            }
            Editable text = C2293j.this.getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int length = text.length();
            if (length > 0) {
                C2293j.this.setSelection(length);
            }
            return C2293j.this.O();
        }
    }

    static {
        p384v6.a aVar = p384v6.a.f56276a;
        f31193Q = false;
        QwertyKeyListener instanceForFullKeyboard = QwertyKeyListener.getInstanceForFullKeyboard();
        Intrinsics.checkNotNullExpressionValue(instanceForFullKeyboard, "getInstanceForFullKeyboard(...)");
        f31194R = instanceForFullKeyboard;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2293j(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        String simpleName = C2293j.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.f31211h = simpleName;
        this.f31196B = -1;
        this.f31197C = -1;
        this.f31203I = p080e7.q.VISIBLE;
        Object systemService = context.getSystemService("input_method");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.f31210g = (InputMethodManager) systemService;
        this.f31213j = getGravity() & 8388615;
        this.f31214k = getGravity() & 112;
        this.f31215l = 0;
        this.f31212i = false;
        this.f31221r = false;
        this.f31216m = null;
        this.f31217n = getInputType();
        if (this.f31225v == null) {
            this.f31225v = new b();
        }
        this.f31224u = null;
        this.f31228y = new com.facebook.react.views.text.t();
        u();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 <= 27) {
            setLayerType(1, null);
        }
        Z.m0(this, new e(isFocusable(), getImportantForAccessibility()));
        d dVar = new d();
        setCustomSelectionActionModeCallback(dVar);
        setCustomInsertionActionModeCallback(dVar);
    }

    private final boolean D() {
        return (getInputType() & 144) != 0;
    }

    private final void F(SpannableStringBuilder spannableStringBuilder) {
        Editable text = getText();
        if (text == null) {
            throw new IllegalStateException("Required value was null.");
        }
        for (Object obj : text.getSpans(0, length(), Object.class)) {
            int spanFlags = text.getSpanFlags(obj);
            boolean z10 = (spanFlags & 33) == 33;
            if (obj instanceof p223m7.i) {
                text.removeSpan(obj);
            }
            if (z10) {
                int spanStart = text.getSpanStart(obj);
                int spanEnd = text.getSpanEnd(obj);
                text.removeSpan(obj);
                if (f31192P.c(text, spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    private final void G(int i10, int i11) {
        if (i10 == -1 || i11 == -1) {
            return;
        }
        setSelection(w(i10), w(i11));
    }

    private final void I(com.facebook.react.views.text.j jVar) {
        if (!(D() && Intrinsics.b(getText(), jVar.h())) && v(jVar.b())) {
            if (f31193Q) {
                W4.a.m(this.f31211h, "maybeSetText[" + getId() + "]: current text: " + ((Object) getText()) + " update: " + ((Object) jVar.h()));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jVar.h());
            F(spannableStringBuilder);
            V(spannableStringBuilder);
            this.f31218o = jVar.a();
            this.f31205K = true;
            if (jVar.h().length() == 0) {
                setText((CharSequence) null);
            } else {
                Editable text = getText();
                if (text == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                text.replace(0, length(), spannableStringBuilder);
            }
            this.f31205K = false;
            if (getBreakStrategy() != jVar.j()) {
                setBreakStrategy(jVar.j());
            }
            d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        InterfaceC2284a interfaceC2284a = this.f31223t;
        if (interfaceC2284a != null) {
            interfaceC2284a.a();
        }
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O() {
        boolean zRequestFocus = super.requestFocus(130, null);
        if (isInTouchMode() && getShowSoftInputOnFocus()) {
            T();
        }
        return zRequestFocus;
    }

    private final void Q() {
        ReactContext reactContextD = C2270o0.d(this);
        if (p384v6.a.f56281f || this.f31204J != null || reactContextD.isBridgeless()) {
            return;
        }
        p pVar = new p(this);
        UIManagerModule uIManagerModule = (UIManagerModule) reactContextD.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.setViewLocalData(getId(), pVar);
        }
    }

    private final void U(SpannableStringBuilder spannableStringBuilder, Class cls, p199l1.h hVar) {
        Iterator itA = AbstractC3966c.a(spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls));
        while (itA.hasNext()) {
            Object next = itA.next();
            if (hVar.test(next)) {
                spannableStringBuilder.removeSpan(next);
            }
        }
    }

    private final void V(SpannableStringBuilder spannableStringBuilder) {
        U(spannableStringBuilder, p223m7.d.class, new C2286c(this));
        U(spannableStringBuilder, p223m7.e.class, new C2287d(this));
        U(spannableStringBuilder, p223m7.g.class, new C2288e(this));
        U(spannableStringBuilder, p223m7.j.class, new C2289f(this));
        U(spannableStringBuilder, p223m7.m.class, new C2290g(this));
        U(spannableStringBuilder, p223m7.a.class, new C2291h(this));
        U(spannableStringBuilder, p223m7.c.class, new C2292i(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean W(C2293j c2293j, p223m7.d span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return span.getSize() == c2293j.f31228y.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X(C2293j c2293j, p223m7.e span) {
        Intrinsics.checkNotNullParameter(span, "span");
        int backgroundColor = span.getBackgroundColor();
        Integer numI = C2241a.i(c2293j);
        return numI != null && backgroundColor == numI.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Y(C2293j c2293j, p223m7.g span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return span.getForegroundColor() == c2293j.getCurrentTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z(C2293j c2293j, p223m7.j jVar) {
        return (c2293j.getPaintFlags() & 16) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a0(C2293j c2293j, p223m7.m mVar) {
        return (c2293j.getPaintFlags() & 8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b0(C2293j c2293j, p223m7.a span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return span.b() == c2293j.f31228y.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c0(C2293j c2293j, p223m7.c span) {
        Intrinsics.checkNotNullParameter(span, "span");
        return span.c() == c2293j.f31197C && Intrinsics.b(span.a(), c2293j.f31195A) && span.d() == c2293j.f31196B && Intrinsics.b(span.b(), c2293j.getFontFeatureSettings());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    public final void d0() {
        if (this.f31204J == null || getId() == -1) {
            return;
        }
        Editable text = getText();
        boolean z10 = text == null || text.length() == 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (text != null && !z10) {
            try {
                spannableStringBuilder.append(text.subSequence(0, text.length()));
            } catch (IndexOutOfBoundsException e10) {
                ReactSoftExceptionLogger.logSoftException(this.f31211h, e10);
            }
        }
        if (z10) {
            if (getHint() != null) {
                CharSequence hint = getHint();
                Intrinsics.checkNotNullExpressionValue(hint, "getHint(...)");
                if (hint.length() > 0) {
                    spannableStringBuilder.append(getHint());
                } else if (Z6.a.c(this) != 2) {
                    spannableStringBuilder.append("I");
                }
            } else if (Z6.a.c(this) != 2) {
                spannableStringBuilder.append("I");
            }
        }
        t(spannableStringBuilder);
        spannableStringBuilder.setSpan(new p223m7.l(new TextPaint(getPaint())), 0, spannableStringBuilder.length(), 18);
        com.facebook.react.views.text.u.f31127a.A(getId(), spannableStringBuilder);
    }

    private final void e0() {
        String str = this.f31209O;
        int i10 = 6;
        if (str != null) {
            switch (str.hashCode()) {
                case -1273775369:
                    if (str.equals("previous")) {
                        i10 = 7;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        i10 = 3;
                    }
                    break;
                case 3304:
                    if (str.equals("go")) {
                        i10 = 2;
                    }
                    break;
                case 3089282:
                    str.equals("done");
                    break;
                case 3377907:
                    if (str.equals("next")) {
                        i10 = 5;
                    }
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        i10 = 1;
                    }
                    break;
                case 3526536:
                    if (str.equals("send")) {
                        i10 = 4;
                    }
                    break;
            }
        }
        if (this.f31221r) {
            i10 |= 33554432;
        }
        setImeOptions(i10);
    }

    private final c getTextWatcherDelegator() {
        if (this.f31208N == null) {
            this.f31208N = new c();
        }
        return this.f31208N;
    }

    private final void t(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.setSpan(new p223m7.d(this.f31228y.c()), 0, spannableStringBuilder.length(), 16711698);
        spannableStringBuilder.setSpan(new p223m7.g(getCurrentTextColor()), 0, spannableStringBuilder.length(), 16711698);
        Integer numI = C2241a.i(this);
        if (numI != null && numI.intValue() != 0) {
            spannableStringBuilder.setSpan(new p223m7.e(numI.intValue()), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 16) != 0) {
            spannableStringBuilder.setSpan(new p223m7.j(), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 8) != 0) {
            spannableStringBuilder.setSpan(new p223m7.m(), 0, spannableStringBuilder.length(), 16711698);
        }
        float fD = this.f31228y.d();
        if (!Float.isNaN(fD)) {
            spannableStringBuilder.setSpan(new p223m7.a(fD), 0, spannableStringBuilder.length(), 16711698);
        }
        if (this.f31197C != -1 || this.f31196B != -1 || this.f31195A != null || getFontFeatureSettings() != null) {
            int i10 = this.f31197C;
            int i11 = this.f31196B;
            String fontFeatureSettings = getFontFeatureSettings();
            String str = this.f31195A;
            AssetManager assets = getContext().getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            spannableStringBuilder.setSpan(new p223m7.c(i10, i11, fontFeatureSettings, str, assets), 0, spannableStringBuilder.length(), 16711698);
        }
        float fE = this.f31228y.e();
        if (Float.isNaN(fE)) {
            return;
        }
        spannableStringBuilder.setSpan(new p223m7.b(fE), 0, spannableStringBuilder.length(), 16711698);
    }

    private final int w(int i10) {
        int length;
        if (getText() == null) {
            length = 0;
        } else {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            length = text.length();
        }
        return (int) Math.max(0.0d, Math.min(i10, length));
    }

    protected final void A() {
        this.f31210g.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public final int B() {
        int i10 = this.f31215l + 1;
        this.f31215l = i10;
        return i10;
    }

    public final boolean C() {
        return (getInputType() & 131072) != 0;
    }

    protected final boolean E() {
        return this.f31212i;
    }

    public final void H(int i10, int i11, int i12) {
        if (v(i10)) {
            G(i11, i12);
        }
    }

    public final void J(com.facebook.react.views.text.j reactTextUpdate) {
        Intrinsics.checkNotNullParameter(reactTextUpdate, "reactTextUpdate");
        this.f31212i = true;
        I(reactTextUpdate);
        this.f31212i = false;
    }

    public final void K(com.facebook.react.views.text.j reactTextUpdate) {
        Intrinsics.checkNotNullParameter(reactTextUpdate, "reactTextUpdate");
        this.f31206L = true;
        I(reactTextUpdate);
        this.f31206L = false;
    }

    public final void L() {
        if (this.f31229z) {
            this.f31229z = false;
            Typeface typeface = getTypeface();
            int i10 = this.f31197C;
            int i11 = this.f31196B;
            String str = this.f31195A;
            AssetManager assets = getContext().getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            setTypeface(com.facebook.react.views.text.q.a(typeface, i10, i11, str, assets));
            setPaintFlags((this.f31197C == -1 && this.f31196B == -1 && this.f31195A == null && getFontFeatureSettings() == null) ? getPaintFlags() & (-129) : getPaintFlags() | 128);
        }
    }

    public final void N() {
        O();
    }

    public final void P(float f10, int i10) {
        C2241a.r(this, (p080e7.d) p080e7.d.g().get(i10), Float.isNaN(f10) ? null : new C2281y(com.facebook.react.uimanager.H.g(f10), EnumC2282z.POINT));
    }

    public final boolean R() {
        String str = this.f31219p;
        if (str == null) {
            return !C();
        }
        return Intrinsics.b(str, "blurAndSubmit");
    }

    public final boolean S() {
        String str = this.f31219p;
        if (str == null) {
            return !C();
        }
        return Intrinsics.b(str, "submit") || Intrinsics.b(str, "blurAndSubmit");
    }

    protected final boolean T() {
        return this.f31210g.showSoftInput(this, 0);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        if (this.f31216m == null) {
            this.f31216m = new CopyOnWriteArrayList();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f31216m;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(watcher);
        }
    }

    protected final void finalize() {
        if (f31193Q) {
            W4.a.m(this.f31211h, "finalize[" + getId() + "] delete cached spannable");
        }
        com.facebook.react.views.text.u.f31127a.l(getId());
    }

    protected final boolean getContainsImages() {
        return this.f31218o;
    }

    public final boolean getDisableFullscreenUI() {
        return this.f31221r;
    }

    public final boolean getDisableTextDiffing$ReactAndroid_release() {
        return this.f31205K;
    }

    @Nullable
    public final List<String> getDragAndDropFilter() {
        return this.f31220q;
    }

    public final int getGravityHorizontal$ReactAndroid_release() {
        return getGravity() & 8388615;
    }

    public final int getGravityVertical$ReactAndroid_release() {
        return getGravity() & 112;
    }

    protected final int getNativeEventCount() {
        return this.f31215l;
    }

    @Nullable
    public final String getReturnKeyType() {
        return this.f31209O;
    }

    public final int getStagedInputType() {
        return this.f31217n;
    }

    @Nullable
    public final InterfaceC2260j0 getStateWrapper() {
        return this.f31204J;
    }

    @Nullable
    public final String getSubmitBehavior() {
        return this.f31219p;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (this.f31218o) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC3966c.a((p223m7.p[]) text.getSpans(0, text.length(), p223m7.p.class));
            while (itA.hasNext()) {
                if (((p223m7.p) itA.next()).a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.setTextIsSelectable(true);
        G(selectionStart, selectionEnd);
        if (this.f31218o) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC3966c.a((p223m7.p[]) text.getSpans(0, text.length(), p223m7.p.class));
            while (itA.hasNext()) {
                ((p223m7.p) itA.next()).c();
            }
        }
        if (this.f31198D && !this.f31200F) {
            O();
        }
        this.f31200F = true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (D6.e.a() && D6.b.k()) {
            u();
        }
    }

    @Override // androidx.appcompat.widget.C1824l, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        ReactContext reactContextD = C2270o0.d(this);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (inputConnectionOnCreateInputConnection != null && this.f31227x) {
            EventDispatcher eventDispatcher = this.f31207M;
            if (eventDispatcher == null) {
                throw new IllegalStateException("Required value was null.");
            }
            inputConnectionOnCreateInputConnection = new C2294k(inputConnectionOnCreateInputConnection, reactContextD, this, eventDispatcher);
        }
        if (C() && (R() || S())) {
            outAttrs.imeOptions &= -1073741825;
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // androidx.appcompat.widget.C1824l, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f31218o) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC3966c.a((p223m7.p[]) text.getSpans(0, text.length(), p223m7.p.class));
            while (itA.hasNext()) {
                ((p223m7.p) itA.next()).d();
            }
        }
    }

    @Override // androidx.appcompat.widget.C1824l, android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        List list = this.f31220q;
        if (list != null && event.getAction() == 1) {
            if (list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (event.getClipDescription().hasMimeType((String) it.next())) {
                }
            }
            return false;
        }
        return super.onDragEvent(event);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f31203I != p080e7.q.VISIBLE) {
            C2241a.a(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f31218o) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC3966c.a((p223m7.p[]) text.getSpans(0, text.length(), p223m7.p.class));
            while (itA.hasNext()) {
                ((p223m7.p) itA.next()).e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        L l10;
        super.onFocusChanged(z10, i10, rect);
        if (!z10 || (l10 = this.f31222s) == null || l10 == null) {
            return;
        }
        l10.a(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i10 != 66 || C()) {
            return super.onKeyUp(i10, event);
        }
        A();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        M();
        if (this.f31201G && isFocused()) {
            selectAll();
            this.f31201G = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        K k10 = this.f31224u;
        if (k10 != null) {
            k10.a(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i10, int i11) {
        L l10;
        if (f31193Q) {
            W4.a.m(this.f31211h, "onSelectionChanged[" + getId() + "]: " + i10 + " " + i11);
        }
        super.onSelectionChanged(i10, i11);
        if (this.f31222s == null || !hasFocus() || (l10 = this.f31222s) == null) {
            return;
        }
        l10.a(i10, i11);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f31218o) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC3966c.a((p223m7.p[]) text.getSpans(0, text.length(), p223m7.p.class));
            while (itA.hasNext()) {
                ((p223m7.p) itA.next()).f();
            }
        }
    }

    @Override // androidx.appcompat.widget.C1824l, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            i10 = 16908337;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        int action = ev.getAction();
        if (action == 0) {
            this.f31226w = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.f31226w) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f31226w = false;
        }
        return super.onTouchEvent(ev);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f31216m;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(watcher);
            if (copyOnWriteArrayList.isEmpty()) {
                this.f31216m = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    public final void setAllowFontScaling(boolean z10) {
        if (this.f31228y.b() != z10) {
            this.f31228y.h(z10);
            u();
        }
    }

    public final void setAutoFocus(boolean z10) {
        this.f31198D = z10;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        C2241a.o(this, Integer.valueOf(i10));
    }

    public final void setBorderRadius(float f10) {
        P(f10, p080e7.d.BORDER_RADIUS.ordinal());
    }

    public final void setBorderStyle(@Nullable String str) {
        C2241a.s(this, str == null ? null : p080e7.f.f40562a.a(str));
    }

    protected final void setContainsImages(boolean z10) {
        this.f31218o = z10;
    }

    public final void setContentSizeWatcher(@Nullable InterfaceC2284a interfaceC2284a) {
        this.f31223t = interfaceC2284a;
    }

    public final void setContextMenuHidden(boolean z10) {
        this.f31199E = z10;
    }

    public final void setDisableFullscreenUI(boolean z10) {
        this.f31221r = z10;
        e0();
    }

    public final void setDisableTextDiffing$ReactAndroid_release(boolean z10) {
        this.f31205K = z10;
    }

    public final void setDragAndDropFilter(@Nullable List<String> list) {
        this.f31220q = list;
    }

    public final void setEventDispatcher(@Nullable EventDispatcher eventDispatcher) {
        this.f31207M = eventDispatcher;
    }

    public final void setFontFamily(@Nullable String str) {
        this.f31195A = str;
        this.f31229z = true;
    }

    @Override // android.widget.TextView
    public void setFontFeatureSettings(@Nullable String str) {
        if (Intrinsics.b(str, getFontFeatureSettings())) {
            return;
        }
        super.setFontFeatureSettings(str);
        this.f31229z = true;
    }

    public final void setFontSize(float f10) {
        this.f31228y.i(f10);
        u();
    }

    public final void setFontStyle(@Nullable String str) {
        int iB = com.facebook.react.views.text.q.b(str);
        if (iB != this.f31197C) {
            this.f31197C = iB;
            this.f31229z = true;
        }
    }

    public final void setFontWeight(@Nullable String str) {
        int iD = com.facebook.react.views.text.q.d(str);
        if (iD != this.f31196B) {
            this.f31196B = iD;
            this.f31229z = true;
        }
    }

    public final void setGravityHorizontal$ReactAndroid_release(int i10) {
        if (i10 == 0) {
            i10 = this.f31213j;
        }
        setGravity(i10 | (getGravity() & (-8388616)));
    }

    public final void setGravityVertical$ReactAndroid_release(int i10) {
        if (i10 == 0) {
            i10 = this.f31214k;
        }
        setGravity(i10 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int i10) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i10);
        this.f31217n = i10;
        super.setTypeface(typeface);
        if (C()) {
            setSingleLine(false);
        }
        if (this.f31225v == null) {
            this.f31225v = new b();
        }
        b bVar = this.f31225v;
        if (bVar != null) {
            bVar.a(i10);
        }
        super.setKeyListener(this.f31225v);
    }

    public final void setLetterSpacingPt(float f10) {
        this.f31228y.k(f10);
        u();
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        this.f31228y.l(i10);
    }

    public final void setMaxFontSizeMultiplier(float f10) {
        if (f10 == this.f31228y.g()) {
            return;
        }
        this.f31228y.m(f10);
        u();
    }

    protected final void setNativeEventCount(int i10) {
        this.f31215l = i10;
    }

    public final void setOnKeyPress(boolean z10) {
        this.f31227x = z10;
    }

    public final void setOverflow(@Nullable String str) {
        if (str == null) {
            this.f31203I = p080e7.q.VISIBLE;
        } else {
            p080e7.q qVarA = p080e7.q.f40625a.a(str);
            if (qVarA == null) {
                qVarA = p080e7.q.VISIBLE;
            }
            this.f31203I = qVarA;
        }
        invalidate();
    }

    public final void setPlaceholder(@Nullable String str) {
        if (Intrinsics.b(str, this.f31202H)) {
            return;
        }
        this.f31202H = str;
        setHint(str);
    }

    public final void setReturnKeyType(@Nullable String str) {
        this.f31209O = str;
        e0();
    }

    public final void setScrollWatcher(@Nullable K k10) {
        this.f31224u = k10;
    }

    public final void setSelectTextOnFocus(boolean z10) {
        super.setSelectAllOnFocus(z10);
        this.f31201G = z10;
    }

    @Override // android.widget.EditText
    public void setSelection(int i10, int i11) {
        if (f31193Q) {
            W4.a.m(this.f31211h, "setSelection[" + getId() + "]: " + i10 + " " + i11);
        }
        super.setSelection(i10, i11);
    }

    public final void setSelectionWatcher$ReactAndroid_release(@Nullable L l10) {
        this.f31222s = l10;
    }

    protected final void setSettingTextFromJS(boolean z10) {
        this.f31212i = z10;
    }

    protected final void setSettingTextFromState(boolean z10) {
        this.f31206L = z10;
    }

    public final void setStagedInputType(int i10) {
        this.f31217n = i10;
    }

    public final void setStateWrapper(@Nullable InterfaceC2260j0 interfaceC2260j0) {
        this.f31204J = interfaceC2260j0;
    }

    public final void setSubmitBehavior(@Nullable String str) {
        this.f31219p = str;
    }

    protected final void u() {
        setTextSize(0, this.f31228y.c());
        float fD = this.f31228y.d();
        if (Float.isNaN(fD)) {
            return;
        }
        setLetterSpacing(fD);
    }

    public final boolean v(int i10) {
        return i10 >= this.f31215l;
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (this.f31218o) {
            Editable text = getText();
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator itA = AbstractC3966c.a((p223m7.p[]) text.getSpans(0, text.length(), p223m7.p.class));
            while (itA.hasNext()) {
                if (((p223m7.p) itA.next()).a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public final void x() {
        if (Build.VERSION.SDK_INT > 28 || !isInTouchMode()) {
            super.clearFocus();
        } else {
            View rootView = getRootView();
            Intrinsics.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) rootView;
            int descendantFocusability = viewGroup.getDescendantFocusability();
            viewGroup.setDescendantFocusability(393216);
            super.clearFocus();
            viewGroup.setDescendantFocusability(descendantFocusability);
        }
        A();
    }

    public final void y() {
        x();
    }

    public final void z() {
        if (getInputType() != this.f31217n) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.f31217n);
            G(selectionStart, selectionEnd);
        }
    }
}
