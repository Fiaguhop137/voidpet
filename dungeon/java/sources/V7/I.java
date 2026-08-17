package V7;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class I implements M.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f14153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14154b;

    public /* synthetic */ I(M m10, long j10) {
        this.f14153a = m10;
        this.f14154b = j10;
    }

    @Override // V7.M.b
    public final Object apply(Object obj) {
        return M.O(this.f14153a, this.f14154b, (SQLiteDatabase) obj);
    }
}
