package p291q3;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface g extends Closeable {
    Cursor C0(j jVar, CancellationSignal cancellationSignal);

    String H();

    boolean I3();

    void M0();

    void O0(String str, Object[] objArr);

    void P0();

    Cursor Z2(String str);

    void a0();

    List f0();

    void f1();

    void i0(String str);

    boolean isOpen();

    k v2(String str);

    boolean v3();

    Cursor z1(j jVar);
}
