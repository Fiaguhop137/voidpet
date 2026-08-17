package p049cc;

import Yb.g;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p067dc.h;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f27416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f27417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f27418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function2 f27419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f27420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Function0 f27421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f27422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f27423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f27424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f27425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f27426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Rb.e f27427m;

    public e(String name, h objectDefinition, Map viewManagerDefinitions, Map eventListeners, Function2 function2, List classData) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(objectDefinition, "objectDefinition");
        Intrinsics.checkNotNullParameter(viewManagerDefinitions, "viewManagerDefinitions");
        Intrinsics.checkNotNullParameter(eventListeners, "eventListeners");
        Intrinsics.checkNotNullParameter(classData, "classData");
        this.f27415a = name;
        this.f27416b = objectDefinition;
        this.f27417c = viewManagerDefinitions;
        this.f27418d = eventListeners;
        this.f27419e = function2;
        this.f27420f = classData;
        this.f27421g = objectDefinition.f();
        this.f27422h = objectDefinition.h();
        this.f27423i = objectDefinition.b();
        this.f27424j = objectDefinition.d();
        this.f27425k = objectDefinition.g();
        this.f27426l = objectDefinition.c();
        this.f27427m = objectDefinition.e();
    }

    public final Map a() {
        return this.f27423i;
    }

    public final List b() {
        return this.f27420f;
    }

    public final Map c() {
        return this.f27418d;
    }

    public final g d() {
        return this.f27424j;
    }

    public final String e() {
        return this.f27415a;
    }

    public final h f() {
        return this.f27416b;
    }

    public final Function2 g() {
        return this.f27419e;
    }

    public final Map h() {
        return this.f27417c;
    }
}
