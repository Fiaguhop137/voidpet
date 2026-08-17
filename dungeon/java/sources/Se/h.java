package Se;

import Re.S;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.G;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final G f11614a = new G("KotlinTypeRefiner");

    public static final G a() {
        return f11614a;
    }

    public static final List b(g gVar, Iterable types) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(types, "types");
        ArrayList arrayList = new ArrayList(CollectionsKt.w(types, 10));
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.a((S) it.next()));
        }
        return arrayList;
    }
}
