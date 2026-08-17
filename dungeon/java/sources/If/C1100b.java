package If;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: If.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1100b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1100b f5482a = new C1100b();

    private C1100b() {
    }

    public final InterfaceC1107i a(Y sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return K.c(sink);
    }

    public final InterfaceC1108j b(a0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return K.d(source);
    }

    public final Y c(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return L.g(file, false, 1, null);
    }

    public final Y d(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        return K.h(outputStream);
    }

    public final a0 e(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        return K.l(inputStream);
    }
}
