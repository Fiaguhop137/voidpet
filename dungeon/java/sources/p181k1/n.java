package p181k1;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f47795a = new e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f47796b = new e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f47797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f47798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f47799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f47800f;

    private static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final a f47801b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f47802a;

        private a(boolean z10) {
            this.f47802a = z10;
        }

        @Override // k1.n.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iA = n.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                    } else if (!this.f47802a) {
                        return 1;
                    }
                    i10++;
                    z10 = z10;
                } else if (this.f47802a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f47802a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f47803a = new b();

        private b() {
        }

        @Override // k1.n.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = n.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    private static abstract class d implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f47804a;

        d(c cVar) {
            this.f47804a = cVar;
        }

        private boolean b(CharSequence charSequence, int i10, int i11) {
            int iA = this.f47804a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        protected abstract boolean a();

        @Override // p181k1.m
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f47804a == null ? a() : b(charSequence, i10, i11);
        }
    }

    private static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f47805b;

        e(c cVar, boolean z10) {
            super(cVar);
            this.f47805b = z10;
        }

        @Override // k1.n.d
        protected boolean a() {
            return this.f47805b;
        }
    }

    private static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f f47806b = new f();

        f() {
            super(null);
        }

        @Override // k1.n.d
        protected boolean a() {
            return o.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f47803a;
        f47797c = new e(bVar, false);
        f47798d = new e(bVar, true);
        f47799e = new e(a.f47801b, false);
        f47800f = f.f47806b;
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
