package Yb;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f17751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f eventName, Function0 body) {
        super(eventName, null);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f17751b = body;
    }

    public final void a() {
        this.f17751b.invoke();
    }
}
