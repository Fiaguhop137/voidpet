package p087ee;

import kotlin.jvm.internal.Intrinsics;
import p015ae.w0;
import p015ae.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40740c = new a();

    private a() {
        super("package", false);
    }

    @Override // p015ae.x0
    public Integer a(x0 visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        return w0.f19759a.b(visibility) ? 1 : -1;
    }

    @Override // p015ae.x0
    public String b() {
        return "public/*package*/";
    }

    @Override // p015ae.x0
    public x0 d() {
        return w0.g.f19768c;
    }
}
