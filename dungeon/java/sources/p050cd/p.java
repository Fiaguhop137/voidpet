package p050cd;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class p implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f27453b;

    private p(String str, k kVar) {
        Objects.requireNonNull(str, "value must not be null");
        this.f27452a = d(str);
        Objects.requireNonNull(kVar, "params must not be null");
        this.f27453b = kVar;
    }

    private static String d(String str) {
        if (str.length() == 0) {
            throw new IllegalArgumentException("Token can not be empty");
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ((i10 == 0 && cCharAt != '*' && !r.c(cCharAt)) || cCharAt <= ' ' || cCharAt >= 127 || "\"(),;<=>?@[\\]{}".indexOf(cCharAt) >= 0) {
                throw new IllegalArgumentException(String.format("Invalid character in Token at position %d: '%c' (0x%04x)", Integer.valueOf(i10), Character.valueOf(cCharAt), Integer.valueOf(cCharAt)));
            }
        }
        return str;
    }

    public static p f(String str) {
        return new p(str, k.f27443b);
    }

    @Override // p050cd.l
    public k b() {
        return this.f27453b;
    }

    @Override // p050cd.q
    public StringBuilder c(StringBuilder sb2) {
        sb2.append(this.f27452a);
        this.f27453b.q(sb2);
        return sb2;
    }

    @Override // p199l1.j
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get() {
        return this.f27452a;
    }

    @Override // p050cd.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public p a(k kVar) {
        Objects.requireNonNull(kVar, "params must not be null");
        return kVar.isEmpty() ? this : new p(this.f27452a, kVar);
    }
}
