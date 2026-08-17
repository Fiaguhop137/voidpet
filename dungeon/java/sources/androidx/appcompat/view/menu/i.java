package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.core.view.AbstractC1929s;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f20395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f20398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f20399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private j.a f20402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f20403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f20404k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f20405l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    public i(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f20400g = 8388611;
        this.f20405l = new a();
        this.f20394a = context;
        this.f20395b = eVar;
        this.f20399f = view;
        this.f20396c = z10;
        this.f20397d = i10;
        this.f20398e = i11;
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f20394a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f20394a.getResources().getDimensionPixelSize(p144i.d.f43108a) ? new b(this.f20394a, this.f20399f, this.f20397d, this.f20398e, this.f20396c) : new l(this.f20394a, this.f20395b, this.f20399f, this.f20397d, this.f20398e, this.f20396c);
        bVar.m(this.f20395b);
        bVar.w(this.f20405l);
        bVar.r(this.f20399f);
        bVar.e(this.f20402i);
        bVar.t(this.f20401h);
        bVar.u(this.f20400g);
        return bVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        h hVarC = c();
        hVarC.x(z11);
        if (z10) {
            if ((AbstractC1929s.b(this.f20400g, this.f20399f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f20399f.getWidth();
            }
            hVarC.v(i10);
            hVarC.y(i11);
            int i12 = (int) ((this.f20394a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            hVarC.s(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        hVarC.c();
    }

    public void b() {
        if (d()) {
            this.f20403j.dismiss();
        }
    }

    public h c() {
        if (this.f20403j == null) {
            this.f20403j = a();
        }
        return this.f20403j;
    }

    public boolean d() {
        h hVar = this.f20403j;
        return hVar != null && hVar.a();
    }

    protected void e() {
        this.f20403j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f20404k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f20399f = view;
    }

    public void g(boolean z10) {
        this.f20401h = z10;
        h hVar = this.f20403j;
        if (hVar != null) {
            hVar.t(z10);
        }
    }

    public void h(int i10) {
        this.f20400g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f20404k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f20402i = aVar;
        h hVar = this.f20403j;
        if (hVar != null) {
            hVar.e(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f20399f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f20399f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }
}
