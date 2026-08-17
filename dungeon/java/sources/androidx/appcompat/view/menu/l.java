package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.W;

/* JADX INFO: loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f20407v = p144i.g.f43221m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f20408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f20409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f20410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f20411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f20412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f20413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f20414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final W f20415i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f20418l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f20419m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    View f20420n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private j.a f20421o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ViewTreeObserver f20422p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f20423q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f20424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f20425s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f20427u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f20416j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f20417k = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f20426t = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.a() || l.this.f20415i.B()) {
                return;
            }
            View view = l.this.f20420n;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f20415i.c();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f20422p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f20422p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f20422p.removeGlobalOnLayoutListener(lVar.f20416j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f20408b = context;
        this.f20409c = eVar;
        this.f20411e = z10;
        this.f20410d = new d(eVar, LayoutInflater.from(context), z10, f20407v);
        this.f20413g = i10;
        this.f20414h = i11;
        Resources resources = context.getResources();
        this.f20412f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p144i.d.f43109b));
        this.f20419m = view;
        this.f20415i = new W(context, null, i10, i11);
        eVar.c(this, context);
    }

    private boolean B() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f20423q || (view = this.f20419m) == null) {
            return false;
        }
        this.f20420n = view;
        this.f20415i.K(this);
        this.f20415i.L(this);
        this.f20415i.J(true);
        View view2 = this.f20420n;
        boolean z10 = this.f20422p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f20422p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f20416j);
        }
        view2.addOnAttachStateChangeListener(this.f20417k);
        this.f20415i.D(view2);
        this.f20415i.G(this.f20426t);
        if (!this.f20424r) {
            this.f20425s = h.q(this.f20410d, null, this.f20408b, this.f20412f);
            this.f20424r = true;
        }
        this.f20415i.F(this.f20425s);
        this.f20415i.I(2);
        this.f20415i.H(p());
        this.f20415i.c();
        ListView listViewO = this.f20415i.o();
        listViewO.setOnKeyListener(this);
        if (this.f20427u && this.f20409c.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f20408b).inflate(p144i.g.f43220l, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f20409c.z());
            }
            frameLayout.setEnabled(false);
            listViewO.addHeaderView(frameLayout, null, false);
        }
        this.f20415i.m(this.f20410d);
        this.f20415i.c();
        return true;
    }

    @Override // p233n.e
    public boolean a() {
        return !this.f20423q && this.f20415i.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        if (eVar != this.f20409c) {
            return;
        }
        dismiss();
        j.a aVar = this.f20421o;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // p233n.e
    public void c() {
        if (!B()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p233n.e
    public void dismiss() {
        if (a()) {
            this.f20415i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f20421o = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f20408b, mVar, this.f20420n, this.f20411e, this.f20413g, this.f20414h);
            iVar.j(this.f20421o);
            iVar.g(h.z(mVar));
            iVar.i(this.f20418l);
            this.f20418l = null;
            this.f20409c.e(false);
            int iB = this.f20415i.b();
            int iL = this.f20415i.l();
            if ((Gravity.getAbsoluteGravity(this.f20426t, this.f20419m.getLayoutDirection()) & 7) == 5) {
                iB += this.f20419m.getWidth();
            }
            if (iVar.n(iB, iL)) {
                j.a aVar = this.f20421o;
                if (aVar == null) {
                    return true;
                }
                aVar.c(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        this.f20424r = false;
        d dVar = this.f20410d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void m(e eVar) {
    }

    @Override // p233n.e
    public ListView o() {
        return this.f20415i.o();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f20423q = true;
        this.f20409c.close();
        ViewTreeObserver viewTreeObserver = this.f20422p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f20422p = this.f20420n.getViewTreeObserver();
            }
            this.f20422p.removeGlobalOnLayoutListener(this.f20416j);
            this.f20422p = null;
        }
        this.f20420n.removeOnAttachStateChangeListener(this.f20417k);
        PopupWindow.OnDismissListener onDismissListener = this.f20418l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(View view) {
        this.f20419m = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(boolean z10) {
        this.f20410d.d(z10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(int i10) {
        this.f20426t = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i10) {
        this.f20415i.e(i10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.f20418l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void x(boolean z10) {
        this.f20427u = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void y(int i10) {
        this.f20415i.i(i10);
    }
}
