package p309r3;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;
import p291q3.k;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SQLiteStatement f52160b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f52160b = delegate;
    }

    @Override // p291q3.k
    public long b2() {
        return this.f52160b.executeInsert();
    }

    @Override // p291q3.k
    public int n0() {
        return this.f52160b.executeUpdateDelete();
    }
}
