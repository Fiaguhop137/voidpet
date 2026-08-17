package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C2333b;
import com.google.android.gms.common.C2335d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import p170j8.AbstractC3851p;
import p323s.C4101a;

/* JADX INFO: loaded from: classes2.dex */
public final class G implements h8.f.a, h8.f.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h8.a.f f31746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2309b f31747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2330x f31748h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f31751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final X f31752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f31753m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ C2314g f31757q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Queue f31745e = new LinkedList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Set f31749i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f31750j = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f31754n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C2333b f31755o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f31756p = 0;

    public G(C2314g c2314g, p135h8.e eVar) {
        this.f31757q = c2314g;
        h8.a.f fVarS = eVar.s(c2314g.f31832n.getLooper(), this);
        this.f31746f = fVarS;
        this.f31747g = eVar.m();
        this.f31748h = new C2330x();
        this.f31751k = eVar.r();
        if (fVarS.f()) {
            this.f31752l = eVar.t(c2314g.f31823e, c2314g.f31832n);
        } else {
            this.f31752l = null;
        }
    }

    static /* bridge */ /* synthetic */ void B(G g10, I i10) {
        if (g10.f31754n.contains(i10) && !g10.f31753m) {
            if (g10.f31746f.a()) {
                g10.i();
            } else {
                g10.E();
            }
        }
    }

    static /* bridge */ /* synthetic */ void C(G g10, I i10) {
        C2335d[] c2335dArrG;
        if (g10.f31754n.remove(i10)) {
            g10.f31757q.f31832n.removeMessages(15, i10);
            g10.f31757q.f31832n.removeMessages(16, i10);
            C2335d c2335d = i10.f31759b;
            ArrayList arrayList = new ArrayList(g10.f31745e.size());
            for (e0 e0Var : g10.f31745e) {
                if ((e0Var instanceof O) && (c2335dArrG = ((O) e0Var).g(g10)) != null && com.google.android.gms.common.util.b.b(c2335dArrG, c2335d)) {
                    arrayList.add(e0Var);
                }
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                e0 e0Var2 = (e0) arrayList.get(i11);
                g10.f31745e.remove(e0Var2);
                e0Var2.b(new p135h8.l(c2335d));
            }
        }
    }

    private final C2335d c(C2335d[] c2335dArr) {
        if (c2335dArr != null && c2335dArr.length != 0) {
            C2335d[] c2335dArrO = this.f31746f.o();
            if (c2335dArrO == null) {
                c2335dArrO = new C2335d[0];
            }
            C4101a c4101a = new C4101a(c2335dArrO.length);
            for (C2335d c2335d : c2335dArrO) {
                c4101a.put(c2335d.getName(), Long.valueOf(c2335d.b4()));
            }
            for (C2335d c2335d2 : c2335dArr) {
                Long l10 = (Long) c4101a.get(c2335d2.getName());
                if (l10 == null || l10.longValue() < c2335d2.b4()) {
                    return c2335d2;
                }
            }
        }
        return null;
    }

    private final void d(C2333b c2333b) {
        Iterator it = this.f31749i.iterator();
        if (!it.hasNext()) {
            this.f31749i.clear();
            return;
        }
        android.support.v4.media.session.b.a(it.next());
        if (AbstractC3851p.a(c2333b, C2333b.f31870f)) {
            this.f31746f.d();
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Status status) {
        p170j8.r.d(this.f31757q.f31832n);
        f(status, null, false);
    }

    private final void f(Status status, Exception exc, boolean z10) {
        p170j8.r.d(this.f31757q.f31832n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f31745e.iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (!z10 || e0Var.f31812a == 2) {
                if (status != null) {
                    e0Var.a(status);
                } else {
                    e0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void i() {
        ArrayList arrayList = new ArrayList(this.f31745e);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e0 e0Var = (e0) arrayList.get(i10);
            if (!this.f31746f.a()) {
                return;
            }
            if (p(e0Var)) {
                this.f31745e.remove(e0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        D();
        d(C2333b.f31870f);
        o();
        Iterator it = this.f31750j.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        i();
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(int i10) {
        D();
        this.f31753m = true;
        this.f31748h.e(i10, this.f31746f.p());
        C2309b c2309b = this.f31747g;
        C2314g c2314g = this.f31757q;
        c2314g.f31832n.sendMessageDelayed(Message.obtain(c2314g.f31832n, 9, c2309b), 5000L);
        C2309b c2309b2 = this.f31747g;
        C2314g c2314g2 = this.f31757q;
        c2314g2.f31832n.sendMessageDelayed(Message.obtain(c2314g2.f31832n, 11, c2309b2), 120000L);
        this.f31757q.f31825g.c();
        Iterator it = this.f31750j.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private final void m() {
        this.f31757q.f31832n.removeMessages(12, this.f31747g);
        C2309b c2309b = this.f31747g;
        C2314g c2314g = this.f31757q;
        c2314g.f31832n.sendMessageDelayed(c2314g.f31832n.obtainMessage(12, c2309b), this.f31757q.f31819a);
    }

    private final void n(e0 e0Var) {
        e0Var.d(this.f31748h, a());
        try {
            e0Var.c(this);
        } catch (DeadObjectException unused) {
            h(1);
            this.f31746f.b("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void o() {
        if (this.f31753m) {
            C2314g c2314g = this.f31757q;
            c2314g.f31832n.removeMessages(11, this.f31747g);
            C2314g c2314g2 = this.f31757q;
            c2314g2.f31832n.removeMessages(9, this.f31747g);
            this.f31753m = false;
        }
    }

    private final boolean p(e0 e0Var) {
        if (!(e0Var instanceof O)) {
            n(e0Var);
            return true;
        }
        O o10 = (O) e0Var;
        C2335d c2335dC = c(o10.g(this));
        if (c2335dC == null) {
            n(e0Var);
            return true;
        }
        Log.w("GoogleApiManager", this.f31746f.getClass().getName() + " could not execute call because it requires feature (" + c2335dC.getName() + ", " + c2335dC.b4() + ").");
        if (!this.f31757q.f31833o || !o10.f(this)) {
            o10.b(new p135h8.l(c2335dC));
            return true;
        }
        I i10 = new I(this.f31747g, c2335dC, null);
        int iIndexOf = this.f31754n.indexOf(i10);
        if (iIndexOf >= 0) {
            I i11 = (I) this.f31754n.get(iIndexOf);
            this.f31757q.f31832n.removeMessages(15, i11);
            C2314g c2314g = this.f31757q;
            c2314g.f31832n.sendMessageDelayed(Message.obtain(c2314g.f31832n, 15, i11), 5000L);
            return false;
        }
        this.f31754n.add(i10);
        C2314g c2314g2 = this.f31757q;
        c2314g2.f31832n.sendMessageDelayed(Message.obtain(c2314g2.f31832n, 15, i10), 5000L);
        C2314g c2314g3 = this.f31757q;
        c2314g3.f31832n.sendMessageDelayed(Message.obtain(c2314g3.f31832n, 16, i10), 120000L);
        C2333b c2333b = new C2333b(2, null);
        if (q(c2333b)) {
            return false;
        }
        this.f31757q.f(c2333b, this.f31751k);
        return false;
    }

    private final boolean q(C2333b c2333b) {
        synchronized (C2314g.f31817r) {
            try {
                C2314g c2314g = this.f31757q;
                if (c2314g.f31829k == null || !c2314g.f31830l.contains(this.f31747g)) {
                    return false;
                }
                this.f31757q.f31829k.h(c2333b, this.f31751k);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean r(boolean z10) {
        p170j8.r.d(this.f31757q.f31832n);
        if (!this.f31746f.a() || !this.f31750j.isEmpty()) {
            return false;
        }
        if (!this.f31748h.g()) {
            this.f31746f.b("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        m();
        return false;
    }

    public final void D() {
        p170j8.r.d(this.f31757q.f31832n);
        this.f31755o = null;
    }

    public final void E() {
        p170j8.r.d(this.f31757q.f31832n);
        if (this.f31746f.a() || this.f31746f.c()) {
            return;
        }
        try {
            C2314g c2314g = this.f31757q;
            int iB = c2314g.f31825g.b(c2314g.f31823e, this.f31746f);
            if (iB == 0) {
                C2314g c2314g2 = this.f31757q;
                h8.a.f fVar = this.f31746f;
                K k10 = new K(c2314g2, fVar, this.f31747g);
                if (fVar.f()) {
                    ((X) p170j8.r.l(this.f31752l)).f1(k10);
                }
                try {
                    this.f31746f.h(k10);
                    return;
                } catch (SecurityException e10) {
                    H(new C2333b(10), e10);
                    return;
                }
            }
            C2333b c2333b = new C2333b(iB, null);
            Log.w("GoogleApiManager", "The service for " + this.f31746f.getClass().getName() + " is not available: " + c2333b.toString());
            H(c2333b, null);
        } catch (IllegalStateException e11) {
            H(new C2333b(10), e11);
        }
    }

    public final void F(e0 e0Var) {
        p170j8.r.d(this.f31757q.f31832n);
        if (this.f31746f.a()) {
            if (p(e0Var)) {
                m();
                return;
            } else {
                this.f31745e.add(e0Var);
                return;
            }
        }
        this.f31745e.add(e0Var);
        C2333b c2333b = this.f31755o;
        if (c2333b == null || !c2333b.e4()) {
            E();
        } else {
            H(this.f31755o, null);
        }
    }

    final void G() {
        this.f31756p++;
    }

    public final void H(C2333b c2333b, Exception exc) {
        p170j8.r.d(this.f31757q.f31832n);
        X x10 = this.f31752l;
        if (x10 != null) {
            x10.g1();
        }
        D();
        this.f31757q.f31825g.c();
        d(c2333b);
        if ((this.f31746f instanceof p206l8.e) && c2333b.b4() != 24) {
            this.f31757q.f31820b = true;
            C2314g c2314g = this.f31757q;
            c2314g.f31832n.sendMessageDelayed(c2314g.f31832n.obtainMessage(19), 300000L);
        }
        if (c2333b.b4() == 4) {
            e(C2314g.f31816q);
            return;
        }
        if (this.f31745e.isEmpty()) {
            this.f31755o = c2333b;
            return;
        }
        if (exc != null) {
            p170j8.r.d(this.f31757q.f31832n);
            f(null, exc, false);
            return;
        }
        if (!this.f31757q.f31833o) {
            e(C2314g.g(this.f31747g, c2333b));
            return;
        }
        f(C2314g.g(this.f31747g, c2333b), null, true);
        if (this.f31745e.isEmpty() || q(c2333b) || this.f31757q.f(c2333b, this.f31751k)) {
            return;
        }
        if (c2333b.b4() == 18) {
            this.f31753m = true;
        }
        if (!this.f31753m) {
            e(C2314g.g(this.f31747g, c2333b));
            return;
        }
        C2314g c2314g2 = this.f31757q;
        c2314g2.f31832n.sendMessageDelayed(Message.obtain(c2314g2.f31832n, 9, this.f31747g), 5000L);
    }

    public final void I(C2333b c2333b) {
        p170j8.r.d(this.f31757q.f31832n);
        h8.a.f fVar = this.f31746f;
        fVar.b("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c2333b));
        H(c2333b, null);
    }

    public final void J() {
        p170j8.r.d(this.f31757q.f31832n);
        if (this.f31753m) {
            E();
        }
    }

    public final void K() {
        p170j8.r.d(this.f31757q.f31832n);
        e(C2314g.f31815p);
        this.f31748h.f();
        for (AbstractC2319l abstractC2319l : (AbstractC2319l[]) this.f31750j.keySet().toArray(new AbstractC2319l[0])) {
            F(new d0(null, new TaskCompletionSource()));
        }
        d(new C2333b(4));
        if (this.f31746f.a()) {
            this.f31746f.n(new F(this));
        }
    }

    public final void L() {
        p170j8.r.d(this.f31757q.f31832n);
        if (this.f31753m) {
            o();
            C2314g c2314g = this.f31757q;
            e(c2314g.f31824f.g(c2314g.f31823e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f31746f.b("Timing out connection while resuming.");
        }
    }

    public final boolean a() {
        return this.f31746f.f();
    }

    public final boolean b() {
        return r(true);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2313f
    public final void g(Bundle bundle) {
        if (Looper.myLooper() == this.f31757q.f31832n.getLooper()) {
            j();
        } else {
            this.f31757q.f31832n.post(new C(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2313f
    public final void h(int i10) {
        if (Looper.myLooper() == this.f31757q.f31832n.getLooper()) {
            l(i10);
        } else {
            this.f31757q.f31832n.post(new D(this, i10));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2321n
    public final void k(C2333b c2333b) {
        H(c2333b, null);
    }

    public final int s() {
        return this.f31751k;
    }

    final int t() {
        return this.f31756p;
    }

    public final h8.a.f v() {
        return this.f31746f;
    }

    public final Map x() {
        return this.f31750j;
    }
}
