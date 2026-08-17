package p382v4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f56211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Map f56212d;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f56213d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Map f56214e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f56215a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f56216b = f56214e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f56217c = true;

        static {
            String strG = g();
            f56213d = strG;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strG)) {
                map.put("User-Agent", Collections.singletonList(new b(strG)));
            }
            f56214e = Collections.unmodifiableMap(map);
        }

        private Map d() {
            HashMap map = new HashMap(this.f56216b.size());
            for (Map.Entry entry : this.f56216b.entrySet()) {
                map.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            return map;
        }

        private void e() {
            if (this.f56215a) {
                this.f56215a = false;
                this.f56216b = d();
            }
        }

        private List f(String str) {
            List list = (List) this.f56216b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f56216b.put(str, arrayList);
            return arrayList;
        }

        static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public a a(String str, String str2) {
            return b(str, new b(str2));
        }

        public a b(String str, j jVar) {
            if (this.f56217c && "User-Agent".equalsIgnoreCase(str)) {
                return h(str, jVar);
            }
            e();
            f(str).add(jVar);
            return this;
        }

        public k c() {
            this.f56215a = true;
            return new k(this.f56216b);
        }

        public a h(String str, j jVar) {
            e();
            if (jVar == null) {
                this.f56216b.remove(str);
            } else {
                List listF = f(str);
                listF.clear();
                listF.add(jVar);
            }
            if (this.f56217c && "User-Agent".equalsIgnoreCase(str)) {
                this.f56217c = false;
            }
            return this;
        }
    }

    static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f56218a;

        b(String str) {
            this.f56218a = str;
        }

        @Override // p382v4.j
        public String a() {
            return this.f56218a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f56218a.equals(((b) obj).f56218a);
            }
            return false;
        }

        public int hashCode() {
            return this.f56218a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f56218a + "'}";
        }
    }

    k(Map map) {
        this.f56211c = Collections.unmodifiableMap(map);
    }

    private String b(List list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strA = ((j) list.get(i10)).a();
            if (!TextUtils.isEmpty(strA)) {
                sb2.append(strA);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    private Map c() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f56211c.entrySet()) {
            String strB = b((List) entry.getValue());
            if (!TextUtils.isEmpty(strB)) {
                map.put(entry.getKey(), strB);
            }
        }
        return map;
    }

    @Override // p382v4.i
    public Map a() {
        if (this.f56212d == null) {
            synchronized (this) {
                try {
                    if (this.f56212d == null) {
                        this.f56212d = Collections.unmodifiableMap(c());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f56212d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f56211c.equals(((k) obj).f56211c);
        }
        return false;
    }

    public int hashCode() {
        return this.f56211c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f56211c + '}';
    }
}
