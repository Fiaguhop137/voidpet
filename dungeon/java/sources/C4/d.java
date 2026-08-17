package C4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p274p4.k;
import p310r4.v;

/* JADX INFO: loaded from: classes.dex */
public class d implements k {
    @Override // p274p4.k
    public p274p4.c b(p274p4.h hVar) {
        return p274p4.c.SOURCE;
    }

    @Override // p274p4.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(v vVar, File file, p274p4.h hVar) throws Throwable {
        try {
            L4.a.f(((c) vVar.get()).c(), file);
            return true;
        } catch (IOException e10) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            return false;
        }
    }
}
