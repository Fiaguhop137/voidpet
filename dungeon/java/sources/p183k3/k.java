package p183k3;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f47869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f47870b;

    public k(q database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f47869a = database;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f47870b = setNewSetFromMap;
    }
}
