package R3;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f10668a = new HashSet();

    N() {
    }

    public boolean a(M m10, boolean z10) {
        if (!z10) {
            return this.f10668a.remove(m10);
        }
        if (Build.VERSION.SDK_INT >= m10.f10667a) {
            return this.f10668a.add(m10);
        }
        p077e4.g.c(String.format("%s is not supported pre SDK %d", m10.name(), Integer.valueOf(m10.f10667a)));
        return false;
    }

    public boolean b(M m10) {
        return this.f10668a.contains(m10);
    }
}
