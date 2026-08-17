package U6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: U6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1484c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f13257c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f13258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f13259b = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: U6.c$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1484c(boolean z10) {
        this.f13258a = z10;
    }

    public final void a(String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        W4.a.I("BridgelessReact", state);
        if (this.f13258a) {
            this.f13259b.add(state);
        }
    }
}
