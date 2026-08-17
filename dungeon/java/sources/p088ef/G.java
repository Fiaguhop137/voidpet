package p088ef;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.E;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class G implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E f40755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f40756b;

    public /* synthetic */ G(E e10, boolean z10) {
        this.f40755a = e10;
        this.f40756b = z10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return I.e(this.f40755a, this.f40756b, (CoroutineContext) obj, (CoroutineContext.Element) obj2);
    }
}
