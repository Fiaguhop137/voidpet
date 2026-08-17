package U;

import I.C1071s;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class h implements f, J.f, CoroutineContext.Element {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12603b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12604c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1071s f12605a;

    public static final class a implements CoroutineContext.b {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public String toString() {
            return "CompositionErrorContext";
        }
    }

    public h(C1071s c1071s) {
        this.f12605a = c1071s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n(h hVar, Object obj) {
        return hVar.f12605a.u1(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext P(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext S(CoroutineContext.b bVar) {
        return CoroutineContext.Element.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object b0(Object obj, Function2 function2) {
        return CoroutineContext.Element.a.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element e(CoroutineContext.b bVar) {
        return CoroutineContext.Element.a.b(this, bVar);
    }

    @Override // U.f
    public boolean g(Throwable th, Object obj) {
        return d.c(th, new g(this, obj));
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.b getKey() {
        return f12603b;
    }

    @Override // J.f
    public List j(Integer num) {
        return this.f12605a.a1();
    }
}
