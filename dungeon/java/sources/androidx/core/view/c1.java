package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f23189a;

    private static class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Window f23190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final O f23191b;

        a(Window window, O o10) {
            this.f23190a = window;
            this.f23191b = o10;
        }

        private void i(int i10) {
            if (i10 == 1) {
                j(4);
            } else if (i10 == 2) {
                j(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f23191b.a();
            }
        }

        private void l(int i10) {
            if (i10 == 1) {
                m(4);
                n(1024);
            } else if (i10 == 2) {
                m(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f23191b.b();
            }
        }

        @Override // androidx.core.view.c1.g
        int a() {
            Object tag = this.f23190a.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.c1.g
        void b(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    i(i11);
                }
            }
        }

        @Override // androidx.core.view.c1.g
        void g(int i10) {
            this.f23190a.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                m(6144);
                return;
            }
            if (i10 == 1) {
                m(4096);
                j(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                m(2048);
                j(4096);
            }
        }

        @Override // androidx.core.view.c1.g
        void h(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    l(i11);
                }
            }
        }

        protected void j(int i10) {
            View decorView = this.f23190a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void k(int i10) {
            this.f23190a.addFlags(i10);
        }

        protected void m(int i10) {
            View decorView = this.f23190a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void n(int i10) {
            this.f23190a.clearFlags(i10);
        }
    }

    private static class b extends a {
        b(Window window, O o10) {
            super(window, o10);
        }

        @Override // androidx.core.view.c1.g
        public boolean d() {
            return (this.f23190a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.c1.g
        public void f(boolean z10) {
            if (!z10) {
                m(8192);
                return;
            }
            n(67108864);
            k(Integer.MIN_VALUE);
            j(8192);
        }
    }

    private static class c extends b {
        c(Window window, O o10) {
            super(window, o10);
        }

        @Override // androidx.core.view.c1.g
        public boolean c() {
            return (this.f23190a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.c1.g
        public void e(boolean z10) {
            if (!z10) {
                m(16);
                return;
            }
            n(134217728);
            k(Integer.MIN_VALUE);
            j(16);
        }
    }

    private static class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c1 f23192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WindowInsetsController f23193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final O f23194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p323s.f0 f23195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected Window f23196e;

        d(Window window, c1 c1Var, O o10) {
            this(window.getInsetsController(), c1Var, o10);
            this.f23196e = window;
        }

        d(WindowInsetsController windowInsetsController, c1 c1Var, O o10) {
            this.f23195d = new p323s.f0();
            this.f23193b = windowInsetsController;
            this.f23192a = c1Var;
            this.f23194c = o10;
        }

        @Override // androidx.core.view.c1.g
        int a() {
            Window window = this.f23196e;
            if (window == null) {
                return this.f23193b.getSystemBarsBehavior();
            }
            Object tag = window.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.c1.g
        void b(int i10) {
            if ((i10 & 8) != 0) {
                this.f23194c.a();
            }
            this.f23193b.hide(i10 & (-9));
        }

        @Override // androidx.core.view.c1.g
        public boolean c() {
            this.f23193b.setSystemBarsAppearance(0, 0);
            return (this.f23193b.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.c1.g
        public boolean d() {
            this.f23193b.setSystemBarsAppearance(0, 0);
            return (this.f23193b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.c1.g
        public void e(boolean z10) {
            if (z10) {
                if (this.f23196e != null) {
                    i(16);
                }
                this.f23193b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f23196e != null) {
                    j(16);
                }
                this.f23193b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.c1.g
        public void f(boolean z10) {
            if (z10) {
                if (this.f23196e != null) {
                    i(8192);
                }
                this.f23193b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f23196e != null) {
                    j(8192);
                }
                this.f23193b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.c1.g
        void g(int i10) {
            Window window = this.f23196e;
            if (window == null) {
                this.f23193b.setSystemBarsBehavior(i10);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                j(6144);
                return;
            }
            if (i10 == 1) {
                j(4096);
                i(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                j(2048);
                i(4096);
            }
        }

        @Override // androidx.core.view.c1.g
        void h(int i10) {
            if ((i10 & 8) != 0) {
                this.f23194c.b();
            }
            this.f23193b.show(i10 & (-9));
        }

        protected void i(int i10) {
            View decorView = this.f23196e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void j(int i10) {
            View decorView = this.f23196e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    private static class e extends d {
        e(Window window, c1 c1Var, O o10) {
            super(window, c1Var, o10);
        }

        e(WindowInsetsController windowInsetsController, c1 c1Var, O o10) {
            super(windowInsetsController, c1Var, o10);
        }

        @Override // androidx.core.view.c1.d, androidx.core.view.c1.g
        int a() {
            return this.f23193b.getSystemBarsBehavior();
        }

        @Override // androidx.core.view.c1.d, androidx.core.view.c1.g
        void g(int i10) {
            this.f23193b.setSystemBarsBehavior(i10);
        }
    }

    private static class f extends e {
        f(Window window, c1 c1Var, O o10) {
            super(window, c1Var, o10);
        }

        f(WindowInsetsController windowInsetsController, c1 c1Var, O o10) {
            super(windowInsetsController, c1Var, o10);
        }

        @Override // androidx.core.view.c1.d, androidx.core.view.c1.g
        public boolean c() {
            return (this.f23193b.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.c1.d, androidx.core.view.c1.g
        public boolean d() {
            return (this.f23193b.getSystemBarsAppearance() & 8) != 0;
        }
    }

    private static class g {
        g() {
        }

        abstract int a();

        abstract void b(int i10);

        public boolean c() {
            return false;
        }

        public abstract boolean d();

        public void e(boolean z10) {
        }

        public abstract void f(boolean z10);

        abstract void g(int i10);

        abstract void h(int i10);
    }

    public c1(Window window, View view) {
        O o10 = new O(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f23189a = new f(window, this, o10);
            return;
        }
        if (i10 >= 30) {
            this.f23189a = new d(window, this, o10);
        } else if (i10 >= 26) {
            this.f23189a = new c(window, o10);
        } else {
            this.f23189a = new b(window, o10);
        }
    }

    private c1(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f23189a = new f(windowInsetsController, this, new O(windowInsetsController));
        } else {
            this.f23189a = new d(windowInsetsController, this, new O(windowInsetsController));
        }
    }

    public static c1 i(WindowInsetsController windowInsetsController) {
        return new c1(windowInsetsController);
    }

    public int a() {
        return this.f23189a.a();
    }

    public void b(int i10) {
        this.f23189a.b(i10);
    }

    public boolean c() {
        return this.f23189a.c();
    }

    public boolean d() {
        return this.f23189a.d();
    }

    public void e(boolean z10) {
        this.f23189a.e(z10);
    }

    public void f(boolean z10) {
        this.f23189a.f(z10);
    }

    public void g(int i10) {
        this.f23189a.g(i10);
    }

    public void h(int i10) {
        this.f23189a.h(i10);
    }
}
