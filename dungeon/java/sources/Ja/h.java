package Ja;

import Ia.u;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.H;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f5783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f5784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f5785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f5786h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f5783e = handler.b1();
        this.f5784f = handler.Z0();
        this.f5785g = handler.a1();
        this.f5786h = handler.c1();
    }

    @Override // Ja.b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("scale", this.f5783e);
        eventData.putDouble("focalX", H.g(this.f5784f));
        eventData.putDouble("focalY", H.g(this.f5785g));
        eventData.putDouble("velocity", this.f5786h);
    }
}
