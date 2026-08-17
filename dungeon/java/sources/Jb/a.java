package Jb;

import kotlin.jvm.internal.Intrinsics;
import p382v4.h;
import p382v4.i;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f5795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5796j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, i iVar, String cacheKey) {
        super(str, iVar);
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        this.f5795i = cacheKey;
    }

    private final String j() {
        String strC = super.c();
        Intrinsics.checkNotNullExpressionValue(strC, "getCacheKey(...)");
        return strC;
    }

    @Override // p382v4.h
    public String c() {
        return this.f5795i;
    }

    @Override // p382v4.h, p274p4.f
    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Intrinsics.b(j(), aVar.j()) && e().equals(aVar.e());
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (Intrinsics.b(j(), hVar.c()) && e().equals(hVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // p382v4.h, p274p4.f
    public int hashCode() {
        if (this.f5796j == 0) {
            int iHashCode = j().hashCode();
            this.f5796j = iHashCode;
            this.f5796j = (iHashCode * 31) + e().hashCode();
        }
        return this.f5796j;
    }
}
