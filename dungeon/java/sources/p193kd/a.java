package p193kd;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ReactMarker.MarkerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f48042a;

    public /* synthetic */ a(e eVar) {
        this.f48042a = eVar;
    }

    @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
    public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
        e.e(this.f48042a, reactMarkerConstants, str, i10);
    }
}
