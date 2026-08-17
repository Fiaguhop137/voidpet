package W1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class q extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f14545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14546c;

    public q(j jVar, int i10, int i11) {
        super(b(i10, i11));
        this.f14545b = jVar;
        this.f14546c = i11;
    }

    public q(IOException iOException, j jVar, int i10, int i11) {
        super(iOException, b(i10, i11));
        this.f14545b = jVar;
        this.f14546c = i11;
    }

    public q(String str, j jVar, int i10, int i11) {
        super(str, b(i10, i11));
        this.f14545b = jVar;
        this.f14546c = i11;
    }

    public q(String str, IOException iOException, j jVar, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f14545b = jVar;
        this.f14546c = i11;
    }

    private static int b(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static q c(IOException iOException, j jVar, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !B9.c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i11 == 2007 ? new p(iOException, jVar) : new q(iOException, jVar, i11, i10);
    }
}
