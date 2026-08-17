package p015ae;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T {
    public static final void a(O o10, c fqName, Collection packageFragments) {
        Intrinsics.checkNotNullParameter(o10, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        if (o10 instanceof U) {
            ((U) o10).b(fqName, packageFragments);
        } else {
            packageFragments.addAll(o10.c(fqName));
        }
    }

    public static final boolean b(O o10, c fqName) {
        Intrinsics.checkNotNullParameter(o10, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return o10 instanceof U ? ((U) o10).a(fqName) : c(o10, fqName).isEmpty();
    }

    public static final List c(O o10, c fqName) {
        Intrinsics.checkNotNullParameter(o10, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        a(o10, fqName, arrayList);
        return arrayList;
    }
}
