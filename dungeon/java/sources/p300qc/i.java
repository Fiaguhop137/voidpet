package p300qc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f51770a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f51771b = new ArrayList();

    private i() {
    }

    public final void a(Function0 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        f51771b.remove(observer);
    }

    public final void b() {
        Iterator it = f51771b.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    public final void c(Function0 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        f51771b.add(observer);
    }
}
