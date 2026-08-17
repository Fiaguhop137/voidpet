package Ka;

import com.facebook.react.uimanager.I;
import com.facebook.react.uimanager.S;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f6151a;

    public f(b dimmingView) {
        Intrinsics.checkNotNullParameter(dimmingView, "dimmingView");
        this.f6151a = dimmingView;
    }

    @Override // com.facebook.react.uimanager.S
    public I getPointerEvents() {
        return this.f6151a.getBlockGestures$react_native_screens_release() ? I.AUTO : I.NONE;
    }
}
