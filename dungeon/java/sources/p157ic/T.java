package p157ic;

import Zb.r;
import expo.modules.kotlin.types.b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;

/* JADX INFO: loaded from: classes2.dex */
public final class T implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f43885a;

    public T(List providers) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        this.f43885a = providers;
    }

    @Override // p157ic.a0
    public b a(o type) throws r {
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator it = this.f43885a.iterator();
        while (it.hasNext()) {
            try {
                return ((a0) it.next()).a(type);
            } catch (r unused) {
            }
        }
        throw new r(type);
    }
}
