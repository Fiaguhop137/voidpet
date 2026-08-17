package V7;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class K implements M.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f14155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14157c;

    public /* synthetic */ K(M m10, String str, String str2) {
        this.f14155a = m10;
        this.f14156b = str;
        this.f14157c = str2;
    }

    @Override // V7.M.b
    public final Object apply(Object obj) {
        return M.m(this.f14155a, this.f14156b, this.f14157c, (SQLiteDatabase) obj);
    }
}
