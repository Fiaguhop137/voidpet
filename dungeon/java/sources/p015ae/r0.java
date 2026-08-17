package p015ae;

import Ad.n;
import Ad.v;
import Ve.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p464ze.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 {
    private r0() {
    }

    public /* synthetic */ r0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean a(f fVar);

    public final r0 b(Function1 transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (this instanceof A) {
            A a10 = (A) this;
            return new A(a10.c(), (j) transform.invoke(a10.d()));
        }
        if (!(this instanceof I)) {
            throw new n();
        }
        List<Pair> listC = ((I) this).c();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(listC, 10));
        for (Pair pair : listC) {
            arrayList.add(v.a((f) pair.getFirst(), transform.invoke((j) pair.getSecond())));
        }
        return new I(arrayList);
    }
}
