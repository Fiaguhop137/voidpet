package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1986i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1986i f24341a = new C1986i();

    /* JADX INFO: renamed from: androidx.lifecycle.i$a */
    public static final class a implements n3.f.a {
        @Override // n3.f.a
        public void a(p237n3.i owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof U)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            T tG = ((U) owner).g();
            p237n3.f fVarI = owner.i();
            Iterator it = tG.c().iterator();
            while (it.hasNext()) {
                Q qB = tG.b((String) it.next());
                if (qB != null) {
                    C1986i.a(qB, fVarI, owner.y());
                }
            }
            if (tG.c().isEmpty()) {
                return;
            }
            fVarI.d(a.class);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.i$b */
    public static final class b implements InterfaceC1991n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1987j f24342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p237n3.f f24343b;

        b(AbstractC1987j abstractC1987j, p237n3.f fVar) {
            this.f24342a = abstractC1987j;
            this.f24343b = fVar;
        }

        @Override // androidx.lifecycle.InterfaceC1991n
        public void f(InterfaceC1994q source, AbstractC1987j.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC1987j.a.ON_START) {
                this.f24342a.d(this);
                this.f24343b.d(a.class);
            }
        }
    }

    private C1986i() {
    }

    public static final void a(Q viewModel, p237n3.f registry, AbstractC1987j lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        I i10 = (I) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (i10 == null || i10.c()) {
            return;
        }
        i10.a(registry, lifecycle);
        f24341a.c(registry, lifecycle);
    }

    public static final I b(p237n3.f registry, AbstractC1987j lifecycle, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.c(str);
        I i10 = new I(str, G.f24280c.a(registry.a(str), bundle));
        i10.a(registry, lifecycle);
        f24341a.c(registry, lifecycle);
        return i10;
    }

    private final void c(p237n3.f fVar, AbstractC1987j abstractC1987j) {
        AbstractC1987j.b bVarB = abstractC1987j.b();
        if (bVarB == AbstractC1987j.b.INITIALIZED || bVarB.g(AbstractC1987j.b.STARTED)) {
            fVar.d(a.class);
        } else {
            abstractC1987j.a(new b(abstractC1987j, fVar));
        }
    }
}
