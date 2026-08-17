package O5;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f8392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Z4.a f8393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f8394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8396e;

    f(c cVar) {
        this.f8392a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e a() {
        try {
            return new e(this);
        } finally {
            Z4.a.g(this.f8393b);
            this.f8393b = null;
            Z4.a.h(this.f8394c);
            this.f8394c = null;
        }
    }

    public p186k6.a b() {
        return null;
    }

    public List c() {
        return Z4.a.f(this.f8394c);
    }

    public int d() {
        return this.f8395d;
    }

    public c e() {
        return this.f8392a;
    }

    public Z4.a f() {
        return Z4.a.e(this.f8393b);
    }

    public String g() {
        return this.f8396e;
    }

    public f h(p186k6.a aVar) {
        return this;
    }

    public f i(List list) {
        this.f8394c = Z4.a.f(list);
        return this;
    }

    public f j(int i10) {
        this.f8395d = i10;
        return this;
    }

    public f k(Z4.a aVar) {
        this.f8393b = Z4.a.e(aVar);
        return this;
    }

    public f l(String str) {
        this.f8396e = str;
        return this;
    }
}
