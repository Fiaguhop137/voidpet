package p017ag;

import Vf.b;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f19785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f19786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f19787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f19788d;

    public d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, e eVar) {
        this.f19785a = bigInteger3;
        this.f19787c = bigInteger;
        this.f19786b = bigInteger2;
        this.f19788d = eVar;
    }

    public BigInteger a() {
        return this.f19785a;
    }

    public BigInteger b() {
        return this.f19787c;
    }

    public BigInteger c() {
        return this.f19786b;
    }

    public e d() {
        return this.f19788d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.b().equals(this.f19787c) && dVar.c().equals(this.f19786b) && dVar.a().equals(this.f19785a);
    }

    public int hashCode() {
        return (b().hashCode() ^ c().hashCode()) ^ a().hashCode();
    }
}
