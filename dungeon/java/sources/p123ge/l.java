package p123ge;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p302qe.e;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends AbstractC3444h implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f42384c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f fVar, Object[] values) {
        super(fVar, null);
        Intrinsics.checkNotNullParameter(values, "values");
        this.f42384c = values;
    }

    @Override // p302qe.e
    public List c() {
        Object[] objArr = this.f42384c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            AbstractC3444h.a aVar = AbstractC3444h.f42381b;
            Intrinsics.c(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}
