package L8;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: renamed from: L8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1142c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6459c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6460d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6461e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6462f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6463g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f6457a = null;

    public C1142c(int i10, IBinder iBinder) {
        this.f6458b = i10;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("popupLocationInfo.gravity", this.f6458b);
        bundle.putInt("popupLocationInfo.displayId", this.f6459c);
        bundle.putInt("popupLocationInfo.left", this.f6460d);
        bundle.putInt("popupLocationInfo.top", this.f6461e);
        bundle.putInt("popupLocationInfo.right", this.f6462f);
        bundle.putInt("popupLocationInfo.bottom", this.f6463g);
        return bundle;
    }
}
