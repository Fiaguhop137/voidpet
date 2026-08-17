package Yb;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f17753b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f eventName, Function1 body) {
        super(eventName, null);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f17753b = body;
    }

    public final void a(Object obj) {
        this.f17753b.invoke(obj);
    }
}
