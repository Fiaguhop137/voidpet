package Kb;

import N4.g;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import p274p4.h;
import p274p4.j;
import p310r4.v;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements j {
    @Override // p274p4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(InputStream source, int i10, int i11, h options) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(options, "options");
        try {
            g gVarL = g.l(source);
            Intrinsics.checkNotNullExpressionValue(gVarL, "getFromInputStream(...)");
            if (gVarL.g() == null) {
                float fH = gVarL.h();
                float f10 = gVarL.f();
                if (fH != -1.0f && f10 != -1.0f) {
                    gVarL.w(0.0f, 0.0f, fH, f10);
                }
            }
            gVarL.x(i10);
            gVarL.u(i11);
            return new p418x4.g(gVarL);
        } catch (N4.j e10) {
            throw new IOException("Cannot load SVG from stream", e10);
        }
    }

    @Override // p274p4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream source, h options) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(options, "options");
        return true;
    }
}
