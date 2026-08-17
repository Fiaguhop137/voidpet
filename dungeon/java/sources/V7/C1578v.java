package V7;

import android.database.Cursor;
import java.util.List;

/* JADX INFO: renamed from: V7.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1578v implements M.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f14222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f14223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N7.o f14224c;

    public /* synthetic */ C1578v(M m10, List list, N7.o oVar) {
        this.f14222a = m10;
        this.f14223b = list;
        this.f14224c = oVar;
    }

    @Override // V7.M.b
    public final Object apply(Object obj) {
        return M.P(this.f14222a, this.f14223b, this.f14224c, (Cursor) obj);
    }
}
