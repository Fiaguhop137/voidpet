package Cd;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1[] f1832a;

    public /* synthetic */ b(Function1[] function1Arr) {
        this.f1832a = function1Arr;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return c.c(this.f1832a, obj, obj2);
    }
}
