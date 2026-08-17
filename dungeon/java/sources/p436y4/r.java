package p436y4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.c;
import java.security.MessageDigest;
import p274p4.l;
import p310r4.v;
import p328s4.d;

/* JADX INFO: loaded from: classes.dex */
public class r implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f57925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f57926c;

    public r(l lVar, boolean z10) {
        this.f57925b = lVar;
        this.f57926c = z10;
    }

    private v d(Context context, v vVar) {
        return w.d(context.getResources(), vVar);
    }

    @Override // p274p4.l
    public v a(Context context, v vVar, int i10, int i11) {
        d dVarG = c.d(context).g();
        Drawable drawable = (Drawable) vVar.get();
        v vVarA = q.a(dVarG, drawable, i10, i11);
        if (vVarA != null) {
            v vVarA2 = this.f57925b.a(context, vVarA, i10, i11);
            if (!vVarA2.equals(vVarA)) {
                return d(context, vVarA2);
            }
            vVarA2.recycle();
            return vVar;
        }
        if (!this.f57926c) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p274p4.f
    public void b(MessageDigest messageDigest) {
        this.f57925b.b(messageDigest);
    }

    public l c() {
        return this;
    }

    @Override // p274p4.f
    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f57925b.equals(((r) obj).f57925b);
        }
        return false;
    }

    @Override // p274p4.f
    public int hashCode() {
        return this.f57925b.hashCode();
    }
}
