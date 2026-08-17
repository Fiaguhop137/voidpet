package T1;

import U1.AbstractC1459a;
import U1.S;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f12001b = S.z0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12002a;

    public i(String str) {
        this.f12002a = str;
    }

    public static i a(Bundle bundle) {
        return new i((String) AbstractC1459a.e(bundle.getString(f12001b)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f12001b, this.f12002a);
        return bundle;
    }
}
