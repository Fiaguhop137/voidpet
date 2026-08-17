package p017ag;

import Ug.g;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Vf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f19776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f19777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f19778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BigInteger f19779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f19782g;

    public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10, int i11, BigInteger bigInteger4, c cVar) {
        if (i11 != 0) {
            if (i11 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i11 < i10) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i10 > bigInteger.bitLength() && !g.b("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.f19776a = bigInteger2;
        this.f19777b = bigInteger;
        this.f19778c = bigInteger3;
        this.f19780e = i10;
        this.f19781f = i11;
        this.f19779d = bigInteger4;
        this.f19782g = cVar;
    }

    public BigInteger a() {
        return this.f19776a;
    }

    public BigInteger b() {
        return this.f19777b;
    }

    public BigInteger c() {
        return this.f19778c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (c() != null) {
            if (!c().equals(bVar.c())) {
                return false;
            }
        } else if (bVar.c() != null) {
            return false;
        }
        return bVar.b().equals(this.f19777b) && bVar.a().equals(this.f19776a);
    }

    public int hashCode() {
        return (b().hashCode() ^ a().hashCode()) ^ (c() != null ? c().hashCode() : 0);
    }
}
