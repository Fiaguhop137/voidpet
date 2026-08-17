package p277p7;

import android.content.Context;
import com.facebook.soloader.C;
import com.facebook.soloader.C2302c;
import com.facebook.soloader.C2305f;
import com.facebook.soloader.E;
import com.facebook.soloader.G;
import com.facebook.soloader.p;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f50851a;

    public c(Context context) {
        this.f50851a = context;
    }

    @Override // p277p7.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C)) {
            return false;
        }
        p.b("SoLoader", "Checking /data/app missing libraries.");
        File file = new File(this.f50851a.getApplicationInfo().nativeLibraryDir);
        if (!file.exists()) {
            p.b("SoLoader", "Native library directory " + file + " does not exist, exiting /data/app recovery.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (E e10 : eArr) {
            if (e10 instanceof C2302c) {
                C2302c c2302c = (C2302c) e10;
                try {
                    for (G.c cVar : c2302c.o()) {
                        if (!new File(file, cVar.f31329a).exists()) {
                            arrayList.add(cVar.f31329a);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        p.b("SoLoader", "Missing libraries from " + file + ": " + arrayList.toString() + ", will run prepare on tbe backup so source");
                        c2302c.e(0);
                        break;
                    }
                    p.b("SoLoader", "No libraries missing from " + file);
                    return false;
                } catch (Exception e11) {
                    p.c("SoLoader", "Encountered an exception while recovering from /data/app failure ", e11);
                    return false;
                }
            }
        }
        for (E e12 : eArr) {
            if ((e12 instanceof C2305f) && !(e12 instanceof C2302c)) {
                ((C2305f) e12).h();
            }
        }
        p.b("SoLoader", "Successfully recovered from /data/app disk failure.");
        return true;
    }
}
