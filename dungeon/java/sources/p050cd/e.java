package p050cd;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class e implements h, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f27439b;

    private e(List list, k kVar) {
        Objects.requireNonNull(list, "value must not be null");
        this.f27438a = list;
        Objects.requireNonNull(kVar, "params must not be null");
        this.f27439b = kVar;
    }

    public static e e(List list) {
        return new e(list, k.f27443b);
    }

    @Override // p050cd.l
    public k b() {
        return this.f27439b;
    }

    @Override // p050cd.q
    public StringBuilder c(StringBuilder sb2) {
        sb2.append('(');
        String str = "";
        for (g gVar : this.f27438a) {
            sb2.append(str);
            gVar.c(sb2);
            str = " ";
        }
        sb2.append(')');
        this.f27439b.q(sb2);
        return sb2;
    }

    @Override // p199l1.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List get() {
        return this.f27438a;
    }

    public e f(k kVar) {
        Objects.requireNonNull(kVar, "params must not be null");
        return kVar.isEmpty() ? this : new e(this.f27438a, kVar);
    }
}
