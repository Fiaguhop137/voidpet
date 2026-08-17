package Re;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I0 f11037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f11038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1388d0 f11039c;

    public G(I0 howThisTypeIsUsed, Set set, AbstractC1388d0 abstractC1388d0) {
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f11037a = howThisTypeIsUsed;
        this.f11038b = set;
        this.f11039c = abstractC1388d0;
    }

    public abstract AbstractC1388d0 a();

    public abstract I0 b();

    public abstract Set c();

    public abstract G d(p015ae.m0 m0Var);

    public abstract int hashCode();
}
