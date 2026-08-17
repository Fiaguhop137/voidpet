package p088ef;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends kotlin.coroutines.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40786c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40787b;

    public static final class a implements CoroutineContext.b {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public N(String str) {
        super(f40786c);
        this.f40787b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N) && Intrinsics.b(this.f40787b, ((N) obj).f40787b);
    }

    public int hashCode() {
        return this.f40787b.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f40787b + ')';
    }
}
