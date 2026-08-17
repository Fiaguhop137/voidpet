package K9;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class r extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f6125a;

    public r(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f6125a = list;
    }
}
