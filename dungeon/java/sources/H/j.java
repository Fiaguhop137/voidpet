package H;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4079a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f4080b = new LinkedHashMap();

    public final a a(l rippleHostView) {
        Intrinsics.checkNotNullParameter(rippleHostView, "rippleHostView");
        return (a) this.f4080b.get(rippleHostView);
    }

    public final l b(a indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        return (l) this.f4079a.get(indicationInstance);
    }

    public final void c(a indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        l lVar = (l) this.f4079a.get(indicationInstance);
        if (lVar != null) {
        }
        this.f4079a.remove(indicationInstance);
    }

    public final void d(a indicationInstance, l rippleHostView) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        Intrinsics.checkNotNullParameter(rippleHostView, "rippleHostView");
        this.f4079a.put(indicationInstance, rippleHostView);
        this.f4080b.put(rippleHostView, indicationInstance);
    }
}
