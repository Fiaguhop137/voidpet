package R;

import I.H;
import I.Z0;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;
import p323s.O;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Z0 f9862a = H.j(new g());

    /* JADX INFO: Access modifiers changed from: private */
    public static final e b() {
        return null;
    }

    public static final e c(Map map, Function1 function1) {
        return new f(map, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!CharsKt.b(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final Z0 g() {
        return f9862a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O h(Map map) {
        O o10 = new O(map.size());
        o10.s(map);
        return o10;
    }
}
