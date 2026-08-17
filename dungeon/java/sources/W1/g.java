package W1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class g extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14473a;

    public g(int i10) {
        this.f14473a = i10;
    }

    public g(String str, int i10) {
        super(str);
        this.f14473a = i10;
    }

    public g(String str, Throwable th, int i10) {
        super(str, th);
        this.f14473a = i10;
    }

    public g(Throwable th, int i10) {
        super(th);
        this.f14473a = i10;
    }

    public static boolean a(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof g) && ((g) cause).f14473a == 2008) {
                return true;
            }
        }
        return false;
    }
}
