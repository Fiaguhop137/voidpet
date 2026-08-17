package Ja;

import Ia.AbstractC1098d;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5762d;

    public b(AbstractC1098d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f5759a = handler.O();
        this.f5760b = handler.T();
        this.f5761c = handler.S();
        this.f5762d = handler.Q();
    }

    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        eventData.putInt("numberOfPointers", this.f5759a);
        eventData.putInt("handlerTag", this.f5760b);
        eventData.putInt("state", this.f5761c);
        eventData.putInt("pointerType", this.f5762d);
    }
}
