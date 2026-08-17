package U1;

import C9.AbstractC0876t;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: U1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1465g {
    public static AbstractC0876t a(B9.f fVar, List list) {
        AbstractC0876t.a aVarL = AbstractC0876t.l();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarL.a(fVar.apply((Bundle) AbstractC1459a.e((Bundle) list.get(i10))));
        }
        return aVarL.k();
    }

    public static ArrayList b(Collection collection, B9.f fVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) fVar.apply(it.next()));
        }
        return arrayList;
    }
}
