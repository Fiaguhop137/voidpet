package Ke;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.W;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6224a = a.f6225a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f6225a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Function1 f6226b = j.f6223a;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean a(p464ze.f it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return true;
        }

        public final Function1 c() {
            return f6226b;
        }
    }

    public static final class b extends l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f6227b = new b();

        private b() {
        }

        @Override // Ke.l, Ke.k
        public Set b() {
            return W.d();
        }

        @Override // Ke.l, Ke.k
        public Set d() {
            return W.d();
        }

        @Override // Ke.l, Ke.k
        public Set g() {
            return W.d();
        }
    }

    Collection a(p464ze.f fVar, p159ie.b bVar);

    Set b();

    Collection c(p464ze.f fVar, p159ie.b bVar);

    Set d();

    Set g();
}
