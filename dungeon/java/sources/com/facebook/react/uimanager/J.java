package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.facebook.react.AbstractC2232l;
import com.facebook.react.AbstractC2235o;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class J extends p343t1.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final HashMap f30200u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f30201v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f30202w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f30203q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Handler f30204r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final HashMap f30205s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    View f30206t;

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ((View) message.obj).sendAccessibilityEvent(4);
        }
    }

    class b extends com.facebook.react.uimanager.events.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WritableMap f30208a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, int i11, WritableMap writableMap) {
            super(i10, i11);
            this.f30208a = writableMap;
        }

        @Override // com.facebook.react.uimanager.events.d
        public WritableMap getEventData() {
            return this.f30208a;
        }

        @Override // com.facebook.react.uimanager.events.d
        public String getEventName() {
            return "topAccessibilityAction";
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f30211b;

        static {
            int[] iArr = new int[e.values().length];
            f30211b = iArr;
            try {
                iArr[e.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30211b[e.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30211b[e.CHECKBOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30211b[e.COMBOBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30211b[e.GRID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30211b[e.HEADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30211b[e.IMG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30211b[e.LINK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30211b[e.LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f30211b[e.MENU.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f30211b[e.MENUBAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f30211b[e.MENUITEM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f30211b[e.NONE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f30211b[e.PROGRESSBAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f30211b[e.RADIO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f30211b[e.RADIOGROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f30211b[e.SCROLLBAR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f30211b[e.SEARCHBOX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f30211b[e.SLIDER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f30211b[e.SPINBUTTON.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f30211b[e.SUMMARY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f30211b[e.SWITCH.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f30211b[e.TAB.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f30211b[e.TABLIST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f30211b[e.TIMER.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f30211b[e.TOOLBAR.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr2 = new int[d.values().length];
            f30210a = iArr2;
            try {
                iArr2[d.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f30210a[d.DROPDOWNLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f30210a[d.TOGGLEBUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f30210a[d.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f30210a[d.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f30210a[d.IMAGEBUTTON.ordinal()] = 6;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f30210a[d.KEYBOARDKEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f30210a[d.TEXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f30210a[d.ADJUSTABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f30210a[d.CHECKBOX.ordinal()] = 10;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f30210a[d.RADIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f30210a[d.SPINBUTTON.ordinal()] = 12;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f30210a[d.SWITCH.ordinal()] = 13;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f30210a[d.LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f30210a[d.GRID.ordinal()] = 15;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f30210a[d.SCROLLVIEW.ordinal()] = 16;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f30210a[d.HORIZONTALSCROLLVIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f30210a[d.PAGER.ordinal()] = 18;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f30210a[d.DRAWERLAYOUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f30210a[d.SLIDINGDRAWER.ordinal()] = 20;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f30210a[d.ICONMENU.ordinal()] = 21;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f30210a[d.VIEWGROUP.ordinal()] = 22;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f30210a[d.WEBVIEW.ordinal()] = 23;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f30210a[d.NONE.ordinal()] = 24;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f30210a[d.LINK.ordinal()] = 25;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f30210a[d.SUMMARY.ordinal()] = 26;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f30210a[d.HEADER.ordinal()] = 27;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f30210a[d.ALERT.ordinal()] = 28;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f30210a[d.COMBOBOX.ordinal()] = 29;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f30210a[d.MENU.ordinal()] = 30;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f30210a[d.MENUBAR.ordinal()] = 31;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f30210a[d.MENUITEM.ordinal()] = 32;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f30210a[d.PROGRESSBAR.ordinal()] = 33;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f30210a[d.RADIOGROUP.ordinal()] = 34;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f30210a[d.SCROLLBAR.ordinal()] = 35;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f30210a[d.TAB.ordinal()] = 36;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f30210a[d.TABLIST.ordinal()] = 37;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f30210a[d.TIMER.ordinal()] = 38;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f30210a[d.TOOLBAR.ordinal()] = 39;
            } catch (NoSuchFieldError unused65) {
            }
        }
    }

    public enum d {
        NONE,
        BUTTON,
        DROPDOWNLIST,
        TOGGLEBUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        LIST,
        GRID,
        PAGER,
        SCROLLVIEW,
        HORIZONTALSCROLLVIEW,
        VIEWGROUP,
        WEBVIEW,
        DRAWERLAYOUT,
        SLIDINGDRAWER,
        ICONMENU,
        TOOLBAR;

        public static d g(e eVar) {
            switch (c.f30211b[eVar.ordinal()]) {
                case 1:
                    return ALERT;
                case 2:
                    return BUTTON;
                case 3:
                    return CHECKBOX;
                case 4:
                    return COMBOBOX;
                case 5:
                    return GRID;
                case 6:
                    return HEADER;
                case 7:
                    return IMAGE;
                case 8:
                    return LINK;
                case 9:
                    return LIST;
                case 10:
                    return MENU;
                case 11:
                    return MENUBAR;
                case 12:
                    return MENUITEM;
                case 13:
                    return NONE;
                case 14:
                    return PROGRESSBAR;
                case 15:
                    return RADIO;
                case 16:
                    return RADIOGROUP;
                case 17:
                    return SCROLLBAR;
                case 18:
                    return SEARCH;
                case 19:
                    return ADJUSTABLE;
                case 20:
                    return SPINBUTTON;
                case 21:
                    return SUMMARY;
                case 22:
                    return SWITCH;
                case 23:
                    return TAB;
                case 24:
                    return TABLIST;
                case 25:
                    return TIMER;
                case 26:
                    return TOOLBAR;
                default:
                    return null;
            }
        }

        public static d h(String str) {
            if (str == null) {
                return NONE;
            }
            for (d dVar : values()) {
                if (dVar.name().equalsIgnoreCase(str)) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        public static d i(View view) {
            e eVar = (e) view.getTag(AbstractC2232l.f29808B);
            return eVar != null ? g(eVar) : (d) view.getTag(AbstractC2232l.f29822h);
        }

        public static String o(d dVar) {
            switch (c.f30210a[dVar.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.Spinner";
                case 3:
                    return "android.widget.ToggleButton";
                case 4:
                    return "android.widget.EditText";
                case 5:
                    return "android.widget.ImageView";
                case 6:
                    return "android.widget.ImageButton";
                case 7:
                    return "android.inputmethodservice.Keyboard$Key";
                case 8:
                    return "android.widget.TextView";
                case 9:
                    return "android.widget.SeekBar";
                case 10:
                    return "android.widget.CheckBox";
                case 11:
                    return "android.widget.RadioButton";
                case 12:
                    return "android.widget.SpinButton";
                case 13:
                    return "android.widget.Switch";
                case 14:
                    return "android.widget.AbsListView";
                case 15:
                    return "android.widget.GridView";
                case 16:
                    return "android.widget.ScrollView";
                case 17:
                    return "android.widget.HorizontalScrollView";
                case 18:
                    return "androidx.viewpager.widget.ViewPager";
                case 19:
                    return "androidx.drawerlayout.widget.DrawerLayout";
                case 20:
                    return "android.widget.SlidingDrawer";
                case 21:
                    return "com.android.internal.view.menu.IconMenuView";
                case 22:
                    return "android.view.ViewGroup";
                case 23:
                    return "android.webkit.WebView";
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + dVar);
            }
        }
    }

    public enum e {
        ALERT,
        ALERTDIALOG,
        APPLICATION,
        ARTICLE,
        BANNER,
        BUTTON,
        CELL,
        CHECKBOX,
        COLUMNHEADER,
        COMBOBOX,
        COMPLEMENTARY,
        CONTENTINFO,
        DEFINITION,
        DIALOG,
        DIRECTORY,
        DOCUMENT,
        FEED,
        FIGURE,
        FORM,
        GRID,
        GROUP,
        HEADING,
        IMG,
        LINK,
        LIST,
        LISTITEM,
        LOG,
        MAIN,
        MARQUEE,
        MATH,
        MENU,
        MENUBAR,
        MENUITEM,
        METER,
        NAVIGATION,
        NONE,
        NOTE,
        OPTION,
        PRESENTATION,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        REGION,
        ROW,
        ROWGROUP,
        ROWHEADER,
        SCROLLBAR,
        SEARCHBOX,
        SEPARATOR,
        SLIDER,
        SPINBUTTON,
        STATUS,
        SUMMARY,
        SWITCH,
        TAB,
        TABLE,
        TABLIST,
        TABPANEL,
        TERM,
        TIMER,
        TOOLBAR,
        TOOLTIP,
        TREE,
        TREEGRID,
        TREEITEM;

        public static e g(String str) {
            for (e eVar : values()) {
                if (eVar.name().equalsIgnoreCase(str)) {
                    return eVar;
                }
            }
            return null;
        }
    }

    static {
        HashMap map = new HashMap();
        f30200u = map;
        f30201v = 1056964608;
        f30202w = 2;
        map.put("activate", Integer.valueOf(m1.B.a.f48962i.b()));
        map.put("longpress", Integer.valueOf(m1.B.a.f48963j.b()));
        map.put("increment", Integer.valueOf(m1.B.a.f48970q.b()));
        map.put("decrement", Integer.valueOf(m1.B.a.f48971r.b()));
        map.put("expand", Integer.valueOf(m1.B.a.f48976w.b()));
        map.put("collapse", Integer.valueOf(m1.B.a.f48977x.b()));
    }

    public J(View view, boolean z10, int i10) {
        super(view);
        this.f30203q = view;
        this.f30205s = new HashMap();
        this.f30204r = new a();
        view.setFocusable(z10);
        androidx.core.view.Z.v0(view, i10);
    }

    public static p217m1.B W(View view) {
        if (view == null) {
            return null;
        }
        p217m1.B bK0 = p217m1.B.k0();
        try {
            androidx.core.view.Z.Z(view, bK0);
            return bK0;
        } catch (NullPointerException unused) {
            if (bK0 != null) {
                bK0.o0();
            }
            return null;
        }
    }

    public static CharSequence Y(View view, p217m1.B b10) {
        p217m1.B bW = b10 == null ? W(view) : p217m1.B.m0(b10);
        if (bW == null) {
            return null;
        }
        try {
            CharSequence charSequenceW = bW.w();
            CharSequence charSequenceK = bW.K();
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceK);
            boolean z10 = view instanceof EditText;
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(charSequenceW) && (!z10 || zIsEmpty)) {
                sb2.append(charSequenceW);
                return sb2;
            }
            if (!zIsEmpty) {
                sb2.append(charSequenceK);
                return sb2;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                p217m1.B bK0 = p217m1.B.k0();
                androidx.core.view.Z.Z(childAt, bK0);
                if (f0(bK0, childAt) && !d0(bK0, childAt)) {
                    CharSequence charSequenceY = Y(childAt, null);
                    if (!TextUtils.isEmpty(charSequenceY)) {
                        sb3.append(((Object) charSequenceY) + ", ");
                    }
                }
                bK0.o0();
            }
            return g0(sb3);
        } finally {
            bW.o0();
        }
    }

    public static boolean Z(p217m1.B b10, View view) {
        if (b10 != null && view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    p217m1.B bK0 = p217m1.B.k0();
                    try {
                        androidx.core.view.Z.Z(childAt, bK0);
                        if (bK0.j0() && !d0(bK0, childAt) && f0(bK0, childAt)) {
                            return true;
                        }
                        bK0.o0();
                    } finally {
                        if (bK0 != null) {
                            bK0.o0();
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean a0(p217m1.B b10) {
        if (b10 != null) {
            return !TextUtils.isEmpty(b10.I()) || b10.S() || c0(b10);
        }
        return false;
    }

    public static boolean b0(p217m1.B b10) {
        if (b10 == null || b10.u() != null) {
            return false;
        }
        return (TextUtils.isEmpty(b10.K()) && TextUtils.isEmpty(b10.w()) && TextUtils.isEmpty(b10.B())) ? false : true;
    }

    public static boolean c0(p217m1.B b10) {
        m1.B.h hVarG;
        if (b10 == null || (hVarG = b10.G()) == null) {
            return false;
        }
        float fB = hVarG.b();
        float fC = hVarG.c();
        float fA = hVarG.a();
        return fB - fC > 0.0f && fA >= fC && fA <= fB;
    }

    public static boolean d0(p217m1.B b10, View view) {
        if (b10 == null || view == null || !b10.j0()) {
            return false;
        }
        return b10.e0() || e0(b10);
    }

    public static boolean e0(p217m1.B b10) {
        if (b10 == null) {
            return false;
        }
        if (!b10.U() && !b10.c0() && !b10.Y()) {
            List listI = b10.i();
            if (!listI.contains(16) && !listI.contains(32) && !listI.contains(1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean f0(p217m1.B b10, View view) {
        int iX;
        if (b10 == null || view == null || (iX = androidx.core.view.Z.x(view)) == 4 || (iX == 2 && b10.r() <= 0)) {
            return false;
        }
        return b0(b10) || a0(b10) || b10.S() || Z(b10, view);
    }

    private static String g0(StringBuilder sb2) {
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - f30202w, length);
        }
        return sb2.toString();
    }

    private void h0(View view) {
        if (this.f30204r.hasMessages(1, view)) {
            this.f30204r.removeMessages(1, view);
        }
        this.f30204r.sendMessageDelayed(this.f30204r.obtainMessage(1, view), 200L);
    }

    public static void i0(View view, boolean z10, int i10) {
        if (androidx.core.view.Z.M(view)) {
            return;
        }
        if (view.getTag(AbstractC2232l.f29822h) == null && view.getTag(AbstractC2232l.f29823i) == null && view.getTag(AbstractC2232l.f29815a) == null && view.getTag(AbstractC2232l.f29836v) == null && view.getTag(AbstractC2232l.f29817c) == null && view.getTag(AbstractC2232l.f29820f) == null && view.getTag(AbstractC2232l.f29808B) == null) {
            return;
        }
        androidx.core.view.Z.m0(view, new J(view, z10, i10));
    }

    public static void j0(p217m1.B b10, d dVar, Context context) {
        if (dVar == null) {
            dVar = d.NONE;
        }
        b10.z0(d.o(dVar));
        if (dVar.equals(d.LINK)) {
            b10.a1(context.getString(AbstractC2235o.f30009A));
            return;
        }
        if (dVar.equals(d.IMAGE)) {
            b10.a1(context.getString(AbstractC2235o.f30050y));
            return;
        }
        if (dVar.equals(d.IMAGEBUTTON)) {
            b10.a1(context.getString(AbstractC2235o.f30051z));
            b10.A0(true);
            return;
        }
        if (dVar.equals(d.BUTTON)) {
            b10.A0(true);
            return;
        }
        if (dVar.equals(d.TOGGLEBUTTON)) {
            b10.A0(true);
            b10.x0(true);
            return;
        }
        if (dVar.equals(d.SUMMARY)) {
            b10.a1(context.getString(AbstractC2235o.f30022N));
            return;
        }
        if (dVar.equals(d.HEADER)) {
            b10.L0(true);
            return;
        }
        if (dVar.equals(d.ALERT)) {
            b10.a1(context.getString(AbstractC2235o.f30026a));
            return;
        }
        if (dVar.equals(d.COMBOBOX)) {
            b10.a1(context.getString(AbstractC2235o.f30049x));
            return;
        }
        if (dVar.equals(d.MENU)) {
            b10.a1(context.getString(AbstractC2235o.f30010B));
            return;
        }
        if (dVar.equals(d.MENUBAR)) {
            b10.a1(context.getString(AbstractC2235o.f30011C));
            return;
        }
        if (dVar.equals(d.MENUITEM)) {
            b10.a1(context.getString(AbstractC2235o.f30012D));
            return;
        }
        if (dVar.equals(d.PROGRESSBAR)) {
            b10.a1(context.getString(AbstractC2235o.f30013E));
            return;
        }
        if (dVar.equals(d.RADIOGROUP)) {
            b10.a1(context.getString(AbstractC2235o.f30014F));
            return;
        }
        if (dVar.equals(d.SCROLLBAR)) {
            b10.a1(context.getString(AbstractC2235o.f30017I));
            return;
        }
        if (dVar.equals(d.SPINBUTTON)) {
            b10.a1(context.getString(AbstractC2235o.f30018J));
            return;
        }
        if (dVar.equals(d.TAB)) {
            b10.a1(context.getString(AbstractC2235o.f30016H));
            return;
        }
        if (dVar.equals(d.TABLIST)) {
            b10.a1(context.getString(AbstractC2235o.f30023O));
        } else if (dVar.equals(d.TIMER)) {
            b10.a1(context.getString(AbstractC2235o.f30024P));
        } else if (dVar.equals(d.TOOLBAR)) {
            b10.a1(context.getString(AbstractC2235o.f30025Q));
        }
    }

    private static void k0(p217m1.B b10, ReadableMap readableMap, Context context) {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(strNextKey);
            if (strNextKey.equals("selected") && dynamic.getType() == ReadableType.Boolean) {
                b10.d1(dynamic.asBoolean());
            } else if (strNextKey.equals("disabled") && dynamic.getType() == ReadableType.Boolean) {
                b10.H0(!dynamic.asBoolean());
            } else if (strNextKey.equals("checked") && dynamic.getType() == ReadableType.Boolean) {
                boolean zAsBoolean = dynamic.asBoolean();
                b10.x0(true);
                b10.y0(zAsBoolean);
            }
        }
    }

    @Override // p343t1.a
    protected int B(float f10, float f11) {
        return Integer.MIN_VALUE;
    }

    @Override // p343t1.a
    protected void C(List list) {
    }

    @Override // p343t1.a
    protected boolean J(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // p343t1.a
    protected void N(int i10, p217m1.B b10) {
        b10.D0("");
        b10.v0(new Rect(0, 0, 1, 1));
    }

    protected View X() {
        return this.f30203q;
    }

    @Override // p343t1.a, androidx.core.view.C1894a
    public p217m1.C b(View view) {
        return null;
    }

    @Override // p343t1.a, androidx.core.view.C1894a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(AbstractC2232l.f29825k);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int iAsInt = dynamic.asInt();
                    int iAsInt2 = dynamic2.asInt();
                    int iAsInt3 = dynamic3.asInt();
                    if (iAsInt3 <= iAsInt || iAsInt2 < iAsInt || iAsInt3 < iAsInt2) {
                        return;
                    }
                    accessibilityEvent.setItemCount(iAsInt3 - iAsInt);
                    accessibilityEvent.setCurrentItemIndex(iAsInt2);
                }
            }
        }
    }

    @Override // p343t1.a, androidx.core.view.C1894a
    public void g(View view, p217m1.B b10) {
        super.g(view, b10);
        if (view.getTag(AbstractC2232l.f29824j) != null) {
            b10.a(((Boolean) view.getTag(AbstractC2232l.f29824j)).booleanValue() ? 524288 : 262144);
        }
        d dVarI = d.i(view);
        String str = (String) view.getTag(AbstractC2232l.f29818d);
        if (dVarI != null) {
            j0(b10, dVarI, view.getContext());
        }
        if (str != null) {
            b10.k1(str);
        }
        Object tag = view.getTag(AbstractC2232l.f29832r);
        if (tag != null) {
            View viewA = p098f7.a.a(view.getRootView(), (String) tag);
            this.f30206t = viewA;
            if (viewA != null) {
                b10.P0(viewA);
            }
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(AbstractC2232l.f29823i);
        if (readableMap != null) {
            k0(b10, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(AbstractC2232l.f29815a);
        ReadableMap readableMap2 = (ReadableMap) view.getTag(AbstractC2232l.f29817c);
        if (readableMap2 != null) {
            b10.C0(m1.B.g.a(readableMap2.getInt("rowIndex"), readableMap2.getInt("rowSpan"), readableMap2.getInt("columnIndex"), readableMap2.getInt("columnSpan"), readableMap2.getBoolean("heading")));
        }
        boolean z10 = true;
        if (readableArray != null) {
            for (int i10 = 0; i10 < readableArray.size(); i10++) {
                ReadableMap map = readableArray.getMap(i10);
                if (!map.hasKey("name")) {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
                int iIntValue = f30201v;
                String string = map.hasKey("label") ? map.getString("label") : null;
                HashMap map2 = f30200u;
                if (map2.containsKey(map.getString("name"))) {
                    iIntValue = ((Integer) map2.get(map.getString("name"))).intValue();
                } else {
                    f30201v++;
                }
                this.f30205s.put(Integer.valueOf(iIntValue), map.getString("name"));
                b10.b(new m1.B.a(iIntValue, string));
            }
        }
        ReadableMap readableMap3 = (ReadableMap) view.getTag(AbstractC2232l.f29825k);
        if (readableMap3 != null && readableMap3.hasKey("min") && readableMap3.hasKey("now") && readableMap3.hasKey("max")) {
            Dynamic dynamic = readableMap3.getDynamic("min");
            Dynamic dynamic2 = readableMap3.getDynamic("now");
            Dynamic dynamic3 = readableMap3.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int iAsInt = dynamic.asInt();
                    int iAsInt2 = dynamic2.asInt();
                    int iAsInt3 = dynamic3.asInt();
                    if (iAsInt3 > iAsInt && iAsInt2 >= iAsInt && iAsInt3 >= iAsInt2) {
                        b10.Z0(m1.B.h.d(0, iAsInt, iAsInt3, iAsInt2));
                    }
                }
            }
        }
        String str2 = (String) view.getTag(AbstractC2232l.f29836v);
        if (str2 != null) {
            b10.p1(str2);
        }
        boolean z11 = TextUtils.isEmpty(b10.w()) && TextUtils.isEmpty(b10.K());
        if (readableArray == null && readableMap == null && tag == null && dVarI == null) {
            z10 = false;
        }
        if (z11 && z10) {
            b10.D0(Y(view, b10));
        }
    }

    @Override // androidx.core.view.C1894a
    public boolean j(View view, int i10, Bundle bundle) {
        if (i10 == 524288) {
            view.setTag(AbstractC2232l.f29824j, Boolean.FALSE);
        }
        if (i10 == 262144) {
            view.setTag(AbstractC2232l.f29824j, Boolean.TRUE);
        }
        if (!this.f30205s.containsKey(Integer.valueOf(i10))) {
            return super.j(view, i10, bundle);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("actionName", (String) this.f30205s.get(Integer.valueOf(i10)));
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext.hasActiveReactInstance()) {
            int id2 = view.getId();
            int iE = C2270o0.e(reactContext);
            UIManager uIManagerG = C2270o0.g(reactContext, Z6.a.a(id2));
            if (uIManagerG != null) {
                uIManagerG.getEventDispatcher().d(new b(iE, id2, writableMapCreateMap));
            }
        } else {
            ReactSoftExceptionLogger.logSoftException("ReactAccessibilityDelegate", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        d dVar = (d) view.getTag(AbstractC2232l.f29822h);
        ReadableMap readableMap = (ReadableMap) view.getTag(AbstractC2232l.f29825k);
        if (dVar != d.ADJUSTABLE) {
            return true;
        }
        if (i10 != m1.B.a.f48970q.b() && i10 != m1.B.a.f48971r.b()) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey("text")) {
            h0(view);
        }
        return super.j(view, i10, bundle);
    }

    public p217m1.C l0(View view) {
        return super.b(view);
    }
}
