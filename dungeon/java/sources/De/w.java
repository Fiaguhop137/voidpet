package De;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import p015ae.AbstractC1805t;
import p015ae.InterfaceC1788b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w {
    public static final InterfaceC1788b a(Collection descriptors) {
        Integer numD;
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        descriptors.isEmpty();
        Iterator it = descriptors.iterator();
        InterfaceC1788b interfaceC1788b = null;
        while (it.hasNext()) {
            InterfaceC1788b interfaceC1788b2 = (InterfaceC1788b) it.next();
            if (interfaceC1788b == null || ((numD = AbstractC1805t.d(interfaceC1788b.getVisibility(), interfaceC1788b2.getVisibility())) != null && numD.intValue() < 0)) {
                interfaceC1788b = interfaceC1788b2;
            }
        }
        Intrinsics.c(interfaceC1788b);
        return interfaceC1788b;
    }
}
