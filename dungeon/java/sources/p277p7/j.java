package p277p7;

import com.facebook.soloader.B;
import com.facebook.soloader.C;
import com.facebook.soloader.C2302c;
import com.facebook.soloader.C2305f;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50860a;

    public j(int i10) {
        this.f50860a = i10;
    }

    private boolean b(E[] eArr, String str) {
        for (E e10 : eArr) {
            if (e10 instanceof C2302c) {
                C2302c c2302c = (C2302c) e10;
                try {
                    p.b("SoLoader", "Preparing BackupSoSource for the first time " + c2302c.c());
                    c2302c.e(0);
                    for (E e11 : eArr) {
                        if ((e11 instanceof C2305f) && !(e11 instanceof C2302c)) {
                            ((C2305f) e11).h();
                        }
                    }
                    return true;
                } catch (Exception e12) {
                    p.c("SoLoader", "Encountered an exception while reunpacking BackupSoSource " + c2302c.c() + " for library " + str + ": ", e12);
                    break;
                }
            }
        }
        return false;
    }

    private void c(Error error, String str) {
        p.b("SoLoader", "Reunpacking BackupSoSources due to " + error + ", retrying for specific library " + str);
    }

    private boolean d(E[] eArr, String str, int i10) {
        try {
            for (E e10 : eArr) {
                if ((e10 instanceof C2302c) && ((C2302c) e10).x(str, i10)) {
                    return true;
                }
            }
            return false;
        } catch (IOException e11) {
            p.b("SoLoader", "Failed to run recovery for backup so source due to: " + e11);
            return false;
        }
    }

    @Override // p277p7.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C)) {
            return false;
        }
        C c10 = (C) unsatisfiedLinkError;
        String strA = c10.a();
        String message = c10.getMessage();
        if (strA == null) {
            p.b("SoLoader", "No so name provided in ULE, cannot recover");
            return false;
        }
        if (c10 instanceof B) {
            if ((this.f50860a & 1) == 0) {
                return false;
            }
            c(c10, strA);
            return d(eArr, strA, 0);
        }
        if (message == null || !(message.contains("/app/") || message.contains("/mnt/"))) {
            return false;
        }
        c(c10, strA);
        return b(eArr, strA);
    }
}
