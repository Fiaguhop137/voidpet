package p462zc;

import Ic.b;
import Ic.c;
import Ic.j;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p227mb.d;

/* JADX INFO: loaded from: classes2.dex */
public class a implements b, d {
    private Bundle c(b bVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("opensAppToForeground", bVar.j());
        Bundle bundle2 = new Bundle();
        bundle2.putString("identifier", bVar.f());
        bundle2.putString("buttonTitle", bVar.getTitle());
        bundle2.putBundle("options", bundle);
        if (!(bVar instanceof j)) {
            bundle2.putBundle("textInput", null);
            return bundle2;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("placeholder", ((j) bVar).k());
        bundle2.putBundle("textInput", bundle3);
        return bundle2;
    }

    private ArrayList e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c((b) it.next()));
        }
        return arrayList;
    }

    @Override // p462zc.b
    public Bundle a(c cVar) {
        if (cVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("identifier", b(cVar));
        bundle.putParcelableArrayList("actions", e(cVar.f()));
        bundle.putBundle("options", new Bundle());
        return bundle;
    }

    protected String b(c cVar) {
        return cVar.j();
    }

    @Override // p227mb.d
    public List h() {
        return Collections.singletonList(b.class);
    }
}
