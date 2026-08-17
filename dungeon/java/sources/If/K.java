package If;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes3.dex */
public abstract class K {
    public static final Y a(File file) {
        return L.b(file);
    }

    public static final Y b() {
        return M.a();
    }

    public static final InterfaceC1107i c(Y y10) {
        return M.b(y10);
    }

    public static final InterfaceC1108j d(a0 a0Var) {
        return M.c(a0Var);
    }

    public static final boolean e(AssertionError assertionError) {
        return L.c(assertionError);
    }

    public static final AbstractC1113o f(AbstractC1113o abstractC1113o, Q q10) {
        return N.a(abstractC1113o, q10);
    }

    public static final Y g(File file, boolean z10) {
        return L.d(file, z10);
    }

    public static final Y h(OutputStream outputStream) {
        return L.e(outputStream);
    }

    public static final Y i(Socket socket) {
        return L.f(socket);
    }

    public static final a0 k(File file) {
        return L.h(file);
    }

    public static final a0 l(InputStream inputStream) {
        return L.i(inputStream);
    }

    public static final a0 m(Socket socket) {
        return L.j(socket);
    }
}
