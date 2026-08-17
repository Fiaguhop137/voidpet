package Q6;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends p061d6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9507b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f9508c = new LinkedHashMap();

    @Override // p061d6.a, com.facebook.imagepipeline.producers.h0
    public void a(String requestId, String producerName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (p295q7.a.j(0L)) {
            Pair pairCreate = Pair.create(Integer.valueOf(this.f9506a), "FRESCO_PRODUCER_" + StringsKt.H(producerName, ':', '_', false, 4, null));
            Object second = pairCreate.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            p295q7.a.a(0L, (String) second, this.f9506a);
            this.f9507b.put(requestId, pairCreate);
            this.f9506a++;
        }
    }

    @Override // p061d6.e
    public void b(p133h6.b request, String requestId, Throwable throwable, boolean z10) {
        Pair pair;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (p295q7.a.j(0L) && (pair = (Pair) this.f9508c.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            p295q7.a.g(0L, (String) second, ((Number) first).intValue());
            this.f9508c.remove(requestId);
        }
    }

    @Override // p061d6.e
    public void c(p133h6.b request, Object callerContext, String requestId, boolean z10) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (p295q7.a.j(0L)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FRESCO_REQUEST_");
            String string = request.v().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            sb2.append(StringsKt.H(string, ':', '_', false, 4, null));
            Pair pairCreate = Pair.create(Integer.valueOf(this.f9506a), sb2.toString());
            Object second = pairCreate.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            p295q7.a.a(0L, (String) second, this.f9506a);
            this.f9508c.put(requestId, pairCreate);
            this.f9506a++;
        }
    }

    @Override // p061d6.a, com.facebook.imagepipeline.producers.h0
    public boolean d(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return false;
    }

    @Override // p061d6.a, com.facebook.imagepipeline.producers.h0
    public void e(String requestId, String producerName, Map map) {
        Pair pair;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (p295q7.a.j(0L) && (pair = (Pair) this.f9507b.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            p295q7.a.g(0L, (String) second, ((Number) first).intValue());
            this.f9507b.remove(requestId);
        }
    }

    @Override // p061d6.a, com.facebook.imagepipeline.producers.h0
    public void f(String requestId, String producerName, Throwable t10, Map map) {
        Pair pair;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(t10, "t");
        if (p295q7.a.j(0L) && (pair = (Pair) this.f9507b.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            p295q7.a.g(0L, (String) second, ((Number) first).intValue());
            this.f9507b.remove(requestId);
        }
    }

    @Override // p061d6.e
    public void g(p133h6.b request, String requestId, boolean z10) {
        Pair pair;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (p295q7.a.j(0L) && (pair = (Pair) this.f9508c.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            p295q7.a.g(0L, (String) second, ((Number) first).intValue());
            this.f9508c.remove(requestId);
        }
    }

    @Override // p061d6.a, com.facebook.imagepipeline.producers.h0
    public void h(String requestId, String producerName, Map map) {
        Pair pair;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        if (p295q7.a.j(0L) && (pair = (Pair) this.f9507b.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            p295q7.a.g(0L, (String) second, ((Number) first).intValue());
            this.f9507b.remove(requestId);
        }
    }

    @Override // p061d6.a, com.facebook.imagepipeline.producers.h0
    public void j(String requestId, String producerName, String eventName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (p295q7.a.j(0L)) {
            p295q7.a.n(0L, "FRESCO_PRODUCER_EVENT_" + StringsKt.H(requestId, ':', '_', false, 4, null) + "_" + StringsKt.H(producerName, ':', '_', false, 4, null) + "_" + StringsKt.H(eventName, ':', '_', false, 4, null), p295q7.a.EnumC0617a.THREAD);
        }
    }

    @Override // p061d6.e
    public void k(String requestId) {
        Pair pair;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (p295q7.a.j(0L) && (pair = (Pair) this.f9508c.get(requestId)) != null) {
            Object second = pair.second;
            Intrinsics.checkNotNullExpressionValue(second, "second");
            Object first = pair.first;
            Intrinsics.checkNotNullExpressionValue(first, "first");
            p295q7.a.g(0L, (String) second, ((Number) first).intValue());
            this.f9508c.remove(requestId);
        }
    }
}
