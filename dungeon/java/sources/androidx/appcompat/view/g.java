package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.h0;
import androidx.core.view.AbstractC1896b;
import androidx.core.view.AbstractC1941y;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p144i.j;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Class[] f20182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Class[] f20183f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f20184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f20185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f20186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f20187d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class[] f20188c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f20189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f20190b;

        public a(Object obj, String str) {
            this.f20189a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f20190b = cls.getMethod(str, f20188c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f20190b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f20190b.invoke(this.f20189a, menuItem)).booleanValue();
                }
                this.f20190b.invoke(this.f20189a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        AbstractC1896b f20191A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private CharSequence f20192B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private CharSequence f20193C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private ColorStateList f20194D = null;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private PorterDuff.Mode f20195E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f20197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f20198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f20199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f20200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f20201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f20202f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f20203g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f20204h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f20205i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f20206j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CharSequence f20207k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CharSequence f20208l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f20209m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f20210n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f20211o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private char f20212p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f20213q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f20214r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f20215s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f20216t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f20217u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f20218v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f20219w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f20220x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private String f20221y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f20222z;

        public b(Menu menu) {
            this.f20197a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f20186c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f20215s).setVisible(this.f20216t).setEnabled(this.f20217u).setCheckable(this.f20214r >= 1).setTitleCondensed(this.f20208l).setIcon(this.f20209m);
            int i10 = this.f20218v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f20222z != null) {
                if (g.this.f20186c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f20222z));
            }
            if (this.f20214r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof p233n.c) {
                    ((p233n.c) menuItem).h(true);
                }
            }
            String str = this.f20220x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f20182e, g.this.f20184a));
                z10 = true;
            }
            int i11 = this.f20219w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC1896b abstractC1896b = this.f20191A;
            if (abstractC1896b != null) {
                AbstractC1941y.a(menuItem, abstractC1896b);
            }
            AbstractC1941y.c(menuItem, this.f20192B);
            AbstractC1941y.g(menuItem, this.f20193C);
            AbstractC1941y.b(menuItem, this.f20210n, this.f20211o);
            AbstractC1941y.f(menuItem, this.f20212p, this.f20213q);
            PorterDuff.Mode mode = this.f20195E;
            if (mode != null) {
                AbstractC1941y.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f20194D;
            if (colorStateList != null) {
                AbstractC1941y.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f20204h = true;
            i(this.f20197a.add(this.f20198b, this.f20205i, this.f20206j, this.f20207k));
        }

        public SubMenu b() {
            this.f20204h = true;
            SubMenu subMenuAddSubMenu = this.f20197a.addSubMenu(this.f20198b, this.f20205i, this.f20206j, this.f20207k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f20204h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f20186c.obtainStyledAttributes(attributeSet, j.f43441o1);
            this.f20198b = typedArrayObtainStyledAttributes.getResourceId(j.f43451q1, 0);
            this.f20199c = typedArrayObtainStyledAttributes.getInt(j.f43461s1, 0);
            this.f20200d = typedArrayObtainStyledAttributes.getInt(j.f43466t1, 0);
            this.f20201e = typedArrayObtainStyledAttributes.getInt(j.f43471u1, 0);
            this.f20202f = typedArrayObtainStyledAttributes.getBoolean(j.f43456r1, true);
            this.f20203g = typedArrayObtainStyledAttributes.getBoolean(j.f43446p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            h0 h0VarU = h0.u(g.this.f20186c, attributeSet, j.f43476v1);
            this.f20205i = h0VarU.n(j.f43491y1, 0);
            this.f20206j = (h0VarU.k(j.f43254B1, this.f20199c) & (-65536)) | (h0VarU.k(j.f43259C1, this.f20200d) & 65535);
            this.f20207k = h0VarU.p(j.f43264D1);
            this.f20208l = h0VarU.p(j.f43269E1);
            this.f20209m = h0VarU.n(j.f43481w1, 0);
            this.f20210n = c(h0VarU.o(j.f43274F1));
            this.f20211o = h0VarU.k(j.f43309M1, 4096);
            this.f20212p = c(h0VarU.o(j.f43279G1));
            this.f20213q = h0VarU.k(j.f43329Q1, 4096);
            if (h0VarU.s(j.f43284H1)) {
                this.f20214r = h0VarU.a(j.f43284H1, false) ? 1 : 0;
            } else {
                this.f20214r = this.f20201e;
            }
            this.f20215s = h0VarU.a(j.f43496z1, false);
            this.f20216t = h0VarU.a(j.f43249A1, this.f20202f);
            this.f20217u = h0VarU.a(j.f43486x1, this.f20203g);
            this.f20218v = h0VarU.k(j.f43334R1, -1);
            this.f20222z = h0VarU.o(j.f43289I1);
            this.f20219w = h0VarU.n(j.f43294J1, 0);
            this.f20220x = h0VarU.o(j.f43304L1);
            String strO = h0VarU.o(j.f43299K1);
            this.f20221y = strO;
            boolean z10 = strO != null;
            if (z10 && this.f20219w == 0 && this.f20220x == null) {
                this.f20191A = (AbstractC1896b) e(strO, g.f20183f, g.this.f20185b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f20191A = null;
            }
            this.f20192B = h0VarU.p(j.f43314N1);
            this.f20193C = h0VarU.p(j.f43339S1);
            if (h0VarU.s(j.f43324P1)) {
                this.f20195E = O.e(h0VarU.k(j.f43324P1, -1), this.f20195E);
            } else {
                this.f20195E = null;
            }
            if (h0VarU.s(j.f43319O1)) {
                this.f20194D = h0VarU.c(j.f43319O1);
            } else {
                this.f20194D = null;
            }
            h0VarU.x();
            this.f20204h = false;
        }

        public void h() {
            this.f20198b = 0;
            this.f20199c = 0;
            this.f20200d = 0;
            this.f20201e = 0;
            this.f20202f = true;
            this.f20203g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f20182e = clsArr;
        f20183f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f20186c = context;
        Object[] objArr = {context};
        this.f20184a = objArr;
        this.f20185b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        z11 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            AbstractC1896b abstractC1896b = bVar.f20191A;
                            if (abstractC1896b == null || !abstractC1896b.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f20187d == null) {
            this.f20187d = a(this.f20186c);
        }
        return this.f20187d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof p074e1.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f20186c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.H()) {
                        eVar.i0();
                        z10 = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.e) menu).h0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (z10) {
                ((androidx.appcompat.view.menu.e) menu).h0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
