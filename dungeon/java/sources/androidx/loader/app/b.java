package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.InterfaceC1994q;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p323s.g0;

/* JADX INFO: loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f24396c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1994q f24397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f24398b;

    public static class a extends y implements Q1.b.a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f24399l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Bundle f24400m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Q1.b f24401n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private InterfaceC1994q f24402o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private C0305b f24403p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Q1.b f24404q;

        a(int i10, Bundle bundle, Q1.b bVar, Q1.b bVar2) {
            this.f24399l = i10;
            this.f24400m = bundle;
            this.f24401n = bVar;
            this.f24404q = bVar2;
            bVar.r(i10, this);
        }

        @Override // Q1.b.a
        public void a(Q1.b bVar, Object obj) {
            if (b.f24396c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n(obj);
                return;
            }
            if (b.f24396c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            l(obj);
        }

        @Override // androidx.lifecycle.AbstractC1999w
        protected void j() {
            if (b.f24396c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f24401n.u();
        }

        @Override // androidx.lifecycle.AbstractC1999w
        protected void k() {
            if (b.f24396c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f24401n.v();
        }

        @Override // androidx.lifecycle.AbstractC1999w
        public void m(z zVar) {
            super.m(zVar);
            this.f24402o = null;
            this.f24403p = null;
        }

        @Override // androidx.lifecycle.y, androidx.lifecycle.AbstractC1999w
        public void n(Object obj) {
            super.n(obj);
            Q1.b bVar = this.f24404q;
            if (bVar != null) {
                bVar.s();
                this.f24404q = null;
            }
        }

        Q1.b o(boolean z10) {
            if (b.f24396c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f24401n.b();
            this.f24401n.a();
            C0305b c0305b = this.f24403p;
            if (c0305b != null) {
                m(c0305b);
                if (z10) {
                    c0305b.d();
                }
            }
            this.f24401n.w(this);
            if ((c0305b == null || c0305b.c()) && !z10) {
                return this.f24401n;
            }
            this.f24401n.s();
            return this.f24404q;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f24399l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f24400m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f24401n);
            this.f24401n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f24403p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f24403p);
                this.f24403p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(q().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        Q1.b q() {
            return this.f24401n;
        }

        void r() {
            InterfaceC1994q interfaceC1994q = this.f24402o;
            C0305b c0305b = this.f24403p;
            if (interfaceC1994q == null || c0305b == null) {
                return;
            }
            super.m(c0305b);
            h(interfaceC1994q, c0305b);
        }

        Q1.b s(InterfaceC1994q interfaceC1994q, androidx.loader.app.a.InterfaceC0304a interfaceC0304a) {
            C0305b c0305b = new C0305b(this.f24401n, interfaceC0304a);
            h(interfaceC1994q, c0305b);
            z zVar = this.f24403p;
            if (zVar != null) {
                m(zVar);
            }
            this.f24402o = interfaceC1994q;
            this.f24403p = c0305b;
            return this.f24401n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f24399l);
            sb2.append(" : ");
            Class<?> cls = this.f24401n.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0305b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Q1.b f24405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.loader.app.a.InterfaceC0304a f24406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f24407c = false;

        C0305b(Q1.b bVar, androidx.loader.app.a.InterfaceC0304a interfaceC0304a) {
            this.f24405a = bVar;
            this.f24406b = interfaceC0304a;
        }

        @Override // androidx.lifecycle.z
        public void a(Object obj) {
            if (b.f24396c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f24405a + ": " + this.f24405a.d(obj));
            }
            this.f24407c = true;
            this.f24406b.a(this.f24405a, obj);
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f24407c);
        }

        boolean c() {
            return this.f24407c;
        }

        void d() {
            if (this.f24407c) {
                if (b.f24396c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f24405a);
                }
                this.f24406b.c(this.f24405a);
            }
        }

        public String toString() {
            return this.f24406b.toString();
        }
    }

    static class c extends Q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final S.c f24408d = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g0 f24409b = new g0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f24410c = false;

        static class a implements S.c {
            a() {
            }

            @Override // androidx.lifecycle.S.c
            public Q a(Class cls) {
                return new c();
            }
        }

        c() {
        }

        static c g(T t10) {
            return (c) new S(t10, f24408d).a(c.class);
        }

        @Override // androidx.lifecycle.Q
        protected void d() {
            super.d();
            int iM = this.f24409b.m();
            for (int i10 = 0; i10 < iM; i10++) {
                ((a) this.f24409b.n(i10)).o(true);
            }
            this.f24409b.c();
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f24409b.m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f24409b.m(); i10++) {
                    a aVar = (a) this.f24409b.n(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f24409b.j(i10));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void f() {
            this.f24410c = false;
        }

        a h(int i10) {
            return (a) this.f24409b.f(i10);
        }

        boolean i() {
            return this.f24410c;
        }

        void j() {
            int iM = this.f24409b.m();
            for (int i10 = 0; i10 < iM; i10++) {
                ((a) this.f24409b.n(i10)).r();
            }
        }

        void k(int i10, a aVar) {
            this.f24409b.l(i10, aVar);
        }

        void l() {
            this.f24410c = true;
        }
    }

    b(InterfaceC1994q interfaceC1994q, T t10) {
        this.f24397a = interfaceC1994q;
        this.f24398b = c.g(t10);
    }

    private Q1.b e(int i10, Bundle bundle, androidx.loader.app.a.InterfaceC0304a interfaceC0304a, Q1.b bVar) {
        try {
            this.f24398b.l();
            Q1.b bVarB = interfaceC0304a.b(i10, bundle);
            if (bVarB == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (bVarB.getClass().isMemberClass() && !Modifier.isStatic(bVarB.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bVarB);
            }
            a aVar = new a(i10, bundle, bVarB, bVar);
            if (f24396c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f24398b.k(i10, aVar);
            this.f24398b.f();
            return aVar.s(this.f24397a, interfaceC0304a);
        } catch (Throwable th) {
            this.f24398b.f();
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f24398b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public Q1.b c(int i10, Bundle bundle, androidx.loader.app.a.InterfaceC0304a interfaceC0304a) {
        if (this.f24398b.i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVarH = this.f24398b.h(i10);
        if (f24396c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarH == null) {
            return e(i10, bundle, interfaceC0304a, null);
        }
        if (f24396c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarH);
        }
        return aVarH.s(this.f24397a, interfaceC0304a);
    }

    @Override // androidx.loader.app.a
    public void d() {
        this.f24398b.j();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f24397a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
