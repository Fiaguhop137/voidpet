package p220m4;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: m4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0582a {
        void a(Bitmap bitmap);

        byte[] b(int i10);

        Bitmap c(int i10, int i11, Bitmap.Config config);

        int[] d(int i10);

        void e(byte[] bArr);

        void f(int[] iArr);
    }

    int a();

    Bitmap b();

    void c();

    void clear();

    void d(Bitmap.Config config);

    int e();

    void f();

    int g();

    int h();

    ByteBuffer n();
}
