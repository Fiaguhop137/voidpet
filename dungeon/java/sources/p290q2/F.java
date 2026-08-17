package p290q2;

import R1.I;
import U1.AbstractC1459a;
import Z1.v1;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v1[] f51223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y[] f51224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I f51225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f51226e;

    public F(v1[] v1VarArr, y[] yVarArr, I i10, Object obj) {
        AbstractC1459a.a(v1VarArr.length == yVarArr.length);
        this.f51223b = v1VarArr;
        this.f51224c = (y[]) yVarArr.clone();
        this.f51225d = i10;
        this.f51226e = obj;
        this.f51222a = v1VarArr.length;
    }

    public boolean a(F f10) {
        if (f10 == null || f10.f51224c.length != this.f51224c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f51224c.length; i10++) {
            if (!b(f10, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(F f10, int i10) {
        return f10 != null && Objects.equals(this.f51223b[i10], f10.f51223b[i10]) && Objects.equals(this.f51224c[i10], f10.f51224c[i10]);
    }

    public boolean c(int i10) {
        return this.f51223b[i10] != null;
    }
}
