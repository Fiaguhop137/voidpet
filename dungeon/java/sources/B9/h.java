package B9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f612e;

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f613a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f614b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            a f615c;

            a() {
            }
        }

        private b(String str) {
            a aVar = new a();
            this.f609b = aVar;
            this.f610c = aVar;
            this.f611d = false;
            this.f612e = false;
            this.f608a = (String) n.j(str);
        }

        /* synthetic */ b(String str, a aVar) {
            this(str);
        }

        private a a() {
            a aVar = new a();
            this.f610c.f615c = aVar;
            this.f610c = aVar;
            return aVar;
        }

        private b b(Object obj) {
            a().f614b = obj;
            return this;
        }

        private static boolean d(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof k) {
                return !((k) obj).c();
            }
            return obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b c(Object obj) {
            return b(obj);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002c  */
        /* JADX WARN: Code duplicated, block: B:13:0x0033  */
        /* JADX WARN: Code duplicated, block: B:18:0x0059  */
        public String toString() {
            String str;
            boolean z10 = this.f611d;
            boolean z11 = this.f612e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f608a);
            sb2.append('{');
            String str2 = "";
            for (a aVar = this.f609b.f615c; aVar != null; aVar = aVar.f615c) {
                Object obj = aVar.f614b;
                if (obj == null) {
                    if (!z10) {
                        sb2.append(str2);
                        str = aVar.f613a;
                        if (str != null) {
                            sb2.append(str);
                            sb2.append('=');
                        }
                        if (obj == null && obj.getClass().isArray()) {
                            String strDeepToString = Arrays.deepToString(new Object[]{obj});
                            sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                        } else {
                            sb2.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z11 || !d(obj)) {
                    sb2.append(str2);
                    str = aVar.f613a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append('=');
                    }
                    if (obj == null) {
                        sb2.append(obj);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName(), null);
    }
}
