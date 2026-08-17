package Qb;

import android.app.Activity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements p245nb.b, p227mb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f9556a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p173jb.b f9557b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Activity activity) {
        activity.getWindow().addFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Activity activity) {
        activity.getWindow().clearFlags(128);
    }

    private final Activity k() throws p209lb.d {
        p173jb.b bVar = this.f9557b;
        if (bVar == null) {
            Intrinsics.r("moduleRegistry");
            bVar = null;
        }
        p227mb.a aVar = (p227mb.a) bVar.b(p227mb.a.class);
        if (aVar == null) {
            throw new p209lb.d();
        }
        if (aVar.a() == null) {
            throw new p209lb.d();
        }
        Activity activityA = aVar.a();
        Intrinsics.c(activityA);
        return activityA;
    }

    @Override // p245nb.b
    public boolean a() {
        return !this.f9556a.isEmpty();
    }

    @Override // p245nb.b
    public void b(String tag, Runnable done) throws p209lb.d {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(done, "done");
        Activity activityK = k();
        if (!a()) {
            activityK.runOnUiThread(new c(activityK));
        }
        this.f9556a.add(tag);
        done.run();
    }

    @Override // p245nb.b
    public void c(String tag, Runnable done) throws p209lb.d {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(done, "done");
        Activity activityK = k();
        if (this.f9556a.size() == 1 && this.f9556a.contains(tag)) {
            activityK.runOnUiThread(new b(activityK));
        }
        this.f9556a.remove(tag);
        done.run();
    }

    @Override // p227mb.k
    public void f(p173jb.b moduleRegistry) {
        Intrinsics.checkNotNullParameter(moduleRegistry, "moduleRegistry");
        this.f9557b = moduleRegistry;
    }

    @Override // p227mb.d
    public List h() {
        return CollectionsKt.e(p245nb.b.class);
    }
}
