package V7;

import android.database.sqlite.SQLiteDatabase;
import java.util.Map;

/* JADX INFO: renamed from: V7.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1575s implements M.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f14217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f14219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q7.a.C0157a f14220d;

    public /* synthetic */ C1575s(M m10, String str, Map map, Q7.a.C0157a c0157a) {
        this.f14217a = m10;
        this.f14218b = str;
        this.f14219c = map;
        this.f14220d = c0157a;
    }

    @Override // V7.M.b
    public final Object apply(Object obj) {
        return M.U(this.f14217a, this.f14218b, this.f14219c, this.f14220d, (SQLiteDatabase) obj);
    }
}
