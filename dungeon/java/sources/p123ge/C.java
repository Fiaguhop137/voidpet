package p123ge;

import Ie.e;
import Xd.l;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p302qe.v;

/* JADX INFO: loaded from: classes3.dex */
public final class C extends E implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f42347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection f42348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f42349d;

    public C(Class reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f42347b = reflectType;
        this.f42348c = CollectionsKt.l();
    }

    @Override // p302qe.InterfaceC4075d
    public boolean E() {
        return this.f42349d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p123ge.E
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public Class Q() {
        return this.f42347b;
    }

    @Override // p302qe.InterfaceC4075d
    public Collection getAnnotations() {
        return this.f42348c;
    }

    @Override // p302qe.v
    public l getType() {
        if (Intrinsics.b(Q(), Void.TYPE)) {
            return null;
        }
        return e.h(Q().getName()).p();
    }
}
