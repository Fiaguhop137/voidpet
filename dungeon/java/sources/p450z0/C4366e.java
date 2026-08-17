package p450z0;

import java.util.Comparator;
import p019b0.g;

/* JADX INFO: renamed from: z0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C4366e implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4366e f58245a = new C4366e();

    private C4366e() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(r rVar, r rVar2) {
        g gVarL = rVar.l();
        g gVarL2 = rVar2.l();
        int iCompare = Float.compare(gVarL.e(), gVarL2.e());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(gVarL.h(), gVarL2.h());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(gVarL.c(), gVarL2.c());
        return iCompare3 != 0 ? iCompare3 : Float.compare(gVarL.f(), gVarL2.f());
    }
}
