package expo.modules.kotlin.jni;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(List list) {
        Iterator it = list.iterator();
        int iG = 0;
        while (it.hasNext()) {
            iG |= ((JavaScriptObject.a) it.next()).g();
        }
        return iG;
    }
}
