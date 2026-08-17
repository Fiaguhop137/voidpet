package p410we;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p374ue.r;
import p374ue.u;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f56909a;

    public h(u typeTable) {
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List listU = typeTable.u();
        if (typeTable.v()) {
            int iR = typeTable.r();
            List listU2 = typeTable.u();
            Intrinsics.checkNotNullExpressionValue(listU2, "getTypeList(...)");
            ArrayList arrayList = new ArrayList(CollectionsKt.w(listU2, 10));
            int i10 = 0;
            for (Object obj : listU2) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.v();
                }
                r rVarN = (r) obj;
                if (i10 >= iR) {
                    rVarN = rVarN.toBuilder().E(true).build();
                }
                arrayList.add(rVarN);
                i10 = i11;
            }
            listU = arrayList;
        }
        Intrinsics.checkNotNullExpressionValue(listU, "run(...)");
        this.f56909a = listU;
    }

    public final r a(int i10) {
        return (r) this.f56909a.get(i10);
    }
}
