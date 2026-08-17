package H5;

import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f4235a = new b();

    private b() {
    }

    public static final I5.b.a a(Map componentAttribution, Map shortcutAttribution, Map map, Map map2, Rect rect, String str, PointF pointF, Map map3, Object obj, boolean z10, Uri uri) {
        Intrinsics.checkNotNullParameter(componentAttribution, "componentAttribution");
        Intrinsics.checkNotNullParameter(shortcutAttribution, "shortcutAttribution");
        I5.b.a aVar = new I5.b.a();
        if (rect != null) {
            aVar.f4932h = rect.width();
            aVar.f4933i = rect.height();
        }
        aVar.f4934j = str;
        if (pointF != null) {
            aVar.f4935k = Float.valueOf(pointF.x);
            aVar.f4936l = Float.valueOf(pointF.y);
        }
        aVar.f4930f = obj;
        aVar.f4937m = z10;
        aVar.f4931g = uri;
        aVar.f4927c = map;
        aVar.f4928d = map3;
        aVar.f4926b = shortcutAttribution;
        aVar.f4925a = componentAttribution;
        aVar.f4929e = map2;
        return aVar;
    }
}
