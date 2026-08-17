package p170j8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: j8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3851p {

    /* JADX INFO: renamed from: j8.p$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f47016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f47017b;

        /* synthetic */ a(Object obj, byte[] bArr) {
            r.l(obj);
            this.f47017b = obj;
            this.f47016a = new ArrayList();
        }

        public a a(String str, Object obj) {
            r.l(str);
            int length = str.length();
            String strValueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(length + 1 + strValueOf.length());
            sb2.append(str);
            sb2.append("=");
            sb2.append(strValueOf);
            this.f47016a.add(sb2.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f47017b.getClass().getSimpleName());
            sb2.append('{');
            List list = this.f47016a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) list.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
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

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
