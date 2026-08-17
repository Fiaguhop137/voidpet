package p101fa;

import K9.C1135c;
import K9.InterfaceC1136d;
import K9.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class b implements i {
    public static /* synthetic */ Object b(String str, C1135c c1135c, InterfaceC1136d interfaceC1136d) {
        try {
            c.b(str);
            return c1135c.h().a(interfaceC1136d);
        } finally {
            c.a();
        }
    }

    @Override // K9.i
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C1135c c1135cR : componentRegistrar.getComponents()) {
            String strI = c1135cR.i();
            if (strI != null) {
                c1135cR = c1135cR.r(new a(strI, c1135cR));
            }
            arrayList.add(c1135cR);
        }
        return arrayList;
    }
}
