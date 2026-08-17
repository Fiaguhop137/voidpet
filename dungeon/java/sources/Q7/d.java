package Q7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f9535c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f9537b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9538a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f9539b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f9538a, Collections.unmodifiableList(this.f9539b));
        }

        public a b(List list) {
            this.f9539b = list;
            return this;
        }

        public a c(String str) {
            this.f9538a = str;
            return this;
        }
    }

    d(String str, List list) {
        this.f9536a = str;
        this.f9537b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f9537b;
    }

    public String b() {
        return this.f9536a;
    }
}
