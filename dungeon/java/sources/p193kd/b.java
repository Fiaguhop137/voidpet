package p193kd;

import com.facebook.react.bridge.JSExceptionHandler;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements JSExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f48043a;

    public /* synthetic */ b(e eVar) {
        this.f48043a = eVar;
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public final void handleException(Exception exc) {
        e.p(this.f48043a, exc);
    }
}
