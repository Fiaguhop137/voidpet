package p450z0;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f58225a;

    public /* synthetic */ E(Function2 function2) {
        this.f58225a = function2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return F.e(this.f58225a, obj, obj2);
    }
}
