package p447yf;

import Ad.AbstractC0793c;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IOException f58137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f58138b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f58137a = firstConnectException;
        this.f58138b = firstConnectException;
    }

    public final void a(IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        AbstractC0793c.a(this.f58137a, e10);
        this.f58138b = e10;
    }

    public final IOException b() {
        return this.f58137a;
    }

    public final IOException c() {
        return this.f58138b;
    }
}
