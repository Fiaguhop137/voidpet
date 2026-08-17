package p183k3;

import kotlin.jvm.internal.Intrinsics;
import p291q3.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    protected abstract void i(k kVar, Object obj);

    public final void j(Object obj) {
        k kVarB = b();
        try {
            i(kVarB, obj);
            kVarB.b2();
        } finally {
            h(kVarB);
        }
    }

    public final long k(Object obj) {
        k kVarB = b();
        try {
            i(kVarB, obj);
            return kVarB.b2();
        } finally {
            h(kVarB);
        }
    }
}
