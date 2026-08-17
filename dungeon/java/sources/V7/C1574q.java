package V7;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: V7.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1574q implements M.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q7.c.b f14214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14215c;

    public /* synthetic */ C1574q(String str, Q7.c.b bVar, long j10) {
        this.f14213a = str;
        this.f14214b = bVar;
        this.f14215c = j10;
    }

    @Override // V7.M.b
    public final Object apply(Object obj) {
        return M.K(this.f14213a, this.f14214b, this.f14215c, (SQLiteDatabase) obj);
    }
}
