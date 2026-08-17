package C4;

import L4.k;
import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import p274p4.l;
import p310r4.v;

/* JADX INFO: loaded from: classes.dex */
public class f implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f1397b;

    public f(l lVar) {
        this.f1397b = (l) k.d(lVar);
    }

    @Override // p274p4.l
    public v a(Context context, v vVar, int i10, int i11) {
        c cVar = (c) vVar.get();
        v fVar = new p436y4.f(cVar.e(), com.bumptech.glide.c.d(context).g());
        v vVarA = this.f1397b.a(context, fVar, i10, i11);
        if (!fVar.equals(vVarA)) {
            fVar.recycle();
        }
        cVar.m(this.f1397b, (Bitmap) vVarA.get());
        return vVar;
    }

    @Override // p274p4.f
    public void b(MessageDigest messageDigest) {
        this.f1397b.b(messageDigest);
    }

    @Override // p274p4.f
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f1397b.equals(((f) obj).f1397b);
        }
        return false;
    }

    @Override // p274p4.f
    public int hashCode() {
        return this.f1397b.hashCode();
    }
}
