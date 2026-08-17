package V4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class h extends HashSet {
    private h(Set set) {
        super(set);
    }

    public static h c(Object... objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        Collections.addAll(hashSet, objArr);
        return new h(hashSet);
    }
}
