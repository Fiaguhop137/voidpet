package io.sentry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: io.sentry.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3815w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f46677a = new ArrayList();

    /* JADX INFO: renamed from: io.sentry.w0$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46678a;

        static {
            int[] iArr = new int[io.sentry.vendor.gson.stream.b.values().length];
            f46678a = iArr;
            try {
                iArr[io.sentry.vendor.gson.stream.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46678a[io.sentry.vendor.gson.stream.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46678a[io.sentry.vendor.gson.stream.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46678a[io.sentry.vendor.gson.stream.b.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46678a[io.sentry.vendor.gson.stream.b.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46678a[io.sentry.vendor.gson.stream.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46678a[io.sentry.vendor.gson.stream.b.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f46678a[io.sentry.vendor.gson.stream.b.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f46678a[io.sentry.vendor.gson.stream.b.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f46678a[io.sentry.vendor.gson.stream.b.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: io.sentry.w0$b */
    interface b {
        Object a();
    }

    /* JADX INFO: renamed from: io.sentry.w0$c */
    private interface c {
        Object getValue();
    }

    /* JADX INFO: renamed from: io.sentry.w0$d */
    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList f46679a;

        private d() {
            this.f46679a = new ArrayList();
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // io.sentry.C3815w0.c
        public Object getValue() {
            return this.f46679a;
        }
    }

    /* JADX INFO: renamed from: io.sentry.w0$e */
    private static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final HashMap f46680a;

        private e() {
            this.f46680a = new HashMap();
        }

        /* synthetic */ e(a aVar) {
            this();
        }

        @Override // io.sentry.C3815w0.c
        public Object getValue() {
            return this.f46680a;
        }
    }

    /* JADX INFO: renamed from: io.sentry.w0$f */
    private static final class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f46681a;

        f(String str) {
            this.f46681a = str;
        }

        @Override // io.sentry.C3815w0.c
        public Object getValue() {
            return this.f46681a;
        }
    }

    /* JADX INFO: renamed from: io.sentry.w0$g */
    private static final class g implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f46682a;

        g(Object obj) {
            this.f46682a = obj;
        }

        @Override // io.sentry.C3815w0.c
        public Object getValue() {
            return this.f46682a;
        }
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    private c f() {
        if (this.f46677a.isEmpty()) {
            return null;
        }
        ArrayList arrayList = this.f46677a;
        return (c) arrayList.get(arrayList.size() - 1);
    }

    private boolean g() {
        if (i()) {
            return true;
        }
        c cVarF = f();
        l();
        if (!(f() instanceof f)) {
            if (!(f() instanceof d)) {
                return false;
            }
            d dVar = (d) f();
            if (cVarF == null || dVar == null) {
                return false;
            }
            dVar.f46679a.add(cVarF.getValue());
            return false;
        }
        f fVar = (f) f();
        l();
        e eVar = (e) f();
        if (fVar == null || cVarF == null || eVar == null) {
            return false;
        }
        eVar.f46680a.put(fVar.f46681a, cVarF.getValue());
        return false;
    }

    private boolean h(b bVar) {
        Object objA = bVar.a();
        if (f() == null && objA != null) {
            m(new g(objA));
            return true;
        }
        if (f() instanceof f) {
            f fVar = (f) f();
            l();
            ((e) f()).f46680a.put(fVar.f46681a, objA);
            return false;
        }
        if (!(f() instanceof d)) {
            return false;
        }
        ((d) f()).f46679a.add(objA);
        return false;
    }

    private boolean i() {
        return this.f46677a.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object j(C3820x0 c3820x0) {
        try {
            try {
                return Integer.valueOf(c3820x0.nextInt());
            } catch (Exception unused) {
                return Double.valueOf(c3820x0.nextDouble());
            }
        } catch (Exception unused2) {
            return Long.valueOf(c3820x0.nextLong());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void k(C3820x0 c3820x0) throws IOException {
        boolean zG;
        switch (a.f46678a[c3820x0.peek().ordinal()]) {
            case 1:
                c3820x0.N();
                m(new d(null));
                zG = false;
                break;
            case 2:
                c3820x0.J();
                zG = g();
                break;
            case 3:
                c3820x0.I();
                m(new e(null));
                zG = false;
                break;
            case 4:
                c3820x0.T();
                zG = g();
                break;
            case 5:
                m(new f(c3820x0.X0()));
                zG = false;
                break;
            case 6:
                zG = h(new C3783s0(c3820x0));
                break;
            case 7:
                zG = h(new C3788t0(this, c3820x0));
                break;
            case 8:
                zG = h(new C3795u0(c3820x0));
                break;
            case 9:
                c3820x0.b();
                zG = h(new C3810v0());
                break;
            case 10:
                zG = true;
                break;
            default:
                zG = false;
                break;
        }
        if (zG) {
            return;
        }
        k(c3820x0);
    }

    private void l() {
        if (this.f46677a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f46677a;
        arrayList.remove(arrayList.size() - 1);
    }

    private void m(c cVar) {
        this.f46677a.add(cVar);
    }

    public Object e(C3820x0 c3820x0) throws IOException {
        k(c3820x0);
        c cVarF = f();
        if (cVarF != null) {
            return cVarF.getValue();
        }
        return null;
    }
}
