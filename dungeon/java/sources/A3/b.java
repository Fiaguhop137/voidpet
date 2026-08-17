package A3;

import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f159a;

    public /* synthetic */ b(c cVar) {
        this.f159a = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return c.P(this.f159a, (IOException) obj);
    }
}
