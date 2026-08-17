package p288q0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: q0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4054a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0610a f51172b = new C0610a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function2 f51173a;

    /* JADX INFO: renamed from: q0.a$a, reason: collision with other inner class name */
    public static final class C0610a {
        private C0610a() {
        }

        public /* synthetic */ C0610a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AbstractC4054a(Function2 function2) {
        this.f51173a = function2;
    }

    public /* synthetic */ AbstractC4054a(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    public final Function2 a() {
        return this.f51173a;
    }
}
