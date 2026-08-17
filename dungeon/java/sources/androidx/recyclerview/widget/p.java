package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f25345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f25346b = new a();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25347a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f25350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f25351e;

        a() {
        }

        void a(int i10) {
            this.f25347a = i10 | this.f25347a;
        }

        boolean b() {
            int i10 = this.f25347a;
            if ((i10 & 7) != 0 && (i10 & c(this.f25350d, this.f25348b)) == 0) {
                return false;
            }
            int i11 = this.f25347a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f25350d, this.f25349c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f25347a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f25351e, this.f25348b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f25347a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f25351e, this.f25349c) << 12)) != 0;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f25347a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f25348b = i10;
            this.f25349c = i11;
            this.f25350d = i12;
            this.f25351e = i13;
        }
    }

    interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    p(b bVar) {
        this.f25345a = bVar;
    }

    View a(int i10, int i11, int i12, int i13) {
        int iC = this.f25345a.c();
        int iD = this.f25345a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f25345a.a(i10);
            this.f25346b.e(iC, iD, this.f25345a.b(viewA), this.f25345a.e(viewA));
            if (i12 != 0) {
                this.f25346b.d();
                this.f25346b.a(i12);
                if (this.f25346b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.f25346b.d();
                this.f25346b.a(i13);
                if (this.f25346b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    boolean b(View view, int i10) {
        this.f25346b.e(this.f25345a.c(), this.f25345a.d(), this.f25345a.b(view), this.f25345a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f25346b.d();
        this.f25346b.a(i10);
        return this.f25346b.b();
    }
}
