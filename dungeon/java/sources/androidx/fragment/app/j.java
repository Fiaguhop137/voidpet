package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.view.InterfaceC1937w;
import androidx.lifecycle.AbstractC1987j;
import androidx.lifecycle.C1995s;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends p054d.j implements Y0.b.d {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f24069y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f24070z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final l f24067w = l.b(new a());

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final C1995s f24068x = new C1995s(this);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    boolean f24066A = true;

    class a extends n implements Z0.d, Z0.e, Y0.q, Y0.r, U, p054d.y, p108g.f, p237n3.i, G1.q, InterfaceC1937w {
        public a() {
            super(j.this);
        }

        @Override // androidx.fragment.app.n
        public void A() {
            B();
        }

        public void B() {
            j.this.X();
        }

        @Override // androidx.fragment.app.n
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public j s() {
            return j.this;
        }

        @Override // G1.q
        public void a(q qVar, i iVar) {
            j.this.m0(iVar);
        }

        @Override // Z0.e
        public void c(p199l1.b bVar) {
            j.this.c(bVar);
        }

        @Override // p108g.f
        public p108g.e d() {
            return j.this.d();
        }

        @Override // Z0.d
        public void e(p199l1.b bVar) {
            j.this.e(bVar);
        }

        @Override // G1.k
        public View f(int i10) {
            return j.this.findViewById(i10);
        }

        @Override // androidx.lifecycle.U
        public T g() {
            return j.this.g();
        }

        @Override // Y0.r
        public void h(p199l1.b bVar) {
            j.this.h(bVar);
        }

        @Override // p237n3.i
        public p237n3.f i() {
            return j.this.i();
        }

        @Override // G1.k
        public boolean j() {
            Window window = j.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // Y0.r
        public void k(p199l1.b bVar) {
            j.this.k(bVar);
        }

        @Override // androidx.core.view.InterfaceC1937w
        public void m(androidx.core.view.A a10) {
            j.this.m(a10);
        }

        @Override // p054d.y
        public p054d.w p() {
            return j.this.p();
        }

        @Override // Z0.d
        public void q(p199l1.b bVar) {
            j.this.q(bVar);
        }

        @Override // androidx.fragment.app.n
        public void r(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            j.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // Y0.q
        public void t(p199l1.b bVar) {
            j.this.t(bVar);
        }

        @Override // androidx.fragment.app.n
        public LayoutInflater u() {
            return j.this.getLayoutInflater().cloneInContext(j.this);
        }

        @Override // Y0.q
        public void v(p199l1.b bVar) {
            j.this.v(bVar);
        }

        @Override // Z0.e
        public void w(p199l1.b bVar) {
            j.this.w(bVar);
        }

        @Override // androidx.core.view.InterfaceC1937w
        public void x(androidx.core.view.A a10) {
            j.this.x(a10);
        }

        @Override // androidx.lifecycle.InterfaceC1994q
        public AbstractC1987j y() {
            return j.this.f24068x;
        }
    }

    public j() {
        j0();
    }

    public static /* synthetic */ Bundle e0(j jVar) {
        jVar.k0();
        jVar.f24068x.i(AbstractC1987j.a.ON_STOP);
        return new Bundle();
    }

    private void j0() {
        i().c("android:support:lifecycle", new G1.g(this));
        e(new G1.h(this));
        S(new G1.i(this));
        R(new G1.j(this));
    }

    private static boolean l0(q qVar, AbstractC1987j.b bVar) {
        boolean zL0 = false;
        for (i iVar : qVar.t0()) {
            if (iVar != null) {
                if (iVar.O() != null) {
                    zL0 |= l0(iVar.F(), bVar);
                }
                B b10 = iVar.f24005U;
                if (b10 != null && b10.y().b().g(AbstractC1987j.b.STARTED)) {
                    iVar.f24005U.f(bVar);
                    zL0 = true;
                }
                if (iVar.f24004T.b().g(AbstractC1987j.b.STARTED)) {
                    iVar.f24004T.n(bVar);
                    zL0 = true;
                }
            }
        }
        return zL0;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (z(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f24069y);
            printWriter.print(" mResumed=");
            printWriter.print(this.f24070z);
            printWriter.print(" mStopped=");
            printWriter.print(this.f24066A);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f24067w.l().U(str, fileDescriptor, printWriter, strArr);
        }
    }

    final View g0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f24067w.n(view, str, context, attributeSet);
    }

    public q h0() {
        return this.f24067w.l();
    }

    public androidx.loader.app.a i0() {
        return androidx.loader.app.a.b(this);
    }

    void k0() {
        while (l0(h0(), AbstractC1987j.b.CREATED)) {
        }
    }

    @Override // Y0.b.d
    public final void l(int i10) {
    }

    public void m0(i iVar) {
    }

    protected void n0() {
        this.f24068x.i(AbstractC1987j.a.ON_RESUME);
        this.f24067w.h();
    }

    @Override // p054d.j, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.f24067w.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // p054d.j, Y0.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f24068x.i(AbstractC1987j.a.ON_CREATE);
        this.f24067w.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewG0 = g0(view, str, context, attributeSet);
        return viewG0 == null ? super.onCreateView(view, str, context, attributeSet) : viewG0;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewG0 = g0(null, str, context, attributeSet);
        return viewG0 == null ? super.onCreateView(str, context, attributeSet) : viewG0;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f24067w.f();
        this.f24068x.i(AbstractC1987j.a.ON_DESTROY);
    }

    @Override // p054d.j, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.f24067w.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f24070z = false;
        this.f24067w.g();
        this.f24068x.i(AbstractC1987j.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        n0();
    }

    @Override // p054d.j, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f24067w.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.f24067w.m();
        super.onResume();
        this.f24070z = true;
        this.f24067w.k();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.f24067w.m();
        super.onStart();
        this.f24066A = false;
        if (!this.f24069y) {
            this.f24069y = true;
            this.f24067w.c();
        }
        this.f24067w.k();
        this.f24068x.i(AbstractC1987j.a.ON_START);
        this.f24067w.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f24067w.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f24066A = true;
        k0();
        this.f24067w.j();
        this.f24068x.i(AbstractC1987j.a.ON_STOP);
    }
}
