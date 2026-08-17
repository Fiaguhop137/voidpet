package p183k3;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import p291q3.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    protected abstract void i(k kVar, Object obj);

    public final int j(Object obj) {
        k kVarB = b();
        try {
            i(kVarB, obj);
            return kVarB.n0();
        } finally {
            h(kVarB);
        }
    }

    public final int k(Iterable entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        k kVarB = b();
        try {
            Iterator it = entities.iterator();
            int iN0 = 0;
            while (it.hasNext()) {
                i(kVarB, it.next());
                iN0 += kVarB.n0();
            }
            h(kVarB);
            return iN0;
        } catch (Throwable th) {
            h(kVarB);
            throw th;
        }
    }
}
