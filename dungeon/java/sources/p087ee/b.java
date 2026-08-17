package p087ee;

import kotlin.jvm.internal.Intrinsics;
import p015ae.w0;
import p015ae.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f40741c = new b();

    private b() {
        super("protected_and_package", true);
    }

    @Override // p015ae.x0
    public Integer a(x0 visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        if (Intrinsics.b(this, visibility)) {
            return 0;
        }
        if (visibility == w0.b.f19763c) {
            return null;
        }
        return w0.f19759a.b(visibility) ? 1 : -1;
    }

    @Override // p015ae.x0
    public String b() {
        return "protected/*protected and package*/";
    }

    @Override // p015ae.x0
    public x0 d() {
        return w0.g.f19768c;
    }
}
