package T1;

import U1.S;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f11995d = S.z0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f11996e = S.z0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f11997f = S.z0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12000c;

    public h(int i10, int i11, int i12) {
        this.f11998a = i10;
        this.f11999b = i11;
        this.f12000c = i12;
    }

    public static h a(Bundle bundle) {
        return new h(bundle.getInt(f11995d), bundle.getInt(f11996e), bundle.getInt(f11997f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f11995d, this.f11998a);
        bundle.putInt(f11996e, this.f11999b);
        bundle.putInt(f11997f, this.f12000c);
        return bundle;
    }
}
