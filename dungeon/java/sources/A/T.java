package A;

import androidx.compose.foundation.layout.WrapContentElement;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class T implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V.d.b f25a;

    public /* synthetic */ T(V.d.b bVar) {
        this.f25a = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return WrapContentElement.Companion.i(this.f25a, (O0.r) obj, (O0.t) obj2);
    }
}
