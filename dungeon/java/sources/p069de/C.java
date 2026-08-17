package p069de;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class C implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f39949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f39950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f39951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f39952d;

    public C(List allDependencies, Set modulesWhoseInternalsAreVisible, List directExpectedByDependencies, Set allExpectedByDependencies) {
        Intrinsics.checkNotNullParameter(allDependencies, "allDependencies");
        Intrinsics.checkNotNullParameter(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        Intrinsics.checkNotNullParameter(directExpectedByDependencies, "directExpectedByDependencies");
        Intrinsics.checkNotNullParameter(allExpectedByDependencies, "allExpectedByDependencies");
        this.f39949a = allDependencies;
        this.f39950b = modulesWhoseInternalsAreVisible;
        this.f39951c = directExpectedByDependencies;
        this.f39952d = allExpectedByDependencies;
    }

    @Override // p069de.B
    public List a() {
        return this.f39949a;
    }

    @Override // p069de.B
    public List b() {
        return this.f39951c;
    }

    @Override // p069de.B
    public Set c() {
        return this.f39950b;
    }
}
