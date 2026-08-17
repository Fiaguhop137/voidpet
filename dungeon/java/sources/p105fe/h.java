package p105fe;

import kotlin.text.StringsKt;
import p464ze.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(b bVar) {
        String strH = StringsKt.H(bVar.g().a(), '.', '$', false, 4, null);
        if (bVar.f().c()) {
            return strH;
        }
        return bVar.f() + '.' + strH;
    }
}
