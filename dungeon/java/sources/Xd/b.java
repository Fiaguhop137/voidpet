package Xd;

import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.H;
import p015ae.O;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16257a = a.f16258a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f16258a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Lazy f16259b = Ad.j.a(Ad.m.PUBLICATION, Xd.a.f16256a);

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b a() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(b.class, b.class.getClassLoader());
            Intrinsics.c(serviceLoaderLoad);
            b bVar = (b) CollectionsKt.k0(serviceLoaderLoad);
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }

        public final b c() {
            return (b) f16259b.getValue();
        }
    }

    O a(Qe.n nVar, H h10, Iterable iterable, p051ce.c cVar, p051ce.a aVar, boolean z10);
}
