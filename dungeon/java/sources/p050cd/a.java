package p050cd;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f27428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f27429d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f27431b;

    static {
        k kVar = k.f27443b;
        f27428c = new a(true, kVar);
        f27429d = new a(false, kVar);
    }

    private a(boolean z10, k kVar) {
        this.f27430a = z10;
        Objects.requireNonNull(kVar, "params must not be null");
        this.f27431b = kVar;
    }

    public static a e(boolean z10) {
        return z10 ? f27428c : f27429d;
    }

    @Override // p050cd.l
    public k b() {
        return this.f27431b;
    }

    @Override // p050cd.q
    public StringBuilder c(StringBuilder sb2) {
        sb2.append(this.f27430a ? "?1" : "?0");
        this.f27431b.q(sb2);
        return sb2;
    }

    @Override // p199l1.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(this.f27430a);
    }

    @Override // p050cd.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a a(k kVar) {
        Objects.requireNonNull(kVar, "params must not be null");
        return kVar.isEmpty() ? this : new a(this.f27430a, kVar);
    }
}
