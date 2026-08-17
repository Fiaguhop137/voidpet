package Ja;

import Ia.C1096b;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.H;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f5755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f5756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f5757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f5758h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C1096b handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f5755e = handler.L();
        this.f5756f = handler.M();
        this.f5757g = handler.J();
        this.f5758h = handler.K();
    }

    @Override // Ja.b
    public void a(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", H.g(this.f5755e));
        eventData.putDouble("y", H.g(this.f5756f));
        eventData.putDouble("absoluteX", H.g(this.f5757g));
        eventData.putDouble("absoluteY", H.g(this.f5758h));
    }
}
