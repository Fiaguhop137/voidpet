package K3;

import If.AbstractC1113o;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L3.f f6016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L3.e f6017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L3.c f6018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f6019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC1113o f6020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f6021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f6022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f6023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p435y3.l f6024j;

    public o(Context context, L3.f fVar, L3.e eVar, L3.c cVar, String str, AbstractC1113o abstractC1113o, c cVar2, c cVar3, c cVar4, p435y3.l lVar) {
        this.f6015a = context;
        this.f6016b = fVar;
        this.f6017c = eVar;
        this.f6018d = cVar;
        this.f6019e = str;
        this.f6020f = abstractC1113o;
        this.f6021g = cVar2;
        this.f6022h = cVar3;
        this.f6023i = cVar4;
        this.f6024j = lVar;
    }

    public static /* synthetic */ o b(o oVar, Context context, L3.f fVar, L3.e eVar, L3.c cVar, String str, AbstractC1113o abstractC1113o, c cVar2, c cVar3, c cVar4, p435y3.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = oVar.f6015a;
        }
        if ((i10 & 2) != 0) {
            fVar = oVar.f6016b;
        }
        if ((i10 & 4) != 0) {
            eVar = oVar.f6017c;
        }
        if ((i10 & 8) != 0) {
            cVar = oVar.f6018d;
        }
        if ((i10 & 16) != 0) {
            str = oVar.f6019e;
        }
        if ((i10 & 32) != 0) {
            abstractC1113o = oVar.f6020f;
        }
        if ((i10 & 64) != 0) {
            cVar2 = oVar.f6021g;
        }
        if ((i10 & 128) != 0) {
            cVar3 = oVar.f6022h;
        }
        if ((i10 & 256) != 0) {
            cVar4 = oVar.f6023i;
        }
        if ((i10 & 512) != 0) {
            lVar = oVar.f6024j;
        }
        c cVar5 = cVar4;
        p435y3.l lVar2 = lVar;
        c cVar6 = cVar2;
        c cVar7 = cVar3;
        String str2 = str;
        AbstractC1113o abstractC1113o2 = abstractC1113o;
        return oVar.a(context, fVar, eVar, cVar, str2, abstractC1113o2, cVar6, cVar7, cVar5, lVar2);
    }

    public final o a(Context context, L3.f fVar, L3.e eVar, L3.c cVar, String str, AbstractC1113o abstractC1113o, c cVar2, c cVar3, c cVar4, p435y3.l lVar) {
        return new o(context, fVar, eVar, cVar, str, abstractC1113o, cVar2, cVar3, cVar4, lVar);
    }

    public final Context c() {
        return this.f6015a;
    }

    public final String d() {
        return this.f6019e;
    }

    public final c e() {
        return this.f6022h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.b(this.f6015a, oVar.f6015a) && Intrinsics.b(this.f6016b, oVar.f6016b) && this.f6017c == oVar.f6017c && this.f6018d == oVar.f6018d && Intrinsics.b(this.f6019e, oVar.f6019e) && Intrinsics.b(this.f6020f, oVar.f6020f) && this.f6021g == oVar.f6021g && this.f6022h == oVar.f6022h && this.f6023i == oVar.f6023i && Intrinsics.b(this.f6024j, oVar.f6024j);
    }

    public final p435y3.l f() {
        return this.f6024j;
    }

    public final AbstractC1113o g() {
        return this.f6020f;
    }

    public final c h() {
        return this.f6023i;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f6015a.hashCode() * 31) + this.f6016b.hashCode()) * 31) + this.f6017c.hashCode()) * 31) + this.f6018d.hashCode()) * 31;
        String str = this.f6019e;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f6020f.hashCode()) * 31) + this.f6021g.hashCode()) * 31) + this.f6022h.hashCode()) * 31) + this.f6023i.hashCode()) * 31) + this.f6024j.hashCode();
    }

    public final L3.c i() {
        return this.f6018d;
    }

    public final L3.e j() {
        return this.f6017c;
    }

    public final L3.f k() {
        return this.f6016b;
    }

    public String toString() {
        return "Options(context=" + this.f6015a + ", size=" + this.f6016b + ", scale=" + this.f6017c + ", precision=" + this.f6018d + ", diskCacheKey=" + this.f6019e + ", fileSystem=" + this.f6020f + ", memoryCachePolicy=" + this.f6021g + ", diskCachePolicy=" + this.f6022h + ", networkCachePolicy=" + this.f6023i + ", extras=" + this.f6024j + ')';
    }
}
