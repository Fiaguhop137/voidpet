package Oa;

import Ad.v;
import kotlin.Pair;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final Pair a(Na.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return v.a(event.getEventName(), N.k(v.a("registrationName", event.a())));
    }
}
