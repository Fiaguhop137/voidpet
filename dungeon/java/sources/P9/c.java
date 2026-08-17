package P9;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8867b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f8869b = null;

        b(String str) {
            this.f8868a = str;
        }

        public c a() {
            return new c(this.f8868a, this.f8869b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f8869b)), null);
        }

        public b b(Annotation annotation) {
            if (this.f8869b == null) {
                this.f8869b = new HashMap();
            }
            this.f8869b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    private c(String str, Map map) {
        this.f8866a = str;
        this.f8867b = map;
    }

    /* synthetic */ c(String str, Map map, a aVar) {
        this(str, map);
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.f8866a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f8867b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f8866a.equals(cVar.f8866a) && this.f8867b.equals(cVar.f8867b);
    }

    public int hashCode() {
        return (this.f8866a.hashCode() * 31) + this.f8867b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f8866a + ", properties=" + this.f8867b.values() + "}";
    }
}
