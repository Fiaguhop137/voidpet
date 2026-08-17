package p050cd;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class o implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f27451b;

    private o(String str, k kVar) {
        Objects.requireNonNull(str, "value must not be null");
        this.f27450a = d(str);
        Objects.requireNonNull(kVar, "params must not be null");
        this.f27451b = kVar;
    }

    private static String d(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < ' ' || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format("Invalid character in String at position %d: '%c' (0x%04x)", Integer.valueOf(i10), Character.valueOf(cCharAt), Integer.valueOf(cCharAt)));
            }
        }
        return str;
    }

    public static o f(String str) {
        return new o(str, k.f27443b);
    }

    @Override // p050cd.l
    public k b() {
        return this.f27451b;
    }

    @Override // p050cd.q
    public StringBuilder c(StringBuilder sb2) {
        sb2.append('\"');
        for (int i10 = 0; i10 < this.f27450a.length(); i10++) {
            char cCharAt = this.f27450a.charAt(i10);
            if (cCharAt == '\\' || cCharAt == '\"') {
                sb2.append('\\');
            }
            sb2.append(cCharAt);
        }
        sb2.append('\"');
        this.f27451b.q(sb2);
        return sb2;
    }

    @Override // p199l1.j
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get() {
        return this.f27450a;
    }

    @Override // p050cd.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public o a(k kVar) {
        Objects.requireNonNull(kVar, "params must not be null");
        return kVar.isEmpty() ? this : new o(this.f27450a, kVar);
    }
}
