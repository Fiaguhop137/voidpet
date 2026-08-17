package p248ne;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.W;
import kotlin.jvm.internal.Intrinsics;
import p302qe.n;
import p302qe.w;
import p464ze.f;

/* JADX INFO: renamed from: ne.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4031c {

    /* JADX INFO: renamed from: ne.c$a */
    public static final class a implements InterfaceC4031c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50218a = new a();

        private a() {
        }

        @Override // p248ne.InterfaceC4031c
        public Set a() {
            return W.d();
        }

        @Override // p248ne.InterfaceC4031c
        public Set c() {
            return W.d();
        }

        @Override // p248ne.InterfaceC4031c
        public Set d() {
            return W.d();
        }

        @Override // p248ne.InterfaceC4031c
        public n e(f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        @Override // p248ne.InterfaceC4031c
        public w f(f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        @Override // p248ne.InterfaceC4031c
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public List b(f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return CollectionsKt.l();
        }
    }

    Set a();

    Collection b(f fVar);

    Set c();

    Set d();

    n e(f fVar);

    w f(f fVar);
}
