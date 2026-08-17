package Ja;

import Ia.x;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.H;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f5787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f5788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f5789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f5790h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f5787e = handler.Y0();
        this.f5788f = handler.W0();
        this.f5789g = handler.X0();
        this.f5790h = handler.Z0();
    }

    @Override // Ja.b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("rotation", this.f5787e);
        eventData.putDouble("anchorX", H.g(this.f5788f));
        eventData.putDouble("anchorY", H.g(this.f5789g));
        eventData.putDouble("velocity", this.f5790h);
    }
}
