package p237n3;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p273p3.b;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f49899c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f49900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f49901b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(i iVar) {
            iVar.y().a(new b(iVar));
            return Unit.f48228a;
        }

        public final h b(i owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new h(new b(owner, new g(owner)), null);
        }
    }

    private h(b bVar) {
        this.f49900a = bVar;
        this.f49901b = new f(bVar);
    }

    public /* synthetic */ h(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    public static final h a(i iVar) {
        return f49899c.b(iVar);
    }

    public final f b() {
        return this.f49901b;
    }

    public final void c() {
        this.f49900a.f();
    }

    public final void d(Bundle bundle) {
        this.f49900a.h(bundle);
    }

    public final void e(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.f49900a.i(outBundle);
    }
}
