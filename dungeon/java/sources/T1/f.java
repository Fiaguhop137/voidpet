package T1;

import U1.AbstractC1459a;
import U1.S;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f11991c = S.z0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f11992d = S.z0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11994b;

    public f(String str, int i10) {
        this.f11993a = str;
        this.f11994b = i10;
    }

    public static f a(Bundle bundle) {
        return new f((String) AbstractC1459a.e(bundle.getString(f11991c)), bundle.getInt(f11992d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f11991c, this.f11993a);
        bundle.putInt(f11992d, this.f11994b);
        return bundle;
    }
}
