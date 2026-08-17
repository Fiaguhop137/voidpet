package V7;

import android.database.Cursor;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z implements M.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f14225a;

    public /* synthetic */ z(Map map) {
        this.f14225a = map;
    }

    @Override // V7.M.b
    public final Object apply(Object obj) {
        return M.L(this.f14225a, (Cursor) obj);
    }
}
