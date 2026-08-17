package p106ff;

import android.os.Looper;
import java.util.List;
import p088ef.L0;
import p195kf.r;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements r {
    @Override // p195kf.r
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // p195kf.r
    public L0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new e(g.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // p195kf.r
    public int c() {
        return 1073741823;
    }
}
