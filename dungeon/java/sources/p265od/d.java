package p265od;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f50585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f50586b;

    public /* synthetic */ d(e eVar, long j10) {
        this.f50585a = eVar;
        this.f50586b = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(e.g(this.f50585a, this.f50586b, (String) obj));
    }
}
