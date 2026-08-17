package Ye;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17831a;

    public static final class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f17832b = new a();

        private a() {
            super(false, null);
        }
    }

    public static final class b extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f17833b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String error) {
            super(false, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f17833b = error;
        }
    }

    public static final class c extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f17834b = new c();

        private c() {
            super(true, null);
        }
    }

    private g(boolean z10) {
        this.f17831a = z10;
    }

    public /* synthetic */ g(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    public final boolean a() {
        return this.f17831a;
    }
}
