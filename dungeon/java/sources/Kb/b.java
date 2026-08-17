package Kb;

import D4.e;
import Db.C0940d;
import N4.g;
import N4.l;
import android.content.Context;
import android.graphics.Picture;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import p274p4.h;
import p310r4.v;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6165a;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f6165a = context;
    }

    @Override // D4.e
    public v a(v toTranscode, h options) {
        Intrinsics.checkNotNullParameter(toTranscode, "toTranscode");
        Intrinsics.checkNotNullParameter(options, "options");
        Object obj = toTranscode.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        g gVar = (g) obj;
        RectF rectFG = gVar.g();
        int iWidth = rectFG != null ? (int) rectFG.width() : 512;
        RectF rectFG2 = gVar.g();
        int iHeight = rectFG2 != null ? (int) rectFG2.height() : 512;
        Integer num = (Integer) options.c(C0940d.f2268a.a());
        if (num != null) {
            l.b(gVar, num.intValue());
        }
        Picture pictureP = gVar.p();
        Intrinsics.checkNotNullExpressionValue(pictureP, "renderToPicture(...)");
        return new p418x4.g(new c(pictureP, iWidth, iHeight));
    }
}
