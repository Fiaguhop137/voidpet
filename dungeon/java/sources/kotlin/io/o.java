package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f48323a;

    public /* synthetic */ o(Function2 function2) {
        this.f48323a = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return p.v(this.f48323a, (File) obj, (IOException) obj2);
    }
}
