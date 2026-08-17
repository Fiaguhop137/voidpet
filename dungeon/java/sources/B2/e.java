package B2;

import R1.z;
import U1.F;
import p380v2.O;

/* JADX INFO: loaded from: classes.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final O f552a;

    public static final class a extends z {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    protected e(O o10) {
        this.f552a = o10;
    }

    public final boolean a(F f10, long j10) {
        return b(f10) && c(f10, j10);
    }

    protected abstract boolean b(F f10);

    protected abstract boolean c(F f10, long j10);
}
