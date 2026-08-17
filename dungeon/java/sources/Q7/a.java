package Q7;

import N7.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f9509e = new C0157a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f9510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f9511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f9512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9513d;

    /* JADX INFO: renamed from: Q7.a$a, reason: collision with other inner class name */
    public static final class C0157a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f9514a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f9515b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f9516c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f9517d = "";

        C0157a() {
        }

        public C0157a a(d dVar) {
            this.f9515b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f9514a, Collections.unmodifiableList(this.f9515b), this.f9516c, this.f9517d);
        }

        public C0157a c(String str) {
            this.f9517d = str;
            return this;
        }

        public C0157a d(b bVar) {
            this.f9516c = bVar;
            return this;
        }

        public C0157a e(f fVar) {
            this.f9514a = fVar;
            return this;
        }
    }

    a(f fVar, List list, b bVar, String str) {
        this.f9510a = fVar;
        this.f9511b = list;
        this.f9512c = bVar;
        this.f9513d = str;
    }

    public static C0157a e() {
        return new C0157a();
    }

    public String a() {
        return this.f9513d;
    }

    public b b() {
        return this.f9512c;
    }

    public List c() {
        return this.f9511b;
    }

    public f d() {
        return this.f9510a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
