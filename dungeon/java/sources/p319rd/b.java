package p319rd;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements ReactMarker.MarkerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f52444a;

    public /* synthetic */ b(d dVar) {
        this.f52444a = dVar;
    }

    @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
    public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
        d.f(this.f52444a, reactMarkerConstants, str, i10);
    }
}
