package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC1917l0;
import androidx.core.view.C1913j0;
import androidx.core.view.InterfaceC1915k0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f20225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    InterfaceC1915k0 f20226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20227e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20224b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC1917l0 f20228f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList f20223a = new ArrayList();

    class a extends AbstractC1917l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f20229a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f20230b = 0;

        a() {
        }

        @Override // androidx.core.view.InterfaceC1915k0
        public void b(View view) {
            int i10 = this.f20230b + 1;
            this.f20230b = i10;
            if (i10 == h.this.f20223a.size()) {
                InterfaceC1915k0 interfaceC1915k0 = h.this.f20226d;
                if (interfaceC1915k0 != null) {
                    interfaceC1915k0.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.AbstractC1917l0, androidx.core.view.InterfaceC1915k0
        public void c(View view) {
            if (this.f20229a) {
                return;
            }
            this.f20229a = true;
            InterfaceC1915k0 interfaceC1915k0 = h.this.f20226d;
            if (interfaceC1915k0 != null) {
                interfaceC1915k0.c(null);
            }
        }

        void d() {
            this.f20230b = 0;
            this.f20229a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f20227e) {
            Iterator it = this.f20223a.iterator();
            while (it.hasNext()) {
                ((C1913j0) it.next()).c();
            }
            this.f20227e = false;
        }
    }

    void b() {
        this.f20227e = false;
    }

    public h c(C1913j0 c1913j0) {
        if (!this.f20227e) {
            this.f20223a.add(c1913j0);
        }
        return this;
    }

    public h d(C1913j0 c1913j0, C1913j0 c1913j1) {
        this.f20223a.add(c1913j0);
        c1913j1.i(c1913j0.d());
        this.f20223a.add(c1913j1);
        return this;
    }

    public h e(long j10) {
        if (!this.f20227e) {
            this.f20224b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f20227e) {
            this.f20225c = interpolator;
        }
        return this;
    }

    public h g(InterfaceC1915k0 interfaceC1915k0) {
        if (!this.f20227e) {
            this.f20226d = interfaceC1915k0;
        }
        return this;
    }

    public void h() {
        if (this.f20227e) {
            return;
        }
        for (C1913j0 c1913j0 : this.f20223a) {
            long j10 = this.f20224b;
            if (j10 >= 0) {
                c1913j0.e(j10);
            }
            Interpolator interpolator = this.f20225c;
            if (interpolator != null) {
                c1913j0.f(interpolator);
            }
            if (this.f20226d != null) {
                c1913j0.g(this.f20228f);
            }
            c1913j0.k();
        }
        this.f20227e = true;
    }
}
