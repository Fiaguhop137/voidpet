package W3;

import R3.AbstractC1355b;
import X3.c;
import X3.i;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import p077e4.g;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AssetManager f14618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbstractC1355b f14619e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f14615a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f14616b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f14617c = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f14620f = ".ttf";

    public a(Drawable.Callback callback, AbstractC1355b abstractC1355b) {
        this.f14619e = abstractC1355b;
        if (callback instanceof View) {
            this.f14618d = ((View) callback).getContext().getAssets();
        } else {
            g.c("LottieDrawable must be inside of a view for images to work.");
            this.f14618d = null;
        }
    }

    private Typeface a(c cVar) {
        Typeface typefaceCreateFromAsset;
        String strA = cVar.a();
        Typeface typeface = (Typeface) this.f14617c.get(strA);
        if (typeface != null) {
            return typeface;
        }
        String strC = cVar.c();
        String strB = cVar.b();
        AbstractC1355b abstractC1355b = this.f14619e;
        if (abstractC1355b != null) {
            typefaceCreateFromAsset = abstractC1355b.b(strA, strC, strB);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.f14619e.a(strA);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        AbstractC1355b abstractC1355b2 = this.f14619e;
        if (abstractC1355b2 != null && typefaceCreateFromAsset == null) {
            String strD = abstractC1355b2.d(strA, strC, strB);
            if (strD == null) {
                strD = this.f14619e.c(strA);
            }
            if (strD != null) {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.f14618d, strD);
            }
        }
        if (cVar.d() != null) {
            return cVar.d();
        }
        if (typefaceCreateFromAsset == null) {
            typefaceCreateFromAsset = Typeface.createFromAsset(this.f14618d, "fonts/" + strA + this.f14620f);
        }
        this.f14617c.put(strA, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    private Typeface e(Typeface typeface, String str) {
        int i10;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i10 = 3;
        } else if (zContains) {
            i10 = 2;
        } else {
            i10 = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }

    public Typeface b(c cVar) {
        this.f14615a.b(cVar.a(), cVar.c());
        Typeface typeface = (Typeface) this.f14616b.get(this.f14615a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceE = e(a(cVar), cVar.c());
        this.f14616b.put(this.f14615a, typefaceE);
        return typefaceE;
    }

    public void c(String str) {
        this.f14620f = str;
    }

    public void d(AbstractC1355b abstractC1355b) {
        this.f14619e = abstractC1355b;
    }
}
