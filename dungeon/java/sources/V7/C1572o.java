package V7;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: V7.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1572o implements M.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f14210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N7.o f14211b;

    public /* synthetic */ C1572o(long j10, N7.o oVar) {
        this.f14210a = j10;
        this.f14211b = oVar;
    }

    @Override // V7.M.b
    public final Object apply(Object obj) {
        return M.p(this.f14210a, this.f14211b, (SQLiteDatabase) obj);
    }
}
