package If;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f5441a = Logger.getLogger("okio.Okio");

    public static final Y b(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return K.h(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.U(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    public static final Y d(File file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return K.h(new FileOutputStream(file, z10));
    }

    public static final Y e(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new P(outputStream, new b0());
    }

    public static final Y f(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Z z10 = new Z(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        return z10.z(new P(outputStream, z10));
    }

    public static /* synthetic */ Y g(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return K.g(file, z10);
    }

    public static final a0 h(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new C1119v(new FileInputStream(file), b0.f5484e);
    }

    public static final a0 i(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new C1119v(inputStream, new b0());
    }

    public static final a0 j(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Z z10 = new Z(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return z10.A(new C1119v(inputStream, z10));
    }
}
