package E3;

import K3.o;
import android.content.Context;
import android.content.res.Resources;
import p435y3.C;
import p435y3.D;

/* JADX INFO: loaded from: classes.dex */
public final class e implements c {
    private final boolean b(int i10, Context context) {
        try {
            return context.getResources().getResourceEntryName(i10) != null;
        } catch (Resources.NotFoundException unused) {
        }
    }

    @Override // E3.c
    public /* bridge */ /* synthetic */ Object a(Object obj, o oVar) {
        return c(((Number) obj).intValue(), oVar);
    }

    public C c(int i10, o oVar) {
        if (!b(i10, oVar.c())) {
            return null;
        }
        return D.j("android.resource://" + oVar.c().getPackageName() + '/' + i10, null, 1, null);
    }
}
