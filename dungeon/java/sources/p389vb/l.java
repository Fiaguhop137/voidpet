package p389vb;

import expo.modules.fetch.NativeResponse;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f56319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f56320b;

    public /* synthetic */ l(List list, Function1 function1) {
        this.f56319a = list;
        this.f56320b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(NativeResponse.t0(this.f56319a, this.f56320b, (p) obj));
    }
}
