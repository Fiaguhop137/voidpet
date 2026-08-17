package Yb;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function2 f17754b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f eventName, Function2 body) {
        super(eventName, null);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f17754b = body;
    }

    public final void a(Object obj, Object obj2) {
        this.f17754b.invoke(obj, obj2);
    }
}
