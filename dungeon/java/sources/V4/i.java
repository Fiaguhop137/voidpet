package V4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f14055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0194a f14056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C0194a f14057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f14058d;

        /* JADX INFO: renamed from: V4.i$a$a, reason: collision with other inner class name */
        private static final class C0194a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f14059a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f14060b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            C0194a f14061c;

            private C0194a() {
            }

            /* synthetic */ C0194a(j jVar) {
                this();
            }
        }

        private a(String str) {
            C0194a c0194a = new C0194a(null);
            this.f14056b = c0194a;
            this.f14057c = c0194a;
            this.f14058d = false;
            this.f14055a = (String) k.g(str);
        }

        /* synthetic */ a(String str, j jVar) {
            this(str);
        }

        private C0194a d() {
            C0194a c0194a = new C0194a(null);
            this.f14057c.f14061c = c0194a;
            this.f14057c = c0194a;
            return c0194a;
        }

        private a e(String str, Object obj) {
            C0194a c0194aD = d();
            c0194aD.f14060b = obj;
            c0194aD.f14059a = (String) k.g(str);
            return this;
        }

        public a a(String str, int i10) {
            return e(str, String.valueOf(i10));
        }

        public a b(String str, Object obj) {
            return e(str, obj);
        }

        public a c(String str, boolean z10) {
            return e(str, String.valueOf(z10));
        }

        public String toString() {
            boolean z10 = this.f14058d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f14055a);
            sb2.append('{');
            String str = "";
            for (C0194a c0194a = this.f14056b.f14061c; c0194a != null; c0194a = c0194a.f14061c) {
                Object obj = c0194a.f14060b;
                if (!z10 || obj != null) {
                    sb2.append(str);
                    String str2 = c0194a.f14059a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static a b(Object obj) {
        return new a(obj.getClass().getSimpleName(), null);
    }
}
