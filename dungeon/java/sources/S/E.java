package S;

import android.os.Parcel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Parcel f11273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f11274b;

    public /* synthetic */ E(Parcel parcel, ClassLoader classLoader) {
        this.f11273a = parcel;
        this.f11274b = classLoader;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return F.a.d(this.f11273a, this.f11274b, ((Integer) obj).intValue());
    }
}
