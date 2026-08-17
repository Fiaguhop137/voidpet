package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.V;
import androidx.appcompat.widget.W;
import androidx.core.view.AbstractC1929s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final int f20275B = p144i.g.f43213e;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    boolean f20276A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f20277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f20280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f20281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Handler f20282g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f20290o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f20291p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f20293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f20294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f20295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f20296u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f20298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private j.a f20299x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ViewTreeObserver f20300y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private PopupWindow.OnDismissListener f20301z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f20283h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final List f20284i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f20285j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f20286k = new ViewOnAttachStateChangeListenerC0253b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final V f20287l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20288m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f20289n = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f20297v = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20292q = F();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f20284i.size() <= 0 || ((d) b.this.f20284i.get(0)).f20309a.B()) {
                return;
            }
            View view = b.this.f20291p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f20284i.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f20309a.c();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0253b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0253b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f20300y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f20300y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f20300y.removeGlobalOnLayoutListener(bVar.f20285j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements V {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f20305a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MenuItem f20306b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f20307c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f20305a = dVar;
                this.f20306b = menuItem;
                this.f20307c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f20305a;
                if (dVar != null) {
                    b.this.f20276A = true;
                    dVar.f20310b.e(false);
                    b.this.f20276A = false;
                }
                if (this.f20306b.isEnabled() && this.f20306b.hasSubMenu()) {
                    this.f20307c.O(this.f20306b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.V
        public void d(e eVar, MenuItem menuItem) {
            b.this.f20282g.removeCallbacksAndMessages(null);
            int size = b.this.f20284i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == ((d) b.this.f20284i.get(i10)).f20310b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f20282g.postAtTime(new a(i11 < b.this.f20284i.size() ? (d) b.this.f20284i.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.V
        public void n(e eVar, MenuItem menuItem) {
            b.this.f20282g.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final W f20309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f20310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20311c;

        public d(W w10, e eVar, int i10) {
            this.f20309a = w10;
            this.f20310b = eVar;
            this.f20311c = i10;
        }

        public ListView a() {
            return this.f20309a.o();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f20277b = context;
        this.f20290o = view;
        this.f20279d = i10;
        this.f20280e = i11;
        this.f20281f = z10;
        Resources resources = context.getResources();
        this.f20278c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p144i.d.f43109b));
        this.f20282g = new Handler();
    }

    private W B() {
        W w10 = new W(this.f20277b, null, this.f20279d, this.f20280e);
        w10.U(this.f20287l);
        w10.L(this);
        w10.K(this);
        w10.D(this.f20290o);
        w10.G(this.f20289n);
        w10.J(true);
        w10.I(2);
        return w10;
    }

    private int C(e eVar) {
        int size = this.f20284i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == ((d) this.f20284i.get(i10)).f20310b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem D(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View E(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemD = D(dVar.f20310b, eVar);
        if (menuItemD == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemD == dVar2.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int F() {
        return this.f20290o.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int G(int i10) {
        List list = this.f20284i;
        ListView listViewA = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f20291p.getWindowVisibleDisplayFrame(rect);
        if (this.f20292q == 1) {
            return (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1;
        }
        return iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void H(e eVar) {
        d dVar;
        View viewE;
        int i10;
        int i11;
        int i12;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f20277b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f20281f, f20275B);
        if (!a() && this.f20297v) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.z(eVar));
        }
        int iQ = h.q(dVar2, null, this.f20277b, this.f20278c);
        W wB = B();
        wB.m(dVar2);
        wB.F(iQ);
        wB.G(this.f20289n);
        if (this.f20284i.size() > 0) {
            List list = this.f20284i;
            dVar = (d) list.get(list.size() - 1);
            viewE = E(dVar, eVar);
        } else {
            dVar = null;
            viewE = null;
        }
        if (viewE != null) {
            wB.V(false);
            wB.S(null);
            int iG = G(iQ);
            boolean z10 = iG == 1;
            this.f20292q = iG;
            if (Build.VERSION.SDK_INT >= 26) {
                wB.D(viewE);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f20290o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewE.getLocationOnScreen(iArr2);
                if ((this.f20289n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f20290o.getWidth();
                    iArr2[0] = iArr2[0] + viewE.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f20289n & 5) == 5) {
                if (z10) {
                    i12 = i10 + iQ;
                } else {
                    iQ = viewE.getWidth();
                    i12 = i10 - iQ;
                }
            } else if (z10) {
                iQ = viewE.getWidth();
                i12 = i10 + iQ;
            } else {
                i12 = i10 - iQ;
            }
            wB.e(i12);
            wB.N(true);
            wB.i(i11);
        } else {
            if (this.f20293r) {
                wB.e(this.f20295t);
            }
            if (this.f20294s) {
                wB.i(this.f20296u);
            }
            wB.H(p());
        }
        this.f20284i.add(new d(wB, eVar, this.f20292q));
        wB.c();
        ListView listViewO = wB.o();
        listViewO.setOnKeyListener(this);
        if (dVar == null && this.f20298w && eVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(p144i.g.f43220l, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(eVar.z());
            listViewO.addHeaderView(frameLayout, null, false);
            wB.c();
        }
    }

    @Override // p233n.e
    public boolean a() {
        return this.f20284i.size() > 0 && ((d) this.f20284i.get(0)).f20309a.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        int iC = C(eVar);
        if (iC < 0) {
            return;
        }
        int i10 = iC + 1;
        if (i10 < this.f20284i.size()) {
            ((d) this.f20284i.get(i10)).f20310b.e(false);
        }
        d dVar = (d) this.f20284i.remove(iC);
        dVar.f20310b.R(this);
        if (this.f20276A) {
            dVar.f20309a.T(null);
            dVar.f20309a.E(0);
        }
        dVar.f20309a.dismiss();
        int size = this.f20284i.size();
        if (size > 0) {
            this.f20292q = ((d) this.f20284i.get(size - 1)).f20311c;
        } else {
            this.f20292q = F();
        }
        if (size != 0) {
            if (z10) {
                ((d) this.f20284i.get(0)).f20310b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f20299x;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f20300y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f20300y.removeGlobalOnLayoutListener(this.f20285j);
            }
            this.f20300y = null;
        }
        this.f20291p.removeOnAttachStateChangeListener(this.f20286k);
        this.f20301z.onDismiss();
    }

    @Override // p233n.e
    public void c() {
        if (a()) {
            return;
        }
        Iterator it = this.f20283h.iterator();
        while (it.hasNext()) {
            H((e) it.next());
        }
        this.f20283h.clear();
        View view = this.f20290o;
        this.f20291p = view;
        if (view != null) {
            boolean z10 = this.f20300y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f20300y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f20285j);
            }
            this.f20291p.addOnAttachStateChangeListener(this.f20286k);
        }
    }

    @Override // p233n.e
    public void dismiss() {
        int size = this.f20284i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f20284i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f20309a.a()) {
                    dVar.f20309a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f20299x = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(m mVar) {
        for (d dVar : this.f20284i) {
            if (mVar == dVar.f20310b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        m(mVar);
        j.a aVar = this.f20299x;
        if (aVar != null) {
            aVar.c(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        Iterator it = this.f20284i.iterator();
        while (it.hasNext()) {
            h.A(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void m(e eVar) {
        eVar.c(this, this.f20277b);
        if (a()) {
            H(eVar);
        } else {
            this.f20283h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean n() {
        return false;
    }

    @Override // p233n.e
    public ListView o() {
        if (this.f20284i.isEmpty()) {
            return null;
        }
        List list = this.f20284i;
        return ((d) list.get(list.size() - 1)).a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f20284i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f20284i.get(i10);
            if (!dVar.f20309a.a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f20310b.e(false);
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
        if (this.f20290o != view) {
            this.f20290o = view;
            this.f20289n = AbstractC1929s.b(this.f20288m, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(boolean z10) {
        this.f20297v = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(int i10) {
        if (this.f20288m != i10) {
            this.f20288m = i10;
            this.f20289n = AbstractC1929s.b(i10, this.f20290o.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i10) {
        this.f20293r = true;
        this.f20295t = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(PopupWindow.OnDismissListener onDismissListener) {
        this.f20301z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void x(boolean z10) {
        this.f20298w = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void y(int i10) {
        this.f20294s = true;
        this.f20296u = i10;
    }
}
