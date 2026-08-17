package expo.modules.fetch;

import kotlin.jvm.functions.Function1;
import p389vb.p;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f40972a;

    public /* synthetic */ a(p pVar) {
        this.f40972a = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(NativeResponse.c.j(this.f40972a, (Function1) obj));
    }
}
