package Ka;

import com.facebook.react.uimanager.I;
import com.facebook.react.uimanager.S;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f6152a;

    public g(f fVar) {
        this.f6152a = fVar;
    }

    public final void a(f fVar) {
        this.f6152a = fVar;
    }

    @Override // com.facebook.react.uimanager.S
    public I getPointerEvents() {
        I pointerEvents;
        f fVar = this.f6152a;
        return (fVar == null || (pointerEvents = fVar.getPointerEvents()) == null) ? I.NONE : pointerEvents;
    }
}
