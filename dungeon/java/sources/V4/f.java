package V4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f extends ArrayList {
    private f(int i10) {
        super(i10);
    }

    private f(List list) {
        super(list);
    }

    public static f c(List list) {
        return new f(list);
    }

    public static f e(Object... objArr) {
        f fVar = new f(objArr.length);
        Collections.addAll(fVar, objArr);
        return fVar;
    }
}
