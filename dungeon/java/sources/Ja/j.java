package Ja;

import Ia.B;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.H;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f5791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f5792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f5793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f5794h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(B handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f5791e = handler.L();
        this.f5792f = handler.M();
        this.f5793g = handler.J();
        this.f5794h = handler.K();
    }

    @Override // Ja.b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", H.g(this.f5791e));
        eventData.putDouble("y", H.g(this.f5792f));
        eventData.putDouble("absoluteX", H.g(this.f5793g));
        eventData.putDouble("absoluteY", H.g(this.f5794h));
    }
}
