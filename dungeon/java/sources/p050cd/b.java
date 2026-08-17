package p050cd;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f27432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f27433b;

    private b(byte[] bArr, k kVar) {
        Objects.requireNonNull(bArr, "value must not be null");
        this.f27432a = bArr;
        Objects.requireNonNull(kVar, "params must not be null");
        this.f27433b = kVar;
    }

    public static b e(byte[] bArr) {
        return new b(bArr, k.f27443b);
    }

    @Override // p050cd.l
    public k b() {
        return this.f27433b;
    }

    @Override // p050cd.q
    public StringBuilder c(StringBuilder sb2) {
        sb2.append(':');
        sb2.append(Base64.encodeToString(this.f27432a, 0));
        sb2.append(':');
        this.f27433b.q(sb2);
        return sb2;
    }

    @Override // p199l1.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ByteBuffer get() {
        return ByteBuffer.wrap(this.f27432a);
    }

    @Override // p050cd.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b a(k kVar) {
        Objects.requireNonNull(kVar, "params must not be null");
        return kVar.isEmpty() ? this : new b(this.f27432a, kVar);
    }
}
