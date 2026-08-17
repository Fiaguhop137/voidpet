package p050cd;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class j implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27442a;

    private j(List list) {
        Objects.requireNonNull(list, "value must not be null");
        this.f27442a = list;
    }

    public static j f(List list) {
        return new j(list);
    }

    @Override // p050cd.q
    public StringBuilder c(StringBuilder sb2) {
        String str = "";
        for (h hVar : this.f27442a) {
            sb2.append(str);
            hVar.c(sb2);
            str = ", ";
        }
        return sb2;
    }

    @Override // p199l1.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List get() {
        return this.f27442a;
    }

    public String e() {
        return c(new StringBuilder()).toString();
    }
}
