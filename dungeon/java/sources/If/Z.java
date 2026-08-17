package If;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class Z extends C1104f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Socket f5479o;

    public Z(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f5479o = socket;
    }

    @Override // If.C1104f
    protected void B() {
        try {
            this.f5479o.close();
        } catch (AssertionError e10) {
            if (!K.e(e10)) {
                throw e10;
            }
            L.f5441a.log(Level.WARNING, "Failed to close timed out socket " + this.f5479o, (Throwable) e10);
        } catch (Exception e11) {
            L.f5441a.log(Level.WARNING, "Failed to close timed out socket " + this.f5479o, (Throwable) e11);
        }
    }

    @Override // If.C1104f
    protected IOException x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
