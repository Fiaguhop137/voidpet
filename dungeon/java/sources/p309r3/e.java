package p309r3;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import p291q3.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements DatabaseErrorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.a f52157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d.b f52158b;

    public /* synthetic */ e(h.a aVar, d.b bVar) {
        this.f52157a = aVar;
        this.f52158b = bVar;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        d.c.b(this.f52157a, this.f52158b, sQLiteDatabase);
    }
}
