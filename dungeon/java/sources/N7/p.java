package N7;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class p implements L7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f7968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f7969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f7970c;

    p(Set set, o oVar, s sVar) {
        this.f7968a = set;
        this.f7969b = oVar;
        this.f7970c = sVar;
    }

    @Override // L7.i
    public L7.h a(String str, Class cls, L7.c cVar, L7.g gVar) {
        if (this.f7968a.contains(cVar)) {
            return new r(this.f7969b, str, cVar, gVar, this.f7970c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, this.f7968a));
    }
}
