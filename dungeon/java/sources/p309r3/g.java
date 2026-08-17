package p309r3;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;
import p291q3.i;

/* JADX INFO: loaded from: classes.dex */
public class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteProgram f52159a;

    public g(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f52159a = delegate;
    }

    @Override // p291q3.i
    public void N2(int i10, long j10) {
        this.f52159a.bindLong(i10, j10);
    }

    @Override // p291q3.i
    public void R2(int i10, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f52159a.bindBlob(i10, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f52159a.close();
    }

    @Override // p291q3.i
    public void n2(int i10, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f52159a.bindString(i10, value);
    }

    @Override // p291q3.i
    public void q3(int i10) {
        this.f52159a.bindNull(i10);
    }

    @Override // p291q3.i
    public void w0(int i10, double d10) {
        this.f52159a.bindDouble(i10, d10);
    }
}
